
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(response: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),_display_(/*2.2*/main("Welcome to Play")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""
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
    <div align="center" style="border-style:solid; border-width:1px; margin:5% 35%; background-color:lightgrey">
        <form method="POST" action="/attendance" name="myForm" id="myForm">
            <h1> Enter your e-mail </h1>
            <div>Hello ("""),_display_(/*17.26*/session/*17.33*/.get("sessionemail")),format.raw/*17.53*/("""), </div>
            <br>
            <div class="form-group" style=" margin:5%">
                <label for="email">  kindly mark your your attendance by entering your email again</label>
                <input type="text" class="form-control" id="email" name="email" pattern="([0-9]"/>
            </div>
           <input type="submit" value="Submit Attendance" class="btn btn-success"></input>
            &nbsp&nbsp&nbsp
            <br><br>
        </form>
        <div>"""),_display_(/*27.15*/response),format.raw/*27.23*/("""</div>
        <br>
        <div>
            <input type="button" value="Log-out" class="btn btn-success" onclick="window.location.href = '/logout';">
            <br><br>
        </div>

    </div>
</div>
</body>
</html>
""")))}),format.raw/*38.2*/("""
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
                  DATE: 2020-01-06T13:22:33.588
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/index.scala.html
                  HASH: 136805db1ce9ad6cde0e74dccfdb5ccd4e474384
                  MATRIX: 948->1|1061->19|1089->22|1120->45|1159->47|1187->49|2038->873|2054->880|2095->900|2610->1388|2639->1396|2904->1631
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|49->17|49->17|49->17|59->27|59->27|70->38
                  -- GENERATED --
              */
          