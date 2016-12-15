
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

class checkout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Product,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: Product):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),_display_(/*2.2*/main("checkout")/*2.18*/{_display_(Seq[Any](format.raw/*2.19*/("""
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

  def render(product:Product): play.twirl.api.HtmlFormat.Appendable = apply(product)

  def f:((Product) => play.twirl.api.HtmlFormat.Appendable) = (product) => apply(product)

  def ref: this.type = this

}


}

/**/
object checkout extends checkout_Scope0.checkout
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 21:21:50 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/checkout.scala.html
                  HASH: 3db4ce162c39b92637976658fc10a1c11ebf9eb4
                  MATRIX: 752->1|865->19|892->21|916->37|954->38|985->43|1390->421|1405->427|1447->448|1601->572
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|45->14|45->14|45->14|53->22
                  -- GENERATED --
              */
          