
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
object jake extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/Main("jake")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
   <div class="container">
   <div class="row">
   <div class="col-md-4 pagecontent">
    <div class="well">
        <div class="jake-img"></div>
        </div>
      </div>
      <div class="col-md-8 pagecontent">
        <div class="well">
        <h1>Jake Marshall</h1>
        <p>Many young surfers have the potential to make an impact on our sport, but none look more poised to do so than Jake Marshall. Raised on the rippable beachbreaks and reefs of San Diego's North County, Jake has developed a solid base of smooth rail work as well as the kind of flair that few 14-year-old surfers can match. His progression is due in no small part to the numerous world-class talents in his neighborhood that have taught him a thing or two about tearing Seaside apart. I see Rob Machado, Josh Kerr, Damien Hobgood, and Taylor Knox out all the time, and it's really fun to surf with guys on that level, says Jake. I look at them and think, That's how I have to surf if I want to make the Tour one day. That really helps me push my limits.Already, had remarkable success in a jersey, including a recent win at the U.S. Surfing Championships at Lower Trestles. But while surf stardom seems inevitable for Jake, still just a kid, and knows where his priorities should be. â€œI surf and try to improve all the time, but I still put a lot of emphasis on school,â€ says Jake. â€œI know that education is really important, and if surfing doesn't work out, it's always good to have a backup plan</p>
   </div>
   </div>
   </div>
""")))})),format.raw/*18.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 09 10:52:49 HST 2013
                    SOURCE: C:/Users/Diana/Desktop/surferpedia/app/views/jake.scala.html
                    HASH: 81ca2bae2c67fb82da996c0ff6eb562053d81b86
                    MATRIX: 773->1|884->18|923->23|943->35|982->37|2549->1573
                    LINES: 26->1|29->1|31->3|31->3|31->3|46->18
                    -- GENERATED --
                */
            