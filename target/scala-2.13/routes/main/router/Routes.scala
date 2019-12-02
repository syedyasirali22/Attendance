// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Syed_Yasir_PlayProject/Attendance/attendance/conf/routes
// @DATE:Mon Dec 02 14:33:33 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Assets_1: controllers.Assets,
  // @LINE:8
  HomeController_3: controllers.HomeController,
  // @LINE:9
  RegistrationController_2: controllers.RegistrationController,
  // @LINE:14
  LoginController_0: controllers.LoginController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Assets_1: controllers.Assets,
    // @LINE:8
    HomeController_3: controllers.HomeController,
    // @LINE:9
    RegistrationController_2: controllers.RegistrationController,
    // @LINE:14
    LoginController_0: controllers.LoginController
  ) = this(errorHandler, Assets_1, HomeController_3, RegistrationController_2, LoginController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_1, HomeController_3, RegistrationController_2, LoginController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix, """controllers.HomeController.base"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.RegistrationController.home"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.RegistrationController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register/login""", """controllers.RegistrationController.saveRegistration(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.saveLogin(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """persondetails""", """controllers.HomeController.HRindex(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """persondetails""", """controllers.HomeController.saveAttendance(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """alldetails""", """controllers.HomeController.persondetails(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """attendance""", """controllers.HomeController.index(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """attendance""", """controllers.HomeController.saveAttendance(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forgotpassword""", """controllers.LoginController.forgotpassword(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getpassword""", """controllers.LoginController.getpassword(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editdetails""", """controllers.HomeController.editdetails(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editdetails""", """controllers.HomeController.edited(request:Request)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ An example controller showing a sample home page
 Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_base1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_base1_invoker = createInvoker(
    HomeController_3.base,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "base",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_RegistrationController_home2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_RegistrationController_home2_invoker = createInvoker(
    RegistrationController_2.home,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegistrationController",
      "home",
      Nil,
      "GET",
      this.prefix + """home""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_RegistrationController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_RegistrationController_index3_invoker = createInvoker(
    RegistrationController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegistrationController",
      "index",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_RegistrationController_saveRegistration4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register/login")))
  )
  private[this] lazy val controllers_RegistrationController_saveRegistration4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      RegistrationController_2.saveRegistration(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegistrationController",
      "saveRegistration",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """register/login""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_LoginController_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_index5_invoker = createInvoker(
    LoginController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "index",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_LoginController_saveLogin6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_saveLogin6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      LoginController_0.saveLogin(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "saveLogin",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_HRindex7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persondetails")))
  )
  private[this] lazy val controllers_HomeController_HRindex7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_3.HRindex(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "HRindex",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """persondetails""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_saveAttendance8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persondetails")))
  )
  private[this] lazy val controllers_HomeController_saveAttendance8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_3.saveAttendance(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "saveAttendance",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """persondetails""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_persondetails9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("alldetails")))
  )
  private[this] lazy val controllers_HomeController_persondetails9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_3.persondetails(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "persondetails",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """alldetails""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_index10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("attendance")))
  )
  private[this] lazy val controllers_HomeController_index10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_3.index(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """attendance""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_saveAttendance11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("attendance")))
  )
  private[this] lazy val controllers_HomeController_saveAttendance11_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_3.saveAttendance(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "saveAttendance",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """attendance""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_LoginController_logout12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout12_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      LoginController_0.logout(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_LoginController_forgotpassword13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forgotpassword")))
  )
  private[this] lazy val controllers_LoginController_forgotpassword13_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      LoginController_0.forgotpassword(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "forgotpassword",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """forgotpassword""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_LoginController_getpassword14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getpassword")))
  )
  private[this] lazy val controllers_LoginController_getpassword14_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      LoginController_0.getpassword(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "getpassword",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """getpassword""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_HomeController_editdetails15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editdetails")))
  )
  private[this] lazy val controllers_HomeController_editdetails15_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_3.editdetails(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "editdetails",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """editdetails""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_HomeController_edited16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editdetails")))
  )
  private[this] lazy val controllers_HomeController_edited16_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_3.edited(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "edited",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """editdetails""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Assets_versioned0_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:8
    case controllers_HomeController_base1_route(params@_) =>
      call { 
        controllers_HomeController_base1_invoker.call(HomeController_3.base)
      }
  
    // @LINE:9
    case controllers_RegistrationController_home2_route(params@_) =>
      call { 
        controllers_RegistrationController_home2_invoker.call(RegistrationController_2.home)
      }
  
    // @LINE:11
    case controllers_RegistrationController_index3_route(params@_) =>
      call { 
        controllers_RegistrationController_index3_invoker.call(RegistrationController_2.index)
      }
  
    // @LINE:12
    case controllers_RegistrationController_saveRegistration4_route(params@_) =>
      call { 
        controllers_RegistrationController_saveRegistration4_invoker.call(
          req => RegistrationController_2.saveRegistration(req))
      }
  
    // @LINE:14
    case controllers_LoginController_index5_route(params@_) =>
      call { 
        controllers_LoginController_index5_invoker.call(LoginController_0.index)
      }
  
    // @LINE:15
    case controllers_LoginController_saveLogin6_route(params@_) =>
      call { 
        controllers_LoginController_saveLogin6_invoker.call(
          req => LoginController_0.saveLogin(req))
      }
  
    // @LINE:17
    case controllers_HomeController_HRindex7_route(params@_) =>
      call { 
        controllers_HomeController_HRindex7_invoker.call(
          req => HomeController_3.HRindex(req))
      }
  
    // @LINE:18
    case controllers_HomeController_saveAttendance8_route(params@_) =>
      call { 
        controllers_HomeController_saveAttendance8_invoker.call(
          req => HomeController_3.saveAttendance(req))
      }
  
    // @LINE:20
    case controllers_HomeController_persondetails9_route(params@_) =>
      call { 
        controllers_HomeController_persondetails9_invoker.call(
          req => HomeController_3.persondetails(req))
      }
  
    // @LINE:24
    case controllers_HomeController_index10_route(params@_) =>
      call { 
        controllers_HomeController_index10_invoker.call(
          req => HomeController_3.index(req))
      }
  
    // @LINE:25
    case controllers_HomeController_saveAttendance11_route(params@_) =>
      call { 
        controllers_HomeController_saveAttendance11_invoker.call(
          req => HomeController_3.saveAttendance(req))
      }
  
    // @LINE:27
    case controllers_LoginController_logout12_route(params@_) =>
      call { 
        controllers_LoginController_logout12_invoker.call(
          req => LoginController_0.logout(req))
      }
  
    // @LINE:29
    case controllers_LoginController_forgotpassword13_route(params@_) =>
      call { 
        controllers_LoginController_forgotpassword13_invoker.call(
          req => LoginController_0.forgotpassword(req))
      }
  
    // @LINE:31
    case controllers_LoginController_getpassword14_route(params@_) =>
      call { 
        controllers_LoginController_getpassword14_invoker.call(
          req => LoginController_0.getpassword(req))
      }
  
    // @LINE:34
    case controllers_HomeController_editdetails15_route(params@_) =>
      call { 
        controllers_HomeController_editdetails15_invoker.call(
          req => HomeController_3.editdetails(req))
      }
  
    // @LINE:35
    case controllers_HomeController_edited16_route(params@_) =>
      call { 
        controllers_HomeController_edited16_invoker.call(
          req => HomeController_3.edited(req))
      }
  }
}
