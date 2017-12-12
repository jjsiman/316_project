
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
  def apply/*1.2*/(header: String)(script: Html)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.47*/("""

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
    <div id="content">"""),_display_(/*16.24*/content),format.raw/*16.31*/("""</div>
    <hr/>
  </body>
</html>
"""))
      }
    }
  }

  def render(header:String,script:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(header)(script)(content)

  def f:((String) => (Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (header) => (script) => (content) => apply(header)(script)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 11 23:28:34 EST 2017
                  SOURCE: /vagrant/project/316_project/play-colleges/app/views/main.scala.html
                  HASH: 106e2c448e16cd15538cce99bfe243e3d5f4acb9
                  MATRIX: 957->1|1097->46|1125->48|1624->520|1639->526|1694->560|1760->600|1787->606|1817->609|1884->649|1912->656
                  LINES: 28->1|33->1|35->3|44->12|44->12|44->12|45->13|45->13|46->14|48->16|48->16
                  -- GENERATED --
              */
          