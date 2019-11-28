
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(response: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),_display_(/*2.2*/main("Welcome to Nexxo Registration page")/*2.44*/ {_display_(Seq[Any](format.raw/*2.46*/("""
"""),format.raw/*3.1*/("""<html>
<head>
</head>
<body>
<div align="center" style="border-style:solid; border-width:1px; margin:5% 35% 20% 35%; background-color:lightgrey">
  <form method="POST" action="/register/login" name="registrationForm" id="registrationForm">
    <br><br>
    <h1> Registration </h1>
    Enter Name &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp&nbsp&nbsp&nbsp <input type="name" name="name" pattern="([^\s][A-z\s]+)" title="Should contain only alphabatical characters and there should be no open space at the start"/><br><br>
    Enter Email &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp&nbsp&nbsp&nbsp <input type="email" name="email" title="Enter e-mail"/><br><br>
    Enter Password &nbsp &nbsp &nbsp &nbsp &nbsp<input type="password" name="password1" id="password1" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])."""),format.raw/*13.144*/("""{"""),format.raw/*13.145*/("""8,"""),format.raw/*13.147*/("""}"""),format.raw/*13.148*/("""" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"/><br><br>
    Confirm  Password &nbsp &nbsp &nbsp<input type="password" name="password2" title="confirm-password" id="password2" oninput="check(this)" /><br><br>
   <br><br>
    <input type="submit"  value="Register me" ></input>

    &nbsp&nbsp&nbsp
    <br><br>
      <script language='javascript' type='text/javascript'>
    function check(input) """),format.raw/*21.27*/("""{"""),format.raw/*21.28*/("""
        """),format.raw/*22.9*/("""if (input.value != document.getElementById('password1').value) """),format.raw/*22.72*/("""{"""),format.raw/*22.73*/("""
            """),format.raw/*23.13*/("""input.setCustomValidity('Password Must be Matching.');
        """),format.raw/*24.9*/("""}"""),format.raw/*24.10*/(""" """),format.raw/*24.11*/("""else """),format.raw/*24.16*/("""{"""),format.raw/*24.17*/("""
"""),format.raw/*25.1*/("""<!--            input is valid &#45;&#45; reset the error message-->
            input.setCustomValidity('');
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/("""
    """),format.raw/*28.5*/("""}"""),format.raw/*28.6*/("""
"""),format.raw/*29.1*/("""</script>
  </form>
  <div>"""),_display_(/*31.9*/response),format.raw/*31.17*/("""</div>
    <br>
  <form action="/login" method="GET" >
    <input type="submit" value="Login if already registered" style="align:center">
    <br><br>
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
                  DATE: 2019-11-28T10:32:34.733
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/register.scala.html
                  HASH: edd5cc6c9d8e89e5b640bca46a8c5b7fd93682b7
                  MATRIX: 951->1|1064->19|1092->22|1142->64|1181->66|1209->68|2033->863|2063->864|2094->866|2124->867|2627->1342|2656->1343|2693->1353|2784->1416|2813->1417|2855->1431|2946->1495|2975->1496|3004->1497|3037->1502|3066->1503|3095->1505|3242->1625|3271->1626|3304->1632|3332->1633|3361->1635|3417->1665|3446->1673|3670->1867
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|45->13|45->13|45->13|45->13|53->21|53->21|54->22|54->22|54->22|55->23|56->24|56->24|56->24|56->24|56->24|57->25|59->27|59->27|60->28|60->28|61->29|63->31|63->31|72->40
                  -- GENERATED --
              */
          