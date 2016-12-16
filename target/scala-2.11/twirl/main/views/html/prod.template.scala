
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

class prod extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.94*/("""
"""),_display_(/*2.2*/main("Products", user)/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""
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
                        """),_display_(/*44.26*/if(user != null && user.getRole == "admin")/*44.69*/ {_display_(Seq[Any](format.raw/*44.71*/("""
                            """),format.raw/*45.29*/("""<div class="prodEdit">
                                <span class="prodUpdate">
                                    <a href=""""),_display_(/*47.47*/routes/*47.53*/.HomeController.updateProduct(p.getId)),format.raw/*47.91*/("""" class="btn-xs btn-danger">
                                        <span class="glyphicon glyphicon-pencil"></span>
                                    </a>
                                </span>
                                <span class="prodDelete">
                                    <a href=""""),_display_(/*52.47*/routes/*52.53*/.HomeController.deleteProduct(p.getId)),format.raw/*52.91*/("""" class="btn-xs btn-danger"
                                    onclick="return confirmDel();">
                                        <span class="gylpicon glyphicon-trash"></span>
                                    </a>
                                </span>
                            </div>
                        """)))}),format.raw/*58.26*/("""
                        """),_display_(/*59.26*/if(p.getStock == 0)/*59.45*/{_display_(Seq[Any](format.raw/*59.46*/("""
                            """),format.raw/*60.29*/("""<span class="stockMsg">Sorry, out of stock!</span>
                        """)))}/*61.26*/else/*61.30*/{_display_(Seq[Any](format.raw/*61.31*/("""
                            """),format.raw/*62.29*/("""<a href=""""),_display_(/*62.39*/routes/*62.45*/.HomeController.checkout(p.getId)),format.raw/*62.78*/("""">
                                <input type="submit" value="Buy" class="btn btn-primary">
                            </a>
                        """)))}),format.raw/*65.26*/("""
                    """),format.raw/*66.21*/("""</div>
                </div>
            """)))}),format.raw/*68.14*/("""
        """),format.raw/*69.9*/("""</div>
            <script>
                    function confirmDel()"""),format.raw/*71.42*/("""{"""),format.raw/*71.43*/("""
                        """),format.raw/*72.25*/("""return confirm('Are you sure?');
                    """),format.raw/*73.21*/("""}"""),format.raw/*73.22*/("""
            """),format.raw/*74.13*/("""</script>
        </div>
        <div class="col-md-1">

        </div>
    </div>

""")))}),format.raw/*81.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user)

  def f:((List[models.Product],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user) => apply(products,categories,user)

  def ref: this.type = this

}


}

/**/
object prod extends prod_Scope0.prod
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 13:15:54 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/prod.scala.html
                  HASH: d2ad20ca63270cf80aece5a2731e3a5902fbb0cb
                  MATRIX: 797->1|984->93|1011->95|1041->117|1079->118|1110->123|1328->315|1342->321|1385->344|1473->406|1508->426|1547->428|1596->449|1633->459|1648->465|1698->494|1752->521|1762->522|1792->530|1845->555|1893->576|1903->577|1943->596|2024->646|2065->659|2324->891|2365->923|2404->924|2449->941|2527->992|2541->997|2577->1012|2622->1029|2673->1049|2714->1063|2747->1080|2786->1081|2831->1098|3008->1248|3023->1254|3106->1315|3331->1513|3341->1514|3370->1522|3427->1551|3558->1655|3606->1682|3663->1711|3755->1776|3807->1819|3847->1821|3904->1850|4058->1977|4073->1983|4132->2021|4462->2324|4477->2330|4536->2368|4891->2692|4944->2718|4972->2737|5011->2738|5068->2767|5163->2843|5176->2847|5215->2848|5272->2877|5309->2887|5324->2893|5378->2926|5560->3077|5609->3098|5683->3141|5719->3150|5816->3219|5845->3220|5898->3245|5979->3298|6008->3299|6049->3312|6164->3397
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|44->13|45->14|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|60->29|61->30|61->30|61->30|62->31|65->34|65->34|65->34|69->38|69->38|69->38|70->39|72->41|72->41|73->42|75->44|75->44|75->44|76->45|78->47|78->47|78->47|83->52|83->52|83->52|89->58|90->59|90->59|90->59|91->60|92->61|92->61|92->61|93->62|93->62|93->62|93->62|96->65|97->66|99->68|100->69|102->71|102->71|103->72|104->73|104->73|105->74|112->81
                  -- GENERATED --
              */
          