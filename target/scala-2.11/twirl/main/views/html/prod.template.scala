
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
            <div>
                <div class="list-group">
                    <a href=""""),_display_(/*9.31*/routes/*9.37*/.HomeController.prod(0)),format.raw/*9.60*/("""" class="list-group-item">All Categories</a>
                    """),_display_(/*10.22*/for(c <- categories) yield /*10.42*/ {_display_(Seq[Any](format.raw/*10.44*/("""
                        """),format.raw/*11.25*/("""<li class="list-group-item">"""),_display_(/*11.54*/c/*11.55*/.getName),format.raw/*11.63*/("""
                        """),format.raw/*12.25*/("""<span class="badge">"""),_display_(/*12.46*/c/*12.47*/.getProducts.size()),format.raw/*12.66*/("""</span>
                        </li>
                    """)))}),format.raw/*14.22*/("""
                """),format.raw/*15.17*/("""</div>
            </div>
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
            """),_display_(/*27.14*/if(flash.containsKey("success"))/*27.46*/{_display_(Seq[Any](format.raw/*27.47*/("""
                """),format.raw/*28.17*/("""<div class="alert alert-success">
                """),_display_(/*29.18*/flash/*29.23*/.get("success")),format.raw/*29.38*/("""
                """),format.raw/*30.17*/("""</div>
            """)))}),format.raw/*31.14*/("""
            """),format.raw/*32.13*/("""<table>
                """),_display_(/*33.18*/for(p <- products) yield /*33.36*/{_display_(Seq[Any](format.raw/*33.37*/("""
                    """),format.raw/*34.21*/("""<tr class="ProdListItem">
                        <td class="prodImage"><img src="http://lorempixel.com/output/animals-q-g-1900-500-6.jpg"></td>
                        <td class="numeric">"""),_display_(/*36.46*/p/*36.47*/.getId),format.raw/*36.53*/("""</td>
                        <td>"""),_display_(/*37.30*/p/*37.31*/.getName),format.raw/*37.39*/(""" """),format.raw/*37.40*/("""</td>
                        <td class="numeric">&euro;"""),_display_(/*38.52*/("%.2f".format(p.getPrice))),format.raw/*38.79*/("""</td>
                        <td>
                            <a href=""""),_display_(/*40.39*/routes/*40.45*/.HomeController.updateProduct(p.getId)),format.raw/*40.83*/("""" class="btn-xs btn-danger">
                                <span class="glyphicon glyphicon-pencil"></span>
                            </a>

                        </td>
                        <td>
                            <a href=""""),_display_(/*46.39*/routes/*46.45*/.HomeController.deleteProduct(p.getId)),format.raw/*46.83*/("""" class="btn-xs btn-danger"
                            onclick="return confirmDel();">
                                <span class="gylpicon glyphicon-trash"></span>
                            </a>
                        </td>
                        </a>
                        </td>
                        </br>
                    </tr>
                """)))}),format.raw/*55.18*/("""
            """),format.raw/*56.13*/("""</table>
            <script>
                    function confirmDel()"""),format.raw/*58.42*/("""{"""),format.raw/*58.43*/("""
                        """),format.raw/*59.25*/("""return confirm('Are you sure?');
                    """),format.raw/*60.21*/("""}"""),format.raw/*60.22*/("""
            """),format.raw/*61.13*/("""</script>
        </div>
        <div class="col-md-1">

        </div>
    </div>

""")))}),format.raw/*68.2*/("""
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
                  DATE: Wed Dec 14 12:26:09 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/prod.scala.html
                  HASH: 50480956a85c954501e1018219944dfa9fa67b79
                  MATRIX: 779->1|941->68|968->70|992->86|1030->87|1061->92|1305->310|1319->316|1362->339|1455->405|1491->425|1531->427|1584->452|1640->481|1650->482|1679->490|1732->515|1780->536|1790->537|1830->556|1920->615|1965->632|2243->883|2284->915|2323->916|2368->933|2446->984|2460->989|2496->1004|2541->1021|2592->1041|2633->1054|2685->1079|2719->1097|2758->1098|2807->1119|3024->1309|3034->1310|3061->1316|3123->1351|3133->1352|3162->1360|3191->1361|3275->1418|3323->1445|3423->1518|3438->1524|3497->1562|3765->1803|3780->1809|3839->1847|4232->2209|4273->2222|4372->2293|4401->2294|4454->2319|4535->2372|4564->2373|4605->2386|4720->2471
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|45->14|46->15|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|62->31|63->32|64->33|64->33|64->33|65->34|67->36|67->36|67->36|68->37|68->37|68->37|68->37|69->38|69->38|71->40|71->40|71->40|77->46|77->46|77->46|86->55|87->56|89->58|89->58|90->59|91->60|91->60|92->61|99->68
                  -- GENERATED --
              */
          