
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

object error500 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!--<!DOCTYPE html>-->
<!--<html lang="en">-->

<!--<head>-->
<!--	<meta charset="utf-8">-->
<!--	<meta http-equiv="X-UA-Compatible" content="IE=edge">-->
<!--	<meta name="viewport" content="width=device-width, initial-scale=1">-->
<!--	&lt;!&ndash; The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags &ndash;&gt;-->

<!--	<title>500 HTML Template error</title>-->

<!--	&lt;!&ndash; Google font &ndash;&gt;-->
<!--	<link href="https://fonts.googleapis.com/css?family=Montserrat:200,400,700" rel="stylesheet">-->

<!--	&lt;!&ndash; Custom stlylesheet &ndash;&gt;-->
<!--	<link type="text/css" rel="stylesheet" href="css/style.css" />-->

<!--	&lt;!&ndash; HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries &ndash;&gt;-->
<!--	&lt;!&ndash; WARNING: Respond.js doesn't work if you view the page via file:// &ndash;&gt;-->
<!--	&lt;!&ndash;[if lt IE 9]>-->
<!--		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>-->
<!--		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>-->
<!--		<![endif]&ndash;&gt;-->

<!--</head>-->
<!--<body>-->
<!--	<div id="notfound">-->
<!--		<div class="notfound">-->
<!--			<div class="notfound-404">-->
<!--				<h1>Oops!</h1>-->
<!--				<h2>500 - Our Server is on a break</h2>-->
<!--			</div>-->
<!--			<a href="/login">Go TO Registration Page</a>-->
<!--		</div>-->
<!--	</div>-->
<!--</body>&lt;!&ndash; This templates was made by Colorlib (https://colorlib.com) &ndash;&gt;-->
<!--</html>-->
<!--<style>-->
<!--* """),format.raw/*39.7*/("""{"""),format.raw/*39.8*/("""-->
<!-- -webkit-box-sizing: border-box;-->
<!--box-sizing: border-box;-->
<!--"""),format.raw/*42.5*/("""}"""),format.raw/*42.6*/("""-->

<!--body """),format.raw/*44.10*/("""{"""),format.raw/*44.11*/("""-->
<!--padding: 0;-->
<!--margin: 0;-->
<!--"""),format.raw/*47.5*/("""}"""),format.raw/*47.6*/("""-->

<!--#notfound """),format.raw/*49.15*/("""{"""),format.raw/*49.16*/("""-->
<!--position: relative;-->
<!--height: 100vh;-->
<!--"""),format.raw/*52.5*/("""}"""),format.raw/*52.6*/("""-->

<!--#notfound .notfound """),format.raw/*54.25*/("""{"""),format.raw/*54.26*/("""-->
<!--position: absolute;-->
<!--left: 50%;-->
<!--top: 50%;-->
<!-- -webkit-transform: translate(-50%, -50%);-->
<!-- -ms-transform: translate(-50%, -50%);-->
<!--transform: translate(-50%, -50%);-->
<!--"""),format.raw/*61.5*/("""}"""),format.raw/*61.6*/("""-->

<!--.notfound """),format.raw/*63.15*/("""{"""),format.raw/*63.16*/("""-->
<!--max-width: 520px;-->
<!--width: 100%;-->
<!--line-height: 1.4;-->
<!--text-align: center;-->
<!--"""),format.raw/*68.5*/("""}"""),format.raw/*68.6*/("""-->

<!--.notfound .notfound-404 """),format.raw/*70.29*/("""{"""),format.raw/*70.30*/("""-->
<!--position: relative;-->
<!--height: 200px;-->
<!--margin: 0px auto 20px;-->
<!--z-index: -1;-->
<!--"""),format.raw/*75.5*/("""}"""),format.raw/*75.6*/("""-->

<!--.notfound .notfound-404 h1 """),format.raw/*77.32*/("""{"""),format.raw/*77.33*/("""-->
<!--font-family: 'Montserrat', sans-serif;-->
<!--font-size: 236px;-->
<!--font-weight: 200;-->
<!--margin: 0px;-->
<!--color: #211b19;-->
<!--text-transform: uppercase;-->
<!--position: absolute;-->
<!--left: 50%;-->
<!--top: 50%;-->
<!-- -webkit-transform: translate(-50%, -50%);-->
<!-- -ms-transform: translate(-50%, -50%);-->
<!--transform: translate(-50%, -50%);-->
<!--"""),format.raw/*90.5*/("""}"""),format.raw/*90.6*/("""-->

<!--.notfound .notfound-404 h2 """),format.raw/*92.32*/("""{"""),format.raw/*92.33*/("""-->
<!--font-family: 'Montserrat', sans-serif;-->
<!--font-size: 28px;-->
<!--font-weight: 400;-->
<!--text-transform: uppercase;-->
<!--color: #211b19;-->
<!--background: #fff;-->
<!--padding: 10px 5px;-->
<!--margin: auto;-->
<!--display: inline-block;-->
<!--position: absolute;-->
<!--bottom: 0px;-->
<!--left: 0;-->
<!--right: 0;-->
<!--"""),format.raw/*106.5*/("""}"""),format.raw/*106.6*/("""-->

<!--.notfound a """),format.raw/*108.17*/("""{"""),format.raw/*108.18*/("""-->
<!--font-family: 'Montserrat', sans-serif;-->
<!--display: inline-block;-->
<!--font-weight: 700;-->
<!--text-decoration: none;-->
<!--color: #fff;-->
<!--text-transform: uppercase;-->
<!--padding: 13px 23px;-->
<!--background: #ff6300;-->
<!--font-size: 18px;-->
<!-- -webkit-transition: 0.2s all;-->
<!--transition: 0.2s all;-->
<!--"""),format.raw/*120.5*/("""}"""),format.raw/*120.6*/("""-->

<!--.notfound a:hover """),format.raw/*122.23*/("""{"""),format.raw/*122.24*/("""-->
<!--color: #ff6300;-->
<!--background: #211b19;-->
<!--"""),format.raw/*125.5*/("""}"""),format.raw/*125.6*/("""-->

<!--only screen and (max-width: 767px) """),format.raw/*127.40*/("""{"""),format.raw/*127.41*/("""-->
<!--.notfound .notfound-404 h1 """),format.raw/*128.32*/("""{"""),format.raw/*128.33*/("""-->
<!--font-size: 148px;-->
<!--"""),format.raw/*130.5*/("""}"""),format.raw/*130.6*/("""-->
<!--"""),format.raw/*131.5*/("""}"""),format.raw/*131.6*/("""-->

<!--only screen and (max-width: 480px) """),format.raw/*133.40*/("""{"""),format.raw/*133.41*/("""-->
<!--.notfound .notfound-404 """),format.raw/*134.29*/("""{"""),format.raw/*134.30*/("""-->
<!--height: 148px;-->
<!--margin: 0px auto 10px;-->
<!--"""),format.raw/*137.5*/("""}"""),format.raw/*137.6*/("""-->
<!--.notfound .notfound-404 h1 """),format.raw/*138.32*/("""{"""),format.raw/*138.33*/("""-->
<!--font-size: 86px;-->
<!--"""),format.raw/*140.5*/("""}"""),format.raw/*140.6*/("""-->
<!--.notfound .notfound-404 h2 """),format.raw/*141.32*/("""{"""),format.raw/*141.33*/("""-->
<!--font-size: 16px;-->
<!--"""),format.raw/*143.5*/("""}"""),format.raw/*143.6*/("""-->
<!--.notfound a """),format.raw/*144.17*/("""{"""),format.raw/*144.18*/("""-->
<!--padding: 7px 15px;-->
<!--font-size: 14px;-->
<!--"""),format.raw/*147.5*/("""}"""),format.raw/*147.6*/("""-->
<!--"""),format.raw/*148.5*/("""}"""),format.raw/*148.6*/("""-->
<!--</style>-->"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-09T17:48:28.076
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/error500.scala.html
                  HASH: 789ec419227bbffa26d4f0593c7502365e303f10
                  MATRIX: 1033->0|2682->1622|2710->1623|2819->1705|2847->1706|2891->1722|2920->1723|2995->1771|3023->1772|3072->1793|3101->1794|3188->1854|3216->1855|3275->1886|3304->1887|3545->2101|3573->2102|3622->2123|3651->2124|3788->2234|3816->2235|3879->2270|3908->2271|4047->2383|4075->2384|4141->2422|4170->2423|4590->2816|4618->2817|4684->2855|4713->2856|5097->3212|5126->3213|5178->3236|5208->3237|5587->3588|5616->3589|5674->3618|5704->3619|5794->3681|5823->3682|5898->3728|5928->3729|5993->3765|6023->3766|6086->3801|6115->3802|6152->3811|6181->3812|6256->3858|6286->3859|6348->3892|6378->3893|6469->3956|6498->3957|6563->3993|6593->3994|6655->4028|6684->4029|6749->4065|6779->4066|6841->4100|6870->4101|6920->4122|6950->4123|7039->4184|7068->4185|7105->4194|7134->4195
                  LINES: 33->1|71->39|71->39|74->42|74->42|76->44|76->44|79->47|79->47|81->49|81->49|84->52|84->52|86->54|86->54|93->61|93->61|95->63|95->63|100->68|100->68|102->70|102->70|107->75|107->75|109->77|109->77|122->90|122->90|124->92|124->92|138->106|138->106|140->108|140->108|152->120|152->120|154->122|154->122|157->125|157->125|159->127|159->127|160->128|160->128|162->130|162->130|163->131|163->131|165->133|165->133|166->134|166->134|169->137|169->137|170->138|170->138|172->140|172->140|173->141|173->141|175->143|175->143|176->144|176->144|179->147|179->147|180->148|180->148
                  -- GENERATED --
              */
          