
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
				<h2>500 - Our Server is on a break</h2>
			</div>
			<a href="/login">Go TO Homepage</a>
		</div>
	</div>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<style>
* """),format.raw/*43.3*/("""{"""),format.raw/*43.4*/("""
 """),format.raw/*44.2*/("""-webkit-box-sizing: border-box;
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

"""),format.raw/*137.1*/("""only screen and (max-width: 480px) """),format.raw/*137.36*/("""{"""),format.raw/*137.37*/("""
"""),format.raw/*138.1*/(""".notfound .notfound-404 """),format.raw/*138.25*/("""{"""),format.raw/*138.26*/("""
"""),format.raw/*139.1*/("""height: 148px;
margin: 0px auto 10px;
"""),format.raw/*141.1*/("""}"""),format.raw/*141.2*/("""
"""),format.raw/*142.1*/(""".notfound .notfound-404 h1 """),format.raw/*142.28*/("""{"""),format.raw/*142.29*/("""
"""),format.raw/*143.1*/("""font-size: 86px;
"""),format.raw/*144.1*/("""}"""),format.raw/*144.2*/("""
"""),format.raw/*145.1*/(""".notfound .notfound-404 h2 """),format.raw/*145.28*/("""{"""),format.raw/*145.29*/("""
"""),format.raw/*146.1*/("""font-size: 16px;
"""),format.raw/*147.1*/("""}"""),format.raw/*147.2*/("""
"""),format.raw/*148.1*/(""".notfound a """),format.raw/*148.13*/("""{"""),format.raw/*148.14*/("""
"""),format.raw/*149.1*/("""padding: 7px 15px;
font-size: 14px;
"""),format.raw/*151.1*/("""}"""),format.raw/*151.2*/("""
"""),format.raw/*152.1*/("""}"""),format.raw/*152.2*/("""
"""),format.raw/*153.1*/("""</style>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-02T14:33:34.524
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/error500.scala.html
                  HASH: d7743d4f07d5fd607c03c472db9ff656cbc7be5a
                  MATRIX: 1033->0|2341->1281|2369->1282|2399->1285|2484->1343|2512->1344|2543->1348|2575->1353|2603->1354|2632->1356|2684->1381|2712->1382|2743->1386|2781->1396|2810->1397|2839->1399|2903->1436|2931->1437|2962->1441|3010->1461|3039->1462|3068->1464|3258->1627|3286->1628|3317->1632|3355->1642|3384->1643|3413->1645|3513->1718|3541->1719|3572->1723|3624->1747|3653->1748|3682->1750|3784->1825|3812->1826|3843->1830|3898->1857|3927->1858|3956->1860|4283->2160|4311->2161|4342->2165|4397->2192|4426->2193|4455->2195|4739->2451|4768->2452|4800->2456|4841->2468|4871->2469|4901->2471|5194->2736|5223->2737|5255->2741|5302->2759|5332->2760|5362->2762|5429->2801|5458->2802|5490->2806|5554->2841|5584->2842|5614->2844|5670->2871|5700->2872|5730->2874|5777->2893|5806->2894|5836->2896|5865->2897|5897->2901|5961->2936|5991->2937|6021->2939|6074->2963|6104->2964|6134->2966|6202->3006|6231->3007|6261->3009|6317->3036|6347->3037|6377->3039|6423->3057|6452->3058|6482->3060|6538->3087|6568->3088|6598->3090|6644->3108|6673->3109|6703->3111|6744->3123|6774->3124|6804->3126|6870->3164|6899->3165|6929->3167|6958->3168|6988->3170
                  LINES: 33->1|75->43|75->43|76->44|78->46|78->46|80->48|80->48|80->48|81->49|83->51|83->51|85->53|85->53|85->53|86->54|88->56|88->56|90->58|90->58|90->58|91->59|97->65|97->65|99->67|99->67|99->67|100->68|104->72|104->72|106->74|106->74|106->74|107->75|111->79|111->79|113->81|113->81|113->81|114->82|126->94|126->94|128->96|128->96|128->96|129->97|142->110|142->110|144->112|144->112|144->112|145->113|156->124|156->124|158->126|158->126|158->126|159->127|161->129|161->129|163->131|163->131|163->131|164->132|164->132|164->132|165->133|166->134|166->134|167->135|167->135|169->137|169->137|169->137|170->138|170->138|170->138|171->139|173->141|173->141|174->142|174->142|174->142|175->143|176->144|176->144|177->145|177->145|177->145|178->146|179->147|179->147|180->148|180->148|180->148|181->149|183->151|183->151|184->152|184->152|185->153
                  -- GENERATED --
              */
          