
// @GENERATOR:play-routes-compiler
// @SOURCE:/vagrant/play-beers/conf/routes
// @DATE:Tue Oct 17 14:38:47 EDT 2017

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
  
    // @LINE:7
    def editDrinker(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "edit-drinker/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:8
    def updateDrinker(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "update-drinker")
    }
  
    // @LINE:6
    def viewDrinker(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "drinker/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
  }


}
