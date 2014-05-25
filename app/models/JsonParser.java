package models;

import java.util.ArrayList;
import java.util.List;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

public class JsonParser
{
  public static JSONSerializer userSerializer     = new JSONSerializer().exclude("class")
                                                                        .exclude("persistent")
                                                                        .exclude("entityId"); 
  public static JSONSerializer activitySerializer = new JSONSerializer().exclude("class")
                                                                        .exclude("persistent")
                                                                        .exclude("entityId"); 

  public static User json2User(String json)
  {
    return new JSONDeserializer<User>().deserialize(json, User.class); 
  }

  public static List<User> json2Users(String json)
  {
    return new JSONDeserializer<ArrayList<User>>().use("values", User.class)
                                                  .deserialize(json);
  }

  public static String user2Json(Object obj)
  {
    return userSerializer.serialize(obj);
  }

  public static Activity json2Activity(String json)
  {
    Activity activity = new JSONDeserializer<Activity>().deserialize(json,   Activity.class);
    return activity;
  }

  public static String activity2Json(Object obj)
  {
    return activitySerializer.serialize(obj);
  }

  public static  List<Activity> json2Activities (String json)
  {
    return new JSONDeserializer<ArrayList<Activity>>().use("values", Activity.class).deserialize(json);
  }   
}