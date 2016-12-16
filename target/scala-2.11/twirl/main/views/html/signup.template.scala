
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
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

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("Sign Up" , user)/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""
"""),format.raw/*3.1*/("""<div class="col-md-2">
</div>
<div class="col-md-10">
	<div class="text-center">
		<div class="forms">
			<form>
				<input type="text" name="firstname" placeholder="Enter First Name"></br></br>
				<input type="text" name="lastname" placeholder="Enter Last Name"></br></br>
				<input type="text" name="email" placeholder="Enter Email Address"><br></br>
				<input type="password" name="password" placeholder="Enter Password"><br></br>
				<input type="password" name="passwordconfirm" placeholder="Confirm Password"><br></br>
				<input type="submit" value="Submit"><br>
			</form>
		<p> Already have an account?<a href="/account">Sign In</a> </p>
		</div>
	</div>
</div>

""")))}),format.raw/*21.2*/("""
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
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 12:40:05 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/signup.scala.html
                  HASH: a3389faf3477f2f1c1f5804c0826c3175e169139
                  MATRIX: 758->1|878->26|905->28|935->50|973->51|1000->52|1706->728
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|52->21
                  -- GENERATED --
              */
          