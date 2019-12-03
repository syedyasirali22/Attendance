
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
<div class="container">
    <div class="container-fluid"   align="center" style="border-style:solid; border-width:1px; margin:10% auto; width:701px; background-color:lightgrey">

        <h1>Hi Admin </h1>
        <h2> Please find the details of Attendance here</h2>
        <br>
        <table class="table">
            <thead class="thead-dark">
            <tr ><th > ID </th><th> Name </th><th> &nbsp &nbsp &nbsp Check-in Time</th><th> &nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbspCheck-out Time</th></tr>
            <thead class="thead-dark">
            """),_display_(/*23.14*/for(n <- attendance) yield /*23.34*/{_display_(Seq[Any](format.raw/*23.35*/("""
            """),format.raw/*24.13*/("""<tr><td> """),_display_(/*24.23*/n/*24.24*/.getId),format.raw/*24.30*/("""</td> <td> """),_display_(/*24.42*/n/*24.43*/.getName),format.raw/*24.51*/("""</td>   <td>  &nbsp """),_display_(/*24.72*/n/*24.73*/.getCheckIn),format.raw/*24.84*/("""</td>  <td>&nbsp &nbsp &nbsp """),_display_(/*24.114*/n/*24.115*/.getCheckOut),format.raw/*24.127*/("""</td></tr>
            """)))}),format.raw/*25.14*/("""
        """),format.raw/*26.9*/("""</table>
        <div>
            <input type="button" value="Return to previous page" class="btn btn-success" onclick="window.location.href = '/login';">
            <br><br>
        </div>
    </div>
</div>
</body>
</html>
""")))}),format.raw/*35.2*/("""
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
                  DATE: 2019-12-03T19:21:24.919
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/details.scala.html
                  HASH: adbb572c747f6eb4d6001b9996f5e928dc672c25
                  MATRIX: 970->1|1105->41|1133->44|1164->67|1203->69|1231->71|2362->1175|2398->1195|2437->1196|2479->1210|2516->1220|2526->1221|2553->1227|2592->1239|2602->1240|2631->1248|2679->1269|2689->1270|2721->1281|2779->1311|2790->1312|2824->1324|2880->1349|2917->1359|3183->1595
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|55->23|55->23|55->23|56->24|56->24|56->24|56->24|56->24|56->24|56->24|56->24|56->24|56->24|56->24|56->24|56->24|57->25|58->26|67->35
                  -- GENERATED --
              */
          