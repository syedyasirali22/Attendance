
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

object forgotpassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
    <form method="POST" action="/getpassword" name="getpassword" id="getpassword">
        <br><br>
        <h2> Enter your Details </h2>

        Enter your email: &nbsp &nbsp &nbsp &nbsp&nbsp&nbsp <input type="email" name="email" /><br><br>
        Enter your ID: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp&nbsp <input type="text" name="pid" pattern="([0-9]"/><br><br>
        Enter your name: &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp&nbsp <input type="text" name="name" pattern="([^\s][A-z\s]+)" title="Should be same as entered at registration time and contain only alphabatical characters and there should be no open space at the start"/><br><br>

        Set New Password: &nbsp &nbsp   &nbsp&nbsp&nbsp&nbsp <input type="password" name="password1" id="password1" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])."""),format.raw/*17.157*/("""{"""),format.raw/*17.158*/("""8,"""),format.raw/*17.160*/("""}"""),format.raw/*17.161*/("""" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"/><br><br>
        Confirm New Password:  &nbsp  <input type="password" name="password2" id="password2" oninput="check(this)" /><br><br>

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
    </form>
</div>
</body>
</html>
""")))}),format.raw/*39.2*/("""
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
                  DATE: 2019-12-02T14:33:34.648
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/forgotpassword.scala.html
                  HASH: 6d6f873d0d68d7f8358555d4d85d815cceebf2c4
                  MATRIX: 957->1|1070->19|1098->22|1141->57|1180->59|1208->61|2359->1183|2389->1184|2420->1186|2450->1187|2874->1584|2903->1592|3042->1703|3071->1704|3108->1714|3199->1777|3228->1778|3270->1792|3361->1856|3390->1857|3419->1858|3452->1863|3481->1864|3510->1866|3657->1986|3686->1987|3719->1993|3747->1994|3776->1996|3857->2047
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|49->17|49->17|49->17|49->17|55->23|55->23|58->26|58->26|59->27|59->27|59->27|60->28|61->29|61->29|61->29|61->29|61->29|62->30|64->32|64->32|65->33|65->33|66->34|71->39
                  -- GENERATED --
              */
          