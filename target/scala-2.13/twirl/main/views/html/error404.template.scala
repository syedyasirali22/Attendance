
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

object error404 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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



    <style>
* """),format.raw/*28.3*/("""{"""),format.raw/*28.4*/("""
"""),format.raw/*29.1*/("""-webkit-box-sizing: border-box;
box-sizing: border-box;
"""),format.raw/*31.1*/("""}"""),format.raw/*31.2*/("""

"""),format.raw/*33.1*/("""body """),format.raw/*33.6*/("""{"""),format.raw/*33.7*/("""
"""),format.raw/*34.1*/("""padding: 0;
margin: 0;
"""),format.raw/*36.1*/("""}"""),format.raw/*36.2*/("""

"""),format.raw/*38.1*/("""#notfound """),format.raw/*38.11*/("""{"""),format.raw/*38.12*/("""
"""),format.raw/*39.1*/("""position: relative;
height: 100vh;
"""),format.raw/*41.1*/("""}"""),format.raw/*41.2*/("""

"""),format.raw/*43.1*/("""#notfound .notfound """),format.raw/*43.21*/("""{"""),format.raw/*43.22*/("""
"""),format.raw/*44.1*/("""position: absolute;
left: 50%;
top: 50%;
-webkit-transform: translate(-50%, -50%);
-ms-transform: translate(-50%, -50%);
transform: translate(-50%, -50%);
"""),format.raw/*50.1*/("""}"""),format.raw/*50.2*/("""

"""),format.raw/*52.1*/(""".notfound """),format.raw/*52.11*/("""{"""),format.raw/*52.12*/("""
"""),format.raw/*53.1*/("""max-width: 520px;
width: 100%;
line-height: 1.4;
text-align: center;
"""),format.raw/*57.1*/("""}"""),format.raw/*57.2*/("""

"""),format.raw/*59.1*/(""".notfound .notfound-404 """),format.raw/*59.25*/("""{"""),format.raw/*59.26*/("""
"""),format.raw/*60.1*/("""position: relative;
height: 200px;
margin: 0px auto 20px;
z-index: -1;
"""),format.raw/*64.1*/("""}"""),format.raw/*64.2*/("""

"""),format.raw/*66.1*/(""".notfound .notfound-404 h1 """),format.raw/*66.28*/("""{"""),format.raw/*66.29*/("""
"""),format.raw/*67.1*/("""font-family: 'Montserrat', sans-serif;
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
"""),format.raw/*79.1*/("""}"""),format.raw/*79.2*/("""

"""),format.raw/*81.1*/(""".notfound .notfound-404 h2 """),format.raw/*81.28*/("""{"""),format.raw/*81.29*/("""
"""),format.raw/*82.1*/("""font-family: 'Montserrat', sans-serif;
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
"""),format.raw/*95.1*/("""}"""),format.raw/*95.2*/("""

"""),format.raw/*97.1*/(""".notfound a """),format.raw/*97.13*/("""{"""),format.raw/*97.14*/("""
"""),format.raw/*98.1*/("""font-family: 'Montserrat', sans-serif;
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
"""),format.raw/*109.1*/("""}"""),format.raw/*109.2*/("""

"""),format.raw/*111.1*/(""".notfound a:hover """),format.raw/*111.19*/("""{"""),format.raw/*111.20*/("""
"""),format.raw/*112.1*/("""color: #ff6300;
background: #211b19;
"""),format.raw/*114.1*/("""}"""),format.raw/*114.2*/("""

"""),format.raw/*116.1*/("""only screen and (max-width: 767px) """),format.raw/*116.36*/("""{"""),format.raw/*116.37*/("""
"""),format.raw/*117.1*/(""".notfound .notfound-404 h1 """),format.raw/*117.28*/("""{"""),format.raw/*117.29*/("""
"""),format.raw/*118.1*/("""font-size: 148px;
"""),format.raw/*119.1*/("""}"""),format.raw/*119.2*/("""
"""),format.raw/*120.1*/("""}"""),format.raw/*120.2*/("""

"""),format.raw/*122.1*/("""only screen and (max-width: 480px) """),format.raw/*122.36*/("""{"""),format.raw/*122.37*/("""
"""),format.raw/*123.1*/(""".notfound .notfound-404 """),format.raw/*123.25*/("""{"""),format.raw/*123.26*/("""
"""),format.raw/*124.1*/("""height: 148px;
margin: 0px auto 10px;
"""),format.raw/*126.1*/("""}"""),format.raw/*126.2*/("""
"""),format.raw/*127.1*/(""".notfound .notfound-404 h1 """),format.raw/*127.28*/("""{"""),format.raw/*127.29*/("""
"""),format.raw/*128.1*/("""font-size: 86px;
"""),format.raw/*129.1*/("""}"""),format.raw/*129.2*/("""
"""),format.raw/*130.1*/(""".notfound .notfound-404 h2 """),format.raw/*130.28*/("""{"""),format.raw/*130.29*/("""
"""),format.raw/*131.1*/("""font-size: 16px;
"""),format.raw/*132.1*/("""}"""),format.raw/*132.2*/("""
"""),format.raw/*133.1*/(""".notfound a """),format.raw/*133.13*/("""{"""),format.raw/*133.14*/("""
"""),format.raw/*134.1*/("""padding: 7px 15px;
font-size: 14px;
"""),format.raw/*136.1*/("""}"""),format.raw/*136.2*/("""
"""),format.raw/*137.1*/("""}"""),format.raw/*137.2*/("""
    """),format.raw/*138.5*/("""</style>

</head>

<body>

	<div id="notfound">
		<div class="notfound">
			<div class="notfound-404">
				<h1>Oops!</h1>
				<h2>404 - The Page can't be found</h2>
			</div>
			<a href="/register">Go TO Homepage</a>
		</div>
	</div>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!--<style>-->

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
                  DATE: 2019-11-28T10:32:32.246
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/error404.scala.html
                  HASH: 99185cdc81ae4a2eb56e1e178fec45f82351afd4
                  MATRIX: 1033->0|2025->965|2053->966|2082->968|2167->1026|2195->1027|2226->1031|2258->1036|2286->1037|2315->1039|2367->1064|2395->1065|2426->1069|2464->1079|2493->1080|2522->1082|2586->1119|2614->1120|2645->1124|2693->1144|2722->1145|2751->1147|2939->1308|2967->1309|2998->1313|3036->1323|3065->1324|3094->1326|3194->1399|3222->1400|3253->1404|3305->1428|3334->1429|3363->1431|3465->1506|3493->1507|3524->1511|3579->1538|3608->1539|3637->1541|3962->1839|3990->1840|4021->1844|4076->1871|4105->1872|4134->1874|4417->2130|4445->2131|4476->2135|4516->2147|4545->2148|4574->2150|4866->2414|4895->2415|4927->2419|4974->2437|5004->2438|5034->2440|5101->2479|5130->2480|5162->2484|5226->2519|5256->2520|5286->2522|5342->2549|5372->2550|5402->2552|5449->2571|5478->2572|5508->2574|5537->2575|5569->2579|5633->2614|5663->2615|5693->2617|5746->2641|5776->2642|5806->2644|5874->2684|5903->2685|5933->2687|5989->2714|6019->2715|6049->2717|6095->2735|6124->2736|6154->2738|6210->2765|6240->2766|6270->2768|6316->2786|6345->2787|6375->2789|6416->2801|6446->2802|6476->2804|6542->2842|6571->2843|6601->2845|6630->2846|6664->2852
                  LINES: 33->1|60->28|60->28|61->29|63->31|63->31|65->33|65->33|65->33|66->34|68->36|68->36|70->38|70->38|70->38|71->39|73->41|73->41|75->43|75->43|75->43|76->44|82->50|82->50|84->52|84->52|84->52|85->53|89->57|89->57|91->59|91->59|91->59|92->60|96->64|96->64|98->66|98->66|98->66|99->67|111->79|111->79|113->81|113->81|113->81|114->82|127->95|127->95|129->97|129->97|129->97|130->98|141->109|141->109|143->111|143->111|143->111|144->112|146->114|146->114|148->116|148->116|148->116|149->117|149->117|149->117|150->118|151->119|151->119|152->120|152->120|154->122|154->122|154->122|155->123|155->123|155->123|156->124|158->126|158->126|159->127|159->127|159->127|160->128|161->129|161->129|162->130|162->130|162->130|163->131|164->132|164->132|165->133|165->133|165->133|166->134|168->136|168->136|169->137|169->137|170->138
                  -- GENERATED --
              */
          