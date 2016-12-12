
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object prod_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class prod extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.Product],List[models.Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""
"""),_display_(/*2.2*/main("Products")/*2.18*/{_display_(Seq[Any](format.raw/*2.19*/("""
    """),format.raw/*3.5*/("""<div class="col-md-2">
        <div class="list-group">
            <a href=""""),_display_(/*5.23*/routes/*5.29*/.HomeController.prod(0)),format.raw/*5.52*/("""" class="list-group-item">All Categories</a>
                """),_display_(/*6.18*/for(c <- categories) yield /*6.38*/ {_display_(Seq[Any](format.raw/*6.40*/("""
                    """),format.raw/*7.21*/("""<li class="list-group-item">"""),_display_(/*7.50*/c/*7.51*/.getName),format.raw/*7.59*/("""
                    """),format.raw/*8.21*/("""<span class="badge">"""),_display_(/*8.42*/c/*8.43*/.getProducts.size()),format.raw/*8.62*/("""</span>
                    </li>
                """)))}),format.raw/*10.18*/("""
        """),format.raw/*11.9*/("""</div>
    </div>
    <div class="col-md=8">
    """),_display_(/*14.6*/if(flash.containsKey("success"))/*14.38*/{_display_(Seq[Any](format.raw/*14.39*/("""
        """),format.raw/*15.9*/("""<div class="alert alert-success">
        """),_display_(/*16.10*/flash/*16.15*/.get("success")),format.raw/*16.30*/("""
        """),format.raw/*17.9*/("""</div>
    """)))}),format.raw/*18.6*/("""
    """),_display_(/*19.6*/for(p <- products) yield /*19.24*/{_display_(Seq[Any](format.raw/*19.25*/("""
        """),format.raw/*20.9*/("""<tr>
            <td class="numeric">"""),_display_(/*21.34*/p/*21.35*/.getId),format.raw/*21.41*/("""</td>
            <td>"""),_display_(/*22.18*/p/*22.19*/.getName),format.raw/*22.27*/("""</td>
            <td class="numeric">&euro; """),_display_(/*23.41*/("%.2f".format(p.getPrice))),format.raw/*23.68*/("""</td>
            <td>
                <a href=""""),_display_(/*25.27*/routes/*25.33*/.HomeController.updateProduct(p.getId)),format.raw/*25.71*/("""" class="btn-xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
                </a>

            </td>
            <td>
                <a href=""""),_display_(/*31.27*/routes/*31.33*/.HomeController.deleteProduct(p.getId)),format.raw/*31.71*/("""" class="btn-xs btn-danger"
                    onclick="return confirmDel();">
                    <span class="gylpicon glyphicon-trash"></span>
                </a>
            </td>
                </a>
            </td>
        </tr>
    """)))}),format.raw/*39.6*/("""
    """),format.raw/*40.5*/("""<script>
        function confirmDel()"""),format.raw/*41.30*/("""{"""),format.raw/*41.31*/("""
            """),format.raw/*42.13*/("""return confirm('Are you sure?');
        """),format.raw/*43.9*/("""}"""),format.raw/*43.10*/("""
    """),format.raw/*44.5*/("""</script>
    </div>
    <div class="col-md-2">

    </div>

""")))}),format.raw/*50.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category]): play.twirl.api.HtmlFormat.Appendable = apply(products,categories)

  def f:((List[models.Product],List[models.Category]) => play.twirl.api.HtmlFormat.Appendable) = (products,categories) => apply(products,categories)

  def ref: this.type = this

}


}

/**/
object prod extends prod_Scope0.prod
              /*
                  -- GENERATED --
                  DATE: Mon Dec 12 14:57:50 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/prod.scala.html
                  HASH: c4f6e8600136fde4c40d46d3d98e6bea115494b6
                  MATRIX: 779->1|941->68|968->70|992->86|1030->87|1061->92|1165->170|1179->176|1222->199|1310->261|1345->281|1384->283|1432->304|1487->333|1496->334|1524->342|1572->363|1619->384|1628->385|1667->404|1749->455|1785->464|1861->514|1902->546|1941->547|1977->556|2047->599|2061->604|2097->619|2133->628|2175->640|2207->646|2241->664|2280->665|2316->674|2381->712|2391->713|2418->719|2468->742|2478->743|2507->751|2580->797|2628->824|2704->873|2719->879|2778->917|2982->1094|2997->1100|3056->1138|3330->1382|3362->1387|3428->1425|3457->1426|3498->1439|3566->1480|3595->1481|3627->1486|3719->1548
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|41->10|42->11|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|49->18|50->19|50->19|50->19|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|56->25|56->25|56->25|62->31|62->31|62->31|70->39|71->40|72->41|72->41|73->42|74->43|74->43|75->44|81->50
                  -- GENERATED --
              */
          