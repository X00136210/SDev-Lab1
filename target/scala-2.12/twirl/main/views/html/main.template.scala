
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Online Shop - """),_display_(/*9.27*/title),format.raw/*9.32*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="/">Online Shop</a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*26.22*/if(title=="Products" )/*26.44*/{_display_(Seq[Any](format.raw/*26.45*/("""class="active"""")))}),format.raw/*26.60*/(""">
                    <a href="#">About</a>
                </li>

                <li>
                    <a href="#">Services</a>
                </li>

                <li>
                    <a href="#">Contact</a>
                </li>
                <li """),_display_(/*37.22*/if(title=="Login")/*37.40*/{_display_(Seq[Any](format.raw/*37.41*/("""class="active"""")))}),format.raw/*37.56*/(""">
                    """),_display_(/*38.22*/if(user != null)/*38.38*/ {_display_(Seq[Any](format.raw/*38.40*/("""
                        """),format.raw/*39.25*/("""<a href=""""),_display_(/*39.35*/routes/*39.41*/.LoginController.logout()),format.raw/*39.66*/("""">Logout """),_display_(/*39.76*/user/*39.80*/.getName()),format.raw/*39.90*/("""</a>
                    """)))}/*40.23*/else/*40.28*/{_display_(Seq[Any](format.raw/*40.29*/("""
                        """),format.raw/*41.25*/("""<a href=""""),_display_(/*41.35*/routes/*41.41*/.LoginController.login()),format.raw/*41.65*/("""">Login</a>
                    """)))}),format.raw/*42.22*/("""

                """),format.raw/*44.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*54.18*/content),format.raw/*54.25*/("""
            """),format.raw/*55.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
                Copyright
                <strong>Online Shop</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*69.19*/routes/*69.25*/.Assets.versioned("javascripts/main.js")),format.raw/*69.65*/(""""></script>
</body>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 26 10:08:29 GMT 2018
                  SOURCE: /media/sf_student/S.Dev Lab/lab1/app/views/main.scala.html
                  HASH: 73020a550aa8bf4b6cb8ad59efc9350b1e5b3580
                  MATRIX: 970->1|1121->57|1149->59|1270->154|1295->159|1507->344|1522->350|1584->391|1915->695|1946->717|1985->718|2031->733|2322->997|2349->1015|2388->1016|2434->1031|2484->1054|2509->1070|2549->1072|2602->1097|2639->1107|2654->1113|2700->1138|2737->1148|2750->1152|2781->1162|2826->1189|2839->1194|2878->1195|2931->1220|2968->1230|2983->1236|3028->1260|3092->1293|3138->1311|3301->1447|3329->1454|3370->1467|3678->1748|3693->1754|3754->1794
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|58->26|58->26|58->26|58->26|69->37|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|71->39|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|73->41|74->42|76->44|86->54|86->54|87->55|101->69|101->69|101->69
                  -- GENERATED --
              */
          