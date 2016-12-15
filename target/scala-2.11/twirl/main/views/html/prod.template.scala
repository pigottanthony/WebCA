
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
    """),format.raw/*3.5*/("""<div class="col-md-3">
        <h4 class="text-center">Filters</h4>
        <div id="accordion">
            <h4>Categories</h4>
            <div class="list-group">
                <a href=""""),_display_(/*8.27*/routes/*8.33*/.HomeController.prod(0)),format.raw/*8.56*/("""" class="list-group-item">All Categories</a>
                """),_display_(/*9.18*/for(c <- categories) yield /*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""
                    """),format.raw/*10.21*/("""<a href=""""),_display_(/*10.31*/routes/*10.37*/.HomeController.prod(c.getId)),format.raw/*10.66*/("""" class="list-group-item">"""),_display_(/*10.93*/c/*10.94*/.getName),format.raw/*10.102*/("""
                        """),format.raw/*11.25*/("""<span class="badge">"""),_display_(/*11.46*/c/*11.47*/.getProducts.size()),format.raw/*11.66*/("""</span>
                    </a>
                """)))}),format.raw/*13.18*/("""
            """),format.raw/*14.13*/("""</div>
            <h4>Price</h4>
            <div>
            </div>
            <h4>Brand</h4>
            <div>
            </div>
        </div>
    </div>
    <div class="col-md-9">
        <div class="col-md=8">
            """),_display_(/*25.14*/if(flash.containsKey("success"))/*25.46*/{_display_(Seq[Any](format.raw/*25.47*/("""
                """),format.raw/*26.17*/("""<div class="alert alert-success">
                """),_display_(/*27.18*/flash/*27.23*/.get("success")),format.raw/*27.38*/("""
                """),format.raw/*28.17*/("""</div>
            """)))}),format.raw/*29.14*/("""
            """),_display_(/*30.14*/for(p <-products) yield /*30.31*/{_display_(Seq[Any](format.raw/*30.32*/("""
                """),format.raw/*31.17*/("""<div class="row">
                    <div class="prodItem">
                        <span class="prodImage";>
                            <img src=""""),_display_(/*34.40*/routes/*34.46*/.Assets.versioned("images/productImages/" + p.getId + ".jpg")),format.raw/*34.107*/("""" height="100"; width="100">
                        </span>
                        <span class="prodDetails">
                            <span class="prodTitle">
                                """),_display_(/*38.34*/p/*38.35*/.getName),format.raw/*38.43*/("""
                            """),format.raw/*39.29*/("""</span>
                            <span class="prodPrice">
                                    &euro;"""),_display_(/*41.44*/("%.2f".format(p.getPrice))),format.raw/*41.71*/("""
                            """),format.raw/*42.29*/("""</span>
                        </span>
                        <div class="prodEdit">
                            <span class="prodUpdate">
                                <a href=""""),_display_(/*46.43*/routes/*46.49*/.HomeController.updateProduct(p.getId)),format.raw/*46.87*/("""" class="btn-xs btn-danger">
                                    <span class="glyphicon glyphicon-pencil"></span>
                                </a>
                            </span>
                            <span class="prodDelete">
                                <a href=""""),_display_(/*51.43*/routes/*51.49*/.HomeController.deleteProduct(p.getId)),format.raw/*51.87*/("""" class="btn-xs btn-danger"
                                    onclick="return confirmDel();">
                                    <span class="gylpicon glyphicon-trash"></span>
                                </a>
                            </span>
                        </div>
                        """),_display_(/*57.26*/if(p.getStock == 0)/*57.45*/{_display_(Seq[Any](format.raw/*57.46*/("""
                            """),format.raw/*58.29*/("""<span class="stockMsg">Sorry, out of stock!</span>
                        """)))}/*59.26*/else/*59.30*/{_display_(Seq[Any](format.raw/*59.31*/("""
                            """),format.raw/*60.29*/("""<a href=""""),_display_(/*60.39*/routes/*60.45*/.HomeController.checkout(p.getId)),format.raw/*60.78*/("""">
                                <input type="submit" value="Buy" class="btn btn-primary">
                            </a>
                        """)))}),format.raw/*63.26*/("""
                    """),format.raw/*64.21*/("""</div>
                </div>
            """)))}),format.raw/*66.14*/("""
        """),format.raw/*67.9*/("""</div>
            <script>
                    function confirmDel()"""),format.raw/*69.42*/("""{"""),format.raw/*69.43*/("""
                        """),format.raw/*70.25*/("""return confirm('Are you sure?');
                    """),format.raw/*71.21*/("""}"""),format.raw/*71.22*/("""
            """),format.raw/*72.13*/("""</script>
        </div>
        <div class="col-md-1">

        </div>
    </div>

""")))}),format.raw/*79.2*/("""
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
                  DATE: Thu Dec 15 20:17:33 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/prod.scala.html
                  HASH: 3bed319588c027fabf4b71897a5df9caf6a0cee1
                  MATRIX: 779->1|941->68|968->70|992->86|1030->87|1061->92|1279->284|1293->290|1336->313|1424->375|1459->395|1498->397|1547->418|1584->428|1599->434|1649->463|1703->490|1713->491|1743->499|1796->524|1844->545|1854->546|1894->565|1975->615|2016->628|2275->860|2316->892|2355->893|2400->910|2478->961|2492->966|2528->981|2573->998|2624->1018|2665->1032|2698->1049|2737->1050|2782->1067|2959->1217|2974->1223|3057->1284|3282->1482|3292->1483|3321->1491|3378->1520|3509->1624|3557->1651|3614->1680|3824->1863|3839->1869|3898->1907|4208->2190|4223->2196|4282->2234|4617->2542|4645->2561|4684->2562|4741->2591|4836->2667|4849->2671|4888->2672|4945->2701|4982->2711|4997->2717|5051->2750|5233->2901|5282->2922|5356->2965|5392->2974|5489->3043|5518->3044|5571->3069|5652->3122|5681->3123|5722->3136|5837->3221
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|44->13|45->14|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|60->29|61->30|61->30|61->30|62->31|65->34|65->34|65->34|69->38|69->38|69->38|70->39|72->41|72->41|73->42|77->46|77->46|77->46|82->51|82->51|82->51|88->57|88->57|88->57|89->58|90->59|90->59|90->59|91->60|91->60|91->60|91->60|94->63|95->64|97->66|98->67|100->69|100->69|101->70|102->71|102->71|103->72|110->79
                  -- GENERATED --
              */
          