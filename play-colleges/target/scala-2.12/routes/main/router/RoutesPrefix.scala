
// @GENERATOR:play-routes-compiler
// @SOURCE:/vagrant/project/316_project/play-colleges/conf/routes
// @DATE:Sun Nov 05 14:40:55 EST 2017


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
