
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contact_Scope0 {
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

     object contact_Scope1 {
import helper._

class contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.Contact],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(addContactForm: Form[models.Contact]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.40*/("""
"""),_display_(/*3.2*/main("Contact")/*3.17*/{_display_(Seq[Any](format.raw/*3.18*/("""


    """),format.raw/*6.5*/("""<div class="col-md-2">
    </div>
    <div class="col-md-10">
        <div class="row">
            <div class="col-md-12">
                <div class="">
                    <h4>Have a problem? Please fill in the online customer service form below for a quick response.</h4>
                </div>
                """),_display_(/*14.18*/form(action = routes.HomeController.contactSubmit(), 'class -> "form-horizontal", 'role ->"form")/*14.115*/{_display_(Seq[Any](format.raw/*14.116*/("""
                    """),_display_(/*15.22*/inputText(addContactForm("fname"), '_label -> "First Name:", 'class -> "form-control")),format.raw/*15.108*/("""
                    """),_display_(/*16.22*/inputText(addContactForm("lname"), '_label -> "Last Name:", 'class -> "form-control")),format.raw/*16.107*/("""
                    """),_display_(/*17.22*/inputText(addContactForm("email"), '_label -> "Email:", 'class -> "form-control")),format.raw/*17.103*/("""
                    """),_display_(/*18.22*/inputText(addContactForm("subject"), '_label -> "Subject:", 'class -> "form-control")),format.raw/*18.107*/("""
                    """),_display_(/*19.22*/inputText(addContactForm("comment"), '_label -> "Comment:", 'class -> "form-control")),format.raw/*19.107*/("""
                    """),_display_(/*20.22*/inputText(addContactForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*20.89*/("""

                    """),format.raw/*22.21*/("""<div class="actions">
                        <input type="submit" value="Add Feedback" class="btn btn-primary">
                        <a href=""""),_display_(/*24.35*/routes/*24.41*/.HomeController.index()),format.raw/*24.64*/(""""
                        <button class="btn btn-warning">Cancel</button>
                        </a>
                    </div>
                """)))}),format.raw/*28.18*/("""
            """),format.raw/*29.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*32.2*/("""
"""))
      }
    }
  }

  def render(addContactForm:Form[models.Contact]): play.twirl.api.HtmlFormat.Appendable = apply(addContactForm)

  def f:((Form[models.Contact]) => play.twirl.api.HtmlFormat.Appendable) = (addContactForm) => apply(addContactForm)

  def ref: this.type = this

}


}
}

/**/
object contact extends contact_Scope0.contact_Scope1.contact
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 16:36:27 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/contact.scala.html
                  HASH: e0ece32d181db70fb8faa8be97dc1e2e5440be73
                  MATRIX: 809->18|942->56|969->58|992->73|1030->74|1063->81|1406->397|1513->494|1553->495|1602->517|1710->603|1759->625|1866->710|1915->732|2018->813|2067->835|2174->920|2223->942|2330->1027|2379->1049|2467->1116|2517->1138|2691->1285|2706->1291|2750->1314|2928->1461|2969->1474|3033->1508
                  LINES: 30->2|35->2|36->3|36->3|36->3|39->6|47->14|47->14|47->14|48->15|48->15|49->16|49->16|50->17|50->17|51->18|51->18|52->19|52->19|53->20|53->20|55->22|57->24|57->24|57->24|61->28|62->29|65->32
                  -- GENERATED --
              */
          