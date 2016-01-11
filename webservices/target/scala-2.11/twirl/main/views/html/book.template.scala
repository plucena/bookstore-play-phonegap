
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
object book extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[model.vo.Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(books: List[model.vo.Book]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.30*/("""
"""),_display_(/*2.2*/main("Lista de Livros")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""


"""),format.raw/*5.1*/("""<script type="text/javascript">
    
    function apagar(id) """),format.raw/*7.25*/("""{"""),format.raw/*7.26*/("""
       """),format.raw/*8.8*/("""var durl = '/Book/' + id; 
        $.ajax("""),format.raw/*9.16*/("""{"""),format.raw/*9.17*/("""
        """),format.raw/*10.9*/("""url: durl,
        type: 'DELETE',
       """),format.raw/*12.8*/("""}"""),format.raw/*12.9*/(""");
       location.reload(); 
    """),format.raw/*14.5*/("""}"""),format.raw/*14.6*/("""
"""),format.raw/*15.1*/("""</script>


 <h2>Livros</h2>

   <table class="table table-striped">
    <thead>
      <tr class="info">
        <th>id</th>
        <th>author</th>
        <th>collection</th>
        <th>other</th>
        <th>title</th>
        <th>reader</th>
        <th>action</th>
      </tr>
    </thead>
    <tbody>
    
    """),_display_(/*34.6*/for(book <- books) yield /*34.24*/ {_display_(Seq[Any](format.raw/*34.26*/("""
      """),format.raw/*35.7*/("""<tr>
        <td><a href="XXX"></a> """),_display_(/*36.33*/book/*36.37*/.id),format.raw/*36.40*/("""</td>
        <td><a href="XXX"></a> """),_display_(/*37.33*/book/*37.37*/.author),format.raw/*37.44*/("""</td>
        <td><a href="XXX"></a> """),_display_(/*38.33*/book/*38.37*/.collection),format.raw/*38.48*/("""</td>
        <td><a href="XXX"></a> """),_display_(/*39.33*/book/*39.37*/.other),format.raw/*39.43*/("""</td>
        <td><a href="XXX"></a> """),_display_(/*40.33*/book/*40.37*/.title),format.raw/*40.43*/("""</td>
        <td><a href="XXX"></a> """),_display_(/*41.33*/book/*41.37*/.reader),format.raw/*41.44*/("""</td>
        <td><input type="button" value="apagar" onclick="apagar("""),_display_(/*42.66*/book/*42.70*/.id),format.raw/*42.73*/(""")"></td>
        </tr> 
    """)))}),format.raw/*44.6*/("""
  
    """),format.raw/*46.5*/("""</tbody>
    </table>
""")))}))}
  }

  def render(books:List[model.vo.Book]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((List[model.vo.Book]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jan 11 12:11:01 BRST 2016
                  SOURCE: /Users/percivalslucena/loja/webservices/app/views/book.scala.html
                  HASH: e94cd91b138b455a8badefefec4d20e9390bbf96
                  MATRIX: 735->1|851->29|878->31|909->54|948->56|977->59|1065->120|1093->121|1127->129|1196->171|1224->172|1260->181|1329->223|1357->224|1418->258|1446->259|1474->260|1818->578|1852->596|1892->598|1926->605|1990->642|2003->646|2027->649|2092->687|2105->691|2133->698|2198->736|2211->740|2243->751|2308->789|2321->793|2348->799|2413->837|2426->841|2453->847|2518->885|2531->889|2559->896|2657->967|2670->971|2694->974|2753->1003|2788->1011
                  LINES: 26->1|29->1|30->2|30->2|30->2|33->5|35->7|35->7|36->8|37->9|37->9|38->10|40->12|40->12|42->14|42->14|43->15|62->34|62->34|62->34|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|72->44|74->46
                  -- GENERATED --
              */
          