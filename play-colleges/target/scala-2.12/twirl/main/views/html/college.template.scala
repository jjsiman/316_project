
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
    <hr>
  <p align="center">All About """),_display_(/*46.32*/schoolInfo/*46.42*/.city),format.raw/*46.47*/(""", """),_display_(/*46.50*/schoolInfo/*46.60*/.state),format.raw/*46.66*/("""</p>
  <table id="city_table" align="center">
    <tr>
		<td>Population</td>
		<td>"""),_display_(/*50.8*/cityInfo/*50.16*/.population),format.raw/*50.27*/("""</td>
	</tr>
    <tr>
		<td>Median Resident Age</td>
		<td>"""),_display_(/*54.8*/cityInfo/*54.16*/.medianResidentAge),format.raw/*54.34*/("""</td>
	</tr>
    <tr>
		<td>Percentage of Residents with a High School Degree</td>
		<td>"""),_display_(/*58.8*/cityInfo/*58.16*/.HSDegree),format.raw/*58.25*/("""%</td>
	</tr>
	<tr>
    	<td>Median Income</td>
		<td>"""),_display_(/*62.8*/cityInfo/*62.16*/.medianIncome),format.raw/*62.29*/("""</td>
	</tr>
	<tr>
   		<td>Percentage of Residents Living Below the Poverty Line</td>
		<td>"""),_display_(/*66.8*/cityInfo/*66.16*/.belowPovertyLine),format.raw/*66.33*/("""%</td>
	</tr>
	<tr>
   		<td>Percentage of Residents Born Outside the US</td>
		<td>"""),_display_(/*70.8*/cityInfo/*70.16*/.foreignBorn),format.raw/*70.28*/("""%</td>
	</tr>
	<tr>
    	<td>Crime Index</td>
		<td>"""),_display_(/*74.8*/cityInfo/*74.16*/.crimeIndex),format.raw/*74.27*/("""</td>
	</tr>
  </table>
  <hr/>
  <p>
      Check out these schools with similar sizes!
      """),_display_(/*80.8*/for(name <- similarSizedSchools) yield /*80.40*/ {_display_(Seq[Any](format.raw/*80.42*/("""
        """),format.raw/*81.9*/("""<li> <a href=""""),_display_(/*81.24*/routes/*81.30*/.Application.viewSchool(name)),format.raw/*81.59*/(""""> """),_display_(/*81.63*/name),format.raw/*81.67*/(""" """),format.raw/*81.68*/("""</a> </li>
      """)))}),format.raw/*82.8*/("""
  """),format.raw/*83.3*/("""</p>
  <p>
      Check out these schools with similar tuition!
      """),_display_(/*86.8*/for(name <- similarTuitionSchools) yield /*86.42*/ {_display_(Seq[Any](format.raw/*86.44*/("""
        """),format.raw/*87.9*/("""<li> <a href=""""),_display_(/*87.24*/routes/*87.30*/.Application.viewSchool(name)),format.raw/*87.59*/(""""> """),_display_(/*87.63*/name),format.raw/*87.67*/(""" """),format.raw/*87.68*/("""</a> </li>
      """)))}),format.raw/*88.8*/("""
  """),format.raw/*89.3*/("""</p>
  <p>
      Check out these schools close by!
      """),_display_(/*92.8*/for(name <- closeSchools) yield /*92.33*/ {_display_(Seq[Any](format.raw/*92.35*/("""
        """),format.raw/*93.9*/("""<li> <a href=""""),_display_(/*93.24*/routes/*93.30*/.Application.viewSchool(name)),format.raw/*93.59*/(""""> """),_display_(/*93.63*/name),format.raw/*93.67*/(""" """),format.raw/*93.68*/("""</a> </li>
      """)))}),format.raw/*94.8*/("""
  """),format.raw/*95.3*/("""</p>
  <p>
    Search <a href=""""),_display_(/*97.22*/routes/*97.28*/.Application.index()),format.raw/*97.48*/("""">other schools</a>.
  </p>
""")))}),format.raw/*99.2*/("""
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
                  DATE: Mon Dec 11 23:36:19 EST 2017
                  SOURCE: /vagrant/project/316_project/play-colleges/app/views/college.scala.html
                  HASH: 2f0a2425e745e899537f1fa7c940edf317157814
                  MATRIX: 1038->1|1311->178|1339->181|1368->202|1407->204|1435->205|1491->235|1505->241|1564->279|1619->315|1659->317|1688->320|1746->352|1760->358|1800->378|1869->421|1883->427|1923->447|2005->503|2023->513|2048->518|2088->532|2107->542|2133->547|2163->550|2182->560|2209->566|2359->689|2378->699|2404->704|2533->806|2552->816|2578->821|2703->919|2722->929|2751->937|2852->1011|2871->1021|2897->1026|2971->1073|3029->1115|3069->1117|3108->1128|3212->1205|3237->1209|3384->1329|3416->1340|3562->1459|3594->1470|3682->1527|3716->1534|3802->1593|3821->1603|3847->1608|3877->1611|3896->1621|3923->1627|4033->1711|4050->1719|4082->1730|4168->1790|4185->1798|4224->1816|4340->1906|4357->1914|4387->1923|4468->1978|4485->1986|4519->1999|4639->2093|4656->2101|4694->2118|4805->2203|4822->2211|4855->2223|4934->2276|4951->2284|4983->2295|5104->2390|5152->2422|5192->2424|5228->2433|5270->2448|5285->2454|5335->2483|5366->2487|5391->2491|5420->2492|5468->2510|5498->2513|5594->2583|5644->2617|5684->2619|5720->2628|5762->2643|5777->2649|5827->2678|5858->2682|5883->2686|5912->2687|5960->2705|5990->2708|6074->2766|6115->2791|6155->2793|6191->2802|6233->2817|6248->2823|6298->2852|6329->2856|6354->2860|6383->2861|6431->2879|6461->2882|6520->2914|6535->2920|6576->2940|6635->2969
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|41->9|41->9|41->9|42->10|42->10|42->10|42->10|42->10|42->10|48->16|48->16|48->16|52->20|52->20|52->20|56->24|56->24|56->24|61->29|61->29|61->29|64->32|64->32|64->32|65->33|67->35|67->35|69->37|69->37|71->39|71->39|74->42|75->43|78->46|78->46|78->46|78->46|78->46|78->46|82->50|82->50|82->50|86->54|86->54|86->54|90->58|90->58|90->58|94->62|94->62|94->62|98->66|98->66|98->66|102->70|102->70|102->70|106->74|106->74|106->74|112->80|112->80|112->80|113->81|113->81|113->81|113->81|113->81|113->81|113->81|114->82|115->83|118->86|118->86|118->86|119->87|119->87|119->87|119->87|119->87|119->87|119->87|120->88|121->89|124->92|124->92|124->92|125->93|125->93|125->93|125->93|125->93|125->93|125->93|126->94|127->95|129->97|129->97|129->97|131->99
                  -- GENERATED --
              */
          