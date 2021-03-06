
// @GENERATOR:play-routes-compiler
// @SOURCE:/vagrant/316_project/play-colleges/conf/routes
// @DATE:Tue Dec 12 14:20:18 EST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  Application_1: controllers.Application,
  // @LINE:13
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    Application_1: controllers.Application,
    // @LINE:13
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.Application.about()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """school/""" + "$" + """name<[^/]+>""", """controllers.Application.viewSchool(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search-school""", """controllers.Application.viewSchoolSearch()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_Application_about1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_Application_about1_invoker = createInvoker(
    Application_1.about(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "about",
      Nil,
      "GET",
      this.prefix + """about""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_viewSchool2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("school/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_viewSchool2_invoker = createInvoker(
    Application_1.viewSchool(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "viewSchool",
      Seq(classOf[String]),
      "GET",
      this.prefix + """school/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_viewSchoolSearch3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search-school")))
  )
  private[this] lazy val controllers_Application_viewSchoolSearch3_invoker = createInvoker(
    Application_1.viewSchoolSearch(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "viewSchoolSearch",
      Nil,
      "POST",
      this.prefix + """search-school""",
      """GET     /edit-drinker/:name         controllers.Application.editDrinker(name:String)
POST    /update-drinker             controllers.Application.updateDrinker()""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_at4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at4_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:6
    case controllers_Application_about1_route(params) =>
      call { 
        controllers_Application_about1_invoker.call(Application_1.about())
      }
  
    // @LINE:7
    case controllers_Application_viewSchool2_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_viewSchool2_invoker.call(Application_1.viewSchool(name))
      }
  
    // @LINE:10
    case controllers_Application_viewSchoolSearch3_route(params) =>
      call { 
        controllers_Application_viewSchoolSearch3_invoker.call(Application_1.viewSchoolSearch())
      }
  
    // @LINE:13
    case controllers_Assets_at4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at4_invoker.call(Assets_0.at(path, file))
      }
  }
}
