
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
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div  style="border-style:solid; border-width:1px; margin:5% 35% 20% 35%; background-color:lightgrey">

    <form method="POST" action="/register/login" name="registrationForm" id="registrationForm">
        <br>

        <div align="center">
            <h1> Registration </h1>
        </div>


        <div class="form-group"  style=" margin:5%">
            <label for="name">Enter Name :</label>
            <input type="name" class="form-control" id="name"  name="name" pattern="([^\s][A-z\s]+)" title="Should contain only alphabatical characters and there should be no open space at the start" />
        </div>

        <div class="form-group"  style=" margin:5%">
            <label for="email">Enter email:</label>
            <input type="email" class="form-control" id="email"  name="email" title="Enter e-mail"/>
        </div>

        <div class="form-group"  style=" margin:5%">
            <label for="password1">Enter Password:</label>
            <input type="password" class="form-control" id="password1"  name="password1" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])."""),format.raw/*35.130*/("""{"""),format.raw/*35.131*/("""8,"""),format.raw/*35.133*/("""}"""),format.raw/*35.134*/("""" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"/>
        </div>

        <div class="form-group"  style=" margin:5%">
            <label for="email">Confirm  Password:</label>
            <input type="password" class="form-control" id="password2"  name="password2" oninput="check(this)" title="confirm-password"/>
        </div>   <br>


        <div align="center">
            <input type="submit"  value="Register me"   class="btn btn-success"></input>
            <br>
        </div>

    </form>


    <div align="center">
        <div>"""),_display_(/*53.15*/response),format.raw/*53.23*/("""</div>    <br>
        <form action="/login" method="GET" >
            <input type="submit" value="Login if already registered" class="btn btn-success">
            <br><br>
        </form>
    </div>


</div>




<script language='javascript' type='text/javascript'>
    function check(input) """),format.raw/*67.27*/("""{"""),format.raw/*67.28*/("""
        """),format.raw/*68.9*/("""if (input.value != document.getElementById('password1').value) """),format.raw/*68.72*/("""{"""),format.raw/*68.73*/("""
            """),format.raw/*69.13*/("""input.setCustomValidity('Password Must be Matching.');
        """),format.raw/*70.9*/("""}"""),format.raw/*70.10*/(""" """),format.raw/*70.11*/("""else """),format.raw/*70.16*/("""{"""),format.raw/*70.17*/("""
"""),format.raw/*71.1*/("""<!--            input is valid &#45;&#45; reset the error message-->
            input.setCustomValidity('');
        """),format.raw/*73.9*/("""}"""),format.raw/*73.10*/("""
    """),format.raw/*74.5*/("""}"""),format.raw/*74.6*/("""
"""),format.raw/*75.1*/("""</script>
</body>
</html>
""")))}),format.raw/*78.2*/("""


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
                  DATE: 2019-12-03T18:46:07.849
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/register.scala.html
                  HASH: ade2ba5394641ae5ce1445c7abb947898fe4bac7
                  MATRIX: 951->1|1064->19|1092->22|1142->64|1181->66|1209->68|2877->1707|2907->1708|2938->1710|2968->1711|3625->2341|3654->2349|3991->2658|4020->2659|4057->2669|4148->2732|4177->2733|4219->2747|4310->2811|4339->2812|4368->2813|4401->2818|4430->2819|4459->2821|4606->2941|4635->2942|4668->2948|4696->2949|4725->2951|4785->2981
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|67->35|67->35|67->35|67->35|85->53|85->53|99->67|99->67|100->68|100->68|100->68|101->69|102->70|102->70|102->70|102->70|102->70|103->71|105->73|105->73|106->74|106->74|107->75|110->78
                  -- GENERATED --
              */
          