
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
object Kanoa extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/Main("kanoa")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
   <div class="container">
   <div class="row">
   <div class="col-md-4 pagecontent">
    <div class="well">
        <div class="kanoa-img"></div>
        </div>
      </div>
      <div class="col-md-8 pagecontent">
        <div class="well">
        <h1>Kanoa Igarashi</h1>
        <p>Kanoa Igarashi is huge in Japan. Although he was born in Santa Monica, California on October 1, 1997, Igarashi spends time in Japan where he is a celebrity of sorts. With local news coverage and autograph seekers, he gets the full star treatment when visiting family and trying to grab a few hours for surf sessions. Although Japan would love to claim this so-called surfing “prodigy,” Igarashi looks to be leading America’s next generation of surfing world title contenders.
Kanoa Igarashi started surfing at three years old when his dad gave him a few shoves into waves on Huntington Pier’s North Side (a decade and countless surf trips later, he calls the pier’s South Side his favorite wave). He got his first board the same year: a Town and Country “longboard” (or what seemed a longboard to a three year old). Igarashi got his first sponsor when was seven. He was stoked to be part of the Huntington Surf and Sport team. Within a few scant years, Igarashi was winning national events, breaking records, and galvanizing American surf jounos to coin him the next “Slater.” However, no matter how meteoric his climb to local, national, and soon global recognition appeared, the pint sized regular footer kept his focus like a laser by staying obsessed with the sport and art of surfing like only a super stoked pre-teen can.</p>
   </div>
   </div>
   </div>
""")))})),format.raw/*19.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 06 18:29:59 HST 2013
                    SOURCE: /home/matt/workspace/surferpedia/app/views/Kanoa.scala.html
                    HASH: 6e09fd57868091d3031633fb93c063bcca48520b
                    MATRIX: 774->1|885->18|922->21|943->34|982->36|2663->1686
                    LINES: 26->1|29->1|31->3|31->3|31->3|47->19
                    -- GENERATED --
                */
            