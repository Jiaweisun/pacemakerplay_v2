package controllers;

import static models.JsonParser.*;
import java.util.List;
import models.Activity;
import models.User;
import play.mvc.Controller;
import play.mvc.Result;

public class PacemakerAPI extends Controller
{  

  public static Result  users()
  {
    List<User> users = User.findAll();
    return ok(user2Json(users));
  }

  public static Result user(Long id)
  {
    User user = User.findById(id);  
    return user==null? notFound() : ok(user2Json(user)); 
  }

  public static Result createUser()
  {
    User user = json2User(request().body().asJson().toString());
    user.save();
    return ok(user2Json(user));
  }

  public static Result deleteUser(Long id)
  {
    Result result = notFound();
    User user = User.findById(id);
    if (user != null)
    {
      user.delete();
      result = ok();
    }
    return result;
  }

  public static Result deleteAllUsers()
  {
    User.deleteAll();
    return ok();
  }

  public static Result updateUser(Long id)
  {
    Result result = notFound();
    User user = User.findById(id);
    if (user != null)
    {
      User updatedUser = json2User(request().body().asJson().toString());
      user.update(updatedUser);
      user.save();
      result = ok(user2Json(user));
    }
    return result;
  }

  public static Result activities (Long userId)
  {  
    User p = User.findById(userId);
    return ok(activity2Json(p.activities));
  }

  public static Result createActivity (Long userId)
  { 
    User    user      = User.findById(userId);
    Activity activity = json2Activity(request().body().asJson().toString());  

    user.activities.add(activity);
    user.save();

    return ok(activity2Json(activity));
  }

  public static Result activity (Long userId, Long activityId)
  {  
    User    user      = User.findById(userId);
    Activity activity = Activity.findById(activityId);

    if (activity == null)
    {
      return notFound();
    }
    else
    {
      return user.activities.contains(activity)? ok(activity2Json(activity)): badRequest();
    }
  }  

  public static Result deleteActivity (Long userId, Long activityId)
  {  
    User    user      = User.findById(userId);
    Activity activity = Activity.findById(activityId);
    if (activity == null)
    {
      return notFound();
    }
    else
    {
      if (user.activities.contains(activity))
      {
        user.activities.remove(activity);
        activity.delete();
        user.save();
        return ok();
      }
      else
      {
        return badRequest();
      }

    }
  }  

  public static Result updateActivity (Long userId, Long activityId)
  {
    User    user      = User.findById(userId);
    Activity activity = Activity.findById(activityId);
    if (activity == null)
    {
      return notFound();
    }
    else
    {
      if (user.activities.contains(activity))
      {
        Activity updatedActivity = json2Activity(request().body().asJson().toString());
        activity.distance = updatedActivity.distance;
        activity.location = updatedActivity.location;
        activity.kind     = updatedActivity.kind;

        activity.save();
        return ok(activity2Json(updatedActivity));
      }
      else
      {
        return badRequest();
      }
    }
  }  
}