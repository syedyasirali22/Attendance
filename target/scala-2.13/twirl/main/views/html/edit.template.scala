
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
<h1 style="border-style:solid;color:black;text-align:center;border-width:1px; margin: 5% 35% 2% 35%;background-color:grey;color:white">Enter details</h1>
<div align="center" style="border-style:solid; border-width:1px; margin: 2% 35% 20% 35%; background-color:lightgrey">
    <form method="POST" action="/editdetails" name="editdetails" id="editdetails">
        <br><br>
        <h2> Enter your Details </h2>

        Enter your email: &nbsp &nbsp &nbsp &nbsp&nbsp&nbsp <input type="email" name="email" /><br><br>
        Enter your ID: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp&nbsp <input type="text" name="pid" pattern="([0-9]"/><br><br>
        Enter your name: &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp&nbsp <input type="text" name="name" pattern="([^\s][A-z\s]+)" title="Should be same as entered at registration time and contain only alphabatical characters and there should be no open space at the start"/><br><br>

        Enter Password: &nbsp &nbsp   &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp <input type="password" name="password1" id="password1" pattern ="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])."""),format.raw/*17.177*/("""{"""),format.raw/*17.178*/("""8,"""),format.raw/*17.180*/("""}"""),format.raw/*17.181*/("""" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"/><br><br>
        <br>
        <p>**You can only update your name here**<p>
        <input type="submit" value="submit details" style="align:center"></input>
        &nbsp&nbsp&nbsp
        <br><br>
        <div>"""),_display_(/*23.15*/response),format.raw/*23.23*/("""</div>
        <br>
        <script language='javascript' type='text/javascript'>
    function check(input) """),format.raw/*26.27*/("""{"""),format.raw/*26.28*/("""
        """),format.raw/*27.9*/("""if (input.value != document.getElementById('password1').value) """),format.raw/*27.72*/("""{"""),format.raw/*27.73*/("""
            """),format.raw/*28.13*/("""input.setCustomValidity('Password Must be Matching.');
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/(""" """),format.raw/*29.11*/("""else """),format.raw/*29.16*/("""{"""),format.raw/*29.17*/("""
"""),format.raw/*30.1*/("""<!--            input is valid &#45;&#45; reset the error message-->
            input.setCustomValidity('');
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/("""
    """),format.raw/*33.5*/("""}"""),format.raw/*33.6*/("""
"""),format.raw/*34.1*/("""</script>
    </form >

    <form method="GET" action="/attendance">
        <input type="submit" value="Return to previous page" />
    </form>

</div>
</body>
</html>
""")))}),format.raw/*44.2*/("""
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
                  DATE: 2019-12-03T18:36:34.813
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/edit.scala.html
                  HASH: c9844aeea7dff41e7db7c9b770fb8d201bf242cc
                  MATRIX: 947->1|1060->19|1088->22|1131->57|1170->59|1198->61|2369->1203|2399->1204|2430->1206|2460->1207|2823->1543|2852->1551|2991->1662|3020->1663|3057->1673|3148->1736|3177->1737|3219->1751|3310->1815|3339->1816|3368->1817|3401->1822|3430->1823|3459->1825|3606->1945|3635->1946|3668->1952|3696->1953|3725->1955|3935->2135
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|49->17|49->17|49->17|49->17|55->23|55->23|58->26|58->26|59->27|59->27|59->27|60->28|61->29|61->29|61->29|61->29|61->29|62->30|64->32|64->32|65->33|65->33|66->34|76->44
                  -- GENERATED --
              */
          