
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object account_Scope0 {
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

class account extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("Account", user)/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
"""),format.raw/*3.1*/("""<div class="col-md-2">
</div>
<div class="col-md-10">
    <div class="text-center">
        <form>
            Email:<br>
            <input type="text" name="email"><br>
            Password:<br>
            <input type="password" name="password"><br>
            <br>
            <input type="submit" value="Sign In"><br>
        </form>
        <p>Don't have an account? <a href="/signup">Sign Up!</a></p>
    </div>
</div>

""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object account extends account_Scope0.account
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 12:40:05 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/account.scala.html
                  HASH: 17ee47c50c750ee7c6e325eb82d501c53a5dd335
                  MATRIX: 760->1|880->26|907->28|936->49|974->50|1001->51|1460->480
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|50->19
                  -- GENERATED --
              */
          