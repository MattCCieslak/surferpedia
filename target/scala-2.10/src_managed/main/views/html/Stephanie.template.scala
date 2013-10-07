
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
object Stephanie extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/Main("stephanie")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
   <div class="container">
   <div class="row">
   <div class="col-md-4 pagecontent">
    <div class="well">
        <div class="stephanie-img"></div>
        </div>
      </div>
      <div class="col-md-8 pagecontent">
        <div class="well">
        <h1>Stephanie Gilmore</h1>
        <p>Stephanie Louise Gilmore is an Australian professional surfer and five-time world champion on the Women's ASP World Tour (2007, 2008, 2009, 2010, 2012). She was born in Murwillumbah, New South Wales, Australia on 29 January 1988 and currently resides in Tweed Heads, New South Wales, Australia.
Gilmore's life as a surfer began at age 10 when she stood on a bodyboard. By age 17 she was entering world tour events as a wild card competitor, which paid off with a victory at the 2005 Roxy Pro Gold Coast. In her next season she won another wild card event, the 2006 Havaianas Beachley Classic. Gilmore's success on the WQS (World Qualifying Series) tour qualified her for the 2007 Women's ASP World Tour and she did not disappoint. She won four of the eight events and claimed the 2007 World Title. She would repeat her success in 2008, 2009 and 2010.</p>
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
                    SOURCE: /home/matt/workspace/surferpedia/app/views/Stephanie.scala.html
                    HASH: cfed2ed49943651cc765958be4a30e41652660b5
                    MATRIX: 778->1|889->18|926->21|951->38|990->40|2201->1220
                    LINES: 26->1|29->1|31->3|31->3|31->3|47->19
                    -- GENERATED --
                */
            