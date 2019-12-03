
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
            <div>Hello ("""),_display_(/*18.26*/session/*18.33*/.get("sessionemail")),format.raw/*18.53*/("""), </div>
            <br>


            <div class="form-group" style=" margin:5%">
                <label for="email">  kindly mark your your attendance by entering your email again</label>
                <input type="text" class="form-control" id="email" name="email" pattern="([0-9]"/>
            </div>


            <input type="submit" value="Submit Attendance" class="btn btn-success"></input>
            &nbsp&nbsp&nbsp
            <br><br>
        </form>
        <div>"""),_display_(/*32.15*/response),format.raw/*32.23*/("""</div>
        <br>
        <!--    <br>-->
        <!--    <form method="POST" action="/singledetails">-->
        <!--        <input type="submit" value="see your attendance details here" style="align=center" >-->
        <!--        <br><br>-->
        <!--    </form>-->
        <div>
            <input type="button" value="Log-out" class="btn btn-success" onclick="window.location.href = '/logout';">
            <br><br>
        </div>

    </div>
</div>
</body>
</html>
""")))}),format.raw/*48.2*/("""
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
                  DATE: 2019-12-03T18:58:32.155
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/index.scala.html
                  HASH: fdc0f8f53ebcefd3db4d05da85e6b3eac8d5355c
                  MATRIX: 948->1|1061->19|1089->22|1120->45|1159->47|1187->49|2040->875|2056->882|2097->902|2621->1399|2650->1407|3175->1902
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|50->18|50->18|50->18|64->32|64->32|80->48
                  -- GENERATED --
              */
          