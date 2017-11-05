
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
    """),format.raw/*7.5*/("""<input type="text" name="name" placeholder="School name"><br/>
    <input type="submit" value="Go!"/>
  </form>
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
                  DATE: Sun Nov 05 14:08:44 EST 2017
                  SOURCE: /vagrant/316_project/play-colleges/app/views/index.scala.html
                  HASH: 08e3f468ed5355538ce8184897407334976c926c
                  MATRIX: 954->1|1071->23|1099->26|1126->45|1165->47|1185->49|1224->51|1253->54|1334->109|1348->115|1399->146|1432->154|1446->160|1481->175|1512->180|1662->300
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|43->11
                  -- GENERATED --
              */
          