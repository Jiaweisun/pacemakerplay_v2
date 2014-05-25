
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
object accounts_login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Pacemaker")/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""
  """),_display_(Seq[Any](/*4.4*/welcome_menu())),format.raw/*4.18*/("""
  
 <section class="ui raised segment">
   <div class="ui grid">
     <aside class="ui six wide column">
      <img src=""""),_display_(Seq[Any](/*9.18*/routes/*9.24*/.Assets.at("images/pacemaker.jpg"))),format.raw/*9.58*/("""" class="ui medium image">
     </aside>
     <div class="ui ten wide column fluid form">
       <div class="ui stacked segment">
         <form action="/authenticate" method="POST">
           <h3 class="ui header">Log-in</h3>
           <div class="field">
             <label>Email</label>
             <input placeholder="Email" type="text" name="email">
           </div>
           <div class="field">
             <label>Password</label>
             <input type="password" name="password">
           </div>
           <button class="ui blue submit button">Login</button>
         </form>
       </div>
     </div>
   </div>
</section>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 03 13:28:08 BST 2014
                    SOURCE: G:/workspacedpatterns/pacemakerplay_v2/app/views/accounts_login.scala.html
                    HASH: 4c6c01ed9b2c23f55909d2eed1cfdaf36250ae2b
                    MATRIX: 776->1|871->3|908->6|944->34|983->36|1021->40|1056->54|1214->177|1228->183|1283->217
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|37->9|37->9|37->9
                    -- GENERATED --
                */
            