
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

"""),_display_(/*3.2*/main("")/*3.10*/ {_display_(Seq[Any](format.raw/*3.12*/(""" """),format.raw/*3.13*/("""<link rel="stylesheet" href=""""),_display_(/*3.43*/routes/*3.49*/.Assets.at("stylesheets/colleges.css")),format.raw/*3.87*/("""" type="text/css" media="screen"/> """)))}/*3.123*/ {_display_(Seq[Any](format.raw/*3.125*/("""

"""),_display_(/*5.2*/main(schoolInfo.name)/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/(""" """)))}/*5.27*/ {_display_(Seq[Any](format.raw/*5.29*/("""
  """),format.raw/*6.3*/("""<ul>
    <li id="nav"><a href=""""),_display_(/*7.28*/routes/*7.34*/.Application.index()),format.raw/*7.54*/("""">Home</a></li>
    <li id="nav"><a href=""""),_display_(/*8.28*/routes/*8.34*/.Application.about()),format.raw/*8.54*/("""">About</a></li>
  </ul>
  <div id="uni_info">
    <h1>"""),_display_(/*11.10*/schoolInfo/*11.20*/.name),format.raw/*11.25*/("""</h1>
    <p>"""),_display_(/*12.9*/schoolInfo/*12.19*/.city),format.raw/*12.24*/(""", """),_display_(/*12.27*/schoolInfo/*12.37*/.state),format.raw/*12.43*/("""<p/>
  </div>
    <table id="basic_info">
      <tr>
        <td><div class="data">
          <h1>Rank</h1>
          <p>#"""),_display_(/*18.16*/schoolInfo/*18.26*/.rank),format.raw/*18.31*/("""<p>
        </div></th>
        <td id="mid"><div class="data">
          <h1>Size</h1>
          <p>"""),_display_(/*22.15*/schoolInfo/*22.25*/.size),format.raw/*22.30*/("""</p>
        </div></th>
        <td><div class="data">
          <h1>Tuition</h1>
          <p>$"""),_display_(/*26.16*/schoolInfo/*26.26*/.tuition),format.raw/*26.34*/("""<p>
        </div></th>
      </tr>
    </table>

    <h3>Top Degrees at """),_display_(/*31.25*/schoolInfo/*31.35*/.name),format.raw/*31.40*/("""</h3>
    <table id="gen">
      <tr>
        """),_display_(/*34.10*/for((name,salaries) <- schoolInfo.degrees) yield /*34.52*/ {_display_(Seq[Any](format.raw/*34.54*/("""
          """),format.raw/*35.11*/("""<td>
            <table id="degree">
              <tr class="deg_name"><th>"""),_display_(/*37.41*/name),format.raw/*37.45*/("""</th></tr>
              <tr class="sal_desc"><td>Average starting salary</td></tr>
              <tr class="sal"><td>$"""),_display_(/*39.37*/salaries(0)),format.raw/*39.48*/("""</td></tr>
              <tr class="sal_desc"><td>Average 10 year salary</td></tr>
              <tr class="sal"><td>$"""),_display_(/*41.37*/salaries(1)),format.raw/*41.48*/("""</td></tr>
            </table>
          </td>
        """)))}),format.raw/*44.10*/("""
      """),format.raw/*45.7*/("""</tr>
    </table>
    <hr>
  <p align="center">All About """),_display_(/*48.32*/schoolInfo/*48.42*/.city),format.raw/*48.47*/(""", """),_display_(/*48.50*/schoolInfo/*48.60*/.state),format.raw/*48.66*/("""</p>
  <table id="city_table" align="center">
    <tr>
		<td>Population</td>
		<td>"""),_display_(/*52.8*/cityInfo/*52.16*/.population),format.raw/*52.27*/("""</td>
	</tr>
    <tr>
		<td>Median Resident Age</td>
		<td>"""),_display_(/*56.8*/cityInfo/*56.16*/.medianResidentAge),format.raw/*56.34*/("""</td>
	</tr>
    <tr>
		<td>Percentage of Residents with a High School Degree</td>
		<td>"""),_display_(/*60.8*/cityInfo/*60.16*/.HSDegree),format.raw/*60.25*/("""%</td>
	</tr>
	<tr>
    	<td>Median Income</td>
		<td>"""),_display_(/*64.8*/cityInfo/*64.16*/.medianIncome),format.raw/*64.29*/("""</td>
	</tr>
	<tr>
   		<td>Percentage of Residents Living Below the Poverty Line</td>
		<td>"""),_display_(/*68.8*/cityInfo/*68.16*/.belowPovertyLine),format.raw/*68.33*/("""%</td>
	</tr>
	<tr>
   		<td>Percentage of Residents Born Outside the US</td>
		<td>"""),_display_(/*72.8*/cityInfo/*72.16*/.foreignBorn),format.raw/*72.28*/("""%</td>
	</tr>
	<tr>
    	<td>Crime Index</td>
		<td>"""),_display_(/*76.8*/cityInfo/*76.16*/.crimeIndex),format.raw/*76.27*/("""</td>
	</tr>
  </table>
  <hr/>
  <p>
      Check out these schools with similar sizes!
      """),_display_(/*82.8*/for(name <- similarSizedSchools) yield /*82.40*/ {_display_(Seq[Any](format.raw/*82.42*/("""
        """),format.raw/*83.9*/("""<li> <a href=""""),_display_(/*83.24*/routes/*83.30*/.Application.viewSchool(name)),format.raw/*83.59*/(""""> """),_display_(/*83.63*/name),format.raw/*83.67*/(""" """),format.raw/*83.68*/("""</a> </li>
      """)))}),format.raw/*84.8*/("""
  """),format.raw/*85.3*/("""</p>
  <p>
      Check out these schools with similar tuition!
      """),_display_(/*88.8*/for(name <- similarTuitionSchools) yield /*88.42*/ {_display_(Seq[Any](format.raw/*88.44*/("""
        """),format.raw/*89.9*/("""<li> <a href=""""),_display_(/*89.24*/routes/*89.30*/.Application.viewSchool(name)),format.raw/*89.59*/(""""> """),_display_(/*89.63*/name),format.raw/*89.67*/(""" """),format.raw/*89.68*/("""</a> </li>
      """)))}),format.raw/*90.8*/("""
  """),format.raw/*91.3*/("""</p>
  <p>
      Check out these schools close by!
      """),_display_(/*94.8*/for(name <- closeSchools) yield /*94.33*/ {_display_(Seq[Any](format.raw/*94.35*/("""
        """),format.raw/*95.9*/("""<li> <a href=""""),_display_(/*95.24*/routes/*95.30*/.Application.viewSchool(name)),format.raw/*95.59*/(""""> """),_display_(/*95.63*/name),format.raw/*95.67*/(""" """),format.raw/*95.68*/("""</a> </li>
      """)))}),format.raw/*96.8*/("""
  """),format.raw/*97.3*/("""</p>
  <p>
    Search <a href=""""),_display_(/*99.22*/routes/*99.28*/.Application.index()),format.raw/*99.48*/("""">other schools</a>.
  </p>
""")))}),format.raw/*101.2*/("""
""")))}),format.raw/*102.2*/("""
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
                  DATE: Mon Dec 11 23:28:34 EST 2017
                  SOURCE: /vagrant/project/316_project/play-colleges/app/views/college.scala.html
                  HASH: eaad649d8b73714d2a0bd07e1183900624ac4dd5
                  MATRIX: 1038->1|1311->178|1339->181|1355->189|1394->191|1422->192|1478->222|1492->228|1550->266|1605->302|1645->304|1673->307|1702->328|1741->330|1761->332|1800->334|1829->337|1887->369|1901->375|1941->395|2010->438|2024->444|2064->464|2147->520|2166->530|2192->535|2232->549|2251->559|2277->564|2307->567|2326->577|2353->583|2503->706|2522->716|2548->721|2677->823|2696->833|2722->838|2847->936|2866->946|2895->954|2996->1028|3015->1038|3041->1043|3115->1090|3173->1132|3213->1134|3252->1145|3356->1222|3381->1226|3528->1346|3560->1357|3706->1476|3738->1487|3826->1544|3860->1551|3946->1610|3965->1620|3991->1625|4021->1628|4040->1638|4067->1644|4177->1728|4194->1736|4226->1747|4312->1807|4329->1815|4368->1833|4484->1923|4501->1931|4531->1940|4612->1995|4629->2003|4663->2016|4783->2110|4800->2118|4838->2135|4949->2220|4966->2228|4999->2240|5078->2293|5095->2301|5127->2312|5248->2407|5296->2439|5336->2441|5372->2450|5414->2465|5429->2471|5479->2500|5510->2504|5535->2508|5564->2509|5612->2527|5642->2530|5738->2600|5788->2634|5828->2636|5864->2645|5906->2660|5921->2666|5971->2695|6002->2699|6027->2703|6056->2704|6104->2722|6134->2725|6218->2783|6259->2808|6299->2810|6335->2819|6377->2834|6392->2840|6442->2869|6473->2873|6498->2877|6527->2878|6575->2896|6605->2899|6664->2931|6679->2937|6720->2957|6780->2986|6813->2988
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|35->3|35->3|35->3|35->3|37->5|37->5|37->5|37->5|37->5|38->6|39->7|39->7|39->7|40->8|40->8|40->8|43->11|43->11|43->11|44->12|44->12|44->12|44->12|44->12|44->12|50->18|50->18|50->18|54->22|54->22|54->22|58->26|58->26|58->26|63->31|63->31|63->31|66->34|66->34|66->34|67->35|69->37|69->37|71->39|71->39|73->41|73->41|76->44|77->45|80->48|80->48|80->48|80->48|80->48|80->48|84->52|84->52|84->52|88->56|88->56|88->56|92->60|92->60|92->60|96->64|96->64|96->64|100->68|100->68|100->68|104->72|104->72|104->72|108->76|108->76|108->76|114->82|114->82|114->82|115->83|115->83|115->83|115->83|115->83|115->83|115->83|116->84|117->85|120->88|120->88|120->88|121->89|121->89|121->89|121->89|121->89|121->89|121->89|122->90|123->91|126->94|126->94|126->94|127->95|127->95|127->95|127->95|127->95|127->95|127->95|128->96|129->97|131->99|131->99|131->99|133->101|134->102
                  -- GENERATED --
              */
          