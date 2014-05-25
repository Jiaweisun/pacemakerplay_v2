
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
object accounts_signup extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Pacemaker")/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""
  """),_display_(Seq[Any](/*4.4*/welcome_menu())),format.raw/*4.18*/("""

<section class="ui raised segment">
  <div class="ui grid">
    <div class="ui ten wide column">
      <div class="ui stacked fluid form segment">
        <form action="/register" method="POST">
          <h3 class="ui header">Register</h3>
          <div class="two fields">
            <div class="field">
              <label>First Name</label>
              <input placeholder="First Name" type="text" name="firstname">
            </div>
            <div class="field">
              <label>Last Name</label>
              <input placeholder="Last Name" type="text" name="lastname">
            </div>
          </div>
          <div class="field">
            <label>Email</label>
            <input placeholder="Email" type="text" name="email">
          </div>
          <div class="field">
            <label>Password</label>
            <input type="password" name="password">
          </div>
          <button class="ui blue submit button">Submit</button>
        </form>
      </div>  
    </div>
    <aside class="ui five wide column">
      <img src=""""),_display_(Seq[Any](/*35.18*/routes/*35.24*/.Assets.at("images/pacemaker.jpg"))),format.raw/*35.58*/("""" class="ui medium image">
    </aside>
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
                    SOURCE: G:/workspacedpatterns/pacemakerplay_v2/app/views/accounts_signup.scala.html
                    HASH: 2a03d0dfad07b0bbdfa9fd30e6157e2b8e11989e
                    MATRIX: 777->1|872->3|909->6|945->34|984->36|1022->40|1057->54|2162->1123|2177->1129|2233->1163
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|63->35|63->35|63->35
                    -- GENERATED --
                */
            