
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
"""),format.raw/*4.1*/("""<div>
  <span id="school_facts">
    <p>
      Located in """),_display_(/*7.19*/schoolInfo/*7.29*/.city),format.raw/*7.34*/(""", """),_display_(/*7.37*/schoolInfo/*7.47*/.state),format.raw/*7.53*/("""<br/>
      Size: """),_display_(/*8.14*/schoolInfo/*8.24*/.size),format.raw/*8.29*/("""<br/>
      Rank: """),_display_(/*9.14*/schoolInfo/*9.24*/.rank),format.raw/*9.29*/("""<br/>
      Tuition: """),_display_(/*10.17*/schoolInfo/*10.27*/.tuition),format.raw/*10.35*/("""<br/>
      <br/>
    </p>
    <p>
      Some facts about """),_display_(/*14.25*/schoolInfo/*14.35*/.city),format.raw/*14.40*/(""", """),_display_(/*14.43*/schoolInfo/*14.53*/.state),format.raw/*14.59*/(""", where available:<br/>
      Population: """),_display_(/*15.20*/cityInfo/*15.28*/.population),format.raw/*15.39*/("""<br/>
      Median resident age: """),_display_(/*16.29*/cityInfo/*16.37*/.medianResidentAge),format.raw/*16.55*/("""<br/>
      Percentage of residents with a high school degree: """),_display_(/*17.59*/cityInfo/*17.67*/.HSDegree),format.raw/*17.76*/("""%<br/>
      Median income: """),_display_(/*18.23*/cityInfo/*18.31*/.medianIncome),format.raw/*18.44*/("""<br/>
      Percentage of residents living below the poverty line: """),_display_(/*19.63*/cityInfo/*19.71*/.belowPovertyLine),format.raw/*19.88*/("""%<br/>
      Percentage of residents that were born outside the US: """),_display_(/*20.63*/cityInfo/*20.71*/.foreignBorn),format.raw/*20.83*/("""%<br/>
      Crime index: """),_display_(/*21.21*/cityInfo/*21.29*/.crimeIndex),format.raw/*21.40*/("""<br/>
    </p>
  </span>
<span id="map">

  

</span>

</div>
  <p>
      Check out these schools with similar sizes!
      """),_display_(/*33.8*/for(name <- similarSizedSchools) yield /*33.40*/ {_display_(Seq[Any](format.raw/*33.42*/("""
        """),format.raw/*34.9*/("""<li> <a href=""""),_display_(/*34.24*/routes/*34.30*/.Application.viewSchool(name)),format.raw/*34.59*/(""""> """),_display_(/*34.63*/name),format.raw/*34.67*/(""" """),format.raw/*34.68*/("""</a> </li>
      """)))}),format.raw/*35.8*/("""
  """),format.raw/*36.3*/("""</p>
  <p>
      Check out these schools with similar tuition!
      """),_display_(/*39.8*/for(name <- similarTuitionSchools) yield /*39.42*/ {_display_(Seq[Any](format.raw/*39.44*/("""
        """),format.raw/*40.9*/("""<li> <a href=""""),_display_(/*40.24*/routes/*40.30*/.Application.viewSchool(name)),format.raw/*40.59*/(""""> """),_display_(/*40.63*/name),format.raw/*40.67*/(""" """),format.raw/*40.68*/("""</a> </li>
      """)))}),format.raw/*41.8*/("""
  """),format.raw/*42.3*/("""</p>
  <p>
      Check out these schools close by!
      """),_display_(/*45.8*/for(name <- closeSchools) yield /*45.33*/ {_display_(Seq[Any](format.raw/*45.35*/("""
        """),format.raw/*46.9*/("""<li> <a href=""""),_display_(/*46.24*/routes/*46.30*/.Application.viewSchool(name)),format.raw/*46.59*/(""""> """),_display_(/*46.63*/name),format.raw/*46.67*/(""" """),format.raw/*46.68*/("""</a> </li>
      """)))}),format.raw/*47.8*/("""
  """),format.raw/*48.3*/("""</p>
  <p>
    Search <a href=""""),_display_(/*50.22*/routes/*50.28*/.Application.index()),format.raw/*50.48*/("""">other schools</a>.
  </p>
""")))}),format.raw/*52.2*/("""
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
                  DATE: Mon Dec 11 16:56:15 EST 2017
                  SOURCE: /vagrant/project/316_project/play-colleges/app/views/college.scala.html
                  HASH: 4db9f4e1db1c7a65c13e82e121dede812946f644
                  MATRIX: 1038->1|1312->179|1340->182|1369->203|1408->205|1428->207|1467->209|1494->210|1579->269|1597->279|1622->284|1651->287|1669->297|1695->303|1740->322|1758->332|1783->337|1828->356|1846->366|1871->371|1920->393|1939->403|1968->411|2054->470|2073->480|2099->485|2129->488|2148->498|2175->504|2245->547|2262->555|2294->566|2355->600|2372->608|2411->626|2502->690|2519->698|2549->707|2605->736|2622->744|2656->757|2751->825|2768->833|2806->850|2902->919|2919->927|2952->939|3006->966|3023->974|3055->985|3206->1110|3254->1142|3294->1144|3330->1153|3372->1168|3387->1174|3437->1203|3468->1207|3493->1211|3522->1212|3570->1230|3600->1233|3696->1303|3746->1337|3786->1339|3822->1348|3864->1363|3879->1369|3929->1398|3960->1402|3985->1406|4014->1407|4062->1425|4092->1428|4176->1486|4217->1511|4257->1513|4293->1522|4335->1537|4350->1543|4400->1572|4431->1576|4456->1580|4485->1581|4533->1599|4563->1602|4622->1634|4637->1640|4678->1660|4737->1689
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|39->7|39->7|39->7|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|46->14|46->14|46->14|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|65->33|65->33|65->33|66->34|66->34|66->34|66->34|66->34|66->34|66->34|67->35|68->36|71->39|71->39|71->39|72->40|72->40|72->40|72->40|72->40|72->40|72->40|73->41|74->42|77->45|77->45|77->45|78->46|78->46|78->46|78->46|78->46|78->46|78->46|79->47|80->48|82->50|82->50|82->50|84->52
                  -- GENERATED --
              */
          