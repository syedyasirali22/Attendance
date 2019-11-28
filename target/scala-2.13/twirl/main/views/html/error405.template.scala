
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

object error405 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

	<title>404 HTML Template error</title>

	<!-- Google font -->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:200,400,700" rel="stylesheet">

	<!-- Custom stlylesheet -->
	<link type="text/css" rel="stylesheet" href="css/style.css" />

	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->

</head>

<body>

	<div id="notfound">
		<div class="notfound">
			<div class="notfound-404">
				<h1>Oops!</h1>
				<h2>405 - Page Not Allowed</h2>
			</div>
			<a href="#">Go TO Homepage</a>
		</div>
	</div>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<style>
* """),format.raw/*43.3*/("""{"""),format.raw/*43.4*/("""
"""),format.raw/*44.1*/("""-webkit-box-sizing: border-box;
box-sizing: border-box;
"""),format.raw/*46.1*/("""}"""),format.raw/*46.2*/("""

"""),format.raw/*48.1*/("""body """),format.raw/*48.6*/("""{"""),format.raw/*48.7*/("""
"""),format.raw/*49.1*/("""padding: 0;
margin: 0;
"""),format.raw/*51.1*/("""}"""),format.raw/*51.2*/("""

"""),format.raw/*53.1*/("""#notfound """),format.raw/*53.11*/("""{"""),format.raw/*53.12*/("""
"""),format.raw/*54.1*/("""position: relative;
height: 100vh;
"""),format.raw/*56.1*/("""}"""),format.raw/*56.2*/("""

"""),format.raw/*58.1*/("""#notfound .notfound """),format.raw/*58.21*/("""{"""),format.raw/*58.22*/("""
"""),format.raw/*59.1*/("""position: absolute;
left: 50%;
top: 50%;
-webkit-transform: translate(-50%, -50%);
-ms-transform: translate(-50%, -50%);
transform: translate(-50%, -50%);
"""),format.raw/*65.1*/("""}"""),format.raw/*65.2*/("""

"""),format.raw/*67.1*/(""".notfound """),format.raw/*67.11*/("""{"""),format.raw/*67.12*/("""
"""),format.raw/*68.1*/("""max-width: 520px;
width: 100%;
line-height: 1.4;
text-align: center;
"""),format.raw/*72.1*/("""}"""),format.raw/*72.2*/("""

"""),format.raw/*74.1*/(""".notfound .notfound-404 """),format.raw/*74.25*/("""{"""),format.raw/*74.26*/("""
"""),format.raw/*75.1*/("""position: relative;
height: 200px;
margin: 0px auto 20px;
z-index: -1;
"""),format.raw/*79.1*/("""}"""),format.raw/*79.2*/("""

"""),format.raw/*81.1*/(""".notfound .notfound-404 h1 """),format.raw/*81.28*/("""{"""),format.raw/*81.29*/("""
"""),format.raw/*82.1*/("""font-family: 'Montserrat', sans-serif;
font-size: 236px;
font-weight: 200;
margin: 0px;
color: #211b19;
text-transform: uppercase;
position: absolute;
left: 50%;
top: 50%;
-webkit-transform: translate(-50%, -50%);
-ms-transform: translate(-50%, -50%);
transform: translate(-50%, -50%);
"""),format.raw/*94.1*/("""}"""),format.raw/*94.2*/("""

"""),format.raw/*96.1*/(""".notfound .notfound-404 h2 """),format.raw/*96.28*/("""{"""),format.raw/*96.29*/("""
"""),format.raw/*97.1*/("""font-family: 'Montserrat', sans-serif;
font-size: 28px;
font-weight: 400;
text-transform: uppercase;
color: #211b19;
background: #fff;
padding: 10px 5px;
margin: auto;
display: inline-block;
position: absolute;
bottom: 0px;
left: 0;
right: 0;
"""),format.raw/*110.1*/("""}"""),format.raw/*110.2*/("""

"""),format.raw/*112.1*/(""".notfound a """),format.raw/*112.13*/("""{"""),format.raw/*112.14*/("""
"""),format.raw/*113.1*/("""font-family: 'Montserrat', sans-serif;
display: inline-block;
font-weight: 700;
text-decoration: none;
color: #fff;
text-transform: uppercase;
padding: 13px 23px;
background: #ff6300;
font-size: 18px;
-webkit-transition: 0.2s all;
transition: 0.2s all;
"""),format.raw/*124.1*/("""}"""),format.raw/*124.2*/("""

"""),format.raw/*126.1*/(""".notfound a:hover """),format.raw/*126.19*/("""{"""),format.raw/*126.20*/("""
"""),format.raw/*127.1*/("""color: #ff6300;
background: #211b19;
"""),format.raw/*129.1*/("""}"""),format.raw/*129.2*/("""

"""),format.raw/*131.1*/("""only screen and (max-width: 767px) """),format.raw/*131.36*/("""{"""),format.raw/*131.37*/("""
"""),format.raw/*132.1*/(""".notfound .notfound-404 h1 """),format.raw/*132.28*/("""{"""),format.raw/*132.29*/("""
"""),format.raw/*133.1*/("""font-size: 148px;
"""),format.raw/*134.1*/("""}"""),format.raw/*134.2*/("""
"""),format.raw/*135.1*/("""}"""),format.raw/*135.2*/("""
"""),format.raw/*136.1*/("""only screen and (max-width: 480px) """),format.raw/*136.36*/("""{"""),format.raw/*136.37*/("""
"""),format.raw/*137.1*/(""".notfound .notfound-404 """),format.raw/*137.25*/("""{"""),format.raw/*137.26*/("""
"""),format.raw/*138.1*/("""height: 148px;
margin: 0px auto 10px;
"""),format.raw/*140.1*/("""}"""),format.raw/*140.2*/("""
"""),format.raw/*141.1*/(""".notfound .notfound-404 h1 """),format.raw/*141.28*/("""{"""),format.raw/*141.29*/("""
"""),format.raw/*142.1*/("""font-size: 86px;
"""),format.raw/*143.1*/("""}"""),format.raw/*143.2*/("""
"""),format.raw/*144.1*/(""".notfound .notfound-404 h2 """),format.raw/*144.28*/("""{"""),format.raw/*144.29*/("""
"""),format.raw/*145.1*/("""font-size: 16px;
"""),format.raw/*146.1*/("""}"""),format.raw/*146.2*/("""
"""),format.raw/*147.1*/(""".notfound a """),format.raw/*147.13*/("""{"""),format.raw/*147.14*/("""
"""),format.raw/*148.1*/("""padding: 7px 15px;
font-size: 14px;
"""),format.raw/*150.1*/("""}"""),format.raw/*150.2*/("""
"""),format.raw/*151.1*/("""}"""),format.raw/*151.2*/("""
"""),format.raw/*152.1*/("""</style>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-11-28T10:32:32.330
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/error405.scala.html
                  HASH: ad7b1f4d4c69dc06967e0764cbbbdbd1baa903bd
                  MATRIX: 1033->0|2328->1268|2356->1269|2385->1271|2470->1329|2498->1330|2529->1334|2561->1339|2589->1340|2618->1342|2670->1367|2698->1368|2729->1372|2767->1382|2796->1383|2825->1385|2889->1422|2917->1423|2948->1427|2996->1447|3025->1448|3054->1450|3242->1611|3270->1612|3301->1616|3339->1626|3368->1627|3397->1629|3497->1702|3525->1703|3556->1707|3608->1731|3637->1732|3666->1734|3768->1809|3796->1810|3827->1814|3882->1841|3911->1842|3940->1844|4265->2142|4293->2143|4324->2147|4379->2174|4408->2175|4437->2177|4721->2433|4750->2434|4782->2438|4823->2450|4853->2451|4883->2453|5175->2717|5204->2718|5236->2722|5283->2740|5313->2741|5343->2743|5410->2782|5439->2783|5471->2787|5535->2822|5565->2823|5595->2825|5651->2852|5681->2853|5711->2855|5758->2874|5787->2875|5817->2877|5846->2878|5876->2880|5940->2915|5970->2916|6000->2918|6053->2942|6083->2943|6113->2945|6181->2985|6210->2986|6240->2988|6296->3015|6326->3016|6356->3018|6402->3036|6431->3037|6461->3039|6517->3066|6547->3067|6577->3069|6623->3087|6652->3088|6682->3090|6723->3102|6753->3103|6783->3105|6849->3143|6878->3144|6908->3146|6937->3147|6967->3149
                  LINES: 33->1|75->43|75->43|76->44|78->46|78->46|80->48|80->48|80->48|81->49|83->51|83->51|85->53|85->53|85->53|86->54|88->56|88->56|90->58|90->58|90->58|91->59|97->65|97->65|99->67|99->67|99->67|100->68|104->72|104->72|106->74|106->74|106->74|107->75|111->79|111->79|113->81|113->81|113->81|114->82|126->94|126->94|128->96|128->96|128->96|129->97|142->110|142->110|144->112|144->112|144->112|145->113|156->124|156->124|158->126|158->126|158->126|159->127|161->129|161->129|163->131|163->131|163->131|164->132|164->132|164->132|165->133|166->134|166->134|167->135|167->135|168->136|168->136|168->136|169->137|169->137|169->137|170->138|172->140|172->140|173->141|173->141|173->141|174->142|175->143|175->143|176->144|176->144|176->144|177->145|178->146|178->146|179->147|179->147|179->147|180->148|182->150|182->150|183->151|183->151|184->152
                  -- GENERATED --
              */
          