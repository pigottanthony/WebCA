
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

class account extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Account")/*1.17*/{_display_(Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""<div class="col-md-2">
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

""")))}),format.raw/*18.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object account extends account_Scope0.account
              /*
                  -- GENERATED --
                  DATE: Wed Dec 14 11:19:20 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/account.scala.html
                  HASH: ab2a7d00facd0d1c66aefc97b5a9bd746b604fd5
                  MATRIX: 831->1|854->16|892->17|919->18|1378->447
                  LINES: 32->1|32->1|32->1|33->2|49->18
                  -- GENERATED --
              */
          