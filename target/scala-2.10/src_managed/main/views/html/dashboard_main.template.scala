
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
object dashboard_main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Activity],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(activities: List[Activity]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.30*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Pacemaker")/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""

  <nav class="ui inverted menu">
    <div class="header item"> <a href="/"> Pacemaker </a> </div>
    <div class="right menu">
      <a class="active item" href="/dashboard"> Dashboard</a>
      <a class="item" href="/upload">  Upload</a>
      <a class="item" href="/logout">  Logout</a>
    </div>
  </nav>    
  
  <section class="ui raised segment">
    <div class="ui grid">
      <aside class="six wide column">
        <img src=""""),_display_(Seq[Any](/*17.20*/routes/*17.26*/.Assets.at("images/pacemaker.jpg"))),format.raw/*17.60*/("""" class="ui medium image">
      </aside>
      <article class="eight wide column">
        <h3> <class="ui header"> Activities </h3>
        <table class="ui celled table segment">
          <thead>
            <tr>
              <th>Type</th>
              <th>Location</th>
              <th>Distance</th>
            </tr>
          </thead>
          <tbody>
  		      """),_display_(Seq[Any](/*30.12*/for(i <- 0 until activities.size) yield /*30.45*/ {_display_(Seq[Any](format.raw/*30.47*/("""
  		        <tr>
  		          <td> """),_display_(Seq[Any](/*32.21*/activities(i)/*32.34*/.kind)),format.raw/*32.39*/(""" </td> <td> """),_display_(Seq[Any](/*32.52*/activities(i)/*32.65*/.location)),format.raw/*32.74*/(""" </td> <td> """),_display_(Seq[Any](/*32.87*/activities(i)/*32.100*/.distance)),format.raw/*32.109*/(""" </td> 
  		        </tr>
  		      """)))})),format.raw/*34.12*/("""
          </tbody>
        </table>
      </article>
    </div>
  </section>
""")))})))}
    }
    
    def render(activities:List[Activity]): play.api.templates.HtmlFormat.Appendable = apply(activities)
    
    def f:((List[Activity]) => play.api.templates.HtmlFormat.Appendable) = (activities) => apply(activities)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 03 13:28:08 BST 2014
                    SOURCE: G:/workspacedpatterns/pacemakerplay_v2/app/views/dashboard_main.scala.html
                    HASH: e64b3db22c8b4ad6dc66dfb192b741d29e319044
                    MATRIX: 791->1|913->29|950->32|986->60|1025->62|1500->501|1515->507|1571->541|1982->916|2031->949|2071->951|2145->989|2167->1002|2194->1007|2243->1020|2265->1033|2296->1042|2345->1055|2368->1068|2400->1077|2469->1114
                    LINES: 26->1|29->1|31->3|31->3|31->3|45->17|45->17|45->17|58->30|58->30|58->30|60->32|60->32|60->32|60->32|60->32|60->32|60->32|60->32|60->32|62->34
                    -- GENERATED --
                */
            