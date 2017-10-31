
// @GENERATOR:play-routes-compiler
// @SOURCE:/vagrant/play-beers/conf/routes
// @DATE:Tue Oct 17 14:38:47 EDT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
