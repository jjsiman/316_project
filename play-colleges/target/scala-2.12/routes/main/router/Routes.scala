
// @GENERATOR:play-routes-compiler
// @SOURCE:/vagrant/play-beers/conf/routes
// @DATE:Tue Oct 17 14:38:47 EDT 2017

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
  // @LINE:11
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    Application_1: controllers.Application,
    // @LINE:11
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """drinker/""" + "$" + """name<[^/]+>""", """controllers.Application.viewDrinker(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """edit-drinker/""" + "$" + """name<[^/]+>""", """controllers.Application.editDrinker(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update-drinker""", """controllers.Application.updateDrinker()"""),
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
  private[this] lazy val controllers_Application_viewDrinker1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("drinker/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_viewDrinker1_invoker = createInvoker(
    Application_1.viewDrinker(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "viewDrinker",
      Seq(classOf[String]),
      "GET",
      this.prefix + """drinker/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_editDrinker2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("edit-drinker/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_editDrinker2_invoker = createInvoker(
    Application_1.editDrinker(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "editDrinker",
      Seq(classOf[String]),
      "GET",
      this.prefix + """edit-drinker/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_updateDrinker3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update-drinker")))
  )
  private[this] lazy val controllers_Application_updateDrinker3_invoker = createInvoker(
    Application_1.updateDrinker(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateDrinker",
      Nil,
      "POST",
      this.prefix + """update-drinker""",
      """""",
      Seq()
    )
  )

  // @LINE:11
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
    case controllers_Application_viewDrinker1_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_viewDrinker1_invoker.call(Application_1.viewDrinker(name))
      }
  
    // @LINE:7
    case controllers_Application_editDrinker2_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_editDrinker2_invoker.call(Application_1.editDrinker(name))
      }
  
    // @LINE:8
    case controllers_Application_updateDrinker3_route(params) =>
      call { 
        controllers_Application_updateDrinker3_invoker.call(Application_1.updateDrinker())
      }
  
    // @LINE:11
    case controllers_Assets_at4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at4_invoker.call(Assets_0.at(path, file))
      }
  }
}
