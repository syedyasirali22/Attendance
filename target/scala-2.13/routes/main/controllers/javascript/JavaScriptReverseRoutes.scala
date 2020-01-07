// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Syed_Yasir_PlayProject/Attendance/attendance/conf/routes
// @DATE:Mon Jan 06 13:22:30 IST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:4
package controllers.javascript {

  // @LINE:4
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:35
  class ReverseGooglePlayStoreController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def categoryrating: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GooglePlayStoreController.categoryrating",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categoryrating"})
        }
      """
    )
  
    // @LINE:35
    def showPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GooglePlayStoreController.showPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "data"})
        }
      """
    )
  
    // @LINE:37
    def categoryinstalls: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GooglePlayStoreController.categoryinstalls",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categoryinstalls"})
        }
      """
    )
  
    // @LINE:36
    def contentRating: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GooglePlayStoreController.contentRating",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "datacontentratings"})
        }
      """
    )
  
    // @LINE:40
    def mostinstalledApps: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GooglePlayStoreController.mostinstalledApps",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mostinstalledApps"})
        }
      """
    )
  
    // @LINE:39
    def genresapp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GooglePlayStoreController.genresapp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "genresapp"})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def base: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.base",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:31
    def editdetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.editdetails",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editdetails"})
        }
      """
    )
  
    // @LINE:15
    def saveAttendance: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.saveAttendance",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "persondetails"})
          }
        
        }
      """
    )
  
    // @LINE:32
    def edited: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.edited",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "editdetails"})
        }
      """
    )
  
    // @LINE:17
    def persondetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.persondetails",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "alldetails"})
        }
      """
    )
  
    // @LINE:14
    def HRindex: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.HRindex",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "persondetails"})
        }
      """
    )
  
    // @LINE:21
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "attendance"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def saveLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.saveLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:28
    def getpassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.getpassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getpassword"})
        }
      """
    )
  
    // @LINE:26
    def forgotpassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.forgotpassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forgotpassword"})
        }
      """
    )
  
    // @LINE:24
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:11
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseRegistrationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def saveRegistration: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RegistrationController.saveRegistration",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register/login"})
        }
      """
    )
  
    // @LINE:6
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RegistrationController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
    // @LINE:8
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RegistrationController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
  }


}
