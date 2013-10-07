
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
                </ul>
            </li>

            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">Females<b class="caret"></b></a>
                <ul class="dropdown-menu" role="menu">
                    <li><a href=""""),_display_(Seq[Any](/*45.35*/routes/*45.41*/.Application.stephanie())),format.raw/*45.65*/("""">Stephanie Gilmore</a></li>
                </ul>
            </li>

            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">Groms<b class="caret"></b></a>
                <ul class="dropdown-menu" role="menu">
                    <li><a href=""""),_display_(Seq[Any](/*52.35*/routes/*52.41*/.Application.kanoa())),format.raw/*52.61*/("""">Kanoa Igarashi</a><a href=""""),_display_(Seq[Any](/*52.91*/routes/*52.97*/.Application.jake())),format.raw/*52.116*/("""">Jake Marshall</a></li>
                </ul>
            </li>
        </ul>
      </div>
    </div>
  </div>
      """),_display_(Seq[Any](/*59.8*/content)),format.raw/*59.15*/("""
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
                    DATE: Sun Oct 06 20:16:01 HST 2013
                    SOURCE: C:/Users/Diana/Documents/GitHub/surferpedia/app/views/Main.scala.html
                    HASH: 18123322dc13d377102a4fb5a0b54ce51019c4b5
                    MATRIX: 778->1|901->30|1338->431|1353->437|1409->471|1507->533|1522->539|1576->571|2874->1833|2889->1839|2930->1858|3268->2160|3283->2166|3329->2190|3671->2496|3686->2502|3728->2522|3794->2552|3809->2558|3851->2577|4012->2703|4041->2710
                    LINES: 26->1|29->1|40->12|40->12|40->12|41->13|41->13|41->13|66->38|66->38|66->38|73->45|73->45|73->45|80->52|80->52|80->52|80->52|80->52|80->52|87->59|87->59
                    -- GENERATED --
                */
            