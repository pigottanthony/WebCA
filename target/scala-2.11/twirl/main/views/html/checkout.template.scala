
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object checkout_Scope0 {
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

class checkout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.users.User,Product,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, product: Product):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.45*/("""
"""),_display_(/*2.2*/main("checkout", user)/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""
    """),format.raw/*3.5*/("""<div class="col-md-2">
    </div>
    <div class="col-md-2">
        <img src=""""),_display_(/*6.20*/routes/*6.26*/.Assets.versioned("images/productImages/" + product.getId + ".jpg")),format.raw/*6.93*/("""" height="100"; width="100">
    </div>
    <div class="col-md-2"
            <br/>
    <br/>
            Subtotal: &euro;"""),_display_(/*11.30*/("%.2f".format(product.getPrice))),format.raw/*11.63*/("""
        """),format.raw/*12.9*/("""</br>
            Shipping: &euro;10
        <br/>
            Total: &euro;"""),_display_(/*15.27*/("%.2f".format(product.getPrice +10))),format.raw/*15.64*/("""
    """),format.raw/*16.5*/("""</div>
    <div class="col-md-5">
        <div class="text-center">
            Card Number:<br>
            <input type="text" name="cardnum"><br>
            Security Code:<br>
            <input type="text" name="secCode"><br>
            Card Expiration:<br>
            <input type="text" name="date"><br>
            <br>
            <a href=""""),_display_(/*26.23*/routes/*26.29*/.HomeController.buy()),format.raw/*26.50*/("""">
                <input type="submit" value="Buy" class="btn btn-primary">
            </a>
        </div>

    </div>


""")))}),format.raw/*34.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User,product:Product): play.twirl.api.HtmlFormat.Appendable = apply(user,product)

  def f:((models.users.User,Product) => play.twirl.api.HtmlFormat.Appendable) = (user,product) => apply(user,product)

  def ref: this.type = this

}


}

/**/
object checkout extends checkout_Scope0.checkout
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 13:29:30 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/checkout.scala.html
                  HASH: 670727eafd78efd919cc43a2456e17f31d8472ec
                  MATRIX: 770->1|908->44|935->46|965->68|1003->69|1034->74|1140->154|1154->160|1241->227|1391->350|1445->383|1481->392|1585->469|1643->506|1675->511|2052->861|2067->867|2109->888|2263->1012
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|37->6|37->6|37->6|42->11|42->11|43->12|46->15|46->15|47->16|57->26|57->26|57->26|65->34
                  -- GENERATED --
              */
          