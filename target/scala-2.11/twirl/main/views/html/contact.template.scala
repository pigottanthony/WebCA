
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

class contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.Contact],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(addContactForm: Form[models.Contact], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.65*/("""
"""),_display_(/*3.2*/main("Contact", user)/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""


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

  def render(addContactForm:Form[models.Contact],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addContactForm,user)

  def f:((Form[models.Contact],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addContactForm,user) => apply(addContactForm,user)

  def ref: this.type = this

}


}
}

/**/
object contact extends contact_Scope0.contact_Scope1.contact
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 12:40:05 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/contact.scala.html
                  HASH: acd5b402ba56fa961437d89a5876d52e3c00d2d3
                  MATRIX: 827->18|985->81|1012->83|1041->104|1079->105|1112->112|1455->428|1562->525|1602->526|1651->548|1759->634|1808->656|1915->741|1964->763|2067->844|2116->866|2223->951|2272->973|2379->1058|2428->1080|2516->1147|2566->1169|2740->1316|2755->1322|2799->1345|2977->1492|3018->1505|3082->1539
                  LINES: 30->2|35->2|36->3|36->3|36->3|39->6|47->14|47->14|47->14|48->15|48->15|49->16|49->16|50->17|50->17|51->18|51->18|52->19|52->19|53->20|53->20|55->22|57->24|57->24|57->24|61->28|62->29|65->32
                  -- GENERATED --
              */
          