
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

class prod extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*2.2*/main("Products")/*2.18*/{_display_(Seq[Any](format.raw/*2.19*/("""
    """),_display_(/*3.6*/if(flash.containsKey("success"))/*3.38*/{_display_(Seq[Any](format.raw/*3.39*/("""
        """),format.raw/*4.9*/("""<div class=""alert alert-success">
        """),_display_(/*5.10*/flash/*5.15*/.get("success")),format.raw/*5.30*/("""
        """),format.raw/*6.9*/("""</div>
    """)))}),format.raw/*7.6*/("""
    """),_display_(/*8.6*/for(p <- products) yield /*8.24*/{_display_(Seq[Any](format.raw/*8.25*/("""
        """),format.raw/*9.9*/("""<tr>
            <td class="numeric">"""),_display_(/*10.34*/p/*10.35*/.getId),format.raw/*10.41*/("""</td>
            <td>"""),_display_(/*11.18*/p/*11.19*/.getName),format.raw/*11.27*/("""</td>
            <td class="numeric">&euro; """),_display_(/*12.41*/("%.2f".format(p.getPrice))),format.raw/*12.68*/("""</td>
            <td>
                <a href=""""),_display_(/*14.27*/routes/*14.33*/.HomeController.deleteProduct(p.getId)),format.raw/*14.71*/("""" class="btn-xs btn-danger"
                onclick="return confirmDel();">
                    <span class="gylpicon glyphicon-trash"></span>
                    </a>
                </td>
                </a>
            </td>
        </tr>
    """)))}),format.raw/*22.6*/("""
    """),format.raw/*23.5*/("""<script>
        function confirmDel()"""),format.raw/*24.30*/("""{"""),format.raw/*24.31*/("""
            """),format.raw/*25.13*/("""return confirm('Are you sure?');
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/("""
    """),format.raw/*27.5*/("""</script>
""")))}),format.raw/*28.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


}

/**/
object prod extends prod_Scope0.prod
              /*
                  -- GENERATED --
                  DATE: Fri Dec 09 16:12:08 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/prod.scala.html
                  HASH: cad47a31011f68b13e37b4cb9d6cc83f1350ae2d
                  MATRIX: 757->1|884->33|911->35|935->51|973->52|1004->58|1044->90|1082->91|1117->100|1187->144|1200->149|1235->164|1270->173|1311->185|1342->191|1375->209|1413->210|1448->219|1513->257|1523->258|1550->264|1600->287|1610->288|1639->296|1712->342|1760->369|1836->418|1851->424|1910->462|2188->710|2220->715|2286->753|2315->754|2356->767|2424->808|2453->809|2485->814|2526->825
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|38->7|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|45->14|45->14|45->14|53->22|54->23|55->24|55->24|56->25|57->26|57->26|58->27|59->28
                  -- GENERATED --
              */
          