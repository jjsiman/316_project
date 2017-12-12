
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(heading: String)(script: Html)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>College Database</title>
    <meta name="description" content="A better way to make an informed college decision"/>
    <meta name="keywords" content="play, java, colleges"/>
    <meta http-equiv="Content-type" content="text/html;charset=UTF-8"/>
    <link rel="stylesheet" href=""""),_display_(/*12.35*/routes/*12.41*/.Assets.at("stylesheets/main.css")),format.raw/*12.75*/("""" type="text/css" media="screen"/>
    """),_display_(/*13.6*/script),format.raw/*13.12*/("""
  """),format.raw/*14.3*/("""</head>
  <body>

    <ul>
      <li id="nav"><a class="active" href=""""),_display_(/*18.45*/routes/*18.51*/.Application.index()),format.raw/*18.71*/("""">Home</a></li>
      <li id="nav"><a href="#search">Search</a></li>
      <li id="nav"><a href="#about">About</a></li>
    </ul>
    <h1>College Database</h1>
    <h2 id="heading">"""),_display_(/*23.23*/heading),format.raw/*23.30*/("""</h2>
    <div id="content">"""),_display_(/*24.24*/content),format.raw/*24.31*/("""</div>
    <hr/>
  </body>
</html>
"""))
      }
    }
  }

  def render(heading:String,script:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(heading)(script)(content)

  def f:((String) => (Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (heading) => (script) => (content) => apply(heading)(script)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 11 15:27:39 EST 2017
                  SOURCE: /vagrant/project/316_project/play-colleges/app/views/main.scala.html
                  HASH: b7963b7fd057e3c38d6bdcaed80bab2c591d983d
                  MATRIX: 957->1|1098->47|1126->49|1625->521|1640->527|1695->561|1761->601|1788->607|1818->610|1916->681|1931->687|1972->707|2181->889|2209->896|2265->925|2293->932
                  LINES: 28->1|33->1|35->3|44->12|44->12|44->12|45->13|45->13|46->14|50->18|50->18|50->18|55->23|55->23|56->24|56->24
                  -- GENERATED --
              */
          