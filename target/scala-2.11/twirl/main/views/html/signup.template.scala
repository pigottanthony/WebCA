
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

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Sign Up")/*1.17*/{_display_(Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""<div class="col-md-2">
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

""")))}),format.raw/*20.2*/("""
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
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Wed Dec 14 11:19:20 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/signup.scala.html
                  HASH: 814cdd472095a7586a2c4a662574596a451ab956
                  MATRIX: 829->1|852->16|890->17|917->18|1623->694
                  LINES: 32->1|32->1|32->1|33->2|51->20
                  -- GENERATED --
              */
          