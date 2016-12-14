
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

class contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Contact")/*1.17*/{_display_(Seq[Any](format.raw/*1.18*/("""
    """),format.raw/*2.5*/("""<div class="col-md-2">
    </div>
    <div class="col-md-10">
          <div class="text-center">
          <h2>Contact Us</h2>
            <h4 class="contacthead">Have a problem? Please fill in the online customer service form below for a quick response.</h4>
            <!--<h4 class="contacthead">Is it urgent? Contact us directly:</br></h4><h5> Phone: 01-4578964 </br> Email: info_[BRANDNAME].ie</h5>
            <h5>Available: </br> 09:00 - 17:00	 Monday to Friday </br> 10:00 - 16:00 Saturday & Sunday</h5>  -->
          </div>
        <form class="form-horizontal">
        <fieldset>



        <!-- Text input-->
        <div class="form-group">
          <label class="col-md-4 control-label" for="textinput">First Name</label>
          <div class="col-md-4">
          <input id="textinput" name="textinput" type="text" placeholder="" class="form-control input-md" required>
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-4 control-label" for="textinput">Last Name</label>
          <div class="col-md-4">
          <input id="textinput" name="textinput" type="text" placeholder="" class="form-control input-md" required>
          </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
          <label class="col-md-4 control-label" for="textinput">Your Email</label>
          <div class="col-md-4">
          <input id="textinput" name="textinput" type="text" placeholder="" class="form-control input-md" required>

          </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
          <label class="col-md-4 control-label" for="textinput">Subject</label>
          <div class="col-md-4">
          <input id="textinput" name="textinput" type="text" placeholder="" class="form-control input-md" required>

          </div>
        </div>

        <!-- Textarea -->
        <div class="form-group">
          <label class="col-md-4 control-label" for="textarea">Comment</label>
          <div class="col-md-4">
            <textarea class="form-control" id="textarea" name="textarea" required></textarea>
          </div>
        </div>

        <!-- Button -->
        <div class="text-center">
        <div class="form-group">
          <label class="col-md-4 control-label" for="singlebutton"></label>
          <div class="col-md-4">
            <button id="singlebutton" name="singlebutton" class="btn btn-success">Submit </button>
          </div>
        </div>
        </div>

        </fieldset>
        </form>
    </div>

""")))}),format.raw/*70.2*/("""
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
object contact extends contact_Scope0.contact
              /*
                  -- GENERATED --
                  DATE: Wed Dec 14 11:19:20 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/contact.scala.html
                  HASH: 65133e3e72d7f90075c30d6062b4a461f9be9769
                  MATRIX: 831->1|854->16|892->17|923->22|3514->2583
                  LINES: 32->1|32->1|32->1|33->2|101->70
                  -- GENERATED --
              */
          