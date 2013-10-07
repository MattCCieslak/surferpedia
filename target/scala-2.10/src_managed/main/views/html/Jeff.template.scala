
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
object Jeff extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/Main("jeff")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
   <div class="container">
   <div class="row">
   <div class="col-md-4 pagecontent">
    <div class="well">
        <div class="jeff-img"></div>
        </div>
      </div>
      <div class="col-md-8 pagecontent">
        <div class="well">
        <h1>Jeff Hakman</h1>
        <p>Jeffrey "Jeff" Hakman is an ex-world surfing champion who together with friend Bob McKnight convinced Alan Green, the founder of Quiksilver (then a small surf company from Torquay, Australia) to allow them the rights to trade the name in America in 1976.
Hakman started surfing in 1956 at age eight in Palos Verdes, California and at the age of ten moved to Hawaii with his parents. He surfed Waimea Bay at fourteen years old and at seventeen won the prestigious surfing title, Duke Kahanamoku Invitational Surfing Championship. Hakman graduated from Punahou School in 1967. From twenty-one to twenty-seven he won the most major surfing titles in the world including the first Pipe Masters at Banzai Pipeline, 1976 Bells Beach and was the unofficial World Champion in 1974 and 1975.
In 1976 Jeff founded Quiksilver America with Bob McKnight and in 1984 founded Quiksilver Europe with Harry Hodge, Brigitte Darrigrand and John Winship. He is currently the Marketing Director for NaPali SA (Quiksilver) in France. He is a 2009 inductee into the Surfers' Hall of Fame in Huntington Beach, California.</p>
   </div>
   </div>
   </div>
""")))})),format.raw/*20.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 07 10:56:41 HST 2013
                    SOURCE: /home/taylorak/Programming/Play/mattcieslak/surferpedia/app/views/Jeff.scala.html
                    HASH: 1c3304677d919118d2e72b7b1a84218af6e6319b
                    MATRIX: 773->1|884->18|921->21|941->33|980->35|2427->1451
                    LINES: 26->1|29->1|31->3|31->3|31->3|48->20
                    -- GENERATED --
                */
            