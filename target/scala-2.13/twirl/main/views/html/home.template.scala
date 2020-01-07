
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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">




    <!------ Include the above in your HEAD tag ---------->

    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
    <style>
/*Main CSS*/


/*Login Signup Page*/
a:focus,a:hover,a"""),format.raw/*20.18*/("""{"""),format.raw/*20.19*/("""
    """),format.raw/*21.5*/("""outline:none;
    text-decoration: none;
"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/("""
"""),format.raw/*24.1*/("""li,ul"""),format.raw/*24.6*/("""{"""),format.raw/*24.7*/("""
    """),format.raw/*25.5*/("""list-style: none;
    padding: 0;
    margin: 0;
"""),format.raw/*28.1*/("""}"""),format.raw/*28.2*/("""
"""),format.raw/*29.1*/(""".header-top i """),format.raw/*29.15*/("""{"""),format.raw/*29.16*/("""
    """),format.raw/*30.5*/("""font-size: 18px;
"""),format.raw/*31.1*/("""}"""),format.raw/*31.2*/("""
"""),format.raw/*32.1*/(""".bg-image """),format.raw/*32.11*/("""{"""),format.raw/*32.12*/("""
    """),format.raw/*33.5*/("""background: url(../images/background-login.jpg) no-repeat 0 0 / cover;
    position: relative;
    width: 100%;
    height: 100vh;
    display: table;
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""

"""),format.raw/*40.1*/(""".login-header """),format.raw/*40.15*/("""{"""),format.raw/*40.16*/("""
    """),format.raw/*41.5*/("""display: inline-block;
    width: 100%;
    background: #0e1a35;
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""

"""),format.raw/*46.1*/(""".login-signup """),format.raw/*46.15*/("""{"""),format.raw/*46.16*/("""
    """),format.raw/*47.5*/("""display: table-cell;
    vertical-align: middle;
    width: 100%;
"""),format.raw/*50.1*/("""}"""),format.raw/*50.2*/("""

"""),format.raw/*52.1*/(""".login-logo img """),format.raw/*52.17*/("""{"""),format.raw/*52.18*/("""
    """),format.raw/*53.5*/("""cursor: pointer;
    max-width: 171px;
    padding: 23px 15px 22px;
    width: 100%;
"""),format.raw/*57.1*/("""}"""),format.raw/*57.2*/("""

"""),format.raw/*59.1*/(""".login-header .navbar-right """),format.raw/*59.29*/("""{"""),format.raw/*59.30*/("""
    """),format.raw/*60.5*/("""margin-right: 0px;
"""),format.raw/*61.1*/("""}"""),format.raw/*61.2*/("""

"""),format.raw/*63.1*/(""".login-header .nav-tabs > li.active > a,
.login-header .nav-tabs > li.active > a:focus,
.login-header .nav-tabs > li.active > a:hover """),format.raw/*65.47*/("""{"""),format.raw/*65.48*/("""
    """),format.raw/*66.5*/("""background-color: transparent;
    border: none;
    color: #fff;
"""),format.raw/*69.1*/("""}"""),format.raw/*69.2*/("""

"""),format.raw/*71.1*/(""".login-header .nav-tabs > li > a """),format.raw/*71.34*/("""{"""),format.raw/*71.35*/("""
    """),format.raw/*72.5*/("""border: medium none;
    border-radius: 0;
    font-size: 14px;
    font-weight: 500;
    line-height: 48px;
    padding: 15px 30px;
    color: #fff;
"""),format.raw/*79.1*/("""}"""),format.raw/*79.2*/("""

"""),format.raw/*81.1*/(""".login-header .nav-tabs """),format.raw/*81.25*/("""{"""),format.raw/*81.26*/("""
    """),format.raw/*82.5*/("""border-bottom: none;
"""),format.raw/*83.1*/("""}"""),format.raw/*83.2*/("""

"""),format.raw/*85.1*/(""".login-header .nav-tabs > li """),format.raw/*85.30*/("""{"""),format.raw/*85.31*/("""
    """),format.raw/*86.5*/("""margin-bottom: 0px;
"""),format.raw/*87.1*/("""}"""),format.raw/*87.2*/("""

"""),format.raw/*89.1*/(""".login-header .nav > li > a:focus,
.login-header .nav > li > a:hover """),format.raw/*90.35*/("""{"""),format.raw/*90.36*/("""
    """),format.raw/*91.5*/("""background: none;
    text-decoration: none;
"""),format.raw/*93.1*/("""}"""),format.raw/*93.2*/("""

"""),format.raw/*95.1*/(""".login-header .nav-tabs > li.active """),format.raw/*95.37*/("""{"""),format.raw/*95.38*/("""
    """),format.raw/*96.5*/("""border-bottom: 6px solid #5584ff;
"""),format.raw/*97.1*/("""}"""),format.raw/*97.2*/("""

"""),format.raw/*99.1*/(""".login-inner h1 """),format.raw/*99.17*/("""{"""),format.raw/*99.18*/("""
    """),format.raw/*100.5*/("""color: #8492af;
    font-size: 48px;
    font-weight: 300;
    text-align: center;
    margin-top: 0;
    margin-bottom: 20px;
"""),format.raw/*106.1*/("""}"""),format.raw/*106.2*/("""

"""),format.raw/*108.1*/(""".login-inner h1 span """),format.raw/*108.22*/("""{"""),format.raw/*108.23*/("""
    """),format.raw/*109.5*/("""color: #5584ff;
"""),format.raw/*110.1*/("""}"""),format.raw/*110.2*/("""

"""),format.raw/*112.1*/(""".login-form """),format.raw/*112.13*/("""{"""),format.raw/*112.14*/("""
    """),format.raw/*113.5*/("""text-align: center;
"""),format.raw/*114.1*/("""}"""),format.raw/*114.2*/("""

"""),format.raw/*116.1*/(""".login-form input """),format.raw/*116.19*/("""{"""),format.raw/*116.20*/("""
    """),format.raw/*117.5*/("""-moz-border-bottom-colors: none;
    -moz-border-left-colors: none;
    -moz-border-right-colors: none;
    -moz-border-top-colors: none;
    background: rgba(0, 0, 0, 0) none repeat scroll 0 0;
    border-color: -moz-use-text-color -moz-use-text-color #d4d9e3;
    border-image: none;
    border-style: none none solid;
    border-width: medium medium 1px;
    font-size: 13px;
    font-weight: 300;
    width: 100%;
    color: #8492af;
    padding: 15px 50px;
    font-size: 17px;
    max-width: 550px;
"""),format.raw/*133.1*/("""}"""),format.raw/*133.2*/("""

"""),format.raw/*135.1*/(""".login-form label """),format.raw/*135.19*/("""{"""),format.raw/*135.20*/("""
    """),format.raw/*136.5*/("""margin-bottom: 30px;
    width: 100%;
"""),format.raw/*138.1*/("""}"""),format.raw/*138.2*/("""

"""),format.raw/*140.1*/(""".user input """),format.raw/*140.13*/("""{"""),format.raw/*140.14*/("""
    """),format.raw/*141.5*/("""background: rgba(0, 0, 0, 0) url("../images/user.png") no-repeat scroll 7px 12px;
"""),format.raw/*142.1*/("""}"""),format.raw/*142.2*/("""

"""),format.raw/*144.1*/(""".pass input """),format.raw/*144.13*/("""{"""),format.raw/*144.14*/("""
    """),format.raw/*145.5*/("""background: rgba(0, 0, 0, 0) url("../images/password.png") no-repeat scroll 7px 12px;
"""),format.raw/*146.1*/("""}"""),format.raw/*146.2*/("""

"""),format.raw/*148.1*/(""".mail input """),format.raw/*148.13*/("""{"""),format.raw/*148.14*/("""
    """),format.raw/*149.5*/("""background: rgba(0, 0, 0, 0) url("../images/mail.png") no-repeat scroll 4px 12px;
"""),format.raw/*150.1*/("""}"""),format.raw/*150.2*/("""

"""),format.raw/*152.1*/(""".login-signup .tab-content """),format.raw/*152.28*/("""{"""),format.raw/*152.29*/("""
    """),format.raw/*153.5*/("""background: #ffffff none repeat scroll 0 0;
    box-shadow: 0 6px 12px rgba(0, 0, 0, 0.176);
    display: inline-block;
    margin-top: -8px;
    width: 100%;
"""),format.raw/*158.1*/("""}"""),format.raw/*158.2*/("""

"""),format.raw/*160.1*/(""".form-btn """),format.raw/*160.11*/("""{"""),format.raw/*160.12*/("""
    """),format.raw/*161.5*/("""background: #5584ff none repeat scroll 0 0;
    border: medium none;
    border-radius: 100px;
    color: #ffffff;
    font-weight: 400;
    max-width: 250px;
    padding: 10px 0;
    position: relative;
    width: 100%;
    margin: 40px 0;
    box-shadow: 0 2px 8px #d2d2d2;
    -moz-box-shadow: 0 2px 8px #d2d2d2;
    -webkit-box-shadow: 0 2px 8px #d2d2d2;
"""),format.raw/*174.1*/("""}"""),format.raw/*174.2*/("""

"""),format.raw/*176.1*/(""".form-btn::before """),format.raw/*176.19*/("""{"""),format.raw/*176.20*/("""
    """),format.raw/*177.5*/("""content: "";
    font-family: FontAwesome;
    position: absolute;
    right: 17px;
    top: 9px;
"""),format.raw/*182.1*/("""}"""),format.raw/*182.2*/("""

"""),format.raw/*184.1*/(""".form-details """),format.raw/*184.15*/("""{"""),format.raw/*184.16*/("""
    """),format.raw/*185.5*/("""padding: 35px 0;
"""),format.raw/*186.1*/("""}"""),format.raw/*186.2*/("""

"""),format.raw/*188.1*/(""".tab-content .tab-pane """),format.raw/*188.24*/("""{"""),format.raw/*188.25*/("""
    """),format.raw/*189.5*/("""padding: 70px 0;
"""),format.raw/*190.1*/("""}"""),format.raw/*190.2*/("""


"""),format.raw/*193.1*/("""/*Login Signup Page*/


/*Home Page*/

.home """),format.raw/*198.7*/("""{"""),format.raw/*198.8*/("""
    """),format.raw/*199.5*/("""background: #f6f7fa;
"""),format.raw/*200.1*/("""}"""),format.raw/*200.2*/("""

"""),format.raw/*202.1*/("""#navigation """),format.raw/*202.13*/("""{"""),format.raw/*202.14*/("""
    """),format.raw/*203.5*/("""background: #0e1a35;
"""),format.raw/*204.1*/("""}"""),format.raw/*204.2*/("""

"""),format.raw/*206.1*/("""#navigation """),format.raw/*206.13*/("""{"""),format.raw/*206.14*/("""
    """),format.raw/*207.5*/("""padding: 0;
"""),format.raw/*208.1*/("""}"""),format.raw/*208.2*/("""

"""),format.raw/*210.1*/(""".display-table """),format.raw/*210.16*/("""{"""),format.raw/*210.17*/("""
    """),format.raw/*211.5*/("""display: table;
    padding: 0;
    height: 100%;
    width: 100%;
"""),format.raw/*215.1*/("""}"""),format.raw/*215.2*/("""

"""),format.raw/*217.1*/(""".display-table-row """),format.raw/*217.20*/("""{"""),format.raw/*217.21*/("""
    """),format.raw/*218.5*/("""display: table-row;
    height: 100%;
"""),format.raw/*220.1*/("""}"""),format.raw/*220.2*/("""

"""),format.raw/*222.1*/(""".display-table-cell """),format.raw/*222.21*/("""{"""),format.raw/*222.22*/("""
    """),format.raw/*223.5*/("""display: table-cell;
    float: none;
    height: 100%;
"""),format.raw/*226.1*/("""}"""),format.raw/*226.2*/("""

"""),format.raw/*228.1*/(""".v-align """),format.raw/*228.10*/("""{"""),format.raw/*228.11*/("""
    """),format.raw/*229.5*/("""vertical-align: top;
"""),format.raw/*230.1*/("""}"""),format.raw/*230.2*/("""
"""),format.raw/*231.1*/(""".logo img """),format.raw/*231.11*/("""{"""),format.raw/*231.12*/("""
    """),format.raw/*232.5*/("""max-width: 180px;
    padding: 16px 0 17px;
    width: 100%;
"""),format.raw/*235.1*/("""}"""),format.raw/*235.2*/("""

"""),format.raw/*237.1*/(""".header-top """),format.raw/*237.13*/("""{"""),format.raw/*237.14*/("""
    """),format.raw/*238.5*/("""margin: 0;
    padding-top: 2px;
"""),format.raw/*240.1*/("""}"""),format.raw/*240.2*/("""

"""),format.raw/*242.1*/(""".header-top img """),format.raw/*242.17*/("""{"""),format.raw/*242.18*/("""
    """),format.raw/*243.5*/("""border-radius: 50%;
    max-width: 48px !important;
    width: 100%;
"""),format.raw/*246.1*/("""}"""),format.raw/*246.2*/("""

"""),format.raw/*248.1*/(""".add-project """),format.raw/*248.14*/("""{"""),format.raw/*248.15*/("""
    """),format.raw/*249.5*/("""background: #5584ff none repeat scroll 0 0;
    border-radius: 100px;
    color: #ffffff;
    font-size: 14px;
    font-weight: 600;
    padding: 10px 27px 10px 45px;
    position: relative;
"""),format.raw/*256.1*/("""}"""),format.raw/*256.2*/("""

"""),format.raw/*258.1*/(""".header-rightside .nav > li > a:focus,
.header-rightside .nav > li > a:hover """),format.raw/*259.39*/("""{"""),format.raw/*259.40*/("""
    """),format.raw/*260.5*/("""background: none;
    text-decoration: none;
"""),format.raw/*262.1*/("""}"""),format.raw/*262.2*/("""

"""),format.raw/*264.1*/(""".add-project::before """),format.raw/*264.22*/("""{"""),format.raw/*264.23*/("""
    """),format.raw/*265.5*/("""background: rgba(0, 0, 0, 0) url("../images/plus.png") no-repeat scroll 0 0;
    content: "";
    ;
    height: 12px;
    left: 17px;
    position: absolute;
    top: 12px;
    width: 12px;
"""),format.raw/*273.1*/("""}"""),format.raw/*273.2*/("""

"""),format.raw/*275.1*/(""".add-project:hover """),format.raw/*275.20*/("""{"""),format.raw/*275.21*/("""
    """),format.raw/*276.5*/("""color: #ffffff;
"""),format.raw/*277.1*/("""}"""),format.raw/*277.2*/("""

"""),format.raw/*279.1*/(""".header-top i """),format.raw/*279.15*/("""{"""),format.raw/*279.16*/("""
    """),format.raw/*280.5*/("""color: #0e1a35;
"""),format.raw/*281.1*/("""}"""),format.raw/*281.2*/("""

"""),format.raw/*283.1*/(""".icon-info """),format.raw/*283.12*/("""{"""),format.raw/*283.13*/("""
    """),format.raw/*284.5*/("""position: relative;
"""),format.raw/*285.1*/("""}"""),format.raw/*285.2*/("""
"""),format.raw/*286.1*/(""".navi i """),format.raw/*286.9*/("""{"""),format.raw/*286.10*/("""
    """),format.raw/*287.5*/("""font-size: 20px;
"""),format.raw/*288.1*/("""}"""),format.raw/*288.2*/("""
"""),format.raw/*289.1*/(""".label.label-primary """),format.raw/*289.22*/("""{"""),format.raw/*289.23*/("""
    """),format.raw/*290.5*/("""border-radius: 50%;
    font-size: 9px;
    left: 8px;
    position: absolute;
    top: -9px;
"""),format.raw/*295.1*/("""}"""),format.raw/*295.2*/("""

"""),format.raw/*297.1*/(""".icon-info .label """),format.raw/*297.19*/("""{"""),format.raw/*297.20*/("""
    """),format.raw/*298.5*/("""border: 2px solid #ffffff;
    font-weight: 500;
    padding: 3px 5px;
    text-align: center;
"""),format.raw/*302.1*/("""}"""),format.raw/*302.2*/("""

"""),format.raw/*304.1*/(""".header-top li """),format.raw/*304.16*/("""{"""),format.raw/*304.17*/("""
    """),format.raw/*305.5*/("""display: inline-block;
    text-align: center;
"""),format.raw/*307.1*/("""}"""),format.raw/*307.2*/("""

"""),format.raw/*309.1*/(""".header-top .dropdown-toggle """),format.raw/*309.30*/("""{"""),format.raw/*309.31*/("""
    """),format.raw/*310.5*/("""color: #0e1a35;
"""),format.raw/*311.1*/("""}"""),format.raw/*311.2*/("""

"""),format.raw/*313.1*/(""".header-top .dropdown-menu """),format.raw/*313.28*/("""{"""),format.raw/*313.29*/("""
    """),format.raw/*314.5*/("""border: medium none;
    left: -85px;
    padding: 17px;
"""),format.raw/*317.1*/("""}"""),format.raw/*317.2*/("""
"""),format.raw/*318.1*/(""".view """),format.raw/*318.7*/("""{"""),format.raw/*318.8*/("""
    """),format.raw/*319.5*/("""background: #5584ff none repeat scroll 0 0;
    border-radius: 100px;
    color: #ffffff;
    display: inline-block;
    font-size: 14px;
    font-weight: 600;
    margin-top: 10px;
    padding: 10px 15px;
"""),format.raw/*327.1*/("""}"""),format.raw/*327.2*/("""

"""),format.raw/*329.1*/(""".navbar-content > span """),format.raw/*329.24*/("""{"""),format.raw/*329.25*/("""
    """),format.raw/*330.5*/("""font-size: 13px;
    font-weight: 700;
"""),format.raw/*332.1*/("""}"""),format.raw/*332.2*/("""

"""),format.raw/*334.1*/(""".img-responsive """),format.raw/*334.17*/("""{"""),format.raw/*334.18*/("""
    """),format.raw/*335.5*/("""width: 100%;
"""),format.raw/*336.1*/("""}"""),format.raw/*336.2*/("""
"""),format.raw/*337.1*/("""#navigation"""),format.raw/*337.12*/("""{"""),format.raw/*337.13*/("""
    """),format.raw/*338.5*/("""-webkit-transition: all 0.5s ease;
    -moz-transition: all 0.5s ease;
    -o-transition: all 0.5s ease;
    transition: all 0.5s ease;
"""),format.raw/*342.1*/("""}"""),format.raw/*342.2*/("""
"""),format.raw/*343.1*/(""".search input """),format.raw/*343.15*/("""{"""),format.raw/*343.16*/("""
    """),format.raw/*344.5*/("""border: none;
    font-size: 15px;
    padding: 15px 9px;
    width: 100%;
    background: rgba(0, 0, 0, 0) url("../images/search.png") no-repeat scroll 99% 12px;
    color: #8492af;
"""),format.raw/*350.1*/("""}"""),format.raw/*350.2*/("""

"""),format.raw/*352.1*/("""header """),format.raw/*352.8*/("""{"""),format.raw/*352.9*/("""
    """),format.raw/*353.5*/("""background: #ffffff none repeat scroll 0 0;
    box-shadow: 0 1px 12px rgba(0, 0, 0, 0.04);
    display: inline-block !important;
    line-height: 23px;
    padding: 15px;
    transition: all 0.5s ease 0s;
    width: 100%;
    -webkit-transition: all 0.5s ease;
    -moz-transition: all 0.5s ease;
    -o-transition: all 0.5s ease;
    transition: all 0.5s ease;
"""),format.raw/*364.1*/("""}"""),format.raw/*364.2*/("""

"""),format.raw/*366.1*/(""".logo """),format.raw/*366.7*/("""{"""),format.raw/*366.8*/("""
    """),format.raw/*367.5*/("""text-align: center;
"""),format.raw/*368.1*/("""}"""),format.raw/*368.2*/("""

"""),format.raw/*370.1*/(""".navi a """),format.raw/*370.9*/("""{"""),format.raw/*370.10*/("""
    """),format.raw/*371.5*/("""border-bottom: 1px solid #0d172e;
    border-top: 1px solid #0d172e;
    color: #ffffff;
    display: block;
    font-size: 17px;
    font-weight: 500;
    padding: 28px 20px;
    text-decoration: none;
"""),format.raw/*379.1*/("""}"""),format.raw/*379.2*/("""

"""),format.raw/*381.1*/(""".navi i """),format.raw/*381.9*/("""{"""),format.raw/*381.10*/("""
    """),format.raw/*382.5*/("""margin-right: 15px;
    color: #5584ff;
"""),format.raw/*384.1*/("""}"""),format.raw/*384.2*/("""

"""),format.raw/*386.1*/(""".navi .active a """),format.raw/*386.17*/("""{"""),format.raw/*386.18*/("""
    """),format.raw/*387.5*/("""background: #122143;
    border-left: 5px solid #5584ff;
    padding-left: 15px;
"""),format.raw/*390.1*/("""}"""),format.raw/*390.2*/("""

"""),format.raw/*392.1*/(""".navi a:hover """),format.raw/*392.15*/("""{"""),format.raw/*392.16*/("""
    """),format.raw/*393.5*/("""background: #122143 none repeat scroll 0 0;
    border-left: 5px solid #5584ff;
    display: block;
    padding-left: 15px;
"""),format.raw/*397.1*/("""}"""),format.raw/*397.2*/("""

"""),format.raw/*399.1*/(""".navbar-default """),format.raw/*399.17*/("""{"""),format.raw/*399.18*/("""
    """),format.raw/*400.5*/("""background-color: #ffffff;
    border-color: #ffffff;
"""),format.raw/*402.1*/("""}"""),format.raw/*402.2*/("""

"""),format.raw/*404.1*/(""".navbar-toggle """),format.raw/*404.16*/("""{"""),format.raw/*404.17*/("""
    """),format.raw/*405.5*/("""border: none;
"""),format.raw/*406.1*/("""}"""),format.raw/*406.2*/("""

"""),format.raw/*408.1*/(""".navbar-default .navbar-toggle:focus,
.navbar-default .navbar-toggle:hover """),format.raw/*409.38*/("""{"""),format.raw/*409.39*/("""
    """),format.raw/*410.5*/("""background-color: rgba(0, 0, 0, 0);
"""),format.raw/*411.1*/("""}"""),format.raw/*411.2*/("""

"""),format.raw/*413.1*/(""".navbar-default .navbar-toggle .icon-bar """),format.raw/*413.42*/("""{"""),format.raw/*413.43*/("""
    """),format.raw/*414.5*/("""background-color: #0e1a35;
"""),format.raw/*415.1*/("""}"""),format.raw/*415.2*/("""

"""),format.raw/*417.1*/(""".circle-logo """),format.raw/*417.14*/("""{"""),format.raw/*417.15*/("""
    """),format.raw/*418.5*/("""margin: 0 auto;
    max-width: 30px !important;
    text-align: center;
"""),format.raw/*421.1*/("""}"""),format.raw/*421.2*/("""
"""),format.raw/*422.1*/(""".hidden-xs"""),format.raw/*422.11*/("""{"""),format.raw/*422.12*/("""
    """),format.raw/*423.5*/("""-webkit-transition: all 0.5s ease;
    -moz-transition: all 0.5s ease;
    -o-transition: all 0.5s ease;
    transition: all 0.5s ease;
"""),format.raw/*427.1*/("""}"""),format.raw/*427.2*/("""

"""),format.raw/*429.1*/(""".user-dashboard """),format.raw/*429.17*/("""{"""),format.raw/*429.18*/("""
    """),format.raw/*430.5*/("""padding: 0 20px;
"""),format.raw/*431.1*/("""}"""),format.raw/*431.2*/("""

"""),format.raw/*433.1*/(""".user-dashboard h1 """),format.raw/*433.20*/("""{"""),format.raw/*433.21*/("""
    """),format.raw/*434.5*/("""color: #0e1a35;
    font-size: 30px;
    font-weight: 500;
    margin: 0;
    padding: 21px 0;
"""),format.raw/*439.1*/("""}"""),format.raw/*439.2*/("""
"""),format.raw/*440.1*/(""".sales """),format.raw/*440.8*/("""{"""),format.raw/*440.9*/("""
    """),format.raw/*441.5*/("""background: #ffffff none repeat scroll 0 0;
    border: 1px solid #d4d9e3;
    display: inline-block;
    padding: 15px;
    width: 100%;
"""),format.raw/*446.1*/("""}"""),format.raw/*446.2*/("""
"""),format.raw/*447.1*/(""".sales button """),format.raw/*447.15*/("""{"""),format.raw/*447.16*/("""
    """),format.raw/*448.5*/("""background: rgba(0, 0, 0, 0) none repeat scroll 0 0;
    border: 1px solid #dadee7;
    border-radius: 100px;
    font-size: 15px;
    letter-spacing: 0.5px;
    padding-right: 32px;
    color: #0e1a35;
"""),format.raw/*455.1*/("""}"""),format.raw/*455.2*/("""

"""),format.raw/*457.1*/(""".sales button::before """),format.raw/*457.23*/("""{"""),format.raw/*457.24*/("""
    """),format.raw/*458.5*/("""content: "";
    font-family: FontAwesome;
    position: absolute;
    right: 12px;
    top: 11px;
"""),format.raw/*463.1*/("""}"""),format.raw/*463.2*/("""
"""),format.raw/*464.1*/(""".sales  .btn-group """),format.raw/*464.20*/("""{"""),format.raw/*464.21*/("""
    """),format.raw/*465.5*/("""float: right;
"""),format.raw/*466.1*/("""}"""),format.raw/*466.2*/("""
"""),format.raw/*467.1*/(""".sales h2 """),format.raw/*467.11*/("""{"""),format.raw/*467.12*/("""
    """),format.raw/*468.5*/("""color: #8492af;
    float: left;
    font-size: 21px;
    font-weight: 600;
    margin: 0;
    padding: 9px 0 0;
"""),format.raw/*474.1*/("""}"""),format.raw/*474.2*/("""
"""),format.raw/*475.1*/(""".btn.btn-secondary.btn-lg.dropdown-toggle > span """),format.raw/*475.50*/("""{"""),format.raw/*475.51*/("""
    """),format.raw/*476.5*/("""font-size: 15px;
    font-weight: 600;
    letter-spacing: 0.5px;
"""),format.raw/*479.1*/("""}"""),format.raw/*479.2*/("""
"""),format.raw/*480.1*/(""".sales .dropdown-menu"""),format.raw/*480.22*/("""{"""),format.raw/*480.23*/("""
    """),format.raw/*481.5*/("""margin: 0px;
    padding: 0px;
    border: 0px;
    border-radius: 8px;
    width: 100%;
    color: #0e1a35;
"""),format.raw/*487.1*/("""}"""),format.raw/*487.2*/("""
"""),format.raw/*488.1*/(""".sales .btn-group.open .dropdown-toggle, .btn.active, .btn:active"""),format.raw/*488.66*/("""{"""),format.raw/*488.67*/("""
    """),format.raw/*489.5*/("""box-shadow: none;
"""),format.raw/*490.1*/("""}"""),format.raw/*490.2*/("""
"""),format.raw/*491.1*/(""".sales .dropdown-menu > a """),format.raw/*491.27*/("""{"""),format.raw/*491.28*/("""
    """),format.raw/*492.5*/("""color: #0e1a35;
    display: inline-block;
    font-weight: 800;
    padding: 9px 0;
    text-align: center;
    width: 100%;
"""),format.raw/*498.1*/("""}"""),format.raw/*498.2*/("""
"""),format.raw/*499.1*/("""#my-cool-chart svg """),format.raw/*499.20*/("""{"""),format.raw/*499.21*/("""
    """),format.raw/*500.5*/("""width: 100%;
"""),format.raw/*501.1*/("""}"""),format.raw/*501.2*/("""
"""),format.raw/*502.1*/(""".sales .dropdown-menu > a:hover"""),format.raw/*502.32*/("""{"""),format.raw/*502.33*/("""
    """),format.raw/*503.5*/("""color: #5584FF;
"""),format.raw/*504.1*/("""}"""),format.raw/*504.2*/("""
"""),format.raw/*505.1*/(""".shield-buttons """),format.raw/*505.17*/("""{"""),format.raw/*505.18*/("""
    """),format.raw/*506.5*/("""display: none;
"""),format.raw/*507.1*/("""}"""),format.raw/*507.2*/("""
"""),format.raw/*508.1*/(""".close, .close:focus, .close:hover """),format.raw/*508.36*/("""{"""),format.raw/*508.37*/("""
    """),format.raw/*509.5*/("""color: #fff;;
    opacity: 1;
    text-shadow: none;
"""),format.raw/*512.1*/("""}"""),format.raw/*512.2*/("""
"""),format.raw/*513.1*/(""".modal-body input """),format.raw/*513.19*/("""{"""),format.raw/*513.20*/("""
    """),format.raw/*514.5*/("""border: 1px solid #d4d9e3;
    font-size: 14px;
    font-weight: 300;
    margin: 5px 0;
    padding: 14px 10px;
    width: 100%;
    color: #8492af;
"""),format.raw/*521.1*/("""}"""),format.raw/*521.2*/("""
"""),format.raw/*522.1*/(""".modal-body textarea """),format.raw/*522.22*/("""{"""),format.raw/*522.23*/("""
    """),format.raw/*523.5*/("""border: 1px solid #d4d9e3;
    font-size: 14px;
    font-weight: 300;
    height: 200px;
    margin-top: 5px;
    padding: 9px 10px;
    width: 100%;
    color: #8492af;
"""),format.raw/*531.1*/("""}"""),format.raw/*531.2*/("""
"""),format.raw/*532.1*/(""".modal-header.login-header h4 """),format.raw/*532.31*/("""{"""),format.raw/*532.32*/("""
    """),format.raw/*533.5*/("""color: #ffffff;
"""),format.raw/*534.1*/("""}"""),format.raw/*534.2*/("""
"""),format.raw/*535.1*/(""".modal-footer .add-project """),format.raw/*535.28*/("""{"""),format.raw/*535.29*/("""
    """),format.raw/*536.5*/("""background: #5584ff none repeat scroll 0 0;
    border: medium none;
    border-radius: 100px;
    color: #ffffff;
    font-size: 14px;
    font-weight: 600;
    padding: 10px 30px;
    position: relative;
"""),format.raw/*544.1*/("""}"""),format.raw/*544.2*/("""
"""),format.raw/*545.1*/(""".modal-footer .add-project::before"""),format.raw/*545.35*/("""{"""),format.raw/*545.36*/("""display: none;"""),format.raw/*545.50*/("""}"""),format.raw/*545.51*/("""
"""),format.raw/*546.1*/(""".modal-footer """),format.raw/*546.15*/("""{"""),format.raw/*546.16*/("""
    """),format.raw/*547.5*/("""border: 0 none;
    padding: 10px 15px 26px;
    text-align: right;
"""),format.raw/*550.1*/("""}"""),format.raw/*550.2*/("""
"""),format.raw/*551.1*/(""".cancel """),format.raw/*551.9*/("""{"""),format.raw/*551.10*/("""
    """),format.raw/*552.5*/("""background: #0E1A35     ;
    border: medium none;
    border-radius: 100px;
    color: #ffffff;
    font-size: 14px;
    font-weight: 600;
    padding: 10px 30px;
        position: relative;

"""),format.raw/*561.1*/("""}"""),format.raw/*561.2*/("""
"""),format.raw/*562.1*/(""".modal"""),format.raw/*562.7*/("""{"""),format.raw/*562.8*/("""
    """),format.raw/*563.5*/("""top: 20%;
"""),format.raw/*564.1*/("""}"""),format.raw/*564.2*/("""
"""),format.raw/*565.1*/(""".modal-header .close """),format.raw/*565.22*/("""{"""),format.raw/*565.23*/("""
    """),format.raw/*566.5*/("""margin-top: 2px;
"""),format.raw/*567.1*/("""}"""),format.raw/*567.2*/("""
"""),format.raw/*568.1*/(""".search input:focus"""),format.raw/*568.20*/("""{"""),format.raw/*568.21*/("""
    """),format.raw/*569.5*/("""border-bottom: 1px solid #BDC4D4;
    line-height:22px;
    transition: 0.1s all;
"""),format.raw/*572.1*/("""}"""),format.raw/*572.2*/("""
"""),format.raw/*573.1*/(""".modal-header.login-header """),format.raw/*573.28*/("""{"""),format.raw/*573.29*/("""
    """),format.raw/*574.5*/("""border-top-left-radius: 5px;
    border-top-right-radius: 5px;
/*Main CSS*/
"""),format.raw/*577.1*/("""}"""),format.raw/*577.2*/("""





    """),format.raw/*583.5*/(""".login-details .nav-tabs > li """),format.raw/*583.35*/("""{"""),format.raw/*583.36*/("""
        """),format.raw/*584.9*/("""text-align: center;
        width: 50%;
    """),format.raw/*586.5*/("""}"""),format.raw/*586.6*/("""
    """),format.raw/*587.5*/(""".login-signup .login-inner h1 """),format.raw/*587.35*/("""{"""),format.raw/*587.36*/("""
        """),format.raw/*588.9*/("""font-size: 26px;
        margin-bottom: 0;
        margin-top: 10px;
    """),format.raw/*591.5*/("""}"""),format.raw/*591.6*/("""
    """),format.raw/*592.5*/(""".login-inner .login-form input """),format.raw/*592.36*/("""{"""),format.raw/*592.37*/("""
        """),format.raw/*593.9*/("""font-size: 15px;
        max-width: 100%;
        padding: 15px 45px;
    """),format.raw/*596.5*/("""}"""),format.raw/*596.6*/("""
    """),format.raw/*597.5*/(""".login-inner .form-details """),format.raw/*597.32*/("""{"""),format.raw/*597.33*/("""
        """),format.raw/*598.9*/("""padding: 25px;
    """),format.raw/*599.5*/("""}"""),format.raw/*599.6*/("""
    """),format.raw/*600.5*/(""".login-inner .login-form label """),format.raw/*600.36*/("""{"""),format.raw/*600.37*/("""
        """),format.raw/*601.9*/("""margin-bottom: 20px;
        width: 100%;
    """),format.raw/*603.5*/("""}"""),format.raw/*603.6*/("""
    """),format.raw/*604.5*/(""".login-inner .form-btn """),format.raw/*604.28*/("""{"""),format.raw/*604.29*/("""
        """),format.raw/*605.9*/("""margin: 0;
        max-width: 180px;
    """),format.raw/*607.5*/("""}"""),format.raw/*607.6*/("""
    """),format.raw/*608.5*/(""".tab-content .tab-pane """),format.raw/*608.28*/("""{"""),format.raw/*608.29*/("""
        """),format.raw/*609.9*/("""padding: 20px 0;
    """),format.raw/*610.5*/("""}"""),format.raw/*610.6*/("""
    """),format.raw/*611.5*/("""#navigation .navi a """),format.raw/*611.25*/("""{"""),format.raw/*611.26*/("""
        """),format.raw/*612.9*/("""font-size: 14px;
        padding: 20px;
        text-align: center;
    """),format.raw/*615.5*/("""}"""),format.raw/*615.6*/("""
    """),format.raw/*616.5*/("""#navigation .navi i """),format.raw/*616.25*/("""{"""),format.raw/*616.26*/("""
        """),format.raw/*617.9*/("""margin-right: 0px;
    """),format.raw/*618.5*/("""}"""),format.raw/*618.6*/("""
    """),format.raw/*619.5*/("""#navigation .navi a:hover,
    #navigation .navi .active a """),format.raw/*620.33*/("""{"""),format.raw/*620.34*/("""
        """),format.raw/*621.9*/("""background: #122143 none repeat scroll 0 0;
        border-left: none;
        display: block;
        padding-left: 20px;
    """),format.raw/*625.5*/("""}"""),format.raw/*625.6*/("""
    """),format.raw/*626.5*/("""header .header-top img """),format.raw/*626.28*/("""{"""),format.raw/*626.29*/("""
        """),format.raw/*627.9*/("""max-width: 38px !important;
    """),format.raw/*628.5*/("""}"""),format.raw/*628.6*/("""
    """),format.raw/*629.5*/(""".v-align header """),format.raw/*629.21*/("""{"""),format.raw/*629.22*/("""
        """),format.raw/*630.9*/("""padding: 12px 15px;
    """),format.raw/*631.5*/("""}"""),format.raw/*631.6*/("""
    """),format.raw/*632.5*/("""header .header-top li """),format.raw/*632.27*/("""{"""),format.raw/*632.28*/("""
        """),format.raw/*633.9*/("""padding-left: 13px;
        padding-right: 6px;
    """),format.raw/*635.5*/("""}"""),format.raw/*635.6*/("""
    """),format.raw/*636.5*/(""".navbar-default .navbar-toggle """),format.raw/*636.36*/("""{"""),format.raw/*636.37*/("""
        """),format.raw/*637.9*/("""border-color: rgba(0, 0, 0, 0);
    """),format.raw/*638.5*/("""}"""),format.raw/*638.6*/("""
    """),format.raw/*639.5*/(""".navbar-header .navbar-toggle """),format.raw/*639.35*/("""{"""),format.raw/*639.36*/("""
        """),format.raw/*640.9*/("""float: left;
        margin: 0;
        padding: 0;
        top: 12px;
    """),format.raw/*644.5*/("""}"""),format.raw/*644.6*/("""
    """),format.raw/*645.5*/("""button,
        html [type="button"],
        [type="reset"],
        [type="submit"] """),format.raw/*648.25*/("""{"""),format.raw/*648.26*/("""
            """),format.raw/*649.13*/("""outline: medium none;
    """),format.raw/*650.5*/("""}"""),format.raw/*650.6*/("""
    """),format.raw/*651.5*/(""".user-dashboard .sales h2 """),format.raw/*651.31*/("""{"""),format.raw/*651.32*/("""
        """),format.raw/*652.9*/("""color: #8492af;
        float: left;
        font-size: 14px;
        font-weight: 600;
        margin: 0;
        padding: 13px 0 0;
"""),format.raw/*658.1*/("""}"""),format.raw/*658.2*/("""
    """),format.raw/*659.5*/(""".user-dashboard .btn.btn-secondary.btn-lg.dropdown-toggle > span """),format.raw/*659.70*/("""{"""),format.raw/*659.71*/("""
        """),format.raw/*660.9*/("""font-size: 11px;
"""),format.raw/*661.1*/("""}"""),format.raw/*661.2*/("""
    """),format.raw/*662.5*/(""".user-dashboard .sales button """),format.raw/*662.35*/("""{"""),format.raw/*662.36*/("""
        """),format.raw/*663.9*/("""font-size: 11px;
        padding-right: 23px;
"""),format.raw/*665.1*/("""}"""),format.raw/*665.2*/("""
    """),format.raw/*666.5*/(""".user-dashboard .sales h2 """),format.raw/*666.31*/("""{"""),format.raw/*666.32*/("""
    """),format.raw/*667.5*/("""font-size: 12px;
"""),format.raw/*668.1*/("""}"""),format.raw/*668.2*/("""
"""),format.raw/*669.1*/(""".gutter"""),format.raw/*669.8*/("""{"""),format.raw/*669.9*/("""
    """),format.raw/*670.5*/("""padding: 0;
"""),format.raw/*671.1*/("""}"""),format.raw/*671.2*/("""


    """),format.raw/*674.5*/("""header .logo img """),format.raw/*674.22*/("""{"""),format.raw/*674.23*/("""
        """),format.raw/*675.9*/("""max-width: 125px !important;
"""),format.raw/*676.1*/("""}"""),format.raw/*676.2*/("""


    """),format.raw/*679.5*/(""".user-dashboard .header-rightside """),format.raw/*679.39*/("""{"""),format.raw/*679.40*/("""
        """),format.raw/*680.9*/("""display: inline-block;
        float: left;
        width: 100%;
"""),format.raw/*683.1*/("""}"""),format.raw/*683.2*/("""
    """),format.raw/*684.5*/(""".user-dashboard .header-rightside .header-top img """),format.raw/*684.55*/("""{"""),format.raw/*684.56*/("""
        """),format.raw/*685.9*/("""max-width: 41px !important;
"""),format.raw/*686.1*/("""}"""),format.raw/*686.2*/("""
    """),format.raw/*687.5*/(""".user-dashboard .sales button """),format.raw/*687.35*/("""{"""),format.raw/*687.36*/("""
    """),format.raw/*688.5*/("""font-size: 10px;
"""),format.raw/*689.1*/("""}"""),format.raw/*689.2*/("""
    """),format.raw/*690.5*/(""".user-dashboard .btn.btn-secondary.btn-lg.dropdown-toggle > span """),format.raw/*690.70*/("""{"""),format.raw/*690.71*/("""
    """),format.raw/*691.5*/("""font-size: 12px;
"""),format.raw/*692.1*/("""}"""),format.raw/*692.2*/("""
    """),format.raw/*693.5*/(""".user-dashboard .sales h2 """),format.raw/*693.31*/("""{"""),format.raw/*693.32*/("""
    """),format.raw/*694.5*/("""font-size: 15px;
"""),format.raw/*695.1*/("""}"""),format.raw/*695.2*/("""

"""),format.raw/*697.1*/("""</style>
</head>
<body class="home">
<div class="container-fluid display-table">
    <div class="row display-table-row">
        <div class="col-md-2 col-sm-1 hidden-xs display-table-cell v-align box" id="navigation">
            <div class="logo">
                <a hef="home.html"><img src="http://jskrishna.com/work/merkury/images/logo.png" alt="merkery_logo" class="hidden-xs hidden-sm">
                    <img src="http://jskrishna.com/work/merkury/images/circle-logo.png" alt="merkery_logo" class="visible-xs visible-sm circle-logo">
                </a>
            </div>
            <div class="navi">
                <ul>
                    <li class="active"><a href="#"><i class="fa fa-home" aria-hidden="true"></i><span class="hidden-xs hidden-sm">Home</span></a></li>
                    <li><a href="#"><i class="fa fa-tasks" aria-hidden="true"></i><span class="hidden-xs hidden-sm">Workflow</span></a></li>
                    <li><a href="#"><i class="fa fa-bar-chart" aria-hidden="true"></i><span class="hidden-xs hidden-sm">Statistics</span></a></li>
                    <li><a href="#"><i class="fa fa-user" aria-hidden="true"></i><span class="hidden-xs hidden-sm">Calender</span></a></li>
                    <li><a href="#"><i class="fa fa-calendar" aria-hidden="true"></i><span class="hidden-xs hidden-sm">Users</span></a></li>
                    <li><a href="#"><i class="fa fa-cog" aria-hidden="true"></i><span class="hidden-xs hidden-sm">Setting</span></a></li>
                </ul>
            </div>
        </div>
        <div class="col-md-10 col-sm-11 display-table-cell v-align">
            <!--<button type="button" class="slide-toggle">Slide Toggle</button> -->
            <div class="row">
                <header>
                    <div class="col-md-7">
                        <nav class="navbar-default pull-left">
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle collapsed" data-toggle="offcanvas" data-target="#side-menu" aria-expanded="false">
                                    <span class="sr-only">Toggle navigation</span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                            </div>
                        </nav>
                        <div class="search hidden-xs hidden-sm">
                            <input type="text" placeholder="Search" id="search">
                        </div>
                    </div>
                    <div class="col-md-5">
                        <div class="header-rightside">
                            <ul class="list-inline header-top pull-right">
                                <li class="hidden-xs"><a href="#" class="add-project" data-toggle="modal" data-target="#add_project">Add Project</a></li>
                                <li><a href="#"><i class="fa fa-envelope" aria-hidden="true"></i></a></li>
                                <li>
                                    <a href="#" class="icon-info">
                                        <i class="fa fa-bell" aria-hidden="true"></i>
                                        <span class="label label-primary">3</span>
                                    </a>
                                </li>
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="http://jskrishna.com/work/merkury/images/user-pic.jpg" alt="user">
                                        <b class="caret"></b></a>
                                    <ul class="dropdown-menu">
                                        <li>
                                            <div class="navbar-content">
                                                <span>JS Krishna</span>

                                                <div class="divider">
                                                </div>
                                                <a href="#" class="view btn-sm active">View Profile</a>
                                            </div>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </header>
            </div>
            <div class="user-dashboard">
                <h1>Hello, JS</h1>
                <div class="row">
                    <div class="col-md-5 col-sm-5 col-xs-12 gutter">

                        <div class="sales">
                            <h2>Your Sale</h2>

                            <div class="btn-group">
                                <button class="btn btn-secondary btn-lg dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <span>Period:</span> Last Year
                                </button>
                                <div class="dropdown-menu">
                                    <a href="#">2012</a>
                                    <a href="#">2014</a>
                                    <a href="#">2015</a>
                                    <a href="#">2016</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-7 col-sm-7 col-xs-12 gutter">

                        <div class="sales report">
                            <h2>Report</h2>
                            <div class="btn-group">
                                <button class="btn btn-secondary btn-lg dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <span>Period:</span> Last Year
                                </button>
                                <div class="dropdown-menu">
                                    <a href="#">2012</a>
                                    <a href="#">2014</a>
                                    <a href="#">2015</a>
                                    <a href="#">2016</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>



<!-- Modal -->
<div id="add_project" class="modal fade" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header login-header">
                <button type="button" class="close" data-dismiss="modal">×</button>
                <h4 class="modal-title">Add Project</h4>
            </div>
            <div class="modal-body">
                <input type="text" placeholder="Project Title" name="name">
                <input type="text" placeholder="Post of Post" name="mail">
                <input type="text" placeholder="Author" name="passsword">
                <textarea placeholder="Desicrption"></textarea>
            </div>
            <div class="modal-footer">
                <button type="button" class="cancel" data-dismiss="modal">Close</button>
                <button type="button" class="add-project" data-dismiss="modal">Save</button>
            </div>
        </div>

    </div>
</div>
<script>
    $(document).ready(function()"""),format.raw/*841.33*/("""{"""),format.raw/*841.34*/("""
   """),format.raw/*842.4*/("""$('[data-toggle="offcanvas"]').click(function()"""),format.raw/*842.51*/("""{"""),format.raw/*842.52*/("""
       """),format.raw/*843.8*/("""$("#navigation").toggleClass("hidden-xs");
   """),format.raw/*844.4*/("""}"""),format.raw/*844.5*/(""");
"""),format.raw/*845.1*/("""}"""),format.raw/*845.2*/(""");

</script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
</body>

</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-06T13:22:33.487
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/home.scala.html
                  HASH: d70193638639dde67cff92f4c8fb2cc65caae3c3
                  MATRIX: 1029->4|1661->608|1690->609|1723->615|1793->658|1821->659|1850->661|1882->666|1910->667|1943->673|2022->725|2050->726|2079->728|2121->742|2150->743|2183->749|2228->767|2256->768|2285->770|2323->780|2352->781|2385->787|2568->943|2596->944|2627->948|2669->962|2698->963|2731->969|2826->1037|2854->1038|2885->1042|2927->1056|2956->1057|2989->1063|3085->1132|3113->1133|3144->1137|3188->1153|3217->1154|3250->1160|3366->1249|3394->1250|3425->1254|3481->1282|3510->1283|3543->1289|3590->1309|3618->1310|3649->1314|3813->1450|3842->1451|3875->1457|3971->1526|3999->1527|4030->1531|4091->1564|4120->1565|4153->1571|4337->1728|4365->1729|4396->1733|4448->1757|4477->1758|4510->1764|4559->1786|4587->1787|4618->1791|4675->1820|4704->1821|4737->1827|4785->1848|4813->1849|4844->1853|4942->1923|4971->1924|5004->1930|5078->1977|5106->1978|5137->1982|5201->2018|5230->2019|5263->2025|5325->2060|5353->2061|5384->2065|5428->2081|5457->2082|5491->2088|5652->2221|5681->2222|5713->2226|5763->2247|5793->2248|5827->2254|5872->2271|5901->2272|5933->2276|5974->2288|6004->2289|6038->2295|6087->2316|6116->2317|6148->2321|6195->2339|6225->2340|6259->2346|6808->2867|6837->2868|6869->2872|6916->2890|6946->2891|6980->2897|7048->2937|7077->2938|7109->2942|7150->2954|7180->2955|7214->2961|7325->3044|7354->3045|7386->3049|7427->3061|7457->3062|7491->3068|7606->3155|7635->3156|7667->3160|7708->3172|7738->3173|7772->3179|7883->3262|7912->3263|7944->3267|8000->3294|8030->3295|8064->3301|8256->3465|8285->3466|8317->3470|8356->3480|8386->3481|8420->3487|8820->3859|8849->3860|8881->3864|8928->3882|8958->3883|8992->3889|9124->3993|9153->3994|9185->3998|9228->4012|9258->4013|9292->4019|9338->4037|9367->4038|9399->4042|9451->4065|9481->4066|9515->4072|9561->4090|9590->4091|9624->4097|9702->4147|9731->4148|9765->4154|9815->4176|9844->4177|9876->4181|9917->4193|9947->4194|9981->4200|10031->4222|10060->4223|10092->4227|10133->4239|10163->4240|10197->4246|10238->4259|10267->4260|10299->4264|10343->4279|10373->4280|10407->4286|10506->4357|10535->4358|10567->4362|10615->4381|10645->4382|10679->4388|10747->4428|10776->4429|10808->4433|10857->4453|10887->4454|10921->4460|11008->4519|11037->4520|11069->4524|11107->4533|11137->4534|11171->4540|11221->4562|11250->4563|11280->4565|11319->4575|11349->4576|11383->4582|11475->4646|11504->4647|11536->4651|11577->4663|11607->4664|11641->4670|11704->4705|11733->4706|11765->4710|11810->4726|11840->4727|11874->4733|11974->4805|12003->4806|12035->4810|12077->4823|12107->4824|12141->4830|12367->5028|12396->5029|12428->5033|12535->5111|12565->5112|12599->5118|12674->5165|12703->5166|12735->5170|12785->5191|12815->5192|12849->5198|13075->5396|13104->5397|13136->5401|13184->5420|13214->5421|13248->5427|13293->5444|13322->5445|13354->5449|13397->5463|13427->5464|13461->5470|13506->5487|13535->5488|13567->5492|13607->5503|13637->5504|13671->5510|13720->5531|13749->5532|13779->5534|13815->5542|13845->5543|13879->5549|13925->5567|13954->5568|13984->5570|14034->5591|14064->5592|14098->5598|14225->5697|14254->5698|14286->5702|14333->5720|14363->5721|14397->5727|14524->5826|14553->5827|14585->5831|14629->5846|14659->5847|14693->5853|14770->5902|14799->5903|14831->5907|14889->5936|14919->5937|14953->5943|14998->5960|15027->5961|15059->5965|15115->5992|15145->5993|15179->5999|15267->6059|15296->6060|15326->6062|15360->6068|15389->6069|15423->6075|15665->6289|15694->6290|15726->6294|15778->6317|15808->6318|15842->6324|15911->6365|15940->6366|15972->6370|16017->6386|16047->6387|16081->6393|16123->6407|16152->6408|16182->6410|16222->6421|16252->6422|16286->6428|16454->6568|16483->6569|16513->6571|16556->6585|16586->6586|16620->6592|16837->6781|16866->6782|16898->6786|16933->6793|16962->6794|16996->6800|17398->7174|17427->7175|17459->7179|17493->7185|17522->7186|17556->7192|17605->7213|17634->7214|17666->7218|17702->7226|17732->7227|17766->7233|18005->7444|18034->7445|18066->7449|18102->7457|18132->7458|18166->7464|18236->7506|18265->7507|18297->7511|18342->7527|18372->7528|18406->7534|18518->7618|18547->7619|18579->7623|18622->7637|18652->7638|18686->7644|18842->7772|18871->7773|18903->7777|18948->7793|18978->7794|19012->7800|19096->7856|19125->7857|19157->7861|19201->7876|19231->7877|19265->7883|19308->7898|19337->7899|19369->7903|19474->7979|19504->7980|19538->7986|19603->8023|19632->8024|19664->8028|19734->8069|19764->8070|19798->8076|19854->8104|19883->8105|19915->8109|19957->8122|19987->8123|20021->8129|20124->8204|20153->8205|20183->8207|20222->8217|20252->8218|20286->8224|20454->8364|20483->8365|20515->8369|20560->8385|20590->8386|20624->8392|20670->8410|20699->8411|20731->8415|20779->8434|20809->8435|20843->8441|20971->8541|21000->8542|21030->8544|21065->8551|21094->8552|21128->8558|21299->8701|21328->8702|21358->8704|21401->8718|21431->8719|21465->8725|21703->8935|21732->8936|21764->8940|21815->8962|21845->8963|21879->8969|22012->9074|22041->9075|22071->9077|22119->9096|22149->9097|22183->9103|22226->9118|22255->9119|22285->9121|22324->9131|22354->9132|22388->9138|22535->9257|22564->9258|22594->9260|22672->9309|22702->9310|22736->9316|22833->9385|22862->9386|22892->9388|22942->9409|22972->9410|23006->9416|23149->9531|23178->9532|23208->9534|23302->9599|23332->9600|23366->9606|23413->9625|23442->9626|23472->9628|23527->9654|23557->9655|23591->9661|23751->9793|23780->9794|23810->9796|23858->9815|23888->9816|23922->9822|23964->9836|23993->9837|24023->9839|24083->9870|24113->9871|24147->9877|24192->9894|24221->9895|24251->9897|24296->9913|24326->9914|24360->9920|24404->9936|24433->9937|24463->9939|24527->9974|24557->9975|24591->9981|24675->10037|24704->10038|24734->10040|24781->10058|24811->10059|24845->10065|25030->10222|25059->10223|25089->10225|25139->10246|25169->10247|25203->10253|25409->10431|25438->10432|25468->10434|25527->10464|25557->10465|25591->10471|25636->10488|25665->10489|25695->10491|25751->10518|25781->10519|25815->10525|26057->10739|26086->10740|26116->10742|26179->10776|26209->10777|26252->10791|26282->10792|26312->10794|26355->10808|26385->10809|26419->10815|26518->10886|26547->10887|26577->10889|26613->10897|26643->10898|26677->10904|26907->11106|26936->11107|26966->11109|27000->11115|27029->11116|27063->11122|27102->11133|27131->11134|27161->11136|27211->11157|27241->11158|27275->11164|27321->11182|27350->11183|27380->11185|27428->11204|27458->11205|27492->11211|27605->11296|27634->11297|27664->11299|27720->11326|27750->11327|27784->11333|27891->11412|27920->11413|27964->11429|28023->11459|28053->11460|28091->11470|28165->11516|28194->11517|28228->11523|28287->11553|28317->11554|28355->11564|28459->11640|28488->11641|28522->11647|28582->11678|28612->11679|28650->11689|28755->11766|28784->11767|28818->11773|28874->11800|28904->11801|28942->11811|28990->11831|29019->11832|29053->11838|29113->11869|29143->11870|29181->11880|29257->11928|29286->11929|29320->11935|29372->11958|29402->11959|29440->11969|29511->12012|29540->12013|29574->12019|29626->12042|29656->12043|29694->12053|29744->12075|29773->12076|29807->12082|29856->12102|29886->12103|29924->12113|30027->12188|30056->12189|30090->12195|30139->12215|30169->12216|30207->12226|30259->12250|30288->12251|30322->12257|30411->12317|30441->12318|30479->12328|30638->12459|30667->12460|30701->12466|30753->12489|30783->12490|30821->12500|30882->12533|30911->12534|30945->12540|30990->12556|31020->12557|31058->12567|31111->12592|31140->12593|31174->12599|31225->12621|31255->12622|31293->12632|31375->12686|31404->12687|31438->12693|31498->12724|31528->12725|31566->12735|31631->12772|31660->12773|31694->12779|31753->12809|31783->12810|31821->12820|31928->12899|31957->12900|31991->12906|32109->12995|32139->12996|32182->13010|32237->13037|32266->13038|32300->13044|32355->13070|32385->13071|32423->13081|32591->13221|32620->13222|32654->13228|32748->13293|32778->13294|32816->13304|32862->13322|32891->13323|32925->13329|32984->13359|33014->13360|33052->13370|33128->13418|33157->13419|33191->13425|33246->13451|33276->13452|33310->13458|33356->13476|33385->13477|33415->13479|33450->13486|33479->13487|33513->13493|33554->13506|33583->13507|33621->13517|33667->13534|33697->13535|33735->13545|33793->13575|33822->13576|33860->13586|33923->13620|33953->13621|33991->13631|34087->13699|34116->13700|34150->13706|34229->13756|34259->13757|34297->13767|34354->13796|34383->13797|34417->13803|34476->13833|34506->13834|34540->13840|34586->13858|34615->13859|34649->13865|34743->13930|34773->13931|34807->13937|34853->13955|34882->13956|34916->13962|34971->13988|35001->13989|35035->13995|35081->14013|35110->14014|35142->14018|42923->21770|42953->21771|42986->21776|43062->21823|43092->21824|43129->21833|43204->21880|43233->21881|43265->21885|43294->21886
                  LINES: 33->3|50->20|50->20|51->21|53->23|53->23|54->24|54->24|54->24|55->25|58->28|58->28|59->29|59->29|59->29|60->30|61->31|61->31|62->32|62->32|62->32|63->33|68->38|68->38|70->40|70->40|70->40|71->41|74->44|74->44|76->46|76->46|76->46|77->47|80->50|80->50|82->52|82->52|82->52|83->53|87->57|87->57|89->59|89->59|89->59|90->60|91->61|91->61|93->63|95->65|95->65|96->66|99->69|99->69|101->71|101->71|101->71|102->72|109->79|109->79|111->81|111->81|111->81|112->82|113->83|113->83|115->85|115->85|115->85|116->86|117->87|117->87|119->89|120->90|120->90|121->91|123->93|123->93|125->95|125->95|125->95|126->96|127->97|127->97|129->99|129->99|129->99|130->100|136->106|136->106|138->108|138->108|138->108|139->109|140->110|140->110|142->112|142->112|142->112|143->113|144->114|144->114|146->116|146->116|146->116|147->117|163->133|163->133|165->135|165->135|165->135|166->136|168->138|168->138|170->140|170->140|170->140|171->141|172->142|172->142|174->144|174->144|174->144|175->145|176->146|176->146|178->148|178->148|178->148|179->149|180->150|180->150|182->152|182->152|182->152|183->153|188->158|188->158|190->160|190->160|190->160|191->161|204->174|204->174|206->176|206->176|206->176|207->177|212->182|212->182|214->184|214->184|214->184|215->185|216->186|216->186|218->188|218->188|218->188|219->189|220->190|220->190|223->193|228->198|228->198|229->199|230->200|230->200|232->202|232->202|232->202|233->203|234->204|234->204|236->206|236->206|236->206|237->207|238->208|238->208|240->210|240->210|240->210|241->211|245->215|245->215|247->217|247->217|247->217|248->218|250->220|250->220|252->222|252->222|252->222|253->223|256->226|256->226|258->228|258->228|258->228|259->229|260->230|260->230|261->231|261->231|261->231|262->232|265->235|265->235|267->237|267->237|267->237|268->238|270->240|270->240|272->242|272->242|272->242|273->243|276->246|276->246|278->248|278->248|278->248|279->249|286->256|286->256|288->258|289->259|289->259|290->260|292->262|292->262|294->264|294->264|294->264|295->265|303->273|303->273|305->275|305->275|305->275|306->276|307->277|307->277|309->279|309->279|309->279|310->280|311->281|311->281|313->283|313->283|313->283|314->284|315->285|315->285|316->286|316->286|316->286|317->287|318->288|318->288|319->289|319->289|319->289|320->290|325->295|325->295|327->297|327->297|327->297|328->298|332->302|332->302|334->304|334->304|334->304|335->305|337->307|337->307|339->309|339->309|339->309|340->310|341->311|341->311|343->313|343->313|343->313|344->314|347->317|347->317|348->318|348->318|348->318|349->319|357->327|357->327|359->329|359->329|359->329|360->330|362->332|362->332|364->334|364->334|364->334|365->335|366->336|366->336|367->337|367->337|367->337|368->338|372->342|372->342|373->343|373->343|373->343|374->344|380->350|380->350|382->352|382->352|382->352|383->353|394->364|394->364|396->366|396->366|396->366|397->367|398->368|398->368|400->370|400->370|400->370|401->371|409->379|409->379|411->381|411->381|411->381|412->382|414->384|414->384|416->386|416->386|416->386|417->387|420->390|420->390|422->392|422->392|422->392|423->393|427->397|427->397|429->399|429->399|429->399|430->400|432->402|432->402|434->404|434->404|434->404|435->405|436->406|436->406|438->408|439->409|439->409|440->410|441->411|441->411|443->413|443->413|443->413|444->414|445->415|445->415|447->417|447->417|447->417|448->418|451->421|451->421|452->422|452->422|452->422|453->423|457->427|457->427|459->429|459->429|459->429|460->430|461->431|461->431|463->433|463->433|463->433|464->434|469->439|469->439|470->440|470->440|470->440|471->441|476->446|476->446|477->447|477->447|477->447|478->448|485->455|485->455|487->457|487->457|487->457|488->458|493->463|493->463|494->464|494->464|494->464|495->465|496->466|496->466|497->467|497->467|497->467|498->468|504->474|504->474|505->475|505->475|505->475|506->476|509->479|509->479|510->480|510->480|510->480|511->481|517->487|517->487|518->488|518->488|518->488|519->489|520->490|520->490|521->491|521->491|521->491|522->492|528->498|528->498|529->499|529->499|529->499|530->500|531->501|531->501|532->502|532->502|532->502|533->503|534->504|534->504|535->505|535->505|535->505|536->506|537->507|537->507|538->508|538->508|538->508|539->509|542->512|542->512|543->513|543->513|543->513|544->514|551->521|551->521|552->522|552->522|552->522|553->523|561->531|561->531|562->532|562->532|562->532|563->533|564->534|564->534|565->535|565->535|565->535|566->536|574->544|574->544|575->545|575->545|575->545|575->545|575->545|576->546|576->546|576->546|577->547|580->550|580->550|581->551|581->551|581->551|582->552|591->561|591->561|592->562|592->562|592->562|593->563|594->564|594->564|595->565|595->565|595->565|596->566|597->567|597->567|598->568|598->568|598->568|599->569|602->572|602->572|603->573|603->573|603->573|604->574|607->577|607->577|613->583|613->583|613->583|614->584|616->586|616->586|617->587|617->587|617->587|618->588|621->591|621->591|622->592|622->592|622->592|623->593|626->596|626->596|627->597|627->597|627->597|628->598|629->599|629->599|630->600|630->600|630->600|631->601|633->603|633->603|634->604|634->604|634->604|635->605|637->607|637->607|638->608|638->608|638->608|639->609|640->610|640->610|641->611|641->611|641->611|642->612|645->615|645->615|646->616|646->616|646->616|647->617|648->618|648->618|649->619|650->620|650->620|651->621|655->625|655->625|656->626|656->626|656->626|657->627|658->628|658->628|659->629|659->629|659->629|660->630|661->631|661->631|662->632|662->632|662->632|663->633|665->635|665->635|666->636|666->636|666->636|667->637|668->638|668->638|669->639|669->639|669->639|670->640|674->644|674->644|675->645|678->648|678->648|679->649|680->650|680->650|681->651|681->651|681->651|682->652|688->658|688->658|689->659|689->659|689->659|690->660|691->661|691->661|692->662|692->662|692->662|693->663|695->665|695->665|696->666|696->666|696->666|697->667|698->668|698->668|699->669|699->669|699->669|700->670|701->671|701->671|704->674|704->674|704->674|705->675|706->676|706->676|709->679|709->679|709->679|710->680|713->683|713->683|714->684|714->684|714->684|715->685|716->686|716->686|717->687|717->687|717->687|718->688|719->689|719->689|720->690|720->690|720->690|721->691|722->692|722->692|723->693|723->693|723->693|724->694|725->695|725->695|727->697|871->841|871->841|872->842|872->842|872->842|873->843|874->844|874->844|875->845|875->845
                  -- GENERATED --
              */
          