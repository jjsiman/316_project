
// @GENERATOR:play-routes-compiler
// @SOURCE:/vagrant/316_project/play-colleges/conf/routes
// @DATE:Tue Oct 31 16:30:09 EDT 2017


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
