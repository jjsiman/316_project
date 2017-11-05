
// @GENERATOR:play-routes-compiler
// @SOURCE:/vagrant/project/316_project/play-colleges/conf/routes
// @DATE:Sun Nov 05 14:40:55 EST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:12
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
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
  
    // @LINE:9
    def viewSchoolSearch(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "search-school")
    }
  
    // @LINE:6
    def viewSchool(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "School/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
  }


}
