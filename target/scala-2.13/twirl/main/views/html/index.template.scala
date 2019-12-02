
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
<body>
<div align="center" style="border-style:solid; border-width:1px; margin:10% 35%; background-color:lightgrey">
    <form method="POST" action="/attendance" name="myForm" id="myForm">
        <br><br>
        <h1> Enter your e-mail </h1>
        <div>Hello ("""),_display_(/*9.22*/session/*9.29*/.get("sessionemail")),format.raw/*9.49*/("""),  kindly mark your your attendance by entering your email again</div>
        <br><br>
       <input type="email" name="email"/><br><br>
        <input type="submit" value="Submit Attendance" style=" align=center"></input>
        &nbsp&nbsp&nbsp
        <br><br>
    </form>
    <div>"""),_display_(/*16.11*/response),format.raw/*16.19*/("""</div>
    <br>
<!--    <br>-->
<!--    <form method="POST" action="/singledetails">-->
<!--        <input type="submit" value="see your attendance details here" style="align=center" >-->
<!--        <br><br>-->
<!--    </form>-->
    <div>
        <input type="button" value="Log-out" style="align=center" onclick="window.location.href = '/logout';">
        <br><br>
    </div>
    <form action="/editdetails" method="GET">
        <input type="submit" value="Edit details"/>
    </form>
    <br>

</div>


</body>
</html>
""")))}),format.raw/*37.2*/("""
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
                  DATE: 2019-12-02T14:33:35.854
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/index.scala.html
                  HASH: 23cff1825a85aa27a6a5d6105812da20240ebacf
                  MATRIX: 948->1|1061->19|1089->22|1120->45|1159->47|1187->49|1490->326|1505->333|1545->353|1867->648|1896->656|2473->1203
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|41->9|41->9|41->9|48->16|48->16|69->37
                  -- GENERATED --
              */
          