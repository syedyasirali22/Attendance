// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Syed_Yasir_PlayProject/Attendance/attendance/conf/routes
// @DATE:Mon Dec 09 19:08:38 IST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:4
package controllers {

  // @LINE:4
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:35
  class ReverseGooglePlayStoreController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def contentRating(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "datacontentratings")
    }
  
    // @LINE:35
    def showPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "data")
    }
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def base(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:31
    def editdetails(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "editdetails")
    }
  
    // @LINE:15
    def saveAttendance(): Call = {
    
      () match {
      
        // @LINE:15
        case ()  =>
          
          Call("POST", _prefix + { _defaultPrefix } + "persondetails")
      
      }
    
    }
  
    // @LINE:32
    def edited(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "editdetails")
    }
  
    // @LINE:17
    def persondetails(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "alldetails")
    }
  
    // @LINE:14
    def HRindex(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "persondetails")
    }
  
    // @LINE:21
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "attendance")
    }
  
  }

  // @LINE:11
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def saveLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:28
    def getpassword(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getpassword")
    }
  
    // @LINE:26
    def forgotpassword(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "forgotpassword")
    }
  
    // @LINE:24
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:11
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:6
  class ReverseRegistrationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def saveRegistration(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "register/login")
    }
  
    // @LINE:6
    def home(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "home")
    }
  
    // @LINE:8
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
  }


}
