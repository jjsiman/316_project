
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

object college extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[models.collegesDB.SchoolInfo,models.collegesDB.CityInfo,List[String],List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(schoolInfo: models.collegesDB.SchoolInfo, cityInfo: models.collegesDB.CityInfo, similarSizedSchools: List[String],similarTuitionSchools: List[String],closeSchools: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.180*/("""

"""),_display_(/*3.2*/main(schoolInfo.name)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/(""" """)))}/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
  """),format.raw/*4.3*/("""<p>
    Located in """),_display_(/*5.17*/schoolInfo/*5.27*/.city),format.raw/*5.32*/(""", """),_display_(/*5.35*/schoolInfo/*5.45*/.state),format.raw/*5.51*/("""<br/>
    Size: """),_display_(/*6.12*/schoolInfo/*6.22*/.size),format.raw/*6.27*/("""<br/>
    Rank: """),_display_(/*7.12*/schoolInfo/*7.22*/.rank),format.raw/*7.27*/("""<br/>
    Tuition: """),_display_(/*8.15*/schoolInfo/*8.25*/.tuition),format.raw/*8.33*/("""<br/>
    <br/>
  </p>
  <p>
    Some facts about """),_display_(/*12.23*/schoolInfo/*12.33*/.city),format.raw/*12.38*/(""", """),_display_(/*12.41*/schoolInfo/*12.51*/.state),format.raw/*12.57*/(""", where available:<br/>
    Population: """),_display_(/*13.18*/cityInfo/*13.26*/.population),format.raw/*13.37*/("""<br/>
    Median resident age: """),_display_(/*14.27*/cityInfo/*14.35*/.medianResidentAge),format.raw/*14.53*/("""<br/>
    Percentage of residents with a high school degree: """),_display_(/*15.57*/cityInfo/*15.65*/.HSDegree),format.raw/*15.74*/("""%<br/>
    Median income: """),_display_(/*16.21*/cityInfo/*16.29*/.medianIncome),format.raw/*16.42*/("""<br/>
    Percentage of residents living below the poverty line: """),_display_(/*17.61*/cityInfo/*17.69*/.belowPovertyLine),format.raw/*17.86*/("""%<br/>
    Percentage of residents that were born outside the US: """),_display_(/*18.61*/cityInfo/*18.69*/.foreignBorn),format.raw/*18.81*/("""%<br/>
    Crime index: """),_display_(/*19.19*/cityInfo/*19.27*/.crimeIndex),format.raw/*19.38*/("""<br/>
  </p>
  <p>
      Check out these schools with similar sizes!
      """),_display_(/*23.8*/for(name <- similarSizedSchools) yield /*23.40*/ {_display_(Seq[Any](format.raw/*23.42*/("""
        """),format.raw/*24.9*/("""<li> <a href=""""),_display_(/*24.24*/routes/*24.30*/.Application.viewSchool(name)),format.raw/*24.59*/(""""> """),_display_(/*24.63*/name),format.raw/*24.67*/(""" """),format.raw/*24.68*/("""</a> </li>
      """)))}),format.raw/*25.8*/("""
  """),format.raw/*26.3*/("""</p>
  <p>
      Check out these schools with similar tuition!
      """),_display_(/*29.8*/for(name <- similarTuitionSchools) yield /*29.42*/ {_display_(Seq[Any](format.raw/*29.44*/("""
        """),format.raw/*30.9*/("""<li> <a href=""""),_display_(/*30.24*/routes/*30.30*/.Application.viewSchool(name)),format.raw/*30.59*/(""""> """),_display_(/*30.63*/name),format.raw/*30.67*/(""" """),format.raw/*30.68*/("""</a> </li>
      """)))}),format.raw/*31.8*/("""
  """),format.raw/*32.3*/("""</p>
  <p>
      Check out these schools close by!
      """),_display_(/*35.8*/for(name <- closeSchools) yield /*35.33*/ {_display_(Seq[Any](format.raw/*35.35*/("""
        """),format.raw/*36.9*/("""<li> <a href=""""),_display_(/*36.24*/routes/*36.30*/.Application.viewSchool(name)),format.raw/*36.59*/(""""> """),_display_(/*36.63*/name),format.raw/*36.67*/(""" """),format.raw/*36.68*/("""</a> </li>
      """)))}),format.raw/*37.8*/("""
  """),format.raw/*38.3*/("""</p>
  <p>
    Search <a href=""""),_display_(/*40.22*/routes/*40.28*/.Application.index()),format.raw/*40.48*/("""">other schools</a>.
  </p>
""")))}),format.raw/*42.2*/("""
"""))
      }
    }
  }

  def render(schoolInfo:models.collegesDB.SchoolInfo,cityInfo:models.collegesDB.CityInfo,similarSizedSchools:List[String],similarTuitionSchools:List[String],closeSchools:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(schoolInfo,cityInfo,similarSizedSchools,similarTuitionSchools,closeSchools)

  def f:((models.collegesDB.SchoolInfo,models.collegesDB.CityInfo,List[String],List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (schoolInfo,cityInfo,similarSizedSchools,similarTuitionSchools,closeSchools) => apply(schoolInfo,cityInfo,similarSizedSchools,similarTuitionSchools,closeSchools)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 09 16:55:29 EST 2017
                  SOURCE: /vagrant/project/316_project/play-colleges/app/views/college.scala.html
                  HASH: 5c6b3623a64ef860c2a8dd09a9d7967810a6a7ef
                  MATRIX: 1038->1|1312->179|1340->182|1369->203|1408->205|1428->207|1467->209|1496->212|1542->232|1560->242|1585->247|1614->250|1632->260|1658->266|1701->283|1719->293|1744->298|1787->315|1805->325|1830->330|1876->350|1894->360|1922->368|2000->419|2019->429|2045->434|2075->437|2094->447|2121->453|2189->494|2206->502|2238->513|2297->545|2314->553|2353->571|2442->633|2459->641|2489->650|2543->677|2560->685|2594->698|2687->764|2704->772|2742->789|2836->856|2853->864|2886->876|2938->901|2955->909|2987->920|3089->996|3137->1028|3177->1030|3213->1039|3255->1054|3270->1060|3320->1089|3351->1093|3376->1097|3405->1098|3453->1116|3483->1119|3579->1189|3629->1223|3669->1225|3705->1234|3747->1249|3762->1255|3812->1284|3843->1288|3868->1292|3897->1293|3945->1311|3975->1314|4059->1372|4100->1397|4140->1399|4176->1408|4218->1423|4233->1429|4283->1458|4314->1462|4339->1466|4368->1467|4416->1485|4446->1488|4505->1520|4520->1526|4561->1546|4620->1575
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|44->12|44->12|44->12|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|55->23|55->23|55->23|56->24|56->24|56->24|56->24|56->24|56->24|56->24|57->25|58->26|61->29|61->29|61->29|62->30|62->30|62->30|62->30|62->30|62->30|62->30|63->31|64->32|67->35|67->35|67->35|68->36|68->36|68->36|68->36|68->36|68->36|68->36|69->37|70->38|72->40|72->40|72->40|74->42
                  -- GENERATED --
              */
          