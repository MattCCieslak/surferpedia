
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
object laird extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/(""" 

"""),_display_(Seq[Any](/*3.2*/Main("Laird Hamilton")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
<div class="container">
  <div class="row">

    <div class="col-md-4 pagecontent">
      <div class="well">
        <div class="laird-img"></div>
      </div>
    </div>

    <div class="col-md-8">
      <div class="well">
        <h3>Laird Hamilton</h3>
        <p>Laird was born Laird John Zerfas in San Francisco on March 2, 1964, in an experimental salt-water sphere
          at UCSF Medical Center designed to ease the mother's labor. His Greek birth father, L. G. Zerfas, left the
          family before his first birthday. While he was an infant, Laird and his mother, Joann, moved to Hawaii. While
          still a young boy living on Oahu, Laird met with 1960s surfer Bill Hamilton, a bachelor at the time, on
          Pūpūkea beach on the North Shore. Bill Hamilton was a surfboard shaper and glasser on Oahu in the 1960s and
          1970s and owned a small business handmaking custom, high-performance surfboards for the Oahu North Shore big
          wave riders of the era. The two became immediate companions. The young Laird invited Bill Hamilton home to
          meet his mother. Bill Hamilton married Laird's then-single mother, becoming Laird's adoptive father.</p>

        <p>The family later moved to a remote valley on Kauaʻi island. Joann and Bill had a second son, Lyon,
          Laird's half-brother, who also became a surfer. Laird's mother died of a brain aneurysm in 1997.</p>

        <p>Hamilton had a reputation for an aggressive demeanor around others of his age. This hostile attitude was
          in part due to Laird and his brother Lyon being bigger than their classmates, fair-skinned, and blonde:
          unusual in their predominantly Hawaiian-populated neighborhood. The role of the outsider profoundly affected
          Laird through to his teen years and early adult life. He became used to this role and was uncomfortable being
          in the center of anything. He was also known for his physical and mental toughness. Young Laird is shown in
          early video footage jumping off a 60-foot cliff into deep water at 7 years of age.</p>
      </div>
    </div>
  </div>
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
                    DATE: Wed Oct 09 10:52:49 HST 2013
                    SOURCE: C:/Users/Diana/Desktop/surferpedia/app/views/laird.scala.html
                    HASH: ca88c47dff5ec27590cd10932c647b8c87c3bb0a
                    MATRIX: 774->1|885->18|925->24|955->46|994->48|3201->2224
                    LINES: 26->1|29->1|31->3|31->3|31->3|66->38
                    -- GENERATED --
                */
            