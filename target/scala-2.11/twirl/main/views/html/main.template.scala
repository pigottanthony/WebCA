
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
	<head>
		<title>"""),_display_(/*6.11*/title),format.raw/*6.16*/("""</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
		<link rel="stylesheet" href="/resources/demos/style.css">
		<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
		<link href='"""),_display_(/*15.16*/routes/*15.22*/.Assets.at("stylesheets/main.css")),format.raw/*15.56*/("""' rel="stylesheet" alt="cascading" >
		<script>
    $( function() """),format.raw/*17.19*/("""{"""),format.raw/*17.20*/("""
		"""),format.raw/*18.3*/("""$( "#accordion" ).accordion("""),format.raw/*18.31*/("""{"""),format.raw/*18.32*/("""
			"""),format.raw/*19.4*/("""collapsible: true,
			active: false
		"""),format.raw/*21.3*/("""}"""),format.raw/*21.4*/(""");
	"""),format.raw/*22.2*/("""}"""),format.raw/*22.3*/(""" """),format.raw/*22.4*/(""");
  </script>
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
							<li """),_display_(/*45.13*/if(title == "Home")/*45.32*/{_display_(Seq[Any](format.raw/*45.33*/(""" """),format.raw/*45.34*/("""class="active";""")))}),format.raw/*45.50*/("""><a href=""""),_display_(/*45.61*/routes/*45.67*/.HomeController.index()),format.raw/*45.90*/("""">Home</a></li>
							<li """),_display_(/*46.13*/if(title == "Products")/*46.36*/{_display_(Seq[Any](format.raw/*46.37*/(""" """),format.raw/*46.38*/("""class="active";""")))}),format.raw/*46.54*/("""><a href=""""),_display_(/*46.65*/routes/*46.71*/.HomeController.prod()),format.raw/*46.93*/("""">Products</a></li>
							<li """),_display_(/*47.13*/if(title == "About")/*47.33*/{_display_(Seq[Any](format.raw/*47.34*/(""" """),format.raw/*47.35*/("""class="active" ;""")))}),format.raw/*47.52*/("""><a href=""""),_display_(/*47.63*/routes/*47.69*/.HomeController.about()),format.raw/*47.92*/("""">About</a></li>
							<li """),_display_(/*48.13*/if(title == "Contact")/*48.35*/{_display_(Seq[Any](format.raw/*48.36*/(""" """),format.raw/*48.37*/("""class="active" ;""")))}),format.raw/*48.54*/("""><a href=""""),_display_(/*48.65*/routes/*48.71*/.HomeController.contact()),format.raw/*48.96*/("""">Contact Us</a></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<!--<li """),_display_(/*51.17*/if(title == "Sign Up")/*51.39*/{_display_(Seq[Any](format.raw/*51.40*/(""" """),format.raw/*51.41*/("""class="active" ;""")))}),format.raw/*51.58*/("""><a href="/signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
							<li """),_display_(/*52.13*/if(title == "Sign In")/*52.35*/{_display_(Seq[Any](format.raw/*52.36*/(""" """),format.raw/*52.37*/("""class="active" ;""")))}),format.raw/*52.54*/("""><a href="/signin"><span class="glyphicon glyphicon-user"></span> Sign In</a></li> -->
							"""),_display_(/*53.9*/if(user == null)/*53.25*/ {_display_(Seq[Any](format.raw/*53.27*/("""
								"""),format.raw/*54.9*/("""<li """),_display_(/*54.14*/if(title == "Login")/*54.34*/ {_display_(Seq[Any](format.raw/*54.36*/("""class = "active";)""")))}),format.raw/*54.55*/("""><a href=""""),_display_(/*54.66*/routes/*54.72*/.LoginController.login()),format.raw/*54.96*/(""""><span class="glyphicon glyphicon-user"></span>
									Account</a> </li>
								<li """),_display_(/*56.14*/if(title == "Cart")/*56.33*/ {_display_(Seq[Any](format.raw/*56.35*/("""
									"""),format.raw/*57.10*/("""class="active" ;""")))}),format.raw/*57.27*/("""><a href=""""),_display_(/*57.38*/routes/*57.44*/.HomeController.cart()),format.raw/*57.66*/(""""><span class="glyphicon glyphicon-shopping-cart"></span>
									Cart</a></li>
							""")))}/*59.9*/else/*59.13*/{_display_(Seq[Any](format.raw/*59.14*/("""
								"""),format.raw/*60.9*/("""<li class="dropdown">
									<a class="dropdown-toggle" data-toggle="dropdown" href="#">"""),_display_(/*61.70*/user/*61.74*/.getName),format.raw/*61.82*/("""
										"""),format.raw/*62.11*/("""<span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li><a href=""""),_display_(/*64.25*/routes/*64.31*/.HomeController.addProduct()),format.raw/*64.59*/("""">Add Product</a></li>
										<li><a href=""""),_display_(/*65.25*/routes/*65.31*/.LoginController.logout()),format.raw/*65.56*/("""">Logout</a></li>
									</ul>
								</li>
                                <li """),_display_(/*68.38*/if(title == "Cart")/*68.57*/ {_display_(Seq[Any](format.raw/*68.59*/("""
                                    """),format.raw/*69.37*/("""class="active" ;""")))}),format.raw/*69.54*/("""><a href=""""),_display_(/*69.65*/routes/*69.71*/.HomeController.cart()),format.raw/*69.93*/(""""><span class="glyphicon glyphicon-shopping-cart"></span>
                                    Cart</a>
                                </li>
							""")))}),format.raw/*72.9*/("""
						"""),format.raw/*73.7*/("""</ul>
					</div> 
				</div>
			</nav>
		</div>
		<div class="col-md-1">
		</div>
	</div>
	<div class="row">
		<div class="container">
			<div class="col-md-10">
			"""),_display_(/*84.5*/content),format.raw/*84.12*/("""
			"""),format.raw/*85.4*/("""</div>
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

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 12:55:10 GMT 2016
                  SOURCE: /home/wdd/webapps/webca/app/views/main.scala.html
                  HASH: 2f47ae8684a87dbce03f9fce76929f3e7ff6226c
                  MATRIX: 766->1|916->56|944->58|1021->109|1046->114|1743->784|1758->790|1813->824|1907->890|1936->891|1966->894|2022->922|2051->923|2082->927|2147->965|2175->966|2206->970|2234->971|2262->972|2906->1589|2934->1608|2973->1609|3002->1610|3049->1626|3087->1637|3102->1643|3146->1666|3201->1694|3233->1717|3272->1718|3301->1719|3348->1735|3386->1746|3401->1752|3444->1774|3503->1806|3532->1826|3571->1827|3600->1828|3648->1845|3686->1856|3701->1862|3745->1885|3801->1914|3832->1936|3871->1937|3900->1938|3948->1955|3986->1966|4001->1972|4047->1997|4171->2094|4202->2116|4241->2117|4270->2118|4318->2135|4440->2230|4471->2252|4510->2253|4539->2254|4587->2271|4708->2366|4733->2382|4773->2384|4809->2393|4841->2398|4870->2418|4910->2420|4960->2439|4998->2450|5013->2456|5058->2480|5174->2569|5202->2588|5242->2590|5280->2600|5328->2617|5366->2628|5381->2634|5424->2656|5531->2745|5544->2749|5583->2750|5619->2759|5737->2850|5750->2854|5779->2862|5818->2873|5937->2965|5952->2971|6001->2999|6075->3046|6090->3052|6136->3077|6247->3161|6275->3180|6315->3182|6380->3219|6428->3236|6466->3247|6481->3253|6524->3275|6703->3424|6737->3431|6930->3598|6958->3605|6989->3609
                  LINES: 27->1|32->1|34->3|37->6|37->6|46->15|46->15|46->15|48->17|48->17|49->18|49->18|49->18|50->19|52->21|52->21|53->22|53->22|53->22|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|77->46|77->46|77->46|77->46|77->46|77->46|77->46|77->46|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|79->48|79->48|79->48|79->48|79->48|79->48|79->48|79->48|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|90->59|90->59|90->59|91->60|92->61|92->61|92->61|93->62|95->64|95->64|95->64|96->65|96->65|96->65|99->68|99->68|99->68|100->69|100->69|100->69|100->69|100->69|103->72|104->73|115->84|115->84|116->85
                  -- GENERATED --
              */
          