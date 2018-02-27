
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

object addCustomer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerForm: Form[models.Customer],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.63*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Customer",user)/*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new customer</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addCustomerSubmit(), 'class-> "form-horizontal", 'role -> "form")/*6.105*/ {_display_(Seq[Any](format.raw/*6.107*/("""
        """),_display_(/*7.10*/CSRF/*7.14*/.formField),format.raw/*7.24*/("""

        """),_display_(/*9.10*/inputText(customerForm("name"), '_label -> "Name", 'class -> "form_control")),format.raw/*9.86*/("""
        """),_display_(/*10.10*/inputText(customerForm("email"), '_label -> "E-mail", 'class -> "form_control")),format.raw/*10.89*/("""

        """),_display_(/*12.10*/inputText(customerForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*12.75*/("""

        """),format.raw/*14.9*/("""<div class="actions">
            <input type="submit" value="Add/Update Customer" class="btn btn-primary">
            <a href=""""),_display_(/*16.23*/routes/*16.29*/.HomeController.customer),format.raw/*16.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
        """)))}),format.raw/*20.10*/("""
""")))}))
      }
    }
  }

  def render(customerForm:Form[models.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(customerForm,user)

  def f:((Form[models.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (customerForm,user) => apply(customerForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 26 10:08:28 GMT 2018
                  SOURCE: /media/sf_student/S.Dev Lab/lab1/app/views/addCustomer.scala.html
                  HASH: 6637179d9ffdea584381bde519002b0d0a7fe8c8
                  MATRIX: 987->1|1121->64|1166->62|1193->80|1220->82|1253->107|1292->109|1323->114|1392->158|1500->257|1540->259|1576->269|1588->273|1618->283|1655->294|1751->370|1788->380|1888->459|1926->470|2012->535|2049->545|2206->675|2221->681|2266->705|2419->827
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|38->6|38->6|39->7|39->7|39->7|41->9|41->9|42->10|42->10|44->12|44->12|46->14|48->16|48->16|48->16|52->20
                  -- GENERATED --
              */
          