
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
            """),_display_(/*32.14*/for(p <- products) yield /*32.32*/{_display_(Seq[Any](format.raw/*32.33*/("""
                """),format.raw/*33.17*/("""<tr>
                    <td class="numeric">"""),_display_(/*34.42*/p/*34.43*/.getId),format.raw/*34.49*/("""</td>
                    <td>"""),_display_(/*35.26*/p/*35.27*/.getName),format.raw/*35.35*/("""</td>
                    <td class="numeric">&euro; """),_display_(/*36.49*/("%.2f".format(p.getPrice))),format.raw/*36.76*/("""</td>
                    <td>
                        <a href=""""),_display_(/*38.35*/routes/*38.41*/.HomeController.updateProduct(p.getId)),format.raw/*38.79*/("""" class="btn-xs btn-danger">
                            <span class="glyphicon glyphicon-pencil"></span>
                        </a>

                    </td>
                    <td>
                        <a href=""""),_display_(/*44.35*/routes/*44.41*/.HomeController.deleteProduct(p.getId)),format.raw/*44.79*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                            <span class="gylpicon glyphicon-trash"></span>
                        </a>
                    </td>
                    </a>
                    </td>
                </tr>
            """)))}),format.raw/*52.14*/("""
            """),format.raw/*53.13*/("""<script>
                    function confirmDel()"""),format.raw/*54.42*/("""{"""),format.raw/*54.43*/("""
                        """),format.raw/*55.25*/("""return confirm('Are you sure?');
                    """),format.raw/*56.21*/("""}"""),format.raw/*56.22*/("""
            """),format.raw/*57.13*/("""</script>
        </div>
        <div class="col-md-1">

        </div>
    </div>

""")))}),format.raw/*64.2*/("""
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
                  DATE: Mon Dec 12 22:57:17 GMT 2016
                  SOURCE: /home/wdd/webapps/thing/webca/app/views/prod.scala.html
                  HASH: 45c4cb7bc7c016e937b9d2c0bc0cc2d6791b9e3c
                  MATRIX: 779->1|941->68|968->70|992->86|1030->87|1061->92|1305->310|1319->316|1362->339|1455->405|1491->425|1531->427|1584->452|1640->481|1650->482|1679->490|1732->515|1780->536|1790->537|1830->556|1920->615|1965->632|2243->883|2284->915|2323->916|2368->933|2446->984|2460->989|2496->1004|2541->1021|2592->1041|2633->1055|2667->1073|2706->1074|2751->1091|2824->1137|2834->1138|2861->1144|2919->1175|2929->1176|2958->1184|3039->1238|3087->1265|3179->1330|3194->1336|3253->1374|3501->1595|3516->1601|3575->1639|3906->1939|3947->1952|4025->2002|4054->2003|4107->2028|4188->2081|4217->2082|4258->2095|4373->2180
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|45->14|46->15|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|62->31|63->32|63->32|63->32|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|69->38|69->38|69->38|75->44|75->44|75->44|83->52|84->53|85->54|85->54|86->55|87->56|87->56|88->57|95->64
                  -- GENERATED --
              */
          