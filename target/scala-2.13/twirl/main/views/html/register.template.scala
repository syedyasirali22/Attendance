
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(response: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),_display_(/*2.2*/main("Welcome to Nexxo Registration page")/*2.44*/ {_display_(Seq[Any](format.raw/*2.46*/("""
"""),format.raw/*3.1*/("""<html>
    <head>
        <style>
            body """),format.raw/*6.18*/("""{"""),format.raw/*6.19*/("""font-family: Arial, Helvetica, sans-serif;"""),format.raw/*6.61*/("""}"""),format.raw/*6.62*/("""
            """),format.raw/*7.13*/(""".registrationPage"""),format.raw/*7.30*/("""{"""),format.raw/*7.31*/("""width:440px;"""),format.raw/*7.43*/("""}"""),format.raw/*7.44*/("""
            """),format.raw/*8.13*/("""/* The Modal (background) */
            .modal """),format.raw/*9.20*/("""{"""),format.raw/*9.21*/("""
              """),format.raw/*10.15*/("""display: none; /* Hidden by default */
              position: absolute; /* Stay in place */
              z-index: 1; /* Sit on top */
              padding-top: 100px; /* Location of the box */
              left: 10%;
              top: 0%;
              width: 50%; /* Full width */
              height: 100%; /* Full height */
              overflow: auto; /* Enable scroll if needed */
              background-color: rgb(0,0,0); /* Fallback color */
              background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
             """),format.raw/*21.14*/("""}"""),format.raw/*21.15*/("""
            """),format.raw/*22.13*/("""/* Modal Content */
            .modal-content """),format.raw/*23.28*/("""{"""),format.raw/*23.29*/("""
              """),format.raw/*24.15*/("""background-color: #fefefe;
              padding: 20px;
              border: 1px solid #888;
              width: 50%%;
            """),format.raw/*28.13*/("""}"""),format.raw/*28.14*/("""

            """),format.raw/*30.13*/("""/* The Close Button */
            .close """),format.raw/*31.20*/("""{"""),format.raw/*31.21*/("""
              """),format.raw/*32.15*/("""color: #aaaaaa;
              float: right;
              font-size: 28px;
              font-weight: bold;
            """),format.raw/*36.13*/("""}"""),format.raw/*36.14*/("""
            """),format.raw/*37.13*/(""".close:hover,
            .close:focus """),format.raw/*38.26*/("""{"""),format.raw/*38.27*/("""
              """),format.raw/*39.15*/("""color: #000;
              text-decoration: none;
              cursor: pointer;
            """),format.raw/*42.13*/("""}"""),format.raw/*42.14*/("""
        """),format.raw/*43.9*/("""</style>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <script src="https://code.highcharts.com/highcharts.js"></script>

    </head>
    <body>
        <div class="container"style="background-color:lightgrey"><br>
            <div class="row">
                <div class="col-lg-12">
                    <div align="center">
                        <h1> Registration </h1>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-lg-12">
                    <div class="card registrationPage mx-auto">
                        <div class="card-body">
                            <div class="row">
                                <div class="col-lg-12">
                                    <div class="form-group" style="">
                                        <label for="name">Enter Name :</label>
                                        <input type="name" class="form-control" id="name" name="name" pattern="([a-zA-Z]+)"
                                               title="Should contain only alphabatical characters and there should be no open space at the start"/>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-12">
                                    <div class="form-group" style="">
                                        <label for="email">Enter email:</label>
                                        <input type="email" class="form-control" id="email" name="email" title="Enter e-mail"/>
                                    </div>
                                </div>

                            </div>
                            <div class="row">
                                <div class="col-lg-12">
                                    <div class="form-group" style="">
                                        <label for="password1">Enter Password:</label>
                                        <input type="password" class="form-control" id="password1" name="password1" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])."""),format.raw/*89.157*/("""{"""),format.raw/*89.158*/("""8,"""),format.raw/*89.160*/("""}"""),format.raw/*89.161*/("""" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"/>
                                    </div>

                                </div>

                            </div>
                            <div class="row">
                                <div class="col-lg-12">
                                    <div class="form-group" style="">
                                        <label for="email">Confirm Password:</label>
                                        <input type="password" class="form-control" id="password2" name="password2" oninput="check(this)"
                                               title="confirm-password"/>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-12">
                                    <div align="center">
                                        <input type="submit" value="Register me" id="register" class="btn btn-success"></input>
                                        <br>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>

                </div>

            </div>


<!--*****************************************************************************************************-->
<!--            Sample Ajax Implementation having a function loading on click of button-->
<!--            <div id="base">-->
<!--                <div id="sample"></div>-->
<!--                <input type="button" id="hello" value="click me">-->
<!--            </div>-->
<!--******************************************************************************************************-->
            <div align="center">
                <div>"""),_display_(/*129.23*/response),format.raw/*129.31*/("""</div><br>
                <form action="/login" method="GET">
                    <input type="submit" value="Login if already registered" class="btn btn-success">
                    <br><br>
                </form>
            </div>
        </div>
    <script language='javascript' type='text/javascript'>
    function check(input) """),format.raw/*137.27*/("""{"""),format.raw/*137.28*/("""
        """),format.raw/*138.9*/("""if (input.value != document.getElementById('password1').value) """),format.raw/*138.72*/("""{"""),format.raw/*138.73*/("""
            """),format.raw/*139.13*/("""input.setCustomValidity('Password Must be Matching.');
        """),format.raw/*140.9*/("""}"""),format.raw/*140.10*/(""" """),format.raw/*140.11*/("""else """),format.raw/*140.16*/("""{"""),format.raw/*140.17*/("""
         """),format.raw/*141.10*/("""input.setCustomValidity('');
        """),format.raw/*142.9*/("""}"""),format.raw/*142.10*/("""
     """),format.raw/*143.6*/("""}"""),format.raw/*143.7*/("""

    """),format.raw/*145.5*/("""$(document).ready(function()"""),format.raw/*145.33*/("""{"""),format.raw/*145.34*/("""
        """),format.raw/*146.9*/("""$("#hello").click(function()"""),format.raw/*146.37*/("""{"""),format.raw/*146.38*/("""
            """),format.raw/*147.13*/("""$("#sample").load("http://localhost:9000/assets/html/error404.html")
        """),format.raw/*148.9*/("""}"""),format.raw/*148.10*/(""");
    """),format.raw/*149.5*/("""}"""),format.raw/*149.6*/(""");

    $(document).ready(function()"""),format.raw/*151.33*/("""{"""),format.raw/*151.34*/("""
        """),format.raw/*152.9*/("""$("#register").click(function()"""),format.raw/*152.40*/("""{"""),format.raw/*152.41*/("""
            """),format.raw/*153.13*/("""submitRegistrationData();
        """),format.raw/*154.9*/("""}"""),format.raw/*154.10*/(""");

            function submitRegistrationData()"""),format.raw/*156.46*/("""{"""),format.raw/*156.47*/("""
                """),format.raw/*157.17*/("""var name = $('input#name').val();
                var email = $('input#email').val();
                var password1= $('input#password1').val();
                var password2= $('input#password2').val();

                $.ajax("""),format.raw/*162.24*/("""{"""),format.raw/*162.25*/("""
                    """),format.raw/*163.21*/("""url: '/register/login',   <!-- url for saving-->
                    dataType: 'JSON',
                    type: "POST",
                    data:"""),format.raw/*166.26*/("""{"""),format.raw/*166.27*/("""
                        """),format.raw/*167.25*/("""'name': name,
                        'email': email,
                        'password1': password1,
                        'password2': password2
                    """),format.raw/*171.21*/("""}"""),format.raw/*171.22*/(""",
                    success: function (data) """),format.raw/*172.46*/("""{"""),format.raw/*172.47*/("""
                        """),format.raw/*173.25*/("""if(data.status == 200 && data.reason=="Password do not Match")"""),format.raw/*173.87*/("""{"""),format.raw/*173.88*/("""
                        """),format.raw/*174.25*/("""alert(data.reason);
                        """),format.raw/*175.25*/("""}"""),format.raw/*175.26*/("""
                        """),format.raw/*176.25*/("""else if (data.status == 200)"""),format.raw/*176.53*/("""{"""),format.raw/*176.54*/("""
                            """),format.raw/*177.29*/("""alert(data.reason);
                            window.location.href = "/login";   <!-- to redirect-->
                        """),format.raw/*179.25*/("""}"""),format.raw/*179.26*/("""
                        """),format.raw/*180.25*/("""else if(data.status == 400)"""),format.raw/*180.52*/("""{"""),format.raw/*180.53*/("""
                                """),format.raw/*181.33*/("""$("#myModal").modal('show');
                                $(".modalMessage").text(data.reason);
                                $(".close").on('click',function()"""),format.raw/*183.66*/("""{"""),format.raw/*183.67*/("""
                                """),format.raw/*184.33*/("""$("#myModal").modal('hide');
                                """),format.raw/*185.33*/("""}"""),format.raw/*185.34*/(""")
                        """),format.raw/*186.25*/("""}"""),format.raw/*186.26*/(""" """),format.raw/*186.27*/("""else if(data.status == 200)"""),format.raw/*186.54*/("""{"""),format.raw/*186.55*/("""
                            """),format.raw/*187.29*/("""$("#myModal").modal('show');
                                $(".modalMessage").text(data.reason);
                                $(".close").on('click',function()"""),format.raw/*189.66*/("""{"""),format.raw/*189.67*/("""
                                """),format.raw/*190.33*/("""$("#myModal").modal('hide');
                                """),format.raw/*191.33*/("""}"""),format.raw/*191.34*/(""")
                        """),format.raw/*192.25*/("""}"""),format.raw/*192.26*/("""
                     """),format.raw/*193.22*/("""}"""),format.raw/*193.23*/(""",
                    error: function (data) """),format.raw/*194.44*/("""{"""),format.raw/*194.45*/("""
                        """),format.raw/*195.25*/("""console.log(" error"+ data);
                    """),format.raw/*196.21*/("""}"""),format.raw/*196.22*/("""
                """),format.raw/*197.17*/("""}"""),format.raw/*197.18*/(""");
            """),format.raw/*198.13*/("""}"""),format.raw/*198.14*/("""
    """),format.raw/*199.5*/("""}"""),format.raw/*199.6*/(""");
    </script>
        <div id="myModal" class="modal" role="dialog">
        <!-- Modal content -->
            <div class="modal-content">
                <span class="close">&times;</span>
                <p class="modalMessage"></p>
            </div>
        </div>
    </body>
</html>
""")))}),format.raw/*210.2*/("""


"""))
      }
    }
  }

  def render(response:String): play.twirl.api.HtmlFormat.Appendable = apply(response)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (response) => apply(response)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-09T17:48:30.200
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/register.scala.html
                  HASH: 6fb859383840f40e1d9da0b999488b4afab0c846
                  MATRIX: 951->1|1064->19|1092->22|1142->64|1181->66|1209->68|1290->122|1318->123|1387->165|1415->166|1456->180|1500->197|1528->198|1567->210|1595->211|1636->225|1712->274|1740->275|1784->291|2366->845|2395->846|2437->860|2513->908|2542->909|2586->925|2751->1062|2780->1063|2824->1079|2895->1122|2924->1123|2968->1139|3120->1263|3149->1264|3191->1278|3259->1318|3288->1319|3332->1335|3456->1431|3485->1432|3522->1442|6258->4149|6288->4150|6319->4152|6349->4153|8341->6117|8371->6125|8744->6469|8774->6470|8812->6480|8904->6543|8934->6544|8977->6558|9069->6622|9099->6623|9129->6624|9163->6629|9193->6630|9233->6641|9299->6679|9329->6680|9364->6687|9393->6688|9429->6696|9486->6724|9516->6725|9554->6735|9611->6763|9641->6764|9684->6778|9790->6856|9820->6857|9856->6865|9885->6866|9952->6904|9982->6905|10020->6915|10080->6946|10110->6947|10153->6961|10216->6996|10246->6997|10326->7048|10356->7049|10403->7067|10665->7300|10695->7301|10746->7323|10924->7472|10954->7473|11009->7499|11211->7672|11241->7673|11318->7721|11348->7722|11403->7748|11494->7810|11524->7811|11579->7837|11653->7882|11683->7883|11738->7909|11795->7937|11825->7938|11884->7968|12042->8097|12072->8098|12127->8124|12183->8151|12213->8152|12276->8186|12471->8352|12501->8353|12564->8387|12655->8449|12685->8450|12741->8477|12771->8478|12801->8479|12857->8506|12887->8507|12946->8537|13141->8703|13171->8704|13234->8738|13325->8800|13355->8801|13411->8828|13441->8829|13493->8852|13523->8853|13598->8899|13628->8900|13683->8926|13762->8976|13792->8977|13839->8995|13869->8996|13914->9012|13944->9013|13978->9019|14007->9020|14343->9325
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|38->6|38->6|38->6|38->6|39->7|39->7|39->7|39->7|39->7|40->8|41->9|41->9|42->10|53->21|53->21|54->22|55->23|55->23|56->24|60->28|60->28|62->30|63->31|63->31|64->32|68->36|68->36|69->37|70->38|70->38|71->39|74->42|74->42|75->43|121->89|121->89|121->89|121->89|161->129|161->129|169->137|169->137|170->138|170->138|170->138|171->139|172->140|172->140|172->140|172->140|172->140|173->141|174->142|174->142|175->143|175->143|177->145|177->145|177->145|178->146|178->146|178->146|179->147|180->148|180->148|181->149|181->149|183->151|183->151|184->152|184->152|184->152|185->153|186->154|186->154|188->156|188->156|189->157|194->162|194->162|195->163|198->166|198->166|199->167|203->171|203->171|204->172|204->172|205->173|205->173|205->173|206->174|207->175|207->175|208->176|208->176|208->176|209->177|211->179|211->179|212->180|212->180|212->180|213->181|215->183|215->183|216->184|217->185|217->185|218->186|218->186|218->186|218->186|218->186|219->187|221->189|221->189|222->190|223->191|223->191|224->192|224->192|225->193|225->193|226->194|226->194|227->195|228->196|228->196|229->197|229->197|230->198|230->198|231->199|231->199|242->210
                  -- GENERATED --
              */
          