
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
	<title>"""),_display_(/*12.10*/title),format.raw/*12.15*/("""</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="script.js"></script>
	<link href='"""),_display_(/*18.15*/routes/*18.21*/.Assets.at("stylesheets/main.css")),format.raw/*18.55*/("""' rel="stylesheet" alt="cascading" >
</head>



<body>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-1">
		</div>
		<div class="col-md-10">
			<nav class="navbar navbar-inverse">
				<div class="container-fluid">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>                        
						</button>
					</div>
					<div class="collapse navbar-collapse" id="myNavbar">
						<ul class="nav navbar-nav">
							<li """),_display_(/*40.13*/if(title == "Home")/*40.32*/{_display_(Seq[Any](format.raw/*40.33*/(""" """),format.raw/*40.34*/("""class="active";""")))}),format.raw/*40.50*/("""><a href=""""),_display_(/*40.61*/routes/*40.67*/.HomeController.index()),format.raw/*40.90*/("""">Home</a></li>
							<li """),_display_(/*41.13*/if(title == "Products")/*41.36*/{_display_(Seq[Any](format.raw/*41.37*/(""" """),format.raw/*41.38*/("""class="active";""")))}),format.raw/*41.54*/("""><a href=""""),_display_(/*41.65*/routes/*41.71*/.HomeController.prod()),format.raw/*41.93*/("""">Products</a></li>
							<li """),_display_(/*42.13*/if(title == "About")/*42.33*/{_display_(Seq[Any](format.raw/*42.34*/(""" """),format.raw/*42.35*/("""class="active" ;""")))}),format.raw/*42.52*/("""><a href=""""),_display_(/*42.63*/routes/*42.69*/.HomeController.about()),format.raw/*42.92*/("""">About</a></li>
							<li """),_display_(/*43.13*/if(title == "Contact")/*43.35*/{_display_(Seq[Any](format.raw/*43.36*/(""" """),format.raw/*43.37*/("""class="active" ;""")))}),format.raw/*43.54*/("""><a href=""""),_display_(/*43.65*/routes/*43.71*/.HomeController.contact()),format.raw/*43.96*/("""">Contact Us</a></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<!--<li """),_display_(/*46.17*/if(title == "Sign Up")/*46.39*/{_display_(Seq[Any](format.raw/*46.40*/(""" """),format.raw/*46.41*/("""class="active" ;""")))}),format.raw/*46.58*/("""><a href="/signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
							<li """),_display_(/*47.13*/if(title == "Sign In")/*47.35*/{_display_(Seq[Any](format.raw/*47.36*/(""" """),format.raw/*47.37*/("""class="active" ;""")))}),format.raw/*47.54*/("""><a href="/signin"><span class="glyphicon glyphicon-user"></span> Sign In</a></li> -->
							<li """),_display_(/*48.13*/if(title == "Account")/*48.35*/{_display_(Seq[Any](format.raw/*48.36*/("""class = "active";)""")))}),format.raw/*48.55*/("""><a href="/account"><span class="glyphicon glyphicon-user"></span>Account</a></li>
							<li """),_display_(/*49.13*/if(title == "Cart")/*49.32*/{_display_(Seq[Any](format.raw/*49.33*/(""" """),format.raw/*49.34*/("""class="active" ;""")))}),format.raw/*49.51*/("""><a href="/cart"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
						</ul>
					</div> 
				</div>
			</nav>
		</div>
		<div class="col-md-1">
		</div>
	</div>
	<div class="row">
		<div class="container">
            <div class="col-md-1">
            </div>
            <div class="col-md-10">
				"""),_display_(/*63.6*/content),format.raw/*63.13*/("""
            """),format.raw/*64.13*/("""</div>
            <div class="col-md-1">
            </div>
        </div>
	</div>
	</br>
	<div class="row">
		<div id="footer">
			<div class="col-md-1">
			</div>
			<div class="col-md-10">
				<div class="col-md-12">
					<div class="panel-body">
							&copy 2016 SKAS Clothing Inc.
						<div class="footersocial">
							<a href="https://twitter.com/SKASClothing" class="twitter-follow-button" data-show-count="false">Follow SKASClothing</a><script async src="//platform.twitter.com/widgets.js" charset="utf-8"></script>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-1">
			</div>
		</div>
	</div>
</div>
</body>
</html>



"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Dec 12 14:58:59 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/main.scala.html
                  HASH: 03c0f6f349f2f9a763c0f97b58173270192d01f0
                  MATRIX: 1002->260|1127->290|1155->292|1231->341|1257->346|1697->759|1712->765|1767->799|2432->1437|2460->1456|2499->1457|2528->1458|2575->1474|2613->1485|2628->1491|2672->1514|2727->1542|2759->1565|2798->1566|2827->1567|2874->1583|2912->1594|2927->1600|2970->1622|3029->1654|3058->1674|3097->1675|3126->1676|3174->1693|3212->1704|3227->1710|3271->1733|3327->1762|3358->1784|3397->1785|3426->1786|3474->1803|3512->1814|3527->1820|3573->1845|3697->1942|3728->1964|3767->1965|3796->1966|3844->1983|3966->2078|3997->2100|4036->2101|4065->2102|4113->2119|4239->2218|4270->2240|4309->2241|4359->2260|4481->2355|4509->2374|4548->2375|4577->2376|4625->2393|4975->2717|5003->2724|5044->2737
                  LINES: 32->7|37->7|39->9|42->12|42->12|48->18|48->18|48->18|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|71->41|71->41|71->41|71->41|71->41|71->41|71->41|71->41|72->42|72->42|72->42|72->42|72->42|72->42|72->42|72->42|73->43|73->43|73->43|73->43|73->43|73->43|73->43|73->43|76->46|76->46|76->46|76->46|76->46|77->47|77->47|77->47|77->47|77->47|78->48|78->48|78->48|78->48|79->49|79->49|79->49|79->49|79->49|93->63|93->63|94->64
                  -- GENERATED --
              */
          