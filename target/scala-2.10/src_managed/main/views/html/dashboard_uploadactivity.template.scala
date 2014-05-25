
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
object dashboard_uploadactivity extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""

"""),_display_(Seq[Any](/*3.2*/main("Add User")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""

  <nav class="ui inverted menu">
    <div class="header item"> <a href="/"> Pacemaker </a> </div>
    <div class="right menu">
      <a class="item" href="/dashboard"> Dashboard</a>
      <a class="active item" href="/upload">  Upload</a>
      <a class="item" href="/logout">  Logout</a>
    </div>
  </nav>  
  
 <section class="ui raised segment">
   <div class="ui grid">
     <aside class="ui six wide column">
       <img src=""""),_display_(Seq[Any](/*17.19*/routes/*17.25*/.Assets.at("images/pacemaker.jpg"))),format.raw/*17.59*/("""" class="ui medium image">
     </aside>
     <div class="ui ten wide column fluid form">
       <div class="ui stacked segment">
         <form action="/submitactivity" method="POST">
           <h3 class="ui header">Enter Activity Details: </h3>
           <div class="field">
             <label>Type</label>
             <input type="text" name="kind">
           </div>
           <div class="field">
             <label>Location</label>
             <input type="text" name="location">
           </div>
         <div class="field">
             <label>Distance</label>
             <input type="number" name="distance">
           </div>           
           <button class="ui blue submit button"> Upload </button>
         </form>
       </div>
     </div>
   </div>
</section>
""")))})),format.raw/*41.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 03 13:28:08 BST 2014
                    SOURCE: G:/workspacedpatterns/pacemakerplay_v2/app/views/dashboard_uploadactivity.scala.html
                    HASH: 2b7d47009268cc52de6950b978a5724442d9599f
                    MATRIX: 786->1|881->3|918->6|942->22|981->24|1453->460|1468->466|1524->500|2343->1288
                    LINES: 26->1|29->1|31->3|31->3|31->3|45->17|45->17|45->17|69->41
                    -- GENERATED --
                */
            