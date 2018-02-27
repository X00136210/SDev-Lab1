
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

object customer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[models.Customer], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/("""

"""),_display_(/*3.2*/main("Customers",user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

"""),format.raw/*5.1*/("""<p class="lead">Our Customers</p>

"""),_display_(/*7.2*/if(flash.containsKey("success"))/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""
  """),format.raw/*8.3*/("""<div class="alert alert-success">
    """),_display_(/*9.6*/flash/*9.11*/.get("success")),format.raw/*9.26*/("""
  """),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

"""),format.raw/*13.1*/("""<table class="table table-bordered table-hover table-condensed">

  <thead>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Email</th>
      <th colspan="2"></th>      
    </tr>
  </thead>

  <tbody>
    """),_display_(/*25.6*/for(c<-customers) yield /*25.23*/ {_display_(Seq[Any](format.raw/*25.25*/("""
      """),format.raw/*26.7*/("""<tr>
        <td class="numeric">"""),_display_(/*27.30*/c/*27.31*/.getId),format.raw/*27.37*/("""</td>
        <td>"""),_display_(/*28.14*/c/*28.15*/.getName),format.raw/*28.23*/("""</td>
        <td>"""),_display_(/*29.14*/c/*29.15*/.getEmail),format.raw/*29.24*/("""</td>
        <td>
          <a href=""""),_display_(/*31.21*/routes/*31.27*/.HomeController.updateCustomer(c.getId)),format.raw/*31.66*/("""" class="button-xs btn-danger">
            <span class="glyphicon glyphicon-pencil"></span>
          </a>
        </td>  
        <td>
          <a href=""""),_display_(/*36.21*/routes/*36.27*/.HomeController.deleteCustomer(c.getId)),format.raw/*36.66*/("""" class="button-xs btn-danger"  onclick="return confirmDel()">
            <span class="glyphicon glyphicon-trash"></span>
          </a>
        </td>
      </tr>
    """)))}),format.raw/*41.6*/("""
  """),format.raw/*42.3*/("""</tbody>

</table>
<p>
  <a href=""""),_display_(/*46.13*/routes/*46.19*/.HomeController.addCustomer()),format.raw/*46.48*/("""">
    <button class="btn btn-primary">Add a Customer</button>
  </a>
</p>

""")))}))
      }
    }
  }

  def render(customers:List[models.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(customers,user)

  def f:((List[models.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (customers,user) => apply(customers,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 26 10:08:29 GMT 2018
                  SOURCE: /media/sf_student/S.Dev Lab/lab1/app/views/customer.scala.html
                  HASH: 12be329105e17a3dc89a9e4a6995649ea502a038
                  MATRIX: 984->1|1138->60|1166->63|1196->85|1235->87|1263->89|1324->125|1364->157|1403->159|1432->162|1496->201|1509->206|1544->221|1574->224|1612->232|1641->234|1882->449|1915->466|1955->468|1989->475|2050->509|2060->510|2087->516|2133->535|2143->536|2172->544|2218->563|2228->564|2258->573|2324->612|2339->618|2399->657|2583->814|2598->820|2658->859|2857->1028|2887->1031|2949->1066|2964->1072|3014->1101
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|57->25|57->25|57->25|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|63->31|63->31|63->31|68->36|68->36|68->36|73->41|74->42|78->46|78->46|78->46
                  -- GENERATED --
              */
          