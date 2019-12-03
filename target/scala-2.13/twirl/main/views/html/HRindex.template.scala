
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

object HRindex extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
    <div align="center" style="border-style:solid; border-width:1px; margin:10% 35%; background-color:lightgrey">
        <form method="POST" action="/persondetails" name="persondetails" id="persondetails">
            <br>
            <h1> Enter your e-mail </h1><br>
            <div>Hello ("""),_display_(/*20.26*/session/*20.33*/.get("sessionemail")),format.raw/*20.53*/(""") !!!</div>

            <div class="form-group" style=" margin:5%">
                <label for="email"> Kindly mark your your attendance by entering your email again</label>
                <input type="text" class="form-control" id="email" name="email" pattern="([0-9]"/>
            </div>

            <input type="submit" value="Submit Attendance" class="btn btn-success"></input>
            &nbsp&nbsp&nbsp
            <br>
        </form>
        <div>"""),_display_(/*31.15*/response),format.raw/*31.23*/("""</div>
        <br>

        <div>
            <form method="POST" action="/logout">
                <input type="button" value="Log-out" class="btn btn-success" onclick="window.location.href = '/logout';">
                <br>
                <br>
                <br>
            </form>
        </div>

        <form method="POST" action="/alldetails">
            <input type="submit" value="Person Details" class="btn btn-success" >
            <br><br>
        </form>

    </div>
</div>
</body>
</html>
""")))}),format.raw/*52.2*/("""
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
                  DATE: 2019-12-03T19:03:30.371
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/HRindex.scala.html
                  HASH: 3c7f064224a1ebcdfd9b26de048d67e391bbc39a
                  MATRIX: 950->1|1063->19|1091->22|1122->45|1161->47|1189->49|2084->917|2100->924|2141->944|2640->1416|2669->1424|3231->1956
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|52->20|52->20|52->20|63->31|63->31|84->52
                  -- GENERATED --
              */
          