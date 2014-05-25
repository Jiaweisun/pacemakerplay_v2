// @SOURCE:G:/workspacedpatterns/pacemakerplay_v2/conf/routes
// @HASH:e5dfe19081c0c99d6de5b048dcfd3602cef14baa
// @DATE:Thu Apr 03 13:31:40 BST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:5
private[this] lazy val controllers_Accounts_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:6
private[this] lazy val controllers_Accounts_signup1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:7
private[this] lazy val controllers_Accounts_login2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:8
private[this] lazy val controllers_Accounts_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:9
private[this] lazy val controllers_Accounts_register4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:10
private[this] lazy val controllers_Accounts_authenticate5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate"))))
        

// @LINE:12
private[this] lazy val controllers_Dashboard_index6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dashboard"))))
        

// @LINE:13
private[this] lazy val controllers_Dashboard_uploadActivityForm7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("upload"))))
        

// @LINE:14
private[this] lazy val controllers_Dashboard_submitActivity8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("submitactivity"))))
        

// @LINE:17
private[this] lazy val controllers_Assets_at9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:23
private[this] lazy val controllers_PacemakerAPI_users10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/users"))))
        

// @LINE:24
private[this] lazy val controllers_PacemakerAPI_deleteAllUsers11 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/users"))))
        

// @LINE:25
private[this] lazy val controllers_PacemakerAPI_createUser12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/users"))))
        

// @LINE:27
private[this] lazy val controllers_PacemakerAPI_user13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/users/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:28
private[this] lazy val controllers_PacemakerAPI_deleteUser14 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/users/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:29
private[this] lazy val controllers_PacemakerAPI_updateUser15 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/users/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:31
private[this] lazy val controllers_PacemakerAPI_activities16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/users/"),DynamicPart("userId", """[^/]+""",true),StaticPart("/activities"))))
        

// @LINE:32
private[this] lazy val controllers_PacemakerAPI_createActivity17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/users/"),DynamicPart("userId", """[^/]+""",true),StaticPart("/activities"))))
        

// @LINE:34
private[this] lazy val controllers_PacemakerAPI_activity18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/users/"),DynamicPart("userId", """[^/]+""",true),StaticPart("/activities/"),DynamicPart("activityId", """[^/]+""",true))))
        

// @LINE:35
private[this] lazy val controllers_PacemakerAPI_deleteActivity19 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/users/"),DynamicPart("userId", """[^/]+""",true),StaticPart("/activities/"),DynamicPart("activityId", """[^/]+""",true))))
        

// @LINE:36
private[this] lazy val controllers_PacemakerAPI_updateActivity20 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/users/"),DynamicPart("userId", """[^/]+""",true),StaticPart("/activities/"),DynamicPart("activityId", """[^/]+""",true))))
        
def documentation = List(("""GET""", prefix,"""controllers.Accounts.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Accounts.signup()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Accounts.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Accounts.logout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Accounts.register()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate""","""controllers.Accounts.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dashboard""","""controllers.Dashboard.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """upload""","""controllers.Dashboard.uploadActivityForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """submitactivity""","""controllers.Dashboard.submitActivity()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/users""","""controllers.PacemakerAPI.users()"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/users""","""controllers.PacemakerAPI.deleteAllUsers()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/users""","""controllers.PacemakerAPI.createUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/users/$id<[^/]+>""","""controllers.PacemakerAPI.user(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/users/$id<[^/]+>""","""controllers.PacemakerAPI.deleteUser(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/users/$id<[^/]+>""","""controllers.PacemakerAPI.updateUser(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/users/$userId<[^/]+>/activities""","""controllers.PacemakerAPI.activities(userId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/users/$userId<[^/]+>/activities""","""controllers.PacemakerAPI.createActivity(userId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/users/$userId<[^/]+>/activities/$activityId<[^/]+>""","""controllers.PacemakerAPI.activity(userId:Long, activityId:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/users/$userId<[^/]+>/activities/$activityId<[^/]+>""","""controllers.PacemakerAPI.deleteActivity(userId:Long, activityId:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/users/$userId<[^/]+>/activities/$activityId<[^/]+>""","""controllers.PacemakerAPI.updateActivity(userId:Long, activityId:Long)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_Accounts_index0(params) => {
   call { 
        invokeHandler(controllers.Accounts.index(), HandlerDef(this, "controllers.Accounts", "index", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:6
case controllers_Accounts_signup1(params) => {
   call { 
        invokeHandler(controllers.Accounts.signup(), HandlerDef(this, "controllers.Accounts", "signup", Nil,"GET", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:7
case controllers_Accounts_login2(params) => {
   call { 
        invokeHandler(controllers.Accounts.login(), HandlerDef(this, "controllers.Accounts", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:8
case controllers_Accounts_logout3(params) => {
   call { 
        invokeHandler(controllers.Accounts.logout(), HandlerDef(this, "controllers.Accounts", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:9
case controllers_Accounts_register4(params) => {
   call { 
        invokeHandler(controllers.Accounts.register(), HandlerDef(this, "controllers.Accounts", "register", Nil,"POST", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:10
case controllers_Accounts_authenticate5(params) => {
   call { 
        invokeHandler(controllers.Accounts.authenticate(), HandlerDef(this, "controllers.Accounts", "authenticate", Nil,"POST", """""", Routes.prefix + """authenticate"""))
   }
}
        

// @LINE:12
case controllers_Dashboard_index6(params) => {
   call { 
        invokeHandler(controllers.Dashboard.index(), HandlerDef(this, "controllers.Dashboard", "index", Nil,"GET", """""", Routes.prefix + """dashboard"""))
   }
}
        

// @LINE:13
case controllers_Dashboard_uploadActivityForm7(params) => {
   call { 
        invokeHandler(controllers.Dashboard.uploadActivityForm(), HandlerDef(this, "controllers.Dashboard", "uploadActivityForm", Nil,"GET", """""", Routes.prefix + """upload"""))
   }
}
        

// @LINE:14
case controllers_Dashboard_submitActivity8(params) => {
   call { 
        invokeHandler(controllers.Dashboard.submitActivity(), HandlerDef(this, "controllers.Dashboard", "submitActivity", Nil,"POST", """""", Routes.prefix + """submitactivity"""))
   }
}
        

// @LINE:17
case controllers_Assets_at9(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:23
case controllers_PacemakerAPI_users10(params) => {
   call { 
        invokeHandler(controllers.PacemakerAPI.users(), HandlerDef(this, "controllers.PacemakerAPI", "users", Nil,"GET", """""", Routes.prefix + """api/users"""))
   }
}
        

// @LINE:24
case controllers_PacemakerAPI_deleteAllUsers11(params) => {
   call { 
        invokeHandler(controllers.PacemakerAPI.deleteAllUsers(), HandlerDef(this, "controllers.PacemakerAPI", "deleteAllUsers", Nil,"DELETE", """""", Routes.prefix + """api/users"""))
   }
}
        

// @LINE:25
case controllers_PacemakerAPI_createUser12(params) => {
   call { 
        invokeHandler(controllers.PacemakerAPI.createUser(), HandlerDef(this, "controllers.PacemakerAPI", "createUser", Nil,"POST", """""", Routes.prefix + """api/users"""))
   }
}
        

// @LINE:27
case controllers_PacemakerAPI_user13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.PacemakerAPI.user(id), HandlerDef(this, "controllers.PacemakerAPI", "user", Seq(classOf[Long]),"GET", """""", Routes.prefix + """api/users/$id<[^/]+>"""))
   }
}
        

// @LINE:28
case controllers_PacemakerAPI_deleteUser14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.PacemakerAPI.deleteUser(id), HandlerDef(this, "controllers.PacemakerAPI", "deleteUser", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """api/users/$id<[^/]+>"""))
   }
}
        

// @LINE:29
case controllers_PacemakerAPI_updateUser15(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.PacemakerAPI.updateUser(id), HandlerDef(this, "controllers.PacemakerAPI", "updateUser", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """api/users/$id<[^/]+>"""))
   }
}
        

// @LINE:31
case controllers_PacemakerAPI_activities16(params) => {
   call(params.fromPath[Long]("userId", None)) { (userId) =>
        invokeHandler(controllers.PacemakerAPI.activities(userId), HandlerDef(this, "controllers.PacemakerAPI", "activities", Seq(classOf[Long]),"GET", """""", Routes.prefix + """api/users/$userId<[^/]+>/activities"""))
   }
}
        

// @LINE:32
case controllers_PacemakerAPI_createActivity17(params) => {
   call(params.fromPath[Long]("userId", None)) { (userId) =>
        invokeHandler(controllers.PacemakerAPI.createActivity(userId), HandlerDef(this, "controllers.PacemakerAPI", "createActivity", Seq(classOf[Long]),"POST", """""", Routes.prefix + """api/users/$userId<[^/]+>/activities"""))
   }
}
        

// @LINE:34
case controllers_PacemakerAPI_activity18(params) => {
   call(params.fromPath[Long]("userId", None), params.fromPath[Long]("activityId", None)) { (userId, activityId) =>
        invokeHandler(controllers.PacemakerAPI.activity(userId, activityId), HandlerDef(this, "controllers.PacemakerAPI", "activity", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """api/users/$userId<[^/]+>/activities/$activityId<[^/]+>"""))
   }
}
        

// @LINE:35
case controllers_PacemakerAPI_deleteActivity19(params) => {
   call(params.fromPath[Long]("userId", None), params.fromPath[Long]("activityId", None)) { (userId, activityId) =>
        invokeHandler(controllers.PacemakerAPI.deleteActivity(userId, activityId), HandlerDef(this, "controllers.PacemakerAPI", "deleteActivity", Seq(classOf[Long], classOf[Long]),"DELETE", """""", Routes.prefix + """api/users/$userId<[^/]+>/activities/$activityId<[^/]+>"""))
   }
}
        

// @LINE:36
case controllers_PacemakerAPI_updateActivity20(params) => {
   call(params.fromPath[Long]("userId", None), params.fromPath[Long]("activityId", None)) { (userId, activityId) =>
        invokeHandler(controllers.PacemakerAPI.updateActivity(userId, activityId), HandlerDef(this, "controllers.PacemakerAPI", "updateActivity", Seq(classOf[Long], classOf[Long]),"PUT", """""", Routes.prefix + """api/users/$userId<[^/]+>/activities/$activityId<[^/]+>"""))
   }
}
        
}

}
     