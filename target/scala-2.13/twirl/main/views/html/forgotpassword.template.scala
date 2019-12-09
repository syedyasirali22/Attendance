
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
<br>

<h1 style="border-style:solid;color:black;text-align:center;border-width:1px; margin: 5% 35% 2% 35%;background-color:grey;color:white">Enter details</h1>
<div align="center" style="border-style:solid; border-width:1px; margin: 2% 35% 20% 35%; background-color:lightgrey">
    <form method="POST" action="/getpassword" name="getpassword" id="getpassword">
        <br><br>

        Enter your email: &nbsp &nbsp &nbsp &nbsp&nbsp&nbsp <input type="email" name="email" /><br><br>
        Enter your ID: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp&nbsp <input type="text" name="pid" pattern="([0-9]"/><br><br>
        Enter your name: &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp&nbsp <input type="text" name="name" pattern="([^\s][A-z\s]+)" title="Should be same as entered at registration time and contain only alphabatical characters and there should be no open space at the start"/><br><br>

        Set New Password: &nbsp &nbsp   &nbsp&nbsp&nbsp&nbsp <input type="password" name="password1" id="password1" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])."""),format.raw/*18.157*/("""{"""),format.raw/*18.158*/("""8,"""),format.raw/*18.160*/("""}"""),format.raw/*18.161*/("""" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"/><br><br>
        Confirm New Password:  &nbsp  <input type="password" name="password2" id="password2" oninput="check(this)" /><br><br>

        <input type="submit" value="submit details" style="align:center"></input>
        &nbsp&nbsp&nbsp
        <br><br>
        <div>"""),_display_(/*24.15*/response),format.raw/*24.23*/("""</div>
        <br>
        <script language='javascript' type='text/javascript'>
    function check(input) """),format.raw/*27.27*/("""{"""),format.raw/*27.28*/("""
        """),format.raw/*28.9*/("""if (input.value != document.getElementById('password1').value) """),format.raw/*28.72*/("""{"""),format.raw/*28.73*/("""
            """),format.raw/*29.13*/("""input.setCustomValidity('Password Must be Matching.');
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/(""" """),format.raw/*30.11*/("""else """),format.raw/*30.16*/("""{"""),format.raw/*30.17*/("""
"""),format.raw/*31.1*/("""<!--            input is valid &#45;&#45; reset the error message-->
            input.setCustomValidity('');
        """),format.raw/*33.9*/("""}"""),format.raw/*33.10*/("""
    """),format.raw/*34.5*/("""}"""),format.raw/*34.6*/("""
"""),format.raw/*35.1*/("""</script>
    </form>
</div>
</body>
</html>
""")))}),format.raw/*40.2*/("""
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
                  DATE: 2019-12-09T17:48:28.099
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/forgotpassword.scala.html
                  HASH: 53e980bd3000c05d7b52086aca9b3c766eff35ac
                  MATRIX: 957->1|1070->19|1098->22|1141->57|1180->59|1208->61|2328->1152|2358->1153|2389->1155|2419->1156|2843->1553|2872->1561|3011->1672|3040->1673|3077->1683|3168->1746|3197->1747|3239->1761|3330->1825|3359->1826|3388->1827|3421->1832|3450->1833|3479->1835|3626->1955|3655->1956|3688->1962|3716->1963|3745->1965|3826->2016
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|50->18|50->18|50->18|50->18|56->24|56->24|59->27|59->27|60->28|60->28|60->28|61->29|62->30|62->30|62->30|62->30|62->30|63->31|65->33|65->33|66->34|66->34|67->35|72->40
                  -- GENERATED --
              */
          