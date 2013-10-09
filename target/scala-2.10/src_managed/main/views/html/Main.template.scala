
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object Main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(page: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.31*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Surferpedia</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        
        <!--  Load site-specific customizations after bootstrap. -->
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.54*/routes/*12.60*/.Assets.at("stylesheets/main.css"))),format.raw/*12.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*13.59*/routes/*13.65*/.Assets.at("images/favicon.png"))),format.raw/*13.97*/("""">
        
        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.2/html5shiv.js"></script>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.2.0/respond.js"></script>
        <![endif]-->
    </head>
    <body>
    <div class="header"></div>
     <!-- Responsive navbar -->
  <div class="navbar navbar-inverse" role="navigation">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <!--  Display three horizontal lines when navbar collapsed. -->
          <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="/">Surferpedia</a>
      </div>
      <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav">
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">Males<b class="caret"></b></a>
                <ul class="dropdown-menu" role="menu">
                    <li><a href=""""),_display_(Seq[Any](/*38.35*/routes/*38.41*/.Application.jeff())),format.raw/*38.60*/("""">Jeff Hakman</a></li>
                    <li><a href=""""),_display_(Seq[Any](/*39.35*/routes/*39.41*/.Application.laird())),format.raw/*39.61*/("""">Laird Hamilton</a></li>
                    
                </ul>
            </li>

            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">Females<b class="caret"></b></a>
                <ul class="dropdown-menu" role="menu">
                    <li><a href=""""),_display_(Seq[Any](/*47.35*/routes/*47.41*/.Application.stephanie())),format.raw/*47.65*/("""">Stephanie Gilmore</a></li>
                    <li><a href=""""),_display_(Seq[Any](/*48.35*/routes/*48.41*/.Application.carissa())),format.raw/*48.63*/("""">Carissa Moore</a></li>
                </ul>
            </li>

            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">Groms<b class="caret"></b></a>
                <ul class="dropdown-menu" role="menu">
                    <li><a href=""""),_display_(Seq[Any](/*55.35*/routes/*55.41*/.Application.kanoa())),format.raw/*55.61*/("""">Kanoa Igarashi</a><a href=""""),_display_(Seq[Any](/*55.91*/routes/*55.97*/.Application.jake())),format.raw/*55.116*/("""">Jake Marshall</a></li>
                </ul>
            </li>
            
            
        </ul>
      </div>
    </div>
  </div>
      """),_display_(Seq[Any](/*64.8*/content)),format.raw/*64.15*/("""
      <!-- Load Bootstrap JavaScript components. HTMLUnit (used in testing) requires JQuery 1.8.3 or below). -->
      <script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
      <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
    </body>
</html>
"""))}
    }
    
    def render(page:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(page)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (page) => (content) => apply(page)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 09 11:01:40 HST 2013
                    SOURCE: C:/Users/Diana/Desktop/surferpedia/app/views/Main.scala.html
                    HASH: 3db698b78fc31ef0094f797d2e8547be07a5d0cf
                    MATRIX: 778->1|901->30|1338->431|1353->437|1409->471|1507->533|1522->539|1576->571|2874->1833|2889->1839|2930->1858|3024->1916|3039->1922|3081->1942|3444->2269|3459->2275|3505->2299|3605->2363|3620->2369|3664->2391|4002->2693|4017->2699|4059->2719|4125->2749|4140->2755|4182->2774|4371->2928|4400->2935
                    LINES: 26->1|29->1|40->12|40->12|40->12|41->13|41->13|41->13|66->38|66->38|66->38|67->39|67->39|67->39|75->47|75->47|75->47|76->48|76->48|76->48|83->55|83->55|83->55|83->55|83->55|83->55|92->64|92->64
                    -- GENERATED --
                */
            