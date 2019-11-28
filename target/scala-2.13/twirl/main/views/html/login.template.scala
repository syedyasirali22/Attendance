
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(response: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),_display_(/*2.2*/main("Welcome to Nexxo Login page")/*2.37*/ {_display_(Seq[Any](format.raw/*2.39*/("""
"""),format.raw/*3.1*/("""<html>
<head>
</head>
<body>
<h1 style="border-style:solid;color:black;text-align:center;border-width:1px; margin: 5% 35% 2% 35%;background-color:grey;color:white">Login Here</h1>
<div align="center" style="border-style:solid; border-width:1px; margin: 2% 35% 20% 35%; background-color:lightgrey">
    <form method="POST" action="/login" name="registration" id="registration">
        <br><br>
        <h2> Enter your Details </h2>
        Enter your email: &nbsp &nbsp &nbsp &nbsp&nbsp&nbsp <input type="text" name="email"/><br><br>
        Enter password: &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp&nbsp <input type="password" name="password"/><br><br>
        <input type="submit" value="Login" style="align:center"></input>
        &nbsp&nbsp&nbsp
        <br><br>
        <div>"""),_display_(/*17.15*/response),format.raw/*17.23*/("""</div>
        <br>

    </form>
    <form action="/register" method="GET" >
        <input type="submit" value="Register here, if not registered" style="align:center">
        <br><br>
    </form>
    <a href="/forgotpassword"  >Forgot Password</a>



</div>
</body>
</html>
""")))}),format.raw/*32.2*/("""
"""))
      }
    }
  }

  def render(response:String): play.twirl.api.HtmlFormat.Appendable = apply(response)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (response) => apply(response)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-11-28T10:32:34.623
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/login.scala.html
                  HASH: 35f854b9710be77ae1a24e2d8d8b78f73089e33d
                  MATRIX: 948->1|1061->19|1089->22|1132->57|1171->59|1199->61|2015->850|2044->858|2366->1150
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|49->17|49->17|64->32
                  -- GENERATED --
              */
          