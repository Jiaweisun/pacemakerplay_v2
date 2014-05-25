// @SOURCE:G:/workspacedpatterns/pacemakerplay_v2/conf/routes
// @HASH:e5dfe19081c0c99d6de5b048dcfd3602cef14baa
// @DATE:Thu Apr 03 13:31:40 BST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers {

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
class ReversePacemakerAPI {
    

// @LINE:35
def deleteActivity(userId:Long, activityId:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "api/users/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/activities/" + implicitly[PathBindable[Long]].unbind("activityId", activityId))
}
                                                

// @LINE:25
def createUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/users")
}
                                                

// @LINE:29
def updateUser(id:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "api/users/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:27
def user(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/users/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:32
def createActivity(userId:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/users/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/activities")
}
                                                

// @LINE:28
def deleteUser(id:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "api/users/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:36
def updateActivity(userId:Long, activityId:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "api/users/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/activities/" + implicitly[PathBindable[Long]].unbind("activityId", activityId))
}
                                                

// @LINE:23
def users(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/users")
}
                                                

// @LINE:24
def deleteAllUsers(): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "api/users")
}
                                                

// @LINE:31
def activities(userId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/users/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/activities")
}
                                                

// @LINE:34
def activity(userId:Long, activityId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/users/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/activities/" + implicitly[PathBindable[Long]].unbind("activityId", activityId))
}
                                                
    
}
                          

// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:14
// @LINE:13
// @LINE:12
class ReverseDashboard {
    

// @LINE:14
def submitActivity(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "submitactivity")
}
                                                

// @LINE:13
def uploadActivityForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "upload")
}
                                                

// @LINE:12
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "dashboard")
}
                                                
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseAccounts {
    

// @LINE:6
def signup(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:8
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:9
def register(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:10
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "authenticate")
}
                                                

// @LINE:5
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:7
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.javascript {

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
class ReversePacemakerAPI {
    

// @LINE:35
def deleteActivity : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PacemakerAPI.deleteActivity",
   """
      function(userId,activityId) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + "/activities/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("activityId", activityId)})
      }
   """
)
                        

// @LINE:25
def createUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PacemakerAPI.createUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users"})
      }
   """
)
                        

// @LINE:29
def updateUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PacemakerAPI.updateUser",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:27
def user : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PacemakerAPI.user",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:32
def createActivity : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PacemakerAPI.createActivity",
   """
      function(userId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + "/activities"})
      }
   """
)
                        

// @LINE:28
def deleteUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PacemakerAPI.deleteUser",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:36
def updateActivity : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PacemakerAPI.updateActivity",
   """
      function(userId,activityId) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + "/activities/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("activityId", activityId)})
      }
   """
)
                        

// @LINE:23
def users : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PacemakerAPI.users",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users"})
      }
   """
)
                        

// @LINE:24
def deleteAllUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PacemakerAPI.deleteAllUsers",
   """
      function() {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users"})
      }
   """
)
                        

// @LINE:31
def activities : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PacemakerAPI.activities",
   """
      function(userId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + "/activities"})
      }
   """
)
                        

// @LINE:34
def activity : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PacemakerAPI.activity",
   """
      function(userId,activityId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + "/activities/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("activityId", activityId)})
      }
   """
)
                        
    
}
              

// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:14
// @LINE:13
// @LINE:12
class ReverseDashboard {
    

// @LINE:14
def submitActivity : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.submitActivity",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submitactivity"})
      }
   """
)
                        

// @LINE:13
def uploadActivityForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.uploadActivityForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
      }
   """
)
                        

// @LINE:12
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
      }
   """
)
                        
    
}
              

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseAccounts {
    

// @LINE:6
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Accounts.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:8
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Accounts.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:9
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Accounts.register",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:10
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Accounts.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate"})
      }
   """
)
                        

// @LINE:5
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Accounts.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:7
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Accounts.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.ref {


// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
class ReversePacemakerAPI {
    

// @LINE:35
def deleteActivity(userId:Long, activityId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PacemakerAPI.deleteActivity(userId, activityId), HandlerDef(this, "controllers.PacemakerAPI", "deleteActivity", Seq(classOf[Long], classOf[Long]), "DELETE", """""", _prefix + """api/users/$userId<[^/]+>/activities/$activityId<[^/]+>""")
)
                      

// @LINE:25
def createUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PacemakerAPI.createUser(), HandlerDef(this, "controllers.PacemakerAPI", "createUser", Seq(), "POST", """""", _prefix + """api/users""")
)
                      

// @LINE:29
def updateUser(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PacemakerAPI.updateUser(id), HandlerDef(this, "controllers.PacemakerAPI", "updateUser", Seq(classOf[Long]), "PUT", """""", _prefix + """api/users/$id<[^/]+>""")
)
                      

// @LINE:27
def user(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PacemakerAPI.user(id), HandlerDef(this, "controllers.PacemakerAPI", "user", Seq(classOf[Long]), "GET", """""", _prefix + """api/users/$id<[^/]+>""")
)
                      

// @LINE:32
def createActivity(userId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PacemakerAPI.createActivity(userId), HandlerDef(this, "controllers.PacemakerAPI", "createActivity", Seq(classOf[Long]), "POST", """""", _prefix + """api/users/$userId<[^/]+>/activities""")
)
                      

// @LINE:28
def deleteUser(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PacemakerAPI.deleteUser(id), HandlerDef(this, "controllers.PacemakerAPI", "deleteUser", Seq(classOf[Long]), "DELETE", """""", _prefix + """api/users/$id<[^/]+>""")
)
                      

// @LINE:36
def updateActivity(userId:Long, activityId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PacemakerAPI.updateActivity(userId, activityId), HandlerDef(this, "controllers.PacemakerAPI", "updateActivity", Seq(classOf[Long], classOf[Long]), "PUT", """""", _prefix + """api/users/$userId<[^/]+>/activities/$activityId<[^/]+>""")
)
                      

// @LINE:23
def users(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PacemakerAPI.users(), HandlerDef(this, "controllers.PacemakerAPI", "users", Seq(), "GET", """""", _prefix + """api/users""")
)
                      

// @LINE:24
def deleteAllUsers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PacemakerAPI.deleteAllUsers(), HandlerDef(this, "controllers.PacemakerAPI", "deleteAllUsers", Seq(), "DELETE", """""", _prefix + """api/users""")
)
                      

// @LINE:31
def activities(userId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PacemakerAPI.activities(userId), HandlerDef(this, "controllers.PacemakerAPI", "activities", Seq(classOf[Long]), "GET", """""", _prefix + """api/users/$userId<[^/]+>/activities""")
)
                      

// @LINE:34
def activity(userId:Long, activityId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PacemakerAPI.activity(userId, activityId), HandlerDef(this, "controllers.PacemakerAPI", "activity", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """api/users/$userId<[^/]+>/activities/$activityId<[^/]+>""")
)
                      
    
}
                          

// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:14
// @LINE:13
// @LINE:12
class ReverseDashboard {
    

// @LINE:14
def submitActivity(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.submitActivity(), HandlerDef(this, "controllers.Dashboard", "submitActivity", Seq(), "POST", """""", _prefix + """submitactivity""")
)
                      

// @LINE:13
def uploadActivityForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.uploadActivityForm(), HandlerDef(this, "controllers.Dashboard", "uploadActivityForm", Seq(), "GET", """""", _prefix + """upload""")
)
                      

// @LINE:12
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.index(), HandlerDef(this, "controllers.Dashboard", "index", Seq(), "GET", """""", _prefix + """dashboard""")
)
                      
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseAccounts {
    

// @LINE:6
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Accounts.signup(), HandlerDef(this, "controllers.Accounts", "signup", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:8
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Accounts.logout(), HandlerDef(this, "controllers.Accounts", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:9
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Accounts.register(), HandlerDef(this, "controllers.Accounts", "register", Seq(), "POST", """""", _prefix + """register""")
)
                      

// @LINE:10
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Accounts.authenticate(), HandlerDef(this, "controllers.Accounts", "authenticate", Seq(), "POST", """""", _prefix + """authenticate""")
)
                      

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Accounts.index(), HandlerDef(this, "controllers.Accounts", "index", Seq(), "GET", """""", _prefix + """""")
)
                      

// @LINE:7
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Accounts.login(), HandlerDef(this, "controllers.Accounts", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    