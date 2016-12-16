
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*2.40*/("""
"""),_display_(/*3.2*/main("Home", user)/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""<div class="col-md-2">
    </div>
    <div class="col-md-10">
        """),_display_(/*7.10*/if(flash.containsKey("success"))/*7.42*/{_display_(Seq[Any](format.raw/*7.43*/("""
            """),format.raw/*8.13*/("""<div class="alert alert-success">
            """),_display_(/*9.14*/flash/*9.19*/.get("success")),format.raw/*9.34*/("""
            """),format.raw/*10.13*/("""</div>
        """)))}),format.raw/*11.10*/("""
        """),_display_(/*12.10*/if(flash.containsKey("logout"))/*12.41*/{_display_(Seq[Any](format.raw/*12.42*/("""
            """),format.raw/*13.13*/("""<div class="alert alert-success">
            """),_display_(/*14.14*/flash/*14.19*/.get("logout")),format.raw/*14.33*/("""
            """),format.raw/*15.13*/("""</div>
        """)))}),format.raw/*16.10*/("""
        """),_display_(/*17.10*/if(flash.containsKey("bought"))/*17.41*/{_display_(Seq[Any](format.raw/*17.42*/("""
            """),format.raw/*18.13*/("""<div class="alert alert-success">
            """),_display_(/*19.14*/flash/*19.19*/.get("bought")),format.raw/*19.33*/("""
            """),format.raw/*20.13*/("""</div>
        """)))}),format.raw/*21.10*/("""
    """),format.raw/*22.5*/("""<div class="container-fluid">
      <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
          <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
          <li data-target="#myCarousel" data-slide-to="1"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">
            <div class="carousel-caption">
                <!--<a href="/prod">
                    <button type="button" class="btn btn-default">Shop Now</button>
                </a> -->
                <div class="carousel-caption">
                    <a class="shopnow" href="/prod">Shop Now</a>
                </div>
            </div>
            <div class="item active">
                <img src=""""),_display_(/*41.28*/routes/*41.34*/.Assets.versioned("images/background1.jpg")),format.raw/*41.77*/("""" height="225" width="737">
            </div>

            <div class="item">
                <img src=""""),_display_(/*45.28*/routes/*45.34*/.Assets.versioned("images/background2.jpg")),format.raw/*45.77*/("""" height="225" width="737">
            </div>
        </div>

        <!-- Left and right controls -->
        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
          <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
          <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>


      <h4 style="text-align:Center">FEATURED</h4>
           """),format.raw/*62.38*/("""
                """),format.raw/*63.17*/("""<div class="row">

                </div>
           """),format.raw/*66.19*/("""
    """),format.raw/*67.5*/("""</div>
    </div>
""")))}),format.raw/*69.2*/("""
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 12:40:06 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/index.scala.html
                  HASH: b8d809ce091af196fddf96ec2ac5977737a8aa5b
                  MATRIX: 756->1|876->26|905->67|933->70|959->88|997->89|1029->95|1129->169|1169->201|1207->202|1248->216|1322->264|1335->269|1370->284|1412->298|1460->315|1498->326|1538->357|1577->358|1619->372|1694->420|1708->425|1743->439|1785->453|1833->470|1871->481|1911->512|1950->513|1992->527|2067->575|2081->580|2116->594|2158->608|2206->625|2239->631|3110->1475|3125->1481|3189->1524|3326->1634|3341->1640|3405->1683|4104->2380|4150->2398|4234->2461|4267->2467|4318->2488
                  LINES: 27->1|32->1|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|43->12|43->12|43->12|44->13|45->14|45->14|45->14|46->15|47->16|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|52->21|53->22|72->41|72->41|72->41|76->45|76->45|76->45|93->62|94->63|97->66|98->67|100->69
                  -- GENERATED --
              */
          