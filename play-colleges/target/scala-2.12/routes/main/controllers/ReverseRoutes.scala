
// @GENERATOR:play-routes-compiler
// @SOURCE:/vagrant/316_project/play-colleges/conf/routes
// @DATE:Tue Oct 31 16:30:09 EDT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:11
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def at(file:String): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:5
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:6
    def viewSchool(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "School/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
  }


}
