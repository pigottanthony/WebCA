
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
		<title>"""),_display_(/*12.11*/title),format.raw/*12.16*/("""</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
		<link rel="stylesheet" href="/resources/demos/style.css">
		<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
		<link href='"""),_display_(/*21.16*/routes/*21.22*/.Assets.at("stylesheets/main.css")),format.raw/*21.56*/("""' rel="stylesheet" alt="cascading" >
		<script>
    $( function() """),format.raw/*23.19*/("""{"""),format.raw/*23.20*/("""
		"""),format.raw/*24.3*/("""$( "#accordion" ).accordion("""),format.raw/*24.31*/("""{"""),format.raw/*24.32*/("""
			"""),format.raw/*25.4*/("""collapsible: true,
			active: false
		"""),format.raw/*27.3*/("""}"""),format.raw/*27.4*/(""");
	"""),format.raw/*28.2*/("""}"""),format.raw/*28.3*/(""" """),format.raw/*28.4*/(""");
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
							<li """),_display_(/*51.13*/if(title == "Home")/*51.32*/{_display_(Seq[Any](format.raw/*51.33*/(""" """),format.raw/*51.34*/("""class="active";""")))}),format.raw/*51.50*/("""><a href=""""),_display_(/*51.61*/routes/*51.67*/.HomeController.index()),format.raw/*51.90*/("""">Home</a></li>
							<li """),_display_(/*52.13*/if(title == "Products")/*52.36*/{_display_(Seq[Any](format.raw/*52.37*/(""" """),format.raw/*52.38*/("""class="active";""")))}),format.raw/*52.54*/("""><a href=""""),_display_(/*52.65*/routes/*52.71*/.HomeController.prod()),format.raw/*52.93*/("""">Products</a></li>
							<li """),_display_(/*53.13*/if(title == "About")/*53.33*/{_display_(Seq[Any](format.raw/*53.34*/(""" """),format.raw/*53.35*/("""class="active" ;""")))}),format.raw/*53.52*/("""><a href=""""),_display_(/*53.63*/routes/*53.69*/.HomeController.about()),format.raw/*53.92*/("""">About</a></li>
							<li """),_display_(/*54.13*/if(title == "Contact")/*54.35*/{_display_(Seq[Any](format.raw/*54.36*/(""" """),format.raw/*54.37*/("""class="active" ;""")))}),format.raw/*54.54*/("""><a href=""""),_display_(/*54.65*/routes/*54.71*/.HomeController.contact()),format.raw/*54.96*/("""">Contact Us</a></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<!--<li """),_display_(/*57.17*/if(title == "Sign Up")/*57.39*/{_display_(Seq[Any](format.raw/*57.40*/(""" """),format.raw/*57.41*/("""class="active" ;""")))}),format.raw/*57.58*/("""><a href="/signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
							<li """),_display_(/*58.13*/if(title == "Sign In")/*58.35*/{_display_(Seq[Any](format.raw/*58.36*/(""" """),format.raw/*58.37*/("""class="active" ;""")))}),format.raw/*58.54*/("""><a href="/signin"><span class="glyphicon glyphicon-user"></span> Sign In</a></li> -->
							<li """),_display_(/*59.13*/if(title == "Account")/*59.35*/{_display_(Seq[Any](format.raw/*59.36*/("""class = "active";)""")))}),format.raw/*59.55*/("""><a href="/account"><span class="glyphicon glyphicon-user"></span>Account</a></li>
							<li """),_display_(/*60.13*/if(title == "Cart")/*60.32*/{_display_(Seq[Any](format.raw/*60.33*/(""" """),format.raw/*60.34*/("""class="active" ;""")))}),format.raw/*60.51*/("""><a href="/cart"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
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
			<div class="col-md-10">
			"""),_display_(/*72.5*/content),format.raw/*72.12*/("""
			"""),format.raw/*73.4*/("""</div>
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
                  DATE: Mon Dec 12 22:55:11 GMT 2016
                  SOURCE: /home/wdd/webapps/thing/webca/app/views/main.scala.html
                  HASH: c9bc2e015f1d74e431d3790042335fd4b97b6669
                  MATRIX: 1002->260|1127->290|1155->292|1233->343|1259->348|1956->1018|1971->1024|2026->1058|2120->1124|2149->1125|2179->1128|2235->1156|2264->1157|2295->1161|2360->1199|2388->1200|2419->1204|2447->1205|2475->1206|3119->1823|3147->1842|3186->1843|3215->1844|3262->1860|3300->1871|3315->1877|3359->1900|3414->1928|3446->1951|3485->1952|3514->1953|3561->1969|3599->1980|3614->1986|3657->2008|3716->2040|3745->2060|3784->2061|3813->2062|3861->2079|3899->2090|3914->2096|3958->2119|4014->2148|4045->2170|4084->2171|4113->2172|4161->2189|4199->2200|4214->2206|4260->2231|4384->2328|4415->2350|4454->2351|4483->2352|4531->2369|4653->2464|4684->2486|4723->2487|4752->2488|4800->2505|4926->2604|4957->2626|4996->2627|5046->2646|5168->2741|5196->2760|5235->2761|5264->2762|5312->2779|5598->3039|5626->3046|5657->3050
                  LINES: 32->7|37->7|39->9|42->12|42->12|51->21|51->21|51->21|53->23|53->23|54->24|54->24|54->24|55->25|57->27|57->27|58->28|58->28|58->28|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|82->52|82->52|82->52|82->52|82->52|82->52|82->52|82->52|83->53|83->53|83->53|83->53|83->53|83->53|83->53|83->53|84->54|84->54|84->54|84->54|84->54|84->54|84->54|84->54|87->57|87->57|87->57|87->57|87->57|88->58|88->58|88->58|88->58|88->58|89->59|89->59|89->59|89->59|90->60|90->60|90->60|90->60|90->60|102->72|102->72|103->73
                  -- GENERATED --
              */
          