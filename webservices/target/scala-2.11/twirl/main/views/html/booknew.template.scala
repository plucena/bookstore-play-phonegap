
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
object booknew extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Novo Livro")/*1.20*/ {_display_(Seq[Any](format.raw/*1.22*/("""

"""),format.raw/*3.1*/("""<script type="text/javascript">
    
    function save() """),format.raw/*5.21*/("""{"""),format.raw/*5.22*/("""
       """),format.raw/*6.8*/("""var fdata = $('#newbookform').serializeJSON();
       var jdata = JSON.stringify(fdata);
        $.ajax("""),format.raw/*8.16*/("""{"""),format.raw/*8.17*/("""
        """),format.raw/*9.9*/("""url: '/Book',
        type: 'POST',
        contentType: 'application/json',
        data: jdata,
        // processData: false, // this is optional
        dataType: 'json'
       """),format.raw/*15.8*/("""}"""),format.raw/*15.9*/(""");
       
    """),format.raw/*17.5*/("""}"""),format.raw/*17.6*/("""
"""),format.raw/*18.1*/("""</script>

 <h2>Novo Livro</h2>

	<form id="newbookform">
	    <div class="form-group">	
        <label >id</label>
        <input class="form-control" type="text" name='id' id='id'/>
        </div>
        <div class="form-group">
        <label >author</label>
        <input class="form-control" type="text" name='author' id='author' />
        </div>
        <div class="form-group">
        <label >collection</label>
        <input class="form-control" type="text" name='collection' id='collection'/> 
        </div>
        <div class="form-group">
        <label >other</label>
        <input class="form-control" type="text" name='other' id='other' />
        </div>
        <div class="form-group">
        <label >title</label>
        <input class="form-control" type="text" name='title' id='title' />
        </div>
        <div class="form-group">
        <label >reader</label>
        <input class="form-control" type="text" name='reader' id='reader' />
  		</div>
  		<div class="form-group">
  		<button type="submit" class="btn" onclick="save()">Save</button>
  		</div>
      </form>
    
    

""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jan 11 12:11:01 BRST 2016
                  SOURCE: /Users/percivalslucena/loja/webservices/app/views/booknew.scala.html
                  HASH: a237c645b9f7772d6e6abf3ff5520bb2bb311679
                  MATRIX: 800->1|826->19|865->21|893->23|977->80|1005->81|1039->89|1170->193|1198->194|1233->203|1441->384|1469->385|1511->400|1539->401|1567->402
                  LINES: 29->1|29->1|29->1|31->3|33->5|33->5|34->6|36->8|36->8|37->9|43->15|43->15|45->17|45->17|46->18
                  -- GENERATED --
              */
          