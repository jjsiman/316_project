
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

object college extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.collegesDB.SchoolInfo,List[String],List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(schoolInfo: models.collegesDB.SchoolInfo, similarSizedSchools: List[String],similarTuitionSchools: List[String],closeSchools: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.142*/("""

"""),_display_(/*3.2*/main(schoolInfo.name)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/(""" """)))}/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
  """),format.raw/*4.3*/("""<p>
    Located in """),_display_(/*5.17*/schoolInfo/*5.27*/.city),format.raw/*5.32*/(""", """),_display_(/*5.35*/schoolInfo/*5.45*/.state),format.raw/*5.51*/("""<br/>
    Size: """),_display_(/*6.12*/schoolInfo/*6.22*/.size),format.raw/*6.27*/("""<br/>
    Rank: """),_display_(/*7.12*/schoolInfo/*7.22*/.rank),format.raw/*7.27*/("""<br/>
    Tuition: """),_display_(/*8.15*/schoolInfo/*8.25*/.tuition),format.raw/*8.33*/("""<br/>
    <br/>
  </p>
  <p>
      Check out these schools with similar sizes!
      """),_display_(/*13.8*/for(name <- similarSizedSchools) yield /*13.40*/ {_display_(Seq[Any](format.raw/*13.42*/("""
        """),format.raw/*14.9*/("""<li> <a href=""""),_display_(/*14.24*/routes/*14.30*/.Application.viewSchool(name)),format.raw/*14.59*/(""""> """),_display_(/*14.63*/name),format.raw/*14.67*/(""" """),format.raw/*14.68*/("""</a> </li>
      """)))}),format.raw/*15.8*/("""
  """),format.raw/*16.3*/("""</p>
  <p>
      Check out these schools with similar tuition!
      """),_display_(/*19.8*/for(name <- similarTuitionSchools) yield /*19.42*/ {_display_(Seq[Any](format.raw/*19.44*/("""
        """),format.raw/*20.9*/("""<li> <a href=""""),_display_(/*20.24*/routes/*20.30*/.Application.viewSchool(name)),format.raw/*20.59*/(""""> """),_display_(/*20.63*/name),format.raw/*20.67*/(""" """),format.raw/*20.68*/("""</a> </li>
      """)))}),format.raw/*21.8*/("""
  """),format.raw/*22.3*/("""</p>
  <p>
      Check out these schools close by!
      """),_display_(/*25.8*/for(name <- closeSchools) yield /*25.33*/ {_display_(Seq[Any](format.raw/*25.35*/("""
        """),format.raw/*26.9*/("""<li> <a href=""""),_display_(/*26.24*/routes/*26.30*/.Application.viewSchool(name)),format.raw/*26.59*/(""""> """),_display_(/*26.63*/name),format.raw/*26.67*/(""" """),format.raw/*26.68*/("""</a> </li>
      """)))}),format.raw/*27.8*/("""
  """),format.raw/*28.3*/("""</p>
  <p>
    Search <a href=""""),_display_(/*30.22*/routes/*30.28*/.Application.index()),format.raw/*30.48*/("""">other schools</a>.
  </p>
""")))}),format.raw/*32.2*/("""
"""))
      }
    }
  }

  def render(schoolInfo:models.collegesDB.SchoolInfo,similarSizedSchools:List[String],similarTuitionSchools:List[String],closeSchools:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(schoolInfo,similarSizedSchools,similarTuitionSchools,closeSchools)

  def f:((models.collegesDB.SchoolInfo,List[String],List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (schoolInfo,similarSizedSchools,similarTuitionSchools,closeSchools) => apply(schoolInfo,similarSizedSchools,similarTuitionSchools,closeSchools)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Nov 07 17:18:50 EST 2017
                  SOURCE: /vagrant/316_project/play-colleges/app/views/college.scala.html
                  HASH: 427d07b67d1aa43dca77c7be41eeaa1f7b214be6
                  MATRIX: 1011->1|1247->141|1275->144|1304->165|1343->167|1363->169|1402->171|1431->174|1477->194|1495->204|1520->209|1549->212|1567->222|1593->228|1636->245|1654->255|1679->260|1722->277|1740->287|1765->292|1811->312|1829->322|1857->330|1969->416|2017->448|2057->450|2093->459|2135->474|2150->480|2200->509|2231->513|2256->517|2285->518|2333->536|2363->539|2459->609|2509->643|2549->645|2585->654|2627->669|2642->675|2692->704|2723->708|2748->712|2777->713|2825->731|2855->734|2939->792|2980->817|3020->819|3056->828|3098->843|3113->849|3163->878|3194->882|3219->886|3248->887|3296->905|3326->908|3385->940|3400->946|3441->966|3500->995
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|45->13|45->13|45->13|46->14|46->14|46->14|46->14|46->14|46->14|46->14|47->15|48->16|51->19|51->19|51->19|52->20|52->20|52->20|52->20|52->20|52->20|52->20|53->21|54->22|57->25|57->25|57->25|58->26|58->26|58->26|58->26|58->26|58->26|58->26|59->27|60->28|62->30|62->30|62->30|64->32
                  -- GENERATED --
              */
          