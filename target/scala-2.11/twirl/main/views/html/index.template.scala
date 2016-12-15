
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /* @(products: List[models.Product]) */
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Home")/*2.14*/{_display_(Seq[Any](format.raw/*2.15*/("""
    """),format.raw/*3.5*/("""<div class="col-md-2">
    </div>
    <div class="col-md-10">
        """),_display_(/*6.10*/if(flash.containsKey("success"))/*6.42*/{_display_(Seq[Any](format.raw/*6.43*/("""
            """),format.raw/*7.13*/("""<div class="alert alert-success">
            """),_display_(/*8.14*/flash/*8.19*/.get("success")),format.raw/*8.34*/("""
            """),format.raw/*9.13*/("""</div>
        """)))}),format.raw/*10.10*/("""
        """),_display_(/*11.10*/if(flash.containsKey("bought"))/*11.41*/{_display_(Seq[Any](format.raw/*11.42*/("""
            """),format.raw/*12.13*/("""<div class="alert alert-success">
            """),_display_(/*13.14*/flash/*13.19*/.get("bought")),format.raw/*13.33*/("""
            """),format.raw/*14.13*/("""</div>
        """)))}),format.raw/*15.10*/("""
    """),format.raw/*16.5*/("""<div class="container-fluid">
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
            <img src="http://lorempixel.com/output/animals-q-g-1900-500-6.jpg">
          </div>

          <div class="item">
            <img src="http://lorempixel.com/output/technics-q-g-1900-500-6.jpg">
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
           """),format.raw/*56.38*/("""
                """),format.raw/*57.17*/("""<div class="row">

                </div>
           """),format.raw/*60.19*/("""
    """),format.raw/*61.5*/("""</div>
    </div>
""")))}),format.raw/*63.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/* @(products: List[models.Product]) */
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 20:41:10 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/index.scala.html
                  HASH: 25e2e91c82b7430256bf178fb7deceee15f25f90
                  MATRIX: 862->42|882->54|920->55|952->61|1052->135|1092->167|1130->168|1171->182|1245->230|1258->235|1293->250|1334->264|1382->281|1420->292|1460->323|1499->324|1541->338|1616->386|1630->391|1665->405|1707->419|1755->436|1788->442|3484->2136|3530->2154|3614->2217|3647->2223|3698->2244
                  LINES: 32->2|32->2|32->2|33->3|36->6|36->6|36->6|37->7|38->8|38->8|38->8|39->9|40->10|41->11|41->11|41->11|42->12|43->13|43->13|43->13|44->14|45->15|46->16|86->56|87->57|90->60|91->61|93->63
                  -- GENERATED --
              */
          