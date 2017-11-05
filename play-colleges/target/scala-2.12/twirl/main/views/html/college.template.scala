
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

object college extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.collegesDB.SchoolInfo,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(schoolInfo: models.collegesDB.SchoolInfo, similarSchools: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.74*/("""

"""),_display_(/*3.2*/main("School Information: " + schoolInfo.name)/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/(""" """)))}/*3.52*/ {_display_(Seq[Any](format.raw/*3.54*/("""
  """),format.raw/*4.3*/("""<p>
    Size: """),_display_(/*5.12*/schoolInfo/*5.22*/.size),format.raw/*5.27*/("""<br/>
    Rank: """),_display_(/*6.12*/schoolInfo/*6.22*/.rank),format.raw/*6.27*/("""<br/>
    Tuition: """),_display_(/*7.15*/schoolInfo/*7.25*/.tuition),format.raw/*7.33*/("""<br/>
    <br/>
  </p>
  <p>
      """),_display_(/*11.8*/for(name <- similarSchools) yield /*11.35*/ {_display_(Seq[Any](format.raw/*11.37*/("""
        """),format.raw/*12.9*/("""<li> <a href=""""),_display_(/*12.24*/routes/*12.30*/.Application.viewSchool(name)),format.raw/*12.59*/(""""> """),_display_(/*12.63*/name),format.raw/*12.67*/(""" """),format.raw/*12.68*/("""</a> </li>
      """)))}),format.raw/*13.8*/("""
  """),format.raw/*14.3*/("""</p>

  <p>
    Search <a href=""""),_display_(/*17.22*/routes/*17.28*/.Application.index()),format.raw/*17.48*/("""">other schools</a>.
  </p>
""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(schoolInfo:models.collegesDB.SchoolInfo,similarSchools:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(schoolInfo,similarSchools)

  def f:((models.collegesDB.SchoolInfo,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (schoolInfo,similarSchools) => apply(schoolInfo,similarSchools)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 15:32:21 EST 2017
                  SOURCE: /vagrant/project/316_project/play-colleges/app/views/college.scala.html
                  HASH: d9c7b237f8d4e16b8e3e5bb6345d9b59cde796de
                  MATRIX: 985->1|1152->73|1180->76|1234->122|1273->124|1293->126|1332->128|1361->131|1402->146|1420->156|1445->161|1488->178|1506->188|1531->193|1577->213|1595->223|1623->231|1685->267|1728->294|1768->296|1804->305|1846->320|1861->326|1911->355|1942->359|1967->363|1996->364|2044->382|2074->385|2134->418|2149->424|2190->444|2249->473
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|43->11|43->11|43->11|44->12|44->12|44->12|44->12|44->12|44->12|44->12|45->13|46->14|49->17|49->17|49->17|51->19
                  -- GENERATED --
              */
          