
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

<!--	<title>404 HTML Template error</title>-->

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
<!--			<a href="/login">Go TO Homepage</a>-->
<!--		</div>-->
<!--	</div>-->

<!--</body>&lt;!&ndash; This templates was made by Colorlib (https://colorlib.com) &ndash;&gt;-->

<!--</html>-->
<!--<style>-->
<!--* """),format.raw/*43.7*/("""{"""),format.raw/*43.8*/("""-->
<!-- -webkit-box-sizing: border-box;-->
<!--box-sizing: border-box;-->
<!--"""),format.raw/*46.5*/("""}"""),format.raw/*46.6*/("""-->

<!--body """),format.raw/*48.10*/("""{"""),format.raw/*48.11*/("""-->
<!--padding: 0;-->
<!--margin: 0;-->
<!--"""),format.raw/*51.5*/("""}"""),format.raw/*51.6*/("""-->

<!--#notfound """),format.raw/*53.15*/("""{"""),format.raw/*53.16*/("""-->
<!--position: relative;-->
<!--height: 100vh;-->
<!--"""),format.raw/*56.5*/("""}"""),format.raw/*56.6*/("""-->

<!--#notfound .notfound """),format.raw/*58.25*/("""{"""),format.raw/*58.26*/("""-->
<!--position: absolute;-->
<!--left: 50%;-->
<!--top: 50%;-->
<!-- -webkit-transform: translate(-50%, -50%);-->
<!-- -ms-transform: translate(-50%, -50%);-->
<!--transform: translate(-50%, -50%);-->
<!--"""),format.raw/*65.5*/("""}"""),format.raw/*65.6*/("""-->

<!--.notfound """),format.raw/*67.15*/("""{"""),format.raw/*67.16*/("""-->
<!--max-width: 520px;-->
<!--width: 100%;-->
<!--line-height: 1.4;-->
<!--text-align: center;-->
<!--"""),format.raw/*72.5*/("""}"""),format.raw/*72.6*/("""-->

<!--.notfound .notfound-404 """),format.raw/*74.29*/("""{"""),format.raw/*74.30*/("""-->
<!--position: relative;-->
<!--height: 200px;-->
<!--margin: 0px auto 20px;-->
<!--z-index: -1;-->
<!--"""),format.raw/*79.5*/("""}"""),format.raw/*79.6*/("""-->

<!--.notfound .notfound-404 h1 """),format.raw/*81.32*/("""{"""),format.raw/*81.33*/("""-->
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
<!--"""),format.raw/*94.5*/("""}"""),format.raw/*94.6*/("""-->

<!--.notfound .notfound-404 h2 """),format.raw/*96.32*/("""{"""),format.raw/*96.33*/("""-->
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
<!--"""),format.raw/*110.5*/("""}"""),format.raw/*110.6*/("""-->

<!--.notfound a """),format.raw/*112.17*/("""{"""),format.raw/*112.18*/("""-->
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
<!--"""),format.raw/*124.5*/("""}"""),format.raw/*124.6*/("""-->

<!--.notfound a:hover """),format.raw/*126.23*/("""{"""),format.raw/*126.24*/("""-->
<!--color: #ff6300;-->
<!--background: #211b19;-->
<!--"""),format.raw/*129.5*/("""}"""),format.raw/*129.6*/("""-->

<!--only screen and (max-width: 767px) """),format.raw/*131.40*/("""{"""),format.raw/*131.41*/("""-->
<!--.notfound .notfound-404 h1 """),format.raw/*132.32*/("""{"""),format.raw/*132.33*/("""-->
<!--font-size: 148px;-->
<!--"""),format.raw/*134.5*/("""}"""),format.raw/*134.6*/("""-->
<!--"""),format.raw/*135.5*/("""}"""),format.raw/*135.6*/("""-->

<!--only screen and (max-width: 480px) """),format.raw/*137.40*/("""{"""),format.raw/*137.41*/("""-->
<!--.notfound .notfound-404 """),format.raw/*138.29*/("""{"""),format.raw/*138.30*/("""-->
<!--height: 148px;-->
<!--margin: 0px auto 10px;-->
<!--"""),format.raw/*141.5*/("""}"""),format.raw/*141.6*/("""-->
<!--.notfound .notfound-404 h1 """),format.raw/*142.32*/("""{"""),format.raw/*142.33*/("""-->
<!--font-size: 86px;-->
<!--"""),format.raw/*144.5*/("""}"""),format.raw/*144.6*/("""-->
<!--.notfound .notfound-404 h2 """),format.raw/*145.32*/("""{"""),format.raw/*145.33*/("""-->
<!--font-size: 16px;-->
<!--"""),format.raw/*147.5*/("""}"""),format.raw/*147.6*/("""-->
<!--.notfound a """),format.raw/*148.17*/("""{"""),format.raw/*148.18*/("""-->
<!--padding: 7px 15px;-->
<!--font-size: 14px;-->
<!--"""),format.raw/*151.5*/("""}"""),format.raw/*151.6*/("""-->
<!--"""),format.raw/*152.5*/("""}"""),format.raw/*152.6*/("""-->
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
                  DATE: 2019-11-28T10:32:32.621
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/error500.scala.html
                  HASH: b344cc52d23e733ddcf06b7b1c9b392ed68047e7
                  MATRIX: 1033->0|2681->1621|2709->1622|2818->1704|2846->1705|2890->1721|2919->1722|2994->1770|3022->1771|3071->1792|3100->1793|3187->1853|3215->1854|3274->1885|3303->1886|3544->2100|3572->2101|3621->2122|3650->2123|3787->2233|3815->2234|3878->2269|3907->2270|4046->2382|4074->2383|4140->2421|4169->2422|4589->2815|4617->2816|4683->2854|4712->2855|5096->3211|5125->3212|5177->3235|5207->3236|5586->3587|5615->3588|5673->3617|5703->3618|5793->3680|5822->3681|5897->3727|5927->3728|5992->3764|6022->3765|6085->3800|6114->3801|6151->3810|6180->3811|6255->3857|6285->3858|6347->3891|6377->3892|6468->3955|6497->3956|6562->3992|6592->3993|6654->4027|6683->4028|6748->4064|6778->4065|6840->4099|6869->4100|6919->4121|6949->4122|7038->4183|7067->4184|7104->4193|7133->4194
                  LINES: 33->1|75->43|75->43|78->46|78->46|80->48|80->48|83->51|83->51|85->53|85->53|88->56|88->56|90->58|90->58|97->65|97->65|99->67|99->67|104->72|104->72|106->74|106->74|111->79|111->79|113->81|113->81|126->94|126->94|128->96|128->96|142->110|142->110|144->112|144->112|156->124|156->124|158->126|158->126|161->129|161->129|163->131|163->131|164->132|164->132|166->134|166->134|167->135|167->135|169->137|169->137|170->138|170->138|173->141|173->141|174->142|174->142|176->144|176->144|177->145|177->145|179->147|179->147|180->148|180->148|183->151|183->151|184->152|184->152
                  -- GENERATED --
              */
          