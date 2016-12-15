
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


            """),_display_(/*32.14*/for(p <-products) yield /*32.31*/{_display_(Seq[Any](format.raw/*32.32*/("""
                """),format.raw/*33.17*/("""<div class="row">
                    <div class="prodItem">
                        <span class="prodImage">
                            <a href=""""),_display_(/*36.39*/p/*36.40*/.getId),format.raw/*36.46*/("""">
                                <img src="http://placehold.it/100x100">
                            </a>
                        </span>
                        <span class="prodDetails">
                            <span class="prodTitle">
                                """),_display_(/*42.34*/p/*42.35*/.getName),format.raw/*42.43*/("""
                            """),format.raw/*43.29*/("""</span>
                            <span class="prodPrice">
                                    &euro;"""),_display_(/*45.44*/("%.2f".format(p.getPrice))),format.raw/*45.71*/("""
                            """),format.raw/*46.29*/("""</span>
                        </span>
                        <div class="prodEdit">
                            <span class="prodUpdate">
                                <a href=""""),_display_(/*50.43*/routes/*50.49*/.HomeController.updateProduct(p.getId)),format.raw/*50.87*/("""" class="btn-xs btn-danger">
                                    <span class="glyphicon glyphicon-pencil"></span>
                                </a>
                            </span>
                            <span class="prodDelete">
                                <a href=""""),_display_(/*55.43*/routes/*55.49*/.HomeController.deleteProduct(p.getId)),format.raw/*55.87*/("""" class="btn-xs btn-danger"
                                    onclick="return confirmDel();">
                                    <span class="gylpicon glyphicon-trash"></span>
                                </a>
                            </span>
                        </div>
                        """),_display_(/*61.26*/if(p.getStock == 0)/*61.45*/{_display_(Seq[Any](format.raw/*61.46*/("""
                            """),format.raw/*62.29*/("""<span class="stockMsg">Sorry, out of stock!</span>
                        """)))}/*63.26*/else/*63.30*/{_display_(Seq[Any](format.raw/*63.31*/("""
                            """),format.raw/*64.29*/("""<span style="margin-top:0.5em;">
                                <input type="submit" value="Buy" class="btn btn-primary">
                            </span>
                        """)))}),format.raw/*67.26*/("""
                    """),format.raw/*68.21*/("""</div>
                </div>
            """)))}),format.raw/*70.14*/("""
        """),format.raw/*71.9*/("""</div>
            <script>
                    function confirmDel()"""),format.raw/*73.42*/("""{"""),format.raw/*73.43*/("""
                        """),format.raw/*74.25*/("""return confirm('Are you sure?');
                    """),format.raw/*75.21*/("""}"""),format.raw/*75.22*/("""
            """),format.raw/*76.13*/("""</script>
        </div>
        <div class="col-md-1">

        </div>
    </div>

""")))}),format.raw/*83.2*/("""
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
                  DATE: Thu Dec 15 14:53:02 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/prod.scala.html
                  HASH: 82d68b2a67810dc1d3e8ed0366bc5707618bfaba
                  MATRIX: 779->1|941->68|968->70|992->86|1030->87|1061->92|1279->284|1293->290|1336->313|1424->375|1459->395|1498->397|1547->418|1584->428|1599->434|1649->463|1703->490|1713->491|1743->499|1796->524|1844->545|1854->546|1894->565|1975->615|2016->628|2275->860|2316->892|2355->893|2400->910|2478->961|2492->966|2528->981|2573->998|2624->1018|2667->1034|2700->1051|2739->1052|2784->1069|2959->1217|2969->1218|2996->1224|3300->1501|3310->1502|3339->1510|3396->1539|3527->1643|3575->1670|3632->1699|3842->1882|3857->1888|3916->1926|4226->2209|4241->2215|4300->2253|4635->2561|4663->2580|4702->2581|4759->2610|4854->2686|4867->2690|4906->2691|4963->2720|5178->2904|5227->2925|5301->2968|5337->2977|5434->3046|5463->3047|5516->3072|5597->3125|5626->3126|5667->3139|5782->3224
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|44->13|45->14|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|60->29|63->32|63->32|63->32|64->33|67->36|67->36|67->36|73->42|73->42|73->42|74->43|76->45|76->45|77->46|81->50|81->50|81->50|86->55|86->55|86->55|92->61|92->61|92->61|93->62|94->63|94->63|94->63|95->64|98->67|99->68|101->70|102->71|104->73|104->73|105->74|106->75|106->75|107->76|114->83
                  -- GENERATED --
              */
          