
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
  def apply/*1.2*/(drinkers: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""

"""),_display_(/*3.2*/main("All Drinkers")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/(""" """)))}/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""
  """),format.raw/*4.3*/("""<p>Click on drinker below to view more information:
    <ul>
      """),_display_(/*6.8*/for(name <- drinkers) yield /*6.29*/ {_display_(Seq[Any](format.raw/*6.31*/("""
        """),format.raw/*7.9*/("""<li><a href=""""),_display_(/*7.23*/routes/*7.29*/.Application.viewDrinker(name)),format.raw/*7.59*/("""">"""),_display_(/*7.62*/name),format.raw/*7.66*/("""</a></li>
      """)))}),format.raw/*8.8*/("""
    """),format.raw/*9.5*/("""</ul>
  </p>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(drinkers:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(drinkers)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (drinkers) => apply(drinkers)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 17 14:38:48 EDT 2017
                  SOURCE: /vagrant/play-beers/app/views/index.scala.html
                  HASH: bfd1c010f2801b0a5128b2d6379f09e600430537
                  MATRIX: 954->1|1073->25|1101->28|1129->48|1168->50|1188->52|1227->54|1256->57|1349->125|1385->146|1424->148|1459->157|1499->171|1513->177|1563->207|1592->210|1616->214|1662->231|1693->236|1737->250
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|38->6|38->6|38->6|39->7|39->7|39->7|39->7|39->7|39->7|40->8|41->9|43->11
                  -- GENERATED --
              */
          