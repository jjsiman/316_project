
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.collegesDB.SchoolInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(schoolInfo: models.collegesDB.SchoolInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),_display_(/*3.2*/main("Return to school list")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/(""" """)))}/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""
  """),format.raw/*4.3*/("""<p>Go back to <a href=""""),_display_(/*4.27*/routes/*4.33*/.Application.index()),format.raw/*4.53*/("""">all schools</a>.</p>
""")))}),format.raw/*5.2*/("""
"""))
      }
    }
  }

  def render(schoolInfo:models.collegesDB.SchoolInfo): play.twirl.api.HtmlFormat.Appendable = apply(schoolInfo)

  def f:((models.collegesDB.SchoolInfo) => play.twirl.api.HtmlFormat.Appendable) = (schoolInfo) => apply(schoolInfo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 15:58:42 EST 2017
                  SOURCE: /vagrant/316_project/play-colleges/app/views/edit.scala.html
                  HASH: d0ec42ee5e682759a5d2f415fba73ffb4a00a964
                  MATRIX: 969->1|1106->43|1134->46|1171->75|1210->77|1230->79|1269->81|1298->84|1348->108|1362->114|1402->134|1455->158
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|36->4|36->4|36->4|37->5
                  -- GENERATED --
              */
          