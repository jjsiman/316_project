
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
  """),format.raw/*4.3*/("""<p>Search for a school:
  <form method="post" action=""""),_display_(/*5.32*/routes/*5.38*/.Application.viewSchoolSearch()),format.raw/*5.69*/("""">
    """),_display_(/*6.6*/helper/*6.12*/.CSRF.formField),format.raw/*6.27*/("""
    """),format.raw/*7.5*/("""<input list="schools" type="text" name="name" placeholder="School name"><br/>
      <datalist id="schools">
        """),_display_(/*9.10*/for(name <- school) yield /*9.29*/ {_display_(Seq[Any](format.raw/*9.31*/("""
          """),format.raw/*10.11*/("""<option value=""""),_display_(/*10.27*/name),format.raw/*10.31*/(""""> <a href=""""),_display_(/*10.44*/routes/*10.50*/.Application.viewSchool(name)),format.raw/*10.79*/(""""> """),_display_(/*10.83*/name),format.raw/*10.87*/(""" """),format.raw/*10.88*/("""</a> </option>
        """)))}),format.raw/*11.10*/("""
      """),format.raw/*12.7*/("""</datalist>
    <input type="submit" value="Go!"/>
  </form>
  </p>
""")))}),format.raw/*16.2*/("""
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
                  DATE: Sun Nov 05 15:32:21 EST 2017
                  SOURCE: /vagrant/project/316_project/play-colleges/app/views/index.scala.html
                  HASH: 2934f1b3f87b3918e6678dcc65211c528a24b43c
                  MATRIX: 954->1|1071->23|1099->26|1126->45|1165->47|1185->49|1224->51|1253->54|1334->109|1348->115|1399->146|1432->154|1446->160|1481->175|1512->180|1655->297|1689->316|1728->318|1767->329|1810->345|1835->349|1875->362|1890->368|1940->397|1971->401|1996->405|2025->406|2080->430|2114->437|2213->506
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|41->9|41->9|41->9|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|44->12|48->16
                  -- GENERATED --
              */
          