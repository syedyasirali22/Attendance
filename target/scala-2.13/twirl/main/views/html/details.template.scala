
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

object details extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[dto.PersonAttendance],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(attendance: List[dto.PersonAttendance]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""
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
<div class="container" align="center"
     style="border-style:solid; border-width:1px; margin:10% auto; width:701px; background-color:dark">

    <h1>Hi Admin </h1>
    <h2> Please find the details of Attendance here</h2>
    <br>
    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
            <tr>
                <th> ID</th>
                <th> Name</th>
                <th> &nbsp &nbsp &nbsp Check-in Time</th>
                <th> &nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbspCheck-out Time</th>
            </tr>
            <thead class="thead-dark">
            """),_display_(/*31.14*/for(n <- attendance) yield /*31.34*/{_display_(Seq[Any](format.raw/*31.35*/("""
            """),format.raw/*32.13*/("""<tr>
                <td> """),_display_(/*33.23*/n/*33.24*/.getId),format.raw/*33.30*/("""</td>
                <td> """),_display_(/*34.23*/n/*34.24*/.getName),format.raw/*34.32*/("""</td>
                <td> &nbsp """),_display_(/*35.29*/n/*35.30*/.getCheckIn),format.raw/*35.41*/("""</td>
                <td>&nbsp &nbsp &nbsp """),_display_(/*36.40*/n/*36.41*/.getCheckOut),format.raw/*36.53*/("""</td>
            </tr>
            """)))}),format.raw/*38.14*/("""
        """),format.raw/*39.9*/("""</table>
    </div>
    <div>
        <input type="button" value="Return to previous page" class="btn btn-success"
               onclick="window.location.href = '/login';">
        <br><br>
    </div>
</div>
</body>
</html>
""")))}),format.raw/*49.2*/("""
"""))
      }
    }
  }

  def render(attendance:List[dto.PersonAttendance]): play.twirl.api.HtmlFormat.Appendable = apply(attendance)

  def f:((List[dto.PersonAttendance]) => play.twirl.api.HtmlFormat.Appendable) = (attendance) => apply(attendance)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-06T13:22:31.744
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/details.scala.html
                  HASH: f251453f26ebbb24f42d783d3e4bdef4130cc481
                  MATRIX: 970->1|1105->41|1133->44|1164->67|1203->69|1231->71|2431->1244|2467->1264|2506->1265|2548->1279|2603->1307|2613->1308|2640->1314|2696->1343|2706->1344|2735->1352|2797->1387|2807->1388|2839->1399|2912->1445|2922->1446|2955->1458|3025->1497|3062->1507|3328->1743
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|63->31|63->31|63->31|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|70->38|71->39|81->49
                  -- GENERATED --
              */
          