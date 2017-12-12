
// @GENERATOR:play-routes-compiler
// @SOURCE:/vagrant/316_project/play-colleges/conf/routes
// @DATE:Tue Dec 12 14:20:18 EST 2017


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
