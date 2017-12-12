
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

  """),format.raw/*5.3*/("""<div id="container">

  <div class="photobanner">
    	<img class="first" src=""""),_display_(/*8.31*/routes/*8.37*/.Assets.at("images/col1.jpg")),format.raw/*8.66*/("""" alt="" />
    	<img src=""""),_display_(/*9.17*/routes/*9.23*/.Assets.at("images/col2.jpg")),format.raw/*9.52*/("""" alt="" />
    	<img src=""""),_display_(/*10.17*/routes/*10.23*/.Assets.at("images/col3.jpg")),format.raw/*10.52*/("""" alt="" />
    	<img src=""""),_display_(/*11.17*/routes/*11.23*/.Assets.at("images/col4.jpg")),format.raw/*11.52*/("""" alt="" />
    	<img src=""""),_display_(/*12.17*/routes/*12.23*/.Assets.at("images/col5.jpg")),format.raw/*12.52*/("""" alt="" />
    	<img src=""""),_display_(/*13.17*/routes/*13.23*/.Assets.at("images/col6.jpg")),format.raw/*13.52*/("""" alt="" />
    	<img src=""""),_display_(/*14.17*/routes/*14.23*/.Assets.at("images/col7.jpg")),format.raw/*14.52*/("""" alt="" />
    	<img src=""""),_display_(/*15.17*/routes/*15.23*/.Assets.at("images/col1.jpg")),format.raw/*15.52*/("""" alt="" />
    	<img src=""""),_display_(/*16.17*/routes/*16.23*/.Assets.at("images/col2.jpg")),format.raw/*16.52*/("""" alt="" />
    	<img src=""""),_display_(/*17.17*/routes/*17.23*/.Assets.at("images/col3.jpg")),format.raw/*17.52*/("""" alt="" />
      <img src=""""),_display_(/*18.18*/routes/*18.24*/.Assets.at("images/col4.jpg")),format.raw/*18.53*/("""" alt="" />
    </div>
  </div>

  <form id="searchbox" method="post" action=""""),_display_(/*22.47*/routes/*22.53*/.Application.viewSchoolSearch()),format.raw/*22.84*/("""">
    <p>Search for a school:</p>
    """),_display_(/*24.6*/helper/*24.12*/.CSRF.formField),format.raw/*24.27*/("""
    """),format.raw/*25.5*/("""<input list="schools" type="text" name="name" placeholder="School name"><br/>
      <datalist id="schools">
        """),_display_(/*27.10*/for(name <- school) yield /*27.29*/ {_display_(Seq[Any](format.raw/*27.31*/("""
          """),format.raw/*28.11*/("""<option value=""""),_display_(/*28.27*/name),format.raw/*28.31*/(""""> <a href=""""),_display_(/*28.44*/routes/*28.50*/.Application.viewSchool(name)),format.raw/*28.79*/(""""> """),_display_(/*28.83*/name),format.raw/*28.87*/(""" """),format.raw/*28.88*/("""</a> </option>
        """)))}),format.raw/*29.10*/("""
      """),format.raw/*30.7*/("""</datalist>
    <input type="submit" value="Go!"/>
  </form>

  </p>
""")))}),format.raw/*35.2*/("""
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
                  DATE: Mon Dec 11 17:19:49 EST 2017
                  SOURCE: /vagrant/project/316_project/play-colleges/app/views/index.scala.html
                  HASH: 8713020952e97cff81c96adf16b308969323a7f1
                  MATRIX: 954->1|1071->23|1099->26|1115->34|1154->36|1174->38|1213->40|1243->44|1349->124|1363->130|1412->159|1466->187|1480->193|1529->222|1584->250|1599->256|1649->285|1704->313|1719->319|1769->348|1824->376|1839->382|1889->411|1944->439|1959->445|2009->474|2064->502|2079->508|2129->537|2184->565|2199->571|2249->600|2304->628|2319->634|2369->663|2424->691|2439->697|2489->726|2545->755|2560->761|2610->790|2716->869|2731->875|2783->906|2849->946|2864->952|2900->967|2932->972|3076->1089|3111->1108|3151->1110|3190->1121|3233->1137|3258->1141|3298->1154|3313->1160|3363->1189|3394->1193|3419->1197|3448->1198|3503->1222|3537->1229|3637->1299
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|37->5|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|54->22|54->22|54->22|56->24|56->24|56->24|57->25|59->27|59->27|59->27|60->28|60->28|60->28|60->28|60->28|60->28|60->28|60->28|60->28|61->29|62->30|67->35
                  -- GENERATED --
              */
          