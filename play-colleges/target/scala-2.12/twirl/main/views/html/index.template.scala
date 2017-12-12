
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
  def apply/*1.2*/(school: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),_display_(/*3.2*/main("")/*3.10*/ {_display_(Seq[Any](format.raw/*3.12*/(""" """)))}/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
  """),format.raw/*4.3*/("""<ul>
    <li id="nav"><a class="active" href=""""),_display_(/*5.43*/routes/*5.49*/.Application.index()),format.raw/*5.69*/("""">Home</a></li>
    <li id="nav"><a href=""""),_display_(/*6.28*/routes/*6.34*/.Application.about()),format.raw/*6.54*/("""">About</a></li>
  </ul>

  <h1>The College Database</h1>
  <p id="tdesc">Get the facts about schools you might be interested in, as well as similar institutions you may not have known about!</p>
</div>
  <div id="container">

  <div class="photobanner">
    	<img class="first" src=""""),_display_(/*15.31*/routes/*15.37*/.Assets.at("images/col1.jpg")),format.raw/*15.66*/("""" alt="" />
    	<img src=""""),_display_(/*16.17*/routes/*16.23*/.Assets.at("images/col2.jpg")),format.raw/*16.52*/("""" alt="" />
    	<img src=""""),_display_(/*17.17*/routes/*17.23*/.Assets.at("images/col3.jpg")),format.raw/*17.52*/("""" alt="" />
    	<img src=""""),_display_(/*18.17*/routes/*18.23*/.Assets.at("images/col4.jpg")),format.raw/*18.52*/("""" alt="" />
    	<img src=""""),_display_(/*19.17*/routes/*19.23*/.Assets.at("images/col5.jpg")),format.raw/*19.52*/("""" alt="" />
    	<img src=""""),_display_(/*20.17*/routes/*20.23*/.Assets.at("images/col6.jpg")),format.raw/*20.52*/("""" alt="" />
    	<img src=""""),_display_(/*21.17*/routes/*21.23*/.Assets.at("images/col7.jpg")),format.raw/*21.52*/("""" alt="" />
    	<img src=""""),_display_(/*22.17*/routes/*22.23*/.Assets.at("images/col1.jpg")),format.raw/*22.52*/("""" alt="" />
    	<img src=""""),_display_(/*23.17*/routes/*23.23*/.Assets.at("images/col2.jpg")),format.raw/*23.52*/("""" alt="" />
    	<img src=""""),_display_(/*24.17*/routes/*24.23*/.Assets.at("images/col3.jpg")),format.raw/*24.52*/("""" alt="" />
      <img src=""""),_display_(/*25.18*/routes/*25.24*/.Assets.at("images/col4.jpg")),format.raw/*25.53*/("""" alt="" />
    </div>
  </div>

  <form id="searchbox" method="post" action=""""),_display_(/*29.47*/routes/*29.53*/.Application.viewSchoolSearch()),format.raw/*29.84*/("""">
    """),_display_(/*30.6*/helper/*30.12*/.CSRF.formField),format.raw/*30.27*/("""
    """),format.raw/*31.5*/("""<input list="schools" type="text" name="name" placeholder="Search for a School..."><br/>
      <datalist id="schools">
        """),_display_(/*33.10*/for(name <- school) yield /*33.29*/ {_display_(Seq[Any](format.raw/*33.31*/("""
          """),format.raw/*34.11*/("""<option value=""""),_display_(/*34.27*/name),format.raw/*34.31*/(""""> <a href=""""),_display_(/*34.44*/routes/*34.50*/.Application.viewSchool(name)),format.raw/*34.79*/(""""> """),_display_(/*34.83*/name),format.raw/*34.87*/(""" """),format.raw/*34.88*/("""</a> </option>
        """)))}),format.raw/*35.10*/("""
      """),format.raw/*36.7*/("""</datalist>
    <input id="go" type="submit" value="GO"/>
  </form>

  </p>
""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(school:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(school)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (school) => apply(school)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 12 17:03:10 EST 2017
                  SOURCE: /vagrant/316_project/play-colleges/app/views/index.scala.html
                  HASH: 7ea96ec51d6aeec8d9756fb5d91b5907b889163d
                  MATRIX: 954->1|1071->23|1099->26|1115->34|1154->36|1174->38|1213->40|1242->43|1315->90|1329->96|1369->116|1438->159|1452->165|1492->185|1804->470|1819->476|1869->505|1924->533|1939->539|1989->568|2044->596|2059->602|2109->631|2164->659|2179->665|2229->694|2284->722|2299->728|2349->757|2404->785|2419->791|2469->820|2524->848|2539->854|2589->883|2644->911|2659->917|2709->946|2764->974|2779->980|2829->1009|2884->1037|2899->1043|2949->1072|3005->1101|3020->1107|3070->1136|3176->1215|3191->1221|3243->1252|3277->1260|3292->1266|3328->1281|3360->1286|3515->1414|3550->1433|3590->1435|3629->1446|3672->1462|3697->1466|3737->1479|3752->1485|3802->1514|3833->1518|3858->1522|3887->1523|3942->1547|3976->1554|4083->1631
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|61->29|61->29|61->29|62->30|62->30|62->30|63->31|65->33|65->33|65->33|66->34|66->34|66->34|66->34|66->34|66->34|66->34|66->34|66->34|67->35|68->36|73->41
                  -- GENERATED --
              */
          