
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

object drinker extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.BeerDB.DrinkerInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(drinkerInfo: models.BeerDB.DrinkerInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),_display_(/*3.2*/main("Drinker Information: " + drinkerInfo.name)/*3.50*/ {_display_(Seq[Any](format.raw/*3.52*/(""" """)))}/*3.54*/ {_display_(Seq[Any](format.raw/*3.56*/("""
  """),format.raw/*4.3*/("""<p>
    Address: """),_display_(/*5.15*/drinkerInfo/*5.26*/.address),format.raw/*5.34*/("""<br/>
    """),_display_(/*6.6*/drinkerInfo/*6.17*/.beersLiked.size),format.raw/*6.33*/("""
    """),_display_(/*7.6*/if(drinkerInfo.beersLiked.size > 1)/*7.41*/ {_display_(Seq[Any](format.raw/*7.43*/("""beers""")))}/*7.50*/else/*7.55*/{_display_(Seq[Any](format.raw/*7.56*/("""beer""")))}),format.raw/*7.61*/("""
    """),format.raw/*8.5*/("""liked:
    """),_display_(/*9.6*/for(i <- 0 until drinkerInfo.beersLiked.size) yield /*9.51*/ {_display_(Seq[Any](_display_(/*9.54*/if(i > 0)/*9.63*/ {_display_(Seq[Any](format.raw/*9.65*/(""",""")))}),format.raw/*9.67*/("""
      """),_display_(/*10.8*/drinkerInfo/*10.19*/.beersLiked(i))))}),format.raw/*10.34*/("""<br/>
    """),_display_(/*11.6*/drinkerInfo/*11.17*/.barsFrequented.size),format.raw/*11.37*/("""
    """),_display_(/*12.6*/if(drinkerInfo.barsFrequented.size > 1)/*12.45*/ {_display_(Seq[Any](format.raw/*12.47*/("""bars""")))}/*12.53*/else/*12.58*/{_display_(Seq[Any](format.raw/*12.59*/("""bar""")))}),format.raw/*12.63*/("""
    """),format.raw/*13.5*/("""frequented:
    """),_display_(/*14.6*/for(i <- 0 until drinkerInfo.barsFrequented.size) yield /*14.55*/ {_display_(Seq[Any](_display_(/*14.58*/if(i > 0)/*14.67*/ {_display_(Seq[Any](format.raw/*14.69*/(""",""")))}),format.raw/*14.71*/("""
      """),_display_(/*15.8*/drinkerInfo/*15.19*/.barsFrequented(i)),format.raw/*15.37*/("""
      """),format.raw/*16.7*/("""("""),_display_(/*16.9*/drinkerInfo/*16.20*/.timesFrequented(i)),format.raw/*16.39*/("""
       """),_display_(/*17.9*/if(drinkerInfo.timesFrequented(i) > 1)/*17.47*/ {_display_(Seq[Any](format.raw/*17.49*/("""times""")))}/*17.56*/else/*17.61*/{_display_(Seq[Any](format.raw/*17.62*/("""time""")))}),format.raw/*17.67*/("""
       """),format.raw/*18.8*/("""a week)""")))}),format.raw/*18.16*/("""<br/>
    <br/>
    <a href=""""),_display_(/*20.15*/routes/*20.21*/.Application.editDrinker(drinkerInfo.name)),format.raw/*20.63*/("""">Edit</a>
    this information or see
    <a href=""""),_display_(/*22.15*/routes/*22.21*/.Application.index()),format.raw/*22.41*/("""">all drinkers</a>.
  </p>
""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(drinkerInfo:models.BeerDB.DrinkerInfo): play.twirl.api.HtmlFormat.Appendable = apply(drinkerInfo)

  def f:((models.BeerDB.DrinkerInfo) => play.twirl.api.HtmlFormat.Appendable) = (drinkerInfo) => apply(drinkerInfo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 17 14:38:48 EDT 2017
                  SOURCE: /vagrant/play-beers/app/views/drinker.scala.html
                  HASH: c9d958c264f2fa05ef6b1f51ad2c87d797291810
                  MATRIX: 969->1|1104->41|1132->44|1188->92|1227->94|1247->96|1286->98|1315->101|1359->119|1378->130|1406->138|1442->149|1461->160|1497->176|1528->182|1571->217|1610->219|1634->226|1646->231|1684->232|1719->237|1750->242|1787->254|1847->299|1886->302|1903->311|1942->313|1974->315|2008->323|2028->334|2067->349|2104->360|2124->371|2165->391|2197->397|2245->436|2285->438|2309->444|2322->449|2361->450|2396->454|2428->459|2471->476|2536->525|2576->528|2594->537|2634->539|2667->541|2701->549|2721->560|2760->578|2794->585|2822->587|2842->598|2882->617|2917->626|2964->664|3004->666|3029->673|3042->678|3081->679|3117->684|3152->692|3191->700|3248->730|3263->736|3326->778|3406->831|3421->837|3462->857|3520->885
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|39->7|39->7|39->7|39->7|40->8|41->9|41->9|41->9|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|44->12|44->12|44->12|44->12|45->13|46->14|46->14|46->14|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|52->20|52->20|52->20|54->22|54->22|54->22|56->24
                  -- GENERATED --
              */
          