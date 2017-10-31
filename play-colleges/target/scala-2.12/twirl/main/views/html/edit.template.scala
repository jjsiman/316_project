
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.BeerDB.DrinkerInfo,List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(drinkerInfo: models.BeerDB.DrinkerInfo,
  beers: List[String], bars: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.43*/("""

"""),_display_(/*4.2*/main("Edit Drinker Information: " + drinkerInfo.name)/*4.55*/ {_display_(Seq[Any](format.raw/*4.57*/(""" """)))}/*4.59*/ {_display_(Seq[Any](format.raw/*4.61*/("""
  """),format.raw/*5.3*/("""<form method="post" action=""""),_display_(/*5.32*/routes/*5.38*/.Application.updateDrinker()),format.raw/*5.66*/("""">
    """),_display_(/*6.6*/helper/*6.12*/.CSRF.formField),format.raw/*6.27*/("""
    """),format.raw/*7.5*/("""<input type="hidden" name="name" value=""""),_display_(/*7.46*/drinkerInfo/*7.57*/.name),format.raw/*7.62*/(""""/>
    Address: <input type="text" name="address" value=""""),_display_(/*8.56*/drinkerInfo/*8.67*/.address),format.raw/*8.75*/(""""
                    size="20" maxlength="20"/><br/>
    Beer(s) liked:
    """),_display_(/*11.6*/for(beer <- beers) yield /*11.24*/ {_display_(Seq[Any](format.raw/*11.26*/("""
      """),format.raw/*12.7*/("""<input type="checkbox" name="BeersLiked/"""),_display_(/*12.48*/beer),format.raw/*12.52*/("""" value="1"
             """),_display_(/*13.15*/if(drinkerInfo.beersLiked.contains(beer))/*13.56*/ {_display_(Seq[Any](format.raw/*13.58*/("""checked""")))}),format.raw/*13.66*/("""/>"""),_display_(/*13.69*/beer),format.raw/*13.73*/("""
    """)))}),format.raw/*14.6*/("""<br/>
    Bar(s) frequented (times a week):
    <ul>
    """),_display_(/*17.6*/for(bar <- bars) yield /*17.22*/ {_display_(Seq[Any](format.raw/*17.24*/("""
    """),format.raw/*18.5*/("""<li>"""),_display_(/*18.10*/bar),format.raw/*18.13*/(""" """),format.raw/*18.14*/("""<input type="text" name="BarsFrequented/"""),_display_(/*18.55*/bar),format.raw/*18.58*/(""""
                    """),_display_(/*19.22*/if(drinkerInfo.barsFrequented.contains(bar))/*19.66*/ {_display_(Seq[Any](format.raw/*19.68*/("""
                      """),format.raw/*20.23*/("""value=""""),_display_(/*20.31*/drinkerInfo/*20.42*/.timesFrequented(drinkerInfo.barsFrequented.indexOf(bar))),format.raw/*20.99*/(""""
                    """)))}/*21.23*/else/*21.28*/{_display_(Seq[Any](format.raw/*21.29*/("""
                      """),format.raw/*22.23*/("""value="0"
                    """)))}),format.raw/*23.22*/("""
                    """),format.raw/*24.21*/("""size="1" maxlength="2"/></li>
    """)))}),format.raw/*25.6*/("""
    """),format.raw/*26.5*/("""</ul>
    <input type="reset" value="Reset"/>
    <input type="submit" value="Submit Update"/>
  </form>
""")))}),format.raw/*30.2*/("""
"""))
      }
    }
  }

  def render(drinkerInfo:models.BeerDB.DrinkerInfo,beers:List[String],bars:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(drinkerInfo,beers,bars)

  def f:((models.BeerDB.DrinkerInfo,List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (drinkerInfo,beers,bars) => apply(drinkerInfo,beers,bars)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 17 14:38:47 EDT 2017
                  SOURCE: /vagrant/play-beers/app/views/edit.scala.html
                  HASH: 29f14a1bb999a8860c75d17bd89d82c69a1fafba
                  MATRIX: 992->1|1170->84|1198->87|1259->140|1298->142|1318->144|1357->146|1386->149|1441->178|1455->184|1503->212|1536->220|1550->226|1585->241|1616->246|1683->287|1702->298|1727->303|1812->362|1831->373|1859->381|1963->459|1997->477|2037->479|2071->486|2139->527|2164->531|2217->557|2267->598|2307->600|2346->608|2376->611|2401->615|2437->621|2521->679|2553->695|2593->697|2625->702|2657->707|2681->710|2710->711|2778->752|2802->755|2852->778|2905->822|2945->824|2996->847|3031->855|3051->866|3129->923|3171->947|3184->952|3223->953|3274->976|3336->1007|3385->1028|3450->1063|3482->1068|3618->1174
                  LINES: 28->1|34->2|36->4|36->4|36->4|36->4|36->4|37->5|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|39->7|40->8|40->8|40->8|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|46->14|49->17|49->17|49->17|50->18|50->18|50->18|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|52->20|53->21|53->21|53->21|54->22|55->23|56->24|57->25|58->26|62->30
                  -- GENERATED --
              */
          