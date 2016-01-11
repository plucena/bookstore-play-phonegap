
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
  <head>
    <title>"""),_display_(/*7.13*/title),format.raw/*7.18*/("""</title>
    <link href=""""),_display_(/*8.18*/routes/*8.24*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*8.67*/("""" rel="stylesheet" media="screen">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.at("images/favicon.png")),format.raw/*9.93*/("""">
    <script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.at("javascripts/jquery/jquery-2.1.4.min.js")),format.raw/*10.77*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*11.19*/routes/*11.25*/.Assets.at("javascripts/jquery/jquery.serializejson.js")),format.raw/*11.81*/("""" type="text/javascript"></script>
  
  
  </head>
  
  <body class="container">
    """),_display_(/*17.6*/if(flash.containsKey("success"))/*17.38*/{_display_(Seq[Any](format.raw/*17.39*/("""
      """),format.raw/*18.7*/("""<div class="alert alert-success">
      """),_display_(/*19.8*/flash/*19.13*/.get("success")),format.raw/*19.28*/("""
      """),format.raw/*20.7*/("""</div>
    """)))}),format.raw/*21.6*/("""

    """),_display_(/*23.6*/if(flash.containsKey("error"))/*23.36*/{_display_(Seq[Any](format.raw/*23.37*/("""
      """),format.raw/*24.7*/("""<div class="alert alert-error">
      """),_display_(/*25.8*/flash/*25.13*/.get("error")),format.raw/*25.26*/("""
      """),format.raw/*26.7*/("""</div>
    """)))}),format.raw/*27.6*/("""
    
    """),format.raw/*29.5*/("""<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">BookStore</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="/BookNew">Novo Livro</a></li>
        <li><a href="/BookList">Listar Livros</a></li>
        
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
    
  """),_display_(/*53.4*/content),format.raw/*53.11*/("""
  """),format.raw/*54.3*/("""</body>
</html>"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jan 11 12:11:01 BRST 2016
                  SOURCE: /Users/percivalslucena/loja/webservices/app/views/main.scala.html
                  HASH: 05dab7162d729c28c93982c6567644eb3710b825
                  MATRIX: 727->1|845->31|873->33|944->78|969->83|1021->109|1035->115|1098->158|1213->247|1227->253|1279->285|1327->306|1342->312|1415->364|1495->417|1510->423|1587->479|1699->565|1740->597|1779->598|1813->605|1880->646|1894->651|1930->666|1964->673|2006->685|2039->692|2078->722|2117->723|2151->730|2216->769|2230->774|2264->787|2298->794|2340->806|2377->816|3373->1786|3401->1793|3431->1796
                  LINES: 26->1|29->1|31->3|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|49->21|51->23|51->23|51->23|52->24|53->25|53->25|53->25|54->26|55->27|57->29|81->53|81->53|82->54
                  -- GENERATED --
              */
          