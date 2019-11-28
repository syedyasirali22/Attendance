// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Syed_Yasir_PlayProject/Attendance/attendance/conf/routes
// @DATE:Thu Nov 28 10:32:31 IST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:9
  class ReverseRegistrationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def saveRegistration(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "register/login")
    }
  
    // @LINE:9
    def home(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "home")
    }
  
    // @LINE:11
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
  }

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def base(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:34
    def editdetails(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "editdetails")
    }
  
    // @LINE:18
    def saveAttendance(): Call = {
    
      () match {
      
        // @LINE:18
        case ()  =>
          
          Call("POST", _prefix + { _defaultPrefix } + "persondetails")
      
      }
    
    }
  
    // @LINE:35
    def edited(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "editdetails")
    }
  
    // @LINE:20
    def persondetails(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "alldetails")
    }
  
    // @LINE:17
    def HRindex(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "persondetails")
    }
  
    // @LINE:24
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "attendance")
    }
  
  }

  // @LINE:14
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def saveLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:31
    def getpassword(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getpassword")
    }
  
    // @LINE:29
    def forgotpassword(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "forgotpassword")
    }
  
    // @LINE:27
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:14
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:7
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
