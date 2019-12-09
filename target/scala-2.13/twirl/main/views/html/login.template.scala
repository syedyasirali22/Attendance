
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(response: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),_display_(/*2.2*/main("Welcome to Nexxo Login page")/*2.37*/ {_display_(Seq[Any](format.raw/*2.39*/("""
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
        <div class="container-fluid">
            <h1 style="color:black;text-align:center; margin: 5% 35% 0% 35%;background-color:Black;color:white">Login Here</h1>
            <div  style="margin: 0% 35% 20% 35%; background-color:lightgrey"><br>
                <div class="form-group"  style=" margin:5%">
                    <label for="email">Enter your email:</label>
                    <input type="text" class="form-control" id="email"  name="email" />
                </div>
                <div class="form-group"  style=" margin:5%">
                    <label for="email">Enter password:</label>
                    <input type="password" class="form-control" id="password"   name="password" />
                </div><br>
                <div align="center">
                    <input type="submit" id="login" value="Login" style="align:center" class="btn btn-success"></input><br><br>
                 </div>
                <div align="center">
                    <form action="/register" method="GET" >
                        <input type="submit" value="Register here, if unregistered" class="btn btn-success" >
                        <div>"""),_display_(/*30.31*/response),format.raw/*30.39*/("""</div>
                        <br>
                    </form>
                    <form action="/forgotpassword" method="GET" >
                        <input type="submit" value="Forgot Password" class="btn btn-success" >
                        <div>"""),_display_(/*35.31*/response),format.raw/*35.39*/("""</div>
                        <br>
                    </form>
                </div><br>
            </div>
        </div>
    <script language='javascript' type='text/javascript'>
        $(document).ready(function()"""),format.raw/*42.37*/("""{"""),format.raw/*42.38*/("""
            """),format.raw/*43.13*/("""$("#login").click(function()"""),format.raw/*43.41*/("""{"""),format.raw/*43.42*/("""
                """),format.raw/*44.17*/("""submitLogin();
            """),format.raw/*45.13*/("""}"""),format.raw/*45.14*/(""");

            function submitLogin()"""),format.raw/*47.35*/("""{"""),format.raw/*47.36*/("""
                """),format.raw/*48.17*/("""var email = $('input#email').val();
                var password= $('input#password').val();
                $.ajax("""),format.raw/*50.24*/("""{"""),format.raw/*50.25*/("""
                    """),format.raw/*51.21*/("""url: '/login',   <!-- url for saving-->
                    dataType: 'JSON',
                    type: "POST",
                    data:"""),format.raw/*54.26*/("""{"""),format.raw/*54.27*/("""
                        """),format.raw/*55.25*/("""'email': email,
                        'password': password
                    """),format.raw/*57.21*/("""}"""),format.raw/*57.22*/(""",
                    success: function (data) """),format.raw/*58.46*/("""{"""),format.raw/*58.47*/("""
                        """),format.raw/*59.25*/("""if (data.status == 200 && data.reason == "Invalid Email or password")"""),format.raw/*59.94*/("""{"""),format.raw/*59.95*/("""
                            """),format.raw/*60.29*/("""alert(data.reason);
                        """),format.raw/*61.25*/("""}"""),format.raw/*61.26*/("""
                        """),format.raw/*62.25*/("""else if (data.status == 200 && data.reason == "Admin Login successful")"""),format.raw/*62.96*/("""{"""),format.raw/*62.97*/("""
                            """),format.raw/*63.29*/("""alert(data.reason);
                            window.location.href = "/persondetails";   <!-- to redirect-->
                        """),format.raw/*65.25*/("""}"""),format.raw/*65.26*/("""
                        """),format.raw/*66.25*/("""else if (data.status == 200 && data.reason == "Employee Login Successful")"""),format.raw/*66.99*/("""{"""),format.raw/*66.100*/("""
                            """),format.raw/*67.29*/("""alert(data.reason);
                            window.location.href = "/attendance";   <!-- to redirect-->
                        """),format.raw/*69.25*/("""}"""),format.raw/*69.26*/("""

                        """),format.raw/*71.25*/("""else if(data.status == 400)"""),format.raw/*71.52*/("""{"""),format.raw/*71.53*/("""
                        """),format.raw/*72.25*/("""alert(data.reason);
                        """),format.raw/*73.25*/("""}"""),format.raw/*73.26*/("""
                    """),format.raw/*74.21*/("""}"""),format.raw/*74.22*/(""",
                    error: function (data) """),format.raw/*75.44*/("""{"""),format.raw/*75.45*/("""
                        """),format.raw/*76.25*/("""console.log(" error"+ data);
                    """),format.raw/*77.21*/("""}"""),format.raw/*77.22*/("""
                """),format.raw/*78.17*/("""}"""),format.raw/*78.18*/(""");
            """),format.raw/*79.13*/("""}"""),format.raw/*79.14*/("""
        """),format.raw/*80.9*/("""}"""),format.raw/*80.10*/(""");
    </script>
    </body>
</html>
""")))}))
      }
    }
  }

  def render(response:String): play.twirl.api.HtmlFormat.Appendable = apply(response)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (response) => apply(response)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-09T17:48:30.072
                  SOURCE: C:/Syed_Yasir_PlayProject/Attendance/attendance/app/views/login.scala.html
                  HASH: 17c7b00e10e051e7adb061291e77285ac9d7f38d
                  MATRIX: 948->1|1061->19|1089->22|1132->57|1171->59|1199->61|2975->1810|3004->1818|3291->2078|3320->2086|3574->2312|3603->2313|3645->2327|3701->2355|3730->2356|3776->2374|3832->2402|3861->2403|3929->2443|3958->2444|4004->2462|4150->2580|4179->2581|4229->2603|4397->2743|4426->2744|4480->2770|4591->2853|4620->2854|4696->2902|4725->2903|4779->2929|4876->2998|4905->2999|4963->3029|5036->3074|5065->3075|5119->3101|5218->3172|5247->3173|5305->3203|5470->3340|5499->3341|5553->3367|5655->3441|5685->3442|5743->3472|5905->3606|5934->3607|5990->3635|6045->3662|6074->3663|6128->3689|6201->3734|6230->3735|6280->3757|6309->3758|6383->3804|6412->3805|6466->3831|6544->3881|6573->3882|6619->3900|6648->3901|6692->3917|6721->3918|6758->3928|6787->3929
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|62->30|62->30|67->35|67->35|74->42|74->42|75->43|75->43|75->43|76->44|77->45|77->45|79->47|79->47|80->48|82->50|82->50|83->51|86->54|86->54|87->55|89->57|89->57|90->58|90->58|91->59|91->59|91->59|92->60|93->61|93->61|94->62|94->62|94->62|95->63|97->65|97->65|98->66|98->66|98->66|99->67|101->69|101->69|103->71|103->71|103->71|104->72|105->73|105->73|106->74|106->74|107->75|107->75|108->76|109->77|109->77|110->78|110->78|111->79|111->79|112->80|112->80
                  -- GENERATED --
              */
          