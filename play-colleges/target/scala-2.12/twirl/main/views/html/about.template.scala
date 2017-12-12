
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("")/*3.10*/ {_display_(Seq[Any](format.raw/*3.12*/(""" """)))}/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
  """),format.raw/*4.3*/("""<ul>
    <li id="nav"><a href=""""),_display_(/*5.28*/routes/*5.34*/.Application.index()),format.raw/*5.54*/("""">Home</a></li>
    <li id="nav"><a class="active" href=""""),_display_(/*6.43*/routes/*6.49*/.Application.about()),format.raw/*6.69*/("""">About</a></li>
  </ul>

  <section id="about_banner">
    <div class="about_inner">
      <h1>About Us</h1>
      <p>A data driven integrative search to help you find your dream school.</p>
    </div>
  </section>

  <section id="about_info">
    <p>Building a website is, in many ways, an exercise of willpower. It’s tempting to get distracted by the bells and whistles of the design process, and forget all about creating compelling content. But it's that last part that's crucial to making inbound marketing work for your business.</p>
    <p>So how do you balance your remarkable content creation with your web design needs? It all starts with the "About Us" page.</p>
    <p>For a remarkable about page, all you need to do is figure out your company's unique identity, and then share it with the world. Easy, right? Of course it's not easy. That said, the "About Us" page is one of the most important pages on your website, and it can't go neglected. It also happens to be one of the most commonly overlooked pages, which is why you should make it stand out.</p>
    <p>But it can be accomplished. In fact, there are some companies out there with remarkable "About Us" pages, and there are elements of them that you can emulate on your own website. By the end of this post, showing off how your company's greatness won't seem like such a challenging feat.</p>
    <p>Go back to <a href=""""),_display_(/*21.29*/routes/*21.35*/.Application.index()),format.raw/*21.55*/("""">search</a>.</p>
  </section>
""")))}),format.raw/*23.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 11 23:06:18 EST 2017
                  SOURCE: /vagrant/project/316_project/play-colleges/app/views/about.scala.html
                  HASH: 7efa041f8bcacc0bcb5e31a62cfba08cad301abb
                  MATRIX: 948->1|1060->18|1088->21|1104->29|1143->31|1163->33|1202->35|1231->38|1289->70|1303->76|1343->96|1427->154|1441->160|1481->180|2903->1575|2918->1581|2959->1601|3021->1633
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|53->21|53->21|53->21|55->23
                  -- GENERATED --
              */
          