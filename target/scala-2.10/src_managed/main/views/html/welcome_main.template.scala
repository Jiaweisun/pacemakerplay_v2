
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
object welcome_main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Pacemaker")/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""
  """),_display_(Seq[Any](/*4.4*/welcome_menu())),format.raw/*4.18*/("""
    
<section class="ui raised segment">
  <div class="ui grid">
    <aside class="six wide column">
      <img src=""""),_display_(Seq[Any](/*9.18*/routes/*9.24*/.Assets.at("images/pacemaker.jpg"))),format.raw/*9.58*/("""" class="ui medium image">
    </aside>
    <article class="ten wide column">
      <h1 class="ui  header"> Sign up for Pacemaker  </h1>
      <p> No Bitcoins accepted! </p>
    </article>
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
                    SOURCE: G:/workspacedpatterns/pacemakerplay_v2/app/views/welcome_main.scala.html
                    HASH: abcf9e6361ad255076bf3b24442b37396c21eb16
                    MATRIX: 774->1|869->3|906->6|942->34|981->36|1019->40|1054->54|1208->173|1222->179|1277->213
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|37->9|37->9|37->9
                    -- GENERATED --
                */
            