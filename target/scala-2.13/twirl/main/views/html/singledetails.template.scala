
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

object singledetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Attendance],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(attendance: List[Attendance]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),_display_(/*2.2*/main("Welcome to Play")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""
"""),format.raw/*3.1*/("""<html>
<body>

<div align="center" style="border-style:solid; border-width:1px; margin:10% auto; width:701px; background-color:lightgrey">

    <h1>Hi Admin </h1>
    <h2> Please find the details of Attendance here</h2>
    <br>
    <table>
        <tr><th> ID </th><th> &nbsp &nbsp Check-in Time</th><th> Check-out Time</th></tr>
        """),_display_(/*13.10*/for(n <- attendance) yield /*13.30*/{_display_(Seq[Any](format.raw/*13.31*/("""
        """),format.raw/*14.9*/("""<tr><td> """),_display_(/*14.19*/n/*14.20*/.getId),format.raw/*14.26*/("""</td>   <td>&nbsp &nbsp &nbsp &nbsp """),_display_(/*14.63*/n/*14.64*/.getCheckIn),format.raw/*14.75*/("""</td>  <td>&nbsp &nbsp &nbsp &nbsp """),_display_(/*14.111*/n/*14.112*/.getCheckOut),format.raw/*14.124*/("""</td></tr>
        """)))}),format.raw/*15.10*/("""
    """),format.raw/*16.5*/("""</table>
    <div>
        <input type="button" value="Return to previous page" style="align=center" onclick="window.location.href = '/login';">
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

  def render(attendance:List[Attendance]): play.twirl.api.HtmlFormat.Appendable = apply(attendance)

  def f:((List[Attendance]) => play.twirl.api.HtmlFormat.Appendable) = (attendance) => apply(attendance)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-03T18:36:38.654
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/singledetails.scala.html
                  HASH: ece2014e1477320bc2960a7cc4296c4995ac7861
                  MATRIX: 966->1|1091->31|1119->34|1150->57|1189->59|1217->61|1594->411|1630->431|1669->432|1706->442|1743->452|1753->453|1780->459|1844->496|1854->497|1886->508|1950->544|1961->545|1995->557|2047->578|2080->584|2315->789
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|45->13|45->13|45->13|46->14|46->14|46->14|46->14|46->14|46->14|46->14|46->14|46->14|46->14|47->15|48->16|56->24
                  -- GENERATED --
              */
          