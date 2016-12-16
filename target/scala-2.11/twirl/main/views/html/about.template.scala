
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_Scope0 {
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

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("About", user)/*2.21*/{_display_(Seq[Any](format.raw/*2.22*/("""
    """),format.raw/*3.5*/("""<div class="col-md-2">
    </div>
    <div class="col-md-10">
       <div class="text-center">
       <h2>About Us</h2>
       </div>
        <p class="abouthead">SKAS Clothing is based in South Dublin and is home to the finest street wear money can buy!</p>
        <p id="abouttext">Established in 2016, we were formed by 4 entrepreneurs tired of overpriced and bad quality clothing. 
        After many trials and errors, SKAS Clothing was born. Our first store in the heart of South Dublin, Tallaght, comprised mainly of T-Shirts 
        and Hooded Sweatshirts. Due to our phenomenal success and praise we have since branched out to supply a wide range of high quality clothing 
        such as T-Shirts, Hooded Sweatshirts, Tracksuits and Footwear.</p>
        <p id="abouttext">Having won Retail Excellence Irelands' Lifestyle Store of the Year 2017 and being nominated in the Fashion & Clothing Category 2017 by Online Retail Award and Best in Class 2017 by Customer Service Excellence Ireland and with a further 2 stores due to open soon, 
        Dundrum Town Centre, just in time for Christmas and Grafton Street, Dublin City Centre, in the first quarter of 2017, we look forward to what
        the future will bring.</p>
        <p id="abouttext">With our online presence growing by the day 200,000+ fans combined from both Facebook and Twitter tuning in daily for news and updates and our monthly interactive competitions. <!--[SOMETHING ABOUT EXPANDING TO EUROPE AND AMERICA]--></p>
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
object about extends about_Scope0.about
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 12:40:05 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/about.scala.html
                  HASH: 206449b0bee9bfc594418d35608ffbe42c71ec0e
                  MATRIX: 756->1|876->26|903->28|930->47|968->48|999->53|2539->1563
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|50->19
                  -- GENERATED --
              */
          