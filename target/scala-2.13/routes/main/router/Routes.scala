// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Syed_Yasir_PlayProject/Attendance/attendance/conf/routes
// @DATE:Mon Jan 06 13:22:30 IST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:4
  Assets_2: controllers.Assets,
  // @LINE:5
  HomeController_4: controllers.HomeController,
  // @LINE:6
  RegistrationController_1: controllers.RegistrationController,
  // @LINE:11
  LoginController_0: controllers.LoginController,
  // @LINE:35
  GooglePlayStoreController_3: controllers.GooglePlayStoreController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:4
    Assets_2: controllers.Assets,
    // @LINE:5
    HomeController_4: controllers.HomeController,
    // @LINE:6
    RegistrationController_1: controllers.RegistrationController,
    // @LINE:11
    LoginController_0: controllers.LoginController,
    // @LINE:35
    GooglePlayStoreController_3: controllers.GooglePlayStoreController
  ) = this(errorHandler, Assets_2, HomeController_4, RegistrationController_1, LoginController_0, GooglePlayStoreController_3, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_2, HomeController_4, RegistrationController_1, LoginController_0, GooglePlayStoreController_3, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """data""", """controllers.GooglePlayStoreController.showPage(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datacontentratings""", """controllers.GooglePlayStoreController.contentRating(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categoryinstalls""", """controllers.GooglePlayStoreController.categoryinstalls(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categoryrating""", """controllers.GooglePlayStoreController.categoryrating(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """genresapp""", """controllers.GooglePlayStoreController.genresapp(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mostinstalledApps""", """controllers.GooglePlayStoreController.mostinstalledApps(request:Request)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:4
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_HomeController_base1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_base1_invoker = createInvoker(
    HomeController_4.base,
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

  // @LINE:6
  private[this] lazy val controllers_RegistrationController_home2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_RegistrationController_home2_invoker = createInvoker(
    RegistrationController_1.home,
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

  // @LINE:8
  private[this] lazy val controllers_RegistrationController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_RegistrationController_index3_invoker = createInvoker(
    RegistrationController_1.index,
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

  // @LINE:9
  private[this] lazy val controllers_RegistrationController_saveRegistration4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register/login")))
  )
  private[this] lazy val controllers_RegistrationController_saveRegistration4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      RegistrationController_1.saveRegistration(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:11
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

  // @LINE:12
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

  // @LINE:14
  private[this] lazy val controllers_HomeController_HRindex7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persondetails")))
  )
  private[this] lazy val controllers_HomeController_HRindex7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_4.HRindex(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:15
  private[this] lazy val controllers_HomeController_saveAttendance8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persondetails")))
  )
  private[this] lazy val controllers_HomeController_saveAttendance8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_4.saveAttendance(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:17
  private[this] lazy val controllers_HomeController_persondetails9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("alldetails")))
  )
  private[this] lazy val controllers_HomeController_persondetails9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_4.persondetails(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:21
  private[this] lazy val controllers_HomeController_index10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("attendance")))
  )
  private[this] lazy val controllers_HomeController_index10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_4.index(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:22
  private[this] lazy val controllers_HomeController_saveAttendance11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("attendance")))
  )
  private[this] lazy val controllers_HomeController_saveAttendance11_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_4.saveAttendance(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:24
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

  // @LINE:26
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

  // @LINE:28
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

  // @LINE:31
  private[this] lazy val controllers_HomeController_editdetails15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editdetails")))
  )
  private[this] lazy val controllers_HomeController_editdetails15_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_4.editdetails(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:32
  private[this] lazy val controllers_HomeController_edited16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editdetails")))
  )
  private[this] lazy val controllers_HomeController_edited16_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_4.edited(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:35
  private[this] lazy val controllers_GooglePlayStoreController_showPage17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("data")))
  )
  private[this] lazy val controllers_GooglePlayStoreController_showPage17_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      GooglePlayStoreController_3.showPage(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GooglePlayStoreController",
      "showPage",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """data""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_GooglePlayStoreController_contentRating18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datacontentratings")))
  )
  private[this] lazy val controllers_GooglePlayStoreController_contentRating18_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      GooglePlayStoreController_3.contentRating(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GooglePlayStoreController",
      "contentRating",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """datacontentratings""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_GooglePlayStoreController_categoryinstalls19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categoryinstalls")))
  )
  private[this] lazy val controllers_GooglePlayStoreController_categoryinstalls19_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      GooglePlayStoreController_3.categoryinstalls(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GooglePlayStoreController",
      "categoryinstalls",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """categoryinstalls""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_GooglePlayStoreController_categoryrating20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categoryrating")))
  )
  private[this] lazy val controllers_GooglePlayStoreController_categoryrating20_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      GooglePlayStoreController_3.categoryrating(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GooglePlayStoreController",
      "categoryrating",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """categoryrating""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_GooglePlayStoreController_genresapp21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("genresapp")))
  )
  private[this] lazy val controllers_GooglePlayStoreController_genresapp21_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      GooglePlayStoreController_3.genresapp(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GooglePlayStoreController",
      "genresapp",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """genresapp""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_GooglePlayStoreController_mostinstalledApps22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mostinstalledApps")))
  )
  private[this] lazy val controllers_GooglePlayStoreController_mostinstalledApps22_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      GooglePlayStoreController_3.mostinstalledApps(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GooglePlayStoreController",
      "mostinstalledApps",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """mostinstalledApps""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:4
    case controllers_Assets_versioned0_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:5
    case controllers_HomeController_base1_route(params@_) =>
      call { 
        controllers_HomeController_base1_invoker.call(HomeController_4.base)
      }
  
    // @LINE:6
    case controllers_RegistrationController_home2_route(params@_) =>
      call { 
        controllers_RegistrationController_home2_invoker.call(RegistrationController_1.home)
      }
  
    // @LINE:8
    case controllers_RegistrationController_index3_route(params@_) =>
      call { 
        controllers_RegistrationController_index3_invoker.call(RegistrationController_1.index)
      }
  
    // @LINE:9
    case controllers_RegistrationController_saveRegistration4_route(params@_) =>
      call { 
        controllers_RegistrationController_saveRegistration4_invoker.call(
          req => RegistrationController_1.saveRegistration(req))
      }
  
    // @LINE:11
    case controllers_LoginController_index5_route(params@_) =>
      call { 
        controllers_LoginController_index5_invoker.call(LoginController_0.index)
      }
  
    // @LINE:12
    case controllers_LoginController_saveLogin6_route(params@_) =>
      call { 
        controllers_LoginController_saveLogin6_invoker.call(
          req => LoginController_0.saveLogin(req))
      }
  
    // @LINE:14
    case controllers_HomeController_HRindex7_route(params@_) =>
      call { 
        controllers_HomeController_HRindex7_invoker.call(
          req => HomeController_4.HRindex(req))
      }
  
    // @LINE:15
    case controllers_HomeController_saveAttendance8_route(params@_) =>
      call { 
        controllers_HomeController_saveAttendance8_invoker.call(
          req => HomeController_4.saveAttendance(req))
      }
  
    // @LINE:17
    case controllers_HomeController_persondetails9_route(params@_) =>
      call { 
        controllers_HomeController_persondetails9_invoker.call(
          req => HomeController_4.persondetails(req))
      }
  
    // @LINE:21
    case controllers_HomeController_index10_route(params@_) =>
      call { 
        controllers_HomeController_index10_invoker.call(
          req => HomeController_4.index(req))
      }
  
    // @LINE:22
    case controllers_HomeController_saveAttendance11_route(params@_) =>
      call { 
        controllers_HomeController_saveAttendance11_invoker.call(
          req => HomeController_4.saveAttendance(req))
      }
  
    // @LINE:24
    case controllers_LoginController_logout12_route(params@_) =>
      call { 
        controllers_LoginController_logout12_invoker.call(
          req => LoginController_0.logout(req))
      }
  
    // @LINE:26
    case controllers_LoginController_forgotpassword13_route(params@_) =>
      call { 
        controllers_LoginController_forgotpassword13_invoker.call(
          req => LoginController_0.forgotpassword(req))
      }
  
    // @LINE:28
    case controllers_LoginController_getpassword14_route(params@_) =>
      call { 
        controllers_LoginController_getpassword14_invoker.call(
          req => LoginController_0.getpassword(req))
      }
  
    // @LINE:31
    case controllers_HomeController_editdetails15_route(params@_) =>
      call { 
        controllers_HomeController_editdetails15_invoker.call(
          req => HomeController_4.editdetails(req))
      }
  
    // @LINE:32
    case controllers_HomeController_edited16_route(params@_) =>
      call { 
        controllers_HomeController_edited16_invoker.call(
          req => HomeController_4.edited(req))
      }
  
    // @LINE:35
    case controllers_GooglePlayStoreController_showPage17_route(params@_) =>
      call { 
        controllers_GooglePlayStoreController_showPage17_invoker.call(
          req => GooglePlayStoreController_3.showPage(req))
      }
  
    // @LINE:36
    case controllers_GooglePlayStoreController_contentRating18_route(params@_) =>
      call { 
        controllers_GooglePlayStoreController_contentRating18_invoker.call(
          req => GooglePlayStoreController_3.contentRating(req))
      }
  
    // @LINE:37
    case controllers_GooglePlayStoreController_categoryinstalls19_route(params@_) =>
      call { 
        controllers_GooglePlayStoreController_categoryinstalls19_invoker.call(
          req => GooglePlayStoreController_3.categoryinstalls(req))
      }
  
    // @LINE:38
    case controllers_GooglePlayStoreController_categoryrating20_route(params@_) =>
      call { 
        controllers_GooglePlayStoreController_categoryrating20_invoker.call(
          req => GooglePlayStoreController_3.categoryrating(req))
      }
  
    // @LINE:39
    case controllers_GooglePlayStoreController_genresapp21_route(params@_) =>
      call { 
        controllers_GooglePlayStoreController_genresapp21_invoker.call(
          req => GooglePlayStoreController_3.genresapp(req))
      }
  
    // @LINE:40
    case controllers_GooglePlayStoreController_mostinstalledApps22_route(params@_) =>
      call { 
        controllers_GooglePlayStoreController_mostinstalledApps22_invoker.call(
          req => GooglePlayStoreController_3.mostinstalledApps(req))
      }
  }
}
