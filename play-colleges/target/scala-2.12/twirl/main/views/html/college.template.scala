
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

object college extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.collegesDB.SchoolInfo,List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(schoolInfo: models.collegesDB.SchoolInfo, similarSizedSchools: List[String],similarTuitionSchools: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.115*/("""

"""),_display_(/*3.2*/main("School Information: " + schoolInfo.name)/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/(""" """)))}/*3.52*/ {_display_(Seq[Any](format.raw/*3.54*/("""
  """),format.raw/*4.3*/("""<p>
    Size: """),_display_(/*5.12*/schoolInfo/*5.22*/.size),format.raw/*5.27*/("""<br/>
    Rank: """),_display_(/*6.12*/schoolInfo/*6.22*/.rank),format.raw/*6.27*/("""<br/>
    Tuition: """),_display_(/*7.15*/schoolInfo/*7.25*/.tuition),format.raw/*7.33*/("""<br/>
    <br/>
  </p>
  <p>
      Check out these schools with similar sizes!
      """),_display_(/*12.8*/for(name <- similarSizedSchools) yield /*12.40*/ {_display_(Seq[Any](format.raw/*12.42*/("""
        """),format.raw/*13.9*/("""<li> <a href=""""),_display_(/*13.24*/routes/*13.30*/.Application.viewSchool(name)),format.raw/*13.59*/(""""> """),_display_(/*13.63*/name),format.raw/*13.67*/(""" """),format.raw/*13.68*/("""</a> </li>
      """)))}),format.raw/*14.8*/("""
  """),format.raw/*15.3*/("""</p>
  <p>
      Check out these schools with similar tuition!
      """),_display_(/*18.8*/for(name <- similarTuitionSchools) yield /*18.42*/ {_display_(Seq[Any](format.raw/*18.44*/("""
        """),format.raw/*19.9*/("""<li> <a href=""""),_display_(/*19.24*/routes/*19.30*/.Application.viewSchool(name)),format.raw/*19.59*/(""""> """),_display_(/*19.63*/name),format.raw/*19.67*/(""" """),format.raw/*19.68*/("""</a> </li>
      """)))}),format.raw/*20.8*/("""
  """),format.raw/*21.3*/("""</p>
  <p>
    Search <a href=""""),_display_(/*23.22*/routes/*23.28*/.Application.index()),format.raw/*23.48*/("""">other schools</a>.
  </p>
""")))}),format.raw/*25.2*/("""
"""))
      }
    }
  }

  def render(schoolInfo:models.collegesDB.SchoolInfo,similarSizedSchools:List[String],similarTuitionSchools:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(schoolInfo,similarSizedSchools,similarTuitionSchools)

  def f:((models.collegesDB.SchoolInfo,List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (schoolInfo,similarSizedSchools,similarTuitionSchools) => apply(schoolInfo,similarSizedSchools,similarTuitionSchools)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Nov 07 09:57:48 EST 2017
                  SOURCE: /home/mrguhan/316_project/play-colleges/app/views/college.scala.html
                  HASH: 1a33911bbb3885b4b46d5512b76ed0f2c63e1740
                  MATRIX: 998->1|1207->114|1235->117|1289->163|1328->165|1348->167|1387->169|1416->172|1457->187|1475->197|1500->202|1543->219|1561->229|1586->234|1632->254|1650->264|1678->272|1790->358|1838->390|1878->392|1914->401|1956->416|1971->422|2021->451|2052->455|2077->459|2106->460|2154->478|2184->481|2280->551|2330->585|2370->587|2406->596|2448->611|2463->617|2513->646|2544->650|2569->654|2598->655|2646->673|2676->676|2735->708|2750->714|2791->734|2850->763
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|47->15|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|51->19|51->19|52->20|53->21|55->23|55->23|55->23|57->25
                  -- GENERATED --
              */
          