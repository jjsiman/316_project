
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(school: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),_display_(/*3.2*/main("All Schools")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/(""" """)))}/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<p>Click on a school below to view more information:
    <ul>
      """),_display_(/*6.8*/for(name <- school) yield /*6.27*/ {_display_(Seq[Any](format.raw/*6.29*/("""
        """),format.raw/*7.9*/("""<li><a href=""""),_display_(/*7.23*/routes/*7.29*/.Application.viewSchool(name)),format.raw/*7.58*/("""">"""),_display_(/*7.61*/name),format.raw/*7.65*/("""</a></li>
      """)))}),format.raw/*8.8*/("""
    """),format.raw/*9.5*/("""</ul>
  </p>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(school:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(school)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (school) => apply(school)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 31 16:32:52 EDT 2017
                  SOURCE: /vagrant/316_project/play-colleges/app/views/index.scala.html
                  HASH: c26c0679920f276511729b43eb57b50749e54f12
                  MATRIX: 954->1|1071->23|1099->26|1126->45|1165->47|1185->49|1224->51|1253->54|1347->123|1381->142|1420->144|1455->153|1495->167|1509->173|1558->202|1587->205|1611->209|1657->226|1688->231|1732->245
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|38->6|38->6|38->6|39->7|39->7|39->7|39->7|39->7|39->7|40->8|41->9|43->11
                  -- GENERATED --
              */
          