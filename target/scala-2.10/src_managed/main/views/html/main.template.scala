
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""
<!DOCTYPE html>
<html>
	<head>
	  <title>"""),_display_(Seq[Any](/*5.12*/title)),format.raw/*5.17*/("""</title>
	  <meta charset="utf-8">
	  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    
	  <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*10.50*/routes/*10.56*/.Assets.at("semantic/css/semantic.css"))),format.raw/*10.95*/("""">
	  <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*11.50*/routes/*11.56*/.Assets.at("stylesheets/main.css"))),format.raw/*11.90*/("""">
	  <link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:400,700|Open+Sans:300italic,400,300,700' rel='stylesheet' type='text/css'>
    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*13.55*/routes/*13.61*/.Assets.at("images/favicon.png"))),format.raw/*13.93*/("""">
    
    <script src=""""),_display_(Seq[Any](/*15.19*/routes/*15.25*/.Assets.at("javascripts/jquery-2.0.3.min.js"))),format.raw/*15.70*/(""""></script> 
    <script src=""""),_display_(Seq[Any](/*16.19*/routes/*16.25*/.Assets.at("semantic/javascript/semantic.min.js"))),format.raw/*16.74*/(""""></script> 
	</head>
    
  <body> 
    """),_display_(Seq[Any](/*20.6*/content)),format.raw/*20.13*/("""
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 03 13:28:08 BST 2014
                    SOURCE: G:/workspacedpatterns/pacemakerplay_v2/app/views/main.scala.html
                    HASH: 3a36e0c4be878f4114203d721fa7c6f22678d7aa
                    MATRIX: 778->1|902->31|980->74|1006->79|1292->329|1307->335|1368->374|1456->426|1471->432|1527->466|1765->668|1780->674|1834->706|1896->732|1911->738|1978->783|2045->814|2060->820|2131->869|2208->911|2237->918
                    LINES: 26->1|29->1|33->5|33->5|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|43->15|43->15|43->15|44->16|44->16|44->16|48->20|48->20
                    -- GENERATED --
                */
            