
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
object carissa extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/Main("carissa")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
   <div class="container">
   <div class="row">
   <div class="col-md-4 pagecontent">
    <div class="well">
        <div class="carissa-img"></div>
        </div>
      </div>
      <div class="col-md-8 pagecontent">
        <div class="well">
        <h1>Carissa Moore</h1>
        <p>2013, Moore is currently leading the 2013 ASP World Tour womens title race (after 3 events). Moore has won 2 ASP World Tour events in 2013, the Drug Aware Margaret River Pro[7] and the Rip Curl Pro Bells Beach.[8]

2012, Moore finished 3rd in the 2012 ASP World Tour, failing to win any ASP World Tour events, coming runner-up in two events.

2011, Moore was declared the ASP Womens World Champion, the youngest winner of the Title.[9] Throughout the 2011 Tour, Moore won the Billabong Rio Pro,[10] Commonwealth Bank Beachley Classic[11] and the Roxy Pro Gold Coast.[12]

2010, Moore was incepted into the ASP Womens World Tour. During her first year on the Tour Moore won both the TSB Bank Womens Surf Festival[13][14] and Rip Curl Pro Portugal.[15] Moores 2010 Womens World Tour Ranking was 3rd overall.[16] and she was awarded the ASP Womens World Tour Rookie of the Year.[17]

Refer to ASP Wildcard Entries section for further information relating Moores involvement prior to being incepted into the ASP Womens World Tour.</p>
   </div>
   </div>
   </div>
""")))})),format.raw/*26.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 09 11:05:11 HST 2013
                    SOURCE: C:/Users/Diana/Desktop/surferpedia/app/views/carissa.scala.html
                    HASH: c8bc0bf0cf942a35392bffdc1040321f432d91de
                    MATRIX: 776->1|887->18|926->23|949->38|988->40|2392->1413
                    LINES: 26->1|29->1|31->3|31->3|31->3|54->26
                    -- GENERATED --
                */
            