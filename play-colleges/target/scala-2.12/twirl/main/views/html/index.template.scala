
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
  
  <div id="container">

  <div class="photobanner">
    	<img class="first" src=""""),_display_(/*12.31*/routes/*12.37*/.Assets.at("images/col1.jpg")),format.raw/*12.66*/("""" alt="" />
    	<img src=""""),_display_(/*13.17*/routes/*13.23*/.Assets.at("images/col2.jpg")),format.raw/*13.52*/("""" alt="" />
    	<img src=""""),_display_(/*14.17*/routes/*14.23*/.Assets.at("images/col3.jpg")),format.raw/*14.52*/("""" alt="" />
    	<img src=""""),_display_(/*15.17*/routes/*15.23*/.Assets.at("images/col4.jpg")),format.raw/*15.52*/("""" alt="" />
    	<img src=""""),_display_(/*16.17*/routes/*16.23*/.Assets.at("images/col5.jpg")),format.raw/*16.52*/("""" alt="" />
    	<img src=""""),_display_(/*17.17*/routes/*17.23*/.Assets.at("images/col6.jpg")),format.raw/*17.52*/("""" alt="" />
    	<img src=""""),_display_(/*18.17*/routes/*18.23*/.Assets.at("images/col7.jpg")),format.raw/*18.52*/("""" alt="" />
    	<img src=""""),_display_(/*19.17*/routes/*19.23*/.Assets.at("images/col1.jpg")),format.raw/*19.52*/("""" alt="" />
    	<img src=""""),_display_(/*20.17*/routes/*20.23*/.Assets.at("images/col2.jpg")),format.raw/*20.52*/("""" alt="" />
    	<img src=""""),_display_(/*21.17*/routes/*21.23*/.Assets.at("images/col3.jpg")),format.raw/*21.52*/("""" alt="" />
      <img src=""""),_display_(/*22.18*/routes/*22.24*/.Assets.at("images/col4.jpg")),format.raw/*22.53*/("""" alt="" />
    </div>
  </div>

  <form id="searchbox" method="post" action=""""),_display_(/*26.47*/routes/*26.53*/.Application.viewSchoolSearch()),format.raw/*26.84*/("""">
    <p>Search for a school:</p>
    """),_display_(/*28.6*/helper/*28.12*/.CSRF.formField),format.raw/*28.27*/("""
    """),format.raw/*29.5*/("""<input list="schools" type="text" name="name" placeholder="School name"><br/>
      <datalist id="schools">
        """),_display_(/*31.10*/for(name <- school) yield /*31.29*/ {_display_(Seq[Any](format.raw/*31.31*/("""
          """),format.raw/*32.11*/("""<option value=""""),_display_(/*32.27*/name),format.raw/*32.31*/(""""> <a href=""""),_display_(/*32.44*/routes/*32.50*/.Application.viewSchool(name)),format.raw/*32.79*/(""""> """),_display_(/*32.83*/name),format.raw/*32.87*/(""" """),format.raw/*32.88*/("""</a> </option>
        """)))}),format.raw/*33.10*/("""
      """),format.raw/*34.7*/("""</datalist>
    <input type="submit" value="Go!"/>
  </form>

  </p>
""")))}),format.raw/*39.2*/("""
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
                  DATE: Mon Dec 11 23:06:18 EST 2017
                  SOURCE: /vagrant/project/316_project/play-colleges/app/views/index.scala.html
                  HASH: a26af6a94923a7a5a593e53722fe818ed91ad71c
                  MATRIX: 954->1|1071->23|1099->26|1115->34|1154->36|1174->38|1213->40|1242->43|1315->90|1329->96|1369->116|1438->159|1452->165|1492->185|1629->295|1644->301|1694->330|1749->358|1764->364|1814->393|1869->421|1884->427|1934->456|1989->484|2004->490|2054->519|2109->547|2124->553|2174->582|2229->610|2244->616|2294->645|2349->673|2364->679|2414->708|2469->736|2484->742|2534->771|2589->799|2604->805|2654->834|2709->862|2724->868|2774->897|2830->926|2845->932|2895->961|3001->1040|3016->1046|3068->1077|3134->1117|3149->1123|3185->1138|3217->1143|3361->1260|3396->1279|3436->1281|3475->1292|3518->1308|3543->1312|3583->1325|3598->1331|3648->1360|3679->1364|3704->1368|3733->1369|3788->1393|3822->1400|3922->1470
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|58->26|58->26|58->26|60->28|60->28|60->28|61->29|63->31|63->31|63->31|64->32|64->32|64->32|64->32|64->32|64->32|64->32|64->32|64->32|65->33|66->34|71->39
                  -- GENERATED --
              */
          