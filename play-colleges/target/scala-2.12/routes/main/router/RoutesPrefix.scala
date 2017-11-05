
// @GENERATOR:play-routes-compiler
// @SOURCE:/vagrant/316_project/play-colleges/conf/routes
// @DATE:Sun Nov 05 13:52:04 EST 2017


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
