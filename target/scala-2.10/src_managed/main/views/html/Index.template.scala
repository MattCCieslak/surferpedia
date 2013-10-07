
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
object Index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/Main("Home")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
   <div id="main-carousel" class="carousel slide">
     <ol class="carousel-indicators">
        <li data-target="#main-carousel" data-slide-to="0" class="active"></li>
        <li data-target="#main-carousel" data-slide-to="1"></li>
        <li data-target="#main-carousel" data-slide-to="2"></li>
        <li data-target="#main-carousel" data-slide-to="3"></li>
     </ol>
     
     <div class="carousel-inner">
        <div class="item active">
            <div class="carousel-1"></div>
            <div class="carousel-caption"><h3>Jeff Hakman</h3></div>
        </div>
        
        <div class="item">
            <div class="carousel-2"></div>
            <div class="carousel-caption"><h3>Stephanie Gilmore</h3></div>
        </div>
        
        <div class="item">
            <div class="carousel-3"></div>
            <div class="carousel-caption"><h3>Kanoa Igarashi</h3></div>
        </div>
        
        <div class="item">
            <div class="carousel-4"></div>
            <div class="carousel-caption"><h3>Jake Marshall</h3></div>
        </div>
     </div>
     
     
     <a class="left carousel-control" href="#main-carousel" data-slide="prev"><span class="icon-prev"></span></a>
     <a class="right carousel-control" href="#main-carousel" data-slide="next"><span class="icon-next"></span></a>
   </div>
""")))})),format.raw/*38.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 06 20:16:01 HST 2013
                    SOURCE: C:/Users/Diana/Documents/GitHub/surferpedia/app/views/Index.scala.html
                    HASH: 0720499f88c37e3585243f3becd508bdfdc06dd0
                    MATRIX: 774->1|885->18|924->23|944->35|983->37|2390->1413
                    LINES: 26->1|29->1|31->3|31->3|31->3|66->38
                    -- GENERATED --
                */
            