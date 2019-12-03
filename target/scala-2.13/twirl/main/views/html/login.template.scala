
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
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container-fluid">
    <h1 style="color:black;text-align:center; margin: 5% 35% 0% 35%;background-color:Black;color:white">Login Here</h1>
    <div  style="margin: 0% 35% 20% 35%; background-color:lightgrey">
        <form method="POST" action="/login" name="registration" id="registration">
            <br>

            <div class="form-group"  style=" margin:5%">
                <label for="email">Enter your email:</label>
                <input type="text" class="form-control" id="email"  name="email" />
            </div>

            <div class="form-group"  style=" margin:5%">
                <label for="email">Enter password:</label>
                <input type="password" class="form-control" id="password"   name="password" />
            </div>

            <br>
            <div align="center">

            <input type="submit" value="Login" style="align:center" class="btn btn-success"></input><br><br>
            </div>

        </form>

        <div align="center">
            <form action="/register" method="GET" >
                <input type="submit" value="Register here, if unregistered" class="btn btn-success" >
                <div>"""),_display_(/*41.23*/response),format.raw/*41.31*/("""</div>
                <br>
            </form>

            <form action="/forgotpassword" method="GET" >
                <input type="submit" value="Forgot Password" class="btn btn-success" >
                <div>"""),_display_(/*47.23*/response),format.raw/*47.31*/("""</div>
                <br>
            </form>


            <!--        <a href="/forgotpassword"  >Forgot Password</a>-->

        </div>
        <br>

    </div>


</div>

</body>
</html>
""")))}))
      }
    }
  }

  def render(response:String): play.twirl.api.HtmlFormat.Appendable = apply(response)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (response) => apply(response)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-03T18:57:08.396
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/login.scala.html
                  HASH: 1179a625423a00e641abc224a070617f95cb9f6a
                  MATRIX: 948->1|1061->19|1089->22|1132->57|1171->59|1199->61|2966->1801|2995->1809|3244->2031|3273->2039
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|73->41|73->41|79->47|79->47
                  -- GENERATED --
              */
          