
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

object college extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.collegesDB.SchoolInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(schoolInfo: models.collegesDB.SchoolInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),_display_(/*3.2*/main("School Information: " + schoolInfo.name)/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/(""" """)))}/*3.52*/ {_display_(Seq[Any](format.raw/*3.54*/("""
  """),format.raw/*4.3*/("""<p>
    Size: """),_display_(/*5.12*/schoolInfo/*5.22*/.size),format.raw/*5.27*/("""<br/>
    Rank: """),_display_(/*6.12*/schoolInfo/*6.22*/.rank),format.raw/*6.27*/("""<br/>
    Tuition: """),_display_(/*7.15*/schoolInfo/*7.25*/.tuition),format.raw/*7.33*/("""<br/>
    <br/>
    See <a href=""""),_display_(/*9.19*/routes/*9.25*/.Application.index()),format.raw/*9.45*/("""">all schools</a>.
  </p>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(schoolInfo:models.collegesDB.SchoolInfo): play.twirl.api.HtmlFormat.Appendable = apply(schoolInfo)

  def f:((models.collegesDB.SchoolInfo) => play.twirl.api.HtmlFormat.Appendable) = (schoolInfo) => apply(schoolInfo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 31 16:47:17 EDT 2017
                  SOURCE: /vagrant/316_project/play-colleges/app/views/college.scala.html
                  HASH: 312519c0dba19ec61af771d611481f4189b1f3b7
                  MATRIX: 972->1|1109->43|1137->46|1191->92|1230->94|1250->96|1289->98|1318->101|1359->116|1377->126|1402->131|1445->148|1463->158|1488->163|1534->183|1552->193|1580->201|1640->235|1654->241|1694->261|1751->288
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|41->9|41->9|41->9|43->11
                  -- GENERATED --
              */
          