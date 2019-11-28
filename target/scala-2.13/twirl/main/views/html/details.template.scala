
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
<body>

<div align="center" style="border-style:solid; border-width:1px; margin:10% auto; width:701px; background-color:lightgrey">

    <h1>Hi Admin </h1>
    <h2> Please find the details of Attendance here</h2>
    <br>
    <table>
        <tr><th> ID </th><th> &nbsp &nbsp Name</th><th> &nbsp &nbsp Check-in Time</th><th> Check-out Time</th></tr>
        """),_display_(/*13.10*/for(n <- attendance) yield /*13.30*/{_display_(Seq[Any](format.raw/*13.31*/("""
        """),format.raw/*14.9*/("""<tr><td> """),_display_(/*14.19*/n/*14.20*/.getId),format.raw/*14.26*/("""</td>  <td> """),_display_(/*14.39*/n/*14.40*/.getName),format.raw/*14.48*/("""</td>  <td>&nbsp &nbsp &nbsp &nbsp """),_display_(/*14.84*/n/*14.85*/.getCheckIn),format.raw/*14.96*/("""</td>  <td>&nbsp &nbsp &nbsp &nbsp """),_display_(/*14.132*/n/*14.133*/.getCheckOut),format.raw/*14.145*/("""</td></tr>
        """)))}),format.raw/*15.10*/("""
    """),format.raw/*16.5*/("""</table>
    <div>
        <input type="button" value="Return to previous page" style="align=center" onclick="window.location.href = '/persondetails';">
        <br><br>
    </div>
</div>
</body>
</html>
""")))}),format.raw/*24.2*/("""
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
                  DATE: 2019-11-28T10:32:32.044
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/details.scala.html
                  HASH: 1c0860cb95a1181d22fe5c777ddf8569f56b9876
                  MATRIX: 970->1|1105->41|1133->44|1164->67|1203->69|1231->71|1634->447|1670->467|1709->468|1746->478|1783->488|1793->489|1820->495|1860->508|1870->509|1899->517|1962->553|1972->554|2004->565|2068->601|2079->602|2113->614|2165->635|2198->641|2441->854
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|45->13|45->13|45->13|46->14|46->14|46->14|46->14|46->14|46->14|46->14|46->14|46->14|46->14|46->14|46->14|46->14|47->15|48->16|56->24
                  -- GENERATED --
              */
          