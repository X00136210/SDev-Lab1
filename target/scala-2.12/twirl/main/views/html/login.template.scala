
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login", user)/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
    """),format.raw/*5.5*/("""<p class="lead">Product Catalogue</p>
    <div class="col-xs-5">
        <h3>Sign in</h3>
        """),_display_(/*8.10*/if(loginForm.hasGlobalErrors)/*8.39*/ {_display_(Seq[Any](format.raw/*8.41*/("""
            """),format.raw/*9.13*/("""<p class="alert alert-warning">
                """),_display_(/*10.18*/loginForm/*10.27*/.globalError.message),format.raw/*10.47*/(""";
            </p>
        """)))}),format.raw/*12.10*/("""
        """),_display_(/*13.10*/if(flash.containsKey("error"))/*13.40*/ {_display_(Seq[Any](format.raw/*13.42*/("""
            """),format.raw/*14.13*/("""<p class="alert alert-warning">
                """),_display_(/*15.18*/flash/*15.23*/.get("loginRequired")),format.raw/*15.44*/("""
            """),format.raw/*16.13*/("""</p>
        """)))}),format.raw/*17.10*/("""


        """),_display_(/*20.10*/helper/*20.16*/.form(action = controllers.routes.LoginController.loginSubmit())/*20.80*/ {_display_(Seq[Any](format.raw/*20.82*/("""
            """),_display_(/*21.14*/CSRF/*21.18*/.formField),format.raw/*21.28*/("""

            """),format.raw/*23.13*/("""<div class="form-group">
                """),_display_(/*24.18*/inputText(loginForm("email"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*25.76*/("""
            """),format.raw/*26.13*/("""</div>
            <div class="form-group">
                """),_display_(/*28.18*/inputPassword(loginForm("password"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*29.79*/("""
            """),format.raw/*30.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*34.10*/("""
    """),format.raw/*35.5*/("""</div>
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 26 10:08:29 GMT 2018
                  SOURCE: /media/sf_student/S.Dev Lab/lab1/app/views/login.scala.html
                  HASH: 6adfb68d47da5c8f6d87ddf8e891e2a63ba1d0bd
                  MATRIX: 984->1|1119->65|1164->63|1191->81|1218->83|1245->102|1284->104|1315->109|1440->208|1477->237|1516->239|1556->252|1632->301|1650->310|1691->330|1750->358|1787->368|1826->398|1866->400|1907->413|1983->462|1997->467|2039->488|2080->501|2125->515|2164->527|2179->533|2252->597|2292->599|2333->613|2346->617|2377->627|2419->641|2488->683|2630->804|2671->817|2759->878|2911->1009|2952->1022|3133->1172|3165->1177
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|40->8|40->8|40->8|41->9|42->10|42->10|42->10|44->12|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|52->20|52->20|52->20|52->20|53->21|53->21|53->21|55->23|56->24|57->25|58->26|60->28|61->29|62->30|66->34|67->35
                  -- GENERATED --
              */
          