
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

"""),_display_(/*3.2*/main(schoolInfo.name)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/(""" """),format.raw/*3.26*/("""<link rel="stylesheet" href=""""),_display_(/*3.56*/routes/*3.62*/.Assets.at("stylesheets/colleges.css")),format.raw/*3.100*/("""" type="text/css" media="screen"/> """)))}/*3.136*/ {_display_(Seq[Any](format.raw/*3.138*/("""
  """),format.raw/*4.3*/("""<ul>
    <li id="nav"><a href=""""),_display_(/*5.28*/routes/*5.34*/.Application.index()),format.raw/*5.54*/("""">Home</a></li>
    <li id="nav"><a href=""""),_display_(/*6.28*/routes/*6.34*/.Application.about()),format.raw/*6.54*/("""">About</a></li>
  </ul>
  <div id="uni_info">
    <h1>"""),_display_(/*9.10*/schoolInfo/*9.20*/.name),format.raw/*9.25*/("""</h1>
    <p>"""),_display_(/*10.9*/schoolInfo/*10.19*/.city),format.raw/*10.24*/(""", """),_display_(/*10.27*/schoolInfo/*10.37*/.state),format.raw/*10.43*/("""<p/>
  </div>
    <table id="basic_info">
      <tr>
        <td><div class="data">
          <h1>Rank</h1>
          <p>#"""),_display_(/*16.16*/schoolInfo/*16.26*/.rank),format.raw/*16.31*/("""<p>
        </div></th>
        <td id="mid"><div class="data">
          <h1>Size</h1>
          <p>"""),_display_(/*20.15*/schoolInfo/*20.25*/.size),format.raw/*20.30*/("""</p>
        </div></th>
        <td><div class="data">
          <h1>Tuition</h1>
          <p>$"""),_display_(/*24.16*/schoolInfo/*24.26*/.tuition),format.raw/*24.34*/("""<p>
        </div></th>
      </tr>
    </table>
    <div id="degree_section">
    <h3>Top Degrees at """),_display_(/*29.25*/schoolInfo/*29.35*/.name),format.raw/*29.40*/("""</h3>
    <table id="gen">
      <tr>
        """),_display_(/*32.10*/for((name,salaries) <- schoolInfo.degrees) yield /*32.52*/ {_display_(Seq[Any](format.raw/*32.54*/("""
          """),format.raw/*33.11*/("""<td>
            <table id="degree">
              <tr class="deg_name"><th>"""),_display_(/*35.41*/name),format.raw/*35.45*/("""</th></tr>
              <tr class="sal_desc"><td>Average starting salary</td></tr>
              <tr class="sal"><td>$"""),_display_(/*37.37*/salaries(0)),format.raw/*37.48*/("""</td></tr>
              <tr class="sal_desc"><td>Average 10 year salary</td></tr>
              <tr class="sal"><td>$"""),_display_(/*39.37*/salaries(1)),format.raw/*39.48*/("""</td></tr>
            </table>
          </td>
        """)))}),format.raw/*42.10*/("""
      """),format.raw/*43.7*/("""</tr>
    </table>

    </div>

	<p align="center" id="city_name">All About <b>"""),_display_(/*48.49*/schoolInfo/*48.59*/.city),format.raw/*48.64*/(""", """),_display_(/*48.67*/schoolInfo/*48.77*/.state),format.raw/*48.83*/("""</b></p>
  <table id="city_table" align="center">
    <tr>
		<th>Population</th>
		<td>"""),_display_(/*52.8*/cityInfo/*52.16*/.population),format.raw/*52.27*/("""</td>
	</tr>
    <tr>
		<th>Median Resident Age</th>
		<td>"""),_display_(/*56.8*/cityInfo/*56.16*/.medianResidentAge),format.raw/*56.34*/("""</td>
	</tr>
    <tr>
		<th>Percentage of Residents with a High School Degree</th>
		<td>"""),_display_(/*60.8*/cityInfo/*60.16*/.HSDegree),format.raw/*60.25*/("""%</td>
	</tr>
	<tr>
    	<th>Median Income</th>
		<td>"""),_display_(/*64.8*/cityInfo/*64.16*/.medianIncome),format.raw/*64.29*/("""</td>
	</tr>
	<tr>
   		<th>Percentage of Residents Living Below the Poverty Line</th>
		<td>"""),_display_(/*68.8*/cityInfo/*68.16*/.belowPovertyLine),format.raw/*68.33*/("""%</td>
	</tr>
	<tr>
   		<th>Percentage of Residents Born Outside the US</th>
		<td>"""),_display_(/*72.8*/cityInfo/*72.16*/.foreignBorn),format.raw/*72.28*/("""%</td>
	</tr>
	<tr>
    	<th>Crime Index</th>
		<td>"""),_display_(/*76.8*/cityInfo/*76.16*/.crimeIndex),format.raw/*76.27*/("""</td>
	</tr>
  </table>

  <table id="similar_schools">
    <tr>
    <td>
        <h6>Check out these schools with similar sizes!</h6>
        """),_display_(/*84.10*/for(name <- similarSizedSchools) yield /*84.42*/ {_display_(Seq[Any](format.raw/*84.44*/("""
          """),format.raw/*85.11*/("""<li class="school_list"> <a href=""""),_display_(/*85.46*/routes/*85.52*/.Application.viewSchool(name)),format.raw/*85.81*/(""""> """),_display_(/*85.85*/name),format.raw/*85.89*/(""" """),format.raw/*85.90*/("""</a> </li>
        """)))}),format.raw/*86.10*/("""
    """),format.raw/*87.5*/("""</td>
    <td>
        <h6>Check out these schools with similar tuition!</h6>
        """),_display_(/*90.10*/for(name <- similarTuitionSchools) yield /*90.44*/ {_display_(Seq[Any](format.raw/*90.46*/("""
          """),format.raw/*91.11*/("""<li class="school_list"> <a href=""""),_display_(/*91.46*/routes/*91.52*/.Application.viewSchool(name)),format.raw/*91.81*/(""""> """),_display_(/*91.85*/name),format.raw/*91.89*/(""" """),format.raw/*91.90*/("""</a> </li>
        """)))}),format.raw/*92.10*/("""
    """),format.raw/*93.5*/("""</td>
    <td>
        <h6>Check out these schools close by!</h6>
        """),_display_(/*96.10*/for(name <- closeSchools) yield /*96.35*/ {_display_(Seq[Any](format.raw/*96.37*/("""
          """),format.raw/*97.11*/("""<li class="school_list"> <a href=""""),_display_(/*97.46*/routes/*97.52*/.Application.viewSchool(name)),format.raw/*97.81*/(""""> """),_display_(/*97.85*/name),format.raw/*97.89*/(""" """),format.raw/*97.90*/("""</a> </li>
        """)))}),format.raw/*98.10*/("""
    """),format.raw/*99.5*/("""</td>
    </tr>
    </table>

    <p id="search_other">
      Search <a href=""""),_display_(/*104.24*/routes/*104.30*/.Application.index()),format.raw/*104.50*/("""">other schools</a>.
    </p>


""")))}),format.raw/*108.2*/("""
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
                  DATE: Tue Dec 12 16:47:18 EST 2017
                  SOURCE: /vagrant/316_project/play-colleges/app/views/college.scala.html
                  HASH: 0636ba7cc13b34bf6733faee3063466cfb8aaf77
                  MATRIX: 1038->1|1311->178|1339->181|1368->202|1407->204|1435->205|1491->235|1505->241|1564->279|1619->315|1659->317|1688->320|1746->352|1760->358|1800->378|1869->421|1883->427|1923->447|2005->503|2023->513|2048->518|2088->532|2107->542|2133->547|2163->550|2182->560|2209->566|2359->689|2378->699|2404->704|2533->806|2552->816|2578->821|2703->919|2722->929|2751->937|2881->1040|2900->1050|2926->1055|3000->1102|3058->1144|3098->1146|3137->1157|3241->1234|3266->1238|3413->1358|3445->1369|3591->1488|3623->1499|3711->1556|3745->1563|3852->1643|3871->1653|3897->1658|3927->1661|3946->1671|3973->1677|4087->1765|4104->1773|4136->1784|4222->1844|4239->1852|4278->1870|4394->1960|4411->1968|4441->1977|4522->2032|4539->2040|4573->2053|4693->2147|4710->2155|4748->2172|4859->2257|4876->2265|4909->2277|4988->2330|5005->2338|5037->2349|5208->2493|5256->2525|5296->2527|5335->2538|5397->2573|5412->2579|5462->2608|5493->2612|5518->2616|5547->2617|5598->2637|5630->2642|5744->2729|5794->2763|5834->2765|5873->2776|5935->2811|5950->2817|6000->2846|6031->2850|6056->2854|6085->2855|6136->2875|6168->2880|6270->2955|6311->2980|6351->2982|6390->2993|6452->3028|6467->3034|6517->3063|6548->3067|6573->3071|6602->3072|6653->3092|6685->3097|6792->3176|6808->3182|6850->3202|6914->3235
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|41->9|41->9|41->9|42->10|42->10|42->10|42->10|42->10|42->10|48->16|48->16|48->16|52->20|52->20|52->20|56->24|56->24|56->24|61->29|61->29|61->29|64->32|64->32|64->32|65->33|67->35|67->35|69->37|69->37|71->39|71->39|74->42|75->43|80->48|80->48|80->48|80->48|80->48|80->48|84->52|84->52|84->52|88->56|88->56|88->56|92->60|92->60|92->60|96->64|96->64|96->64|100->68|100->68|100->68|104->72|104->72|104->72|108->76|108->76|108->76|116->84|116->84|116->84|117->85|117->85|117->85|117->85|117->85|117->85|117->85|118->86|119->87|122->90|122->90|122->90|123->91|123->91|123->91|123->91|123->91|123->91|123->91|124->92|125->93|128->96|128->96|128->96|129->97|129->97|129->97|129->97|129->97|129->97|129->97|130->98|131->99|136->104|136->104|136->104|140->108
                  -- GENERATED --
              */
          