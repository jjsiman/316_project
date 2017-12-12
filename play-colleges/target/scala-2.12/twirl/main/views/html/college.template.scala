
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
  def apply/*1.2*/(schoolInfo: models.collegesDB.SchoolInfo,cityInfo: models.collegesDB.CityInfo, similarSizedSchools: List[String],similarTuitionSchools: List[String],closeSchools: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.179*/("""


"""),_display_(/*4.2*/main(schoolInfo.name)/*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/(""" """)))}/*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""
  """),format.raw/*5.3*/("""<ul>
    <li id="nav"><a href=""""),_display_(/*6.28*/routes/*6.34*/.Application.index()),format.raw/*6.54*/("""">Home</a></li>
    <li id="nav"><a href=""""),_display_(/*7.28*/routes/*7.34*/.Application.about()),format.raw/*7.54*/("""">About</a></li>
  </ul>

  <p>
    Located in """),_display_(/*11.17*/schoolInfo/*11.27*/.city),format.raw/*11.32*/(""", """),_display_(/*11.35*/schoolInfo/*11.45*/.state),format.raw/*11.51*/("""<br/>
    Size: """),_display_(/*12.12*/schoolInfo/*12.22*/.size),format.raw/*12.27*/("""<br/>
    Rank: """),_display_(/*13.12*/schoolInfo/*13.22*/.rank),format.raw/*13.27*/("""<br/>
    Tuition: """),_display_(/*14.15*/schoolInfo/*14.25*/.tuition),format.raw/*14.33*/("""<br/>
    <br/>
    Top Degrees at """),_display_(/*16.21*/schoolInfo/*16.31*/.name),format.raw/*16.36*/("""
    """),_display_(/*17.6*/for((name,salaries) <- schoolInfo.degrees) yield /*17.48*/ {_display_(Seq[Any](format.raw/*17.50*/("""
      """),format.raw/*18.7*/("""<li>"""),_display_(/*18.12*/name),format.raw/*18.16*/("""</li>
      Average starting salary: """),_display_(/*19.33*/salaries(0)),format.raw/*19.44*/("""<br/>
      Average 10 year salary: """),_display_(/*20.32*/salaries(1)),format.raw/*20.43*/("""<br/>
    """)))}),format.raw/*21.6*/("""
    """),format.raw/*22.5*/("""<br/>
  </p>
  <p>
    Some facts about """),_display_(/*25.23*/schoolInfo/*25.33*/.city),format.raw/*25.38*/(""", """),_display_(/*25.41*/schoolInfo/*25.51*/.state),format.raw/*25.57*/("""<br/>
    Population: """),_display_(/*26.18*/cityInfo/*26.26*/.population),format.raw/*26.37*/("""<br/>
    Median resident age: """),_display_(/*27.27*/cityInfo/*27.35*/.medianResidentAge),format.raw/*27.53*/("""<br/>
    Percentage of residents with a high school degree: """),_display_(/*28.57*/cityInfo/*28.65*/.HSDegree),format.raw/*28.74*/("""%<br/>
    Median income: """),_display_(/*29.21*/cityInfo/*29.29*/.medianIncome),format.raw/*29.42*/("""<br/>
    Percentage of residents living below the poverty line: """),_display_(/*30.61*/cityInfo/*30.69*/.belowPovertyLine),format.raw/*30.86*/("""%<br/>
    Percentage of residents that were born outside the US: """),_display_(/*31.61*/cityInfo/*31.69*/.foreignBorn),format.raw/*31.81*/("""%<br/>
    Crime index: """),_display_(/*32.19*/cityInfo/*32.27*/.crimeIndex),format.raw/*32.38*/("""<br/>
  </p>
  <p>
      Check out these schools with similar sizes!
      """),_display_(/*36.8*/for(name <- similarSizedSchools) yield /*36.40*/ {_display_(Seq[Any](format.raw/*36.42*/("""
        """),format.raw/*37.9*/("""<li> <a href=""""),_display_(/*37.24*/routes/*37.30*/.Application.viewSchool(name)),format.raw/*37.59*/(""""> """),_display_(/*37.63*/name),format.raw/*37.67*/(""" """),format.raw/*37.68*/("""</a> </li>
      """)))}),format.raw/*38.8*/("""
  """),format.raw/*39.3*/("""</p>
  <p>
      Check out these schools with similar tuition!
      """),_display_(/*42.8*/for(name <- similarTuitionSchools) yield /*42.42*/ {_display_(Seq[Any](format.raw/*42.44*/("""
        """),format.raw/*43.9*/("""<li> <a href=""""),_display_(/*43.24*/routes/*43.30*/.Application.viewSchool(name)),format.raw/*43.59*/(""""> """),_display_(/*43.63*/name),format.raw/*43.67*/(""" """),format.raw/*43.68*/("""</a> </li>
      """)))}),format.raw/*44.8*/("""
  """),format.raw/*45.3*/("""</p>
  <p>
      Check out these schools close by!
      """),_display_(/*48.8*/for(name <- closeSchools) yield /*48.33*/ {_display_(Seq[Any](format.raw/*48.35*/("""
        """),format.raw/*49.9*/("""<li> <a href=""""),_display_(/*49.24*/routes/*49.30*/.Application.viewSchool(name)),format.raw/*49.59*/(""""> """),_display_(/*49.63*/name),format.raw/*49.67*/(""" """),format.raw/*49.68*/("""</a> </li>
      """)))}),format.raw/*50.8*/("""
  """),format.raw/*51.3*/("""</p>
  <p>
    Search <a href=""""),_display_(/*53.22*/routes/*53.28*/.Application.index()),format.raw/*53.48*/("""">other schools</a>.
  </p>
""")))}),format.raw/*55.2*/("""
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
                  DATE: Mon Dec 11 23:05:14 EST 2017
                  SOURCE: /vagrant/project/316_project/play-colleges/app/views/college.scala.html
                  HASH: 8dc9ec39d4ee4bcfddfefb04e058dea224dc1ea5
                  MATRIX: 1038->1|1311->178|1340->182|1369->203|1408->205|1428->207|1467->209|1496->212|1554->244|1568->250|1608->270|1677->313|1691->319|1731->339|1806->387|1825->397|1851->402|1881->405|1900->415|1927->421|1971->438|1990->448|2016->453|2060->470|2079->480|2105->485|2152->505|2171->515|2200->523|2263->559|2282->569|2308->574|2340->580|2398->622|2438->624|2472->631|2504->636|2529->640|2594->678|2626->689|2690->726|2722->737|2763->748|2795->753|2863->794|2882->804|2908->809|2938->812|2957->822|2984->828|3034->851|3051->859|3083->870|3142->902|3159->910|3198->928|3287->990|3304->998|3334->1007|3388->1034|3405->1042|3439->1055|3532->1121|3549->1129|3587->1146|3681->1213|3698->1221|3731->1233|3783->1258|3800->1266|3832->1277|3934->1353|3982->1385|4022->1387|4058->1396|4100->1411|4115->1417|4165->1446|4196->1450|4221->1454|4250->1455|4298->1473|4328->1476|4424->1546|4474->1580|4514->1582|4550->1591|4592->1606|4607->1612|4657->1641|4688->1645|4713->1649|4742->1650|4790->1668|4820->1671|4904->1729|4945->1754|4985->1756|5021->1765|5063->1780|5078->1786|5128->1815|5159->1819|5184->1823|5213->1824|5261->1842|5291->1845|5350->1877|5365->1883|5406->1903|5465->1932
                  LINES: 28->1|33->1|36->4|36->4|36->4|36->4|36->4|37->5|38->6|38->6|38->6|39->7|39->7|39->7|43->11|43->11|43->11|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|52->20|52->20|53->21|54->22|57->25|57->25|57->25|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|68->36|68->36|68->36|69->37|69->37|69->37|69->37|69->37|69->37|69->37|70->38|71->39|74->42|74->42|74->42|75->43|75->43|75->43|75->43|75->43|75->43|75->43|76->44|77->45|80->48|80->48|80->48|81->49|81->49|81->49|81->49|81->49|81->49|81->49|82->50|83->51|85->53|85->53|85->53|87->55
                  -- GENERATED --
              */
          