
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
    <div class="col-md-10">
        <div class="text-center">
            Card Number:<br>
            <input type="text" name="cardnum"><br>
            Security Code:<br>
            <input type="text" name="secCode"><br>
            Card Expiration:<br>
            <input type="text" name="date"><br>
            <br>
            <a href=""""),_display_(/*14.23*/routes/*14.29*/.HomeController.buy()),format.raw/*14.50*/("""">
                <input type="submit" value="Buy" class="btn btn-primary">
            </a>
        </div>

    </div>


""")))}),format.raw/*22.2*/("""
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
                  DATE: Fri Dec 16 12:40:05 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/checkout.scala.html
                  HASH: c6ad389e78eb90c8662c63a40c154d31f51de22c
                  MATRIX: 770->1|908->44|935->46|965->68|1003->69|1034->74|1439->452|1454->458|1496->479|1650->603
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|45->14|45->14|45->14|53->22
                  -- GENERATED --
              */
          