
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.94*/("""

"""),_display_(/*3.2*/main("Products",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Product Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index(0)),format.raw/*11.47*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*12.8*/for(c <- categories) yield /*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""
        """),format.raw/*13.9*/("""<a href=""""),_display_(/*13.19*/routes/*13.25*/.HomeController.index(c.getId)),format.raw/*13.55*/("""" class="list-group-item">"""),_display_(/*13.82*/c/*13.83*/.getName),format.raw/*13.91*/("""
          """),format.raw/*14.11*/("""<span class="badge">"""),_display_(/*14.32*/c/*14.33*/.getProducts.size()),format.raw/*14.52*/("""</span>
        </a>
      """)))}),format.raw/*16.8*/("""
    """),format.raw/*17.5*/("""</div>
  </div>
  <div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        """),format.raw/*22.9*/("""<div class="alert alert-success">
          """),_display_(/*23.12*/flash/*23.17*/.get("success")),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""</div>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Category</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*39.10*/for(p<-products) yield /*39.26*/ {_display_(Seq[Any](format.raw/*39.28*/("""
          """),format.raw/*40.11*/("""<tr>
            <td class="numeric">"""),_display_(/*41.34*/p/*41.35*/.getId),format.raw/*41.41*/("""</td>
            <td>"""),_display_(/*42.18*/p/*42.19*/.getName),format.raw/*42.27*/("""</td>
            <td>"""),_display_(/*43.18*/p/*43.19*/.getCategory.getName),format.raw/*43.39*/("""</td>        
            <td>"""),_display_(/*44.18*/p/*44.19*/.getDescription),format.raw/*44.34*/("""</td>
            <td  class="numeric">"""),_display_(/*45.35*/p/*45.36*/.getStock),format.raw/*45.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*46.37*/("%.2f".format(p.getPrice))),format.raw/*46.64*/("""</td>
            <td>
              <a href=""""),_display_(/*48.25*/routes/*48.31*/.HomeController.updateProduct(p.getId)),format.raw/*48.69*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*52.25*/routes/*52.31*/.HomeController.deleteProduct(p.getId)),format.raw/*52.69*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*57.10*/("""
      """),format.raw/*58.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*63.17*/routes/*63.23*/.HomeController.addProduct()),format.raw/*63.51*/("""">
        <button class="btn btn-primary">Add a product</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*69.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user)

  def f:((List[models.Product],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user) => apply(products,categories,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 26 10:08:29 GMT 2018
                  SOURCE: /media/sf_student/S.Dev Lab/lab1/app/views/index.scala.html
                  HASH: 6708d5c1e5bf4e8716afa1196e0da0bae4d0727e
                  MATRIX: 1002->1|1189->93|1217->96|1246->117|1285->119|1313->121|1495->276|1510->282|1555->306|1633->358|1669->378|1709->380|1745->389|1782->399|1797->405|1848->435|1902->462|1912->463|1941->471|1980->482|2028->503|2038->504|2078->523|2136->551|2168->556|2312->674|2353->706|2393->708|2429->717|2501->762|2515->767|2551->782|2587->791|2631->805|2665->812|2959->1079|2991->1095|3031->1097|3070->1108|3135->1146|3145->1147|3172->1153|3222->1176|3232->1177|3261->1185|3311->1208|3321->1209|3362->1229|3420->1260|3430->1261|3466->1276|3533->1316|3543->1317|3573->1326|3642->1368|3690->1395|3764->1442|3779->1448|3838->1486|4035->1656|4050->1662|4109->1700|4329->1889|4363->1896|4438->1944|4453->1950|4502->1978|4635->2081
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|71->39|71->39|71->39|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|80->48|80->48|80->48|84->52|84->52|84->52|89->57|90->58|95->63|95->63|95->63|101->69
                  -- GENERATED --
              */
          