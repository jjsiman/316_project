
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mrguhan/316_project/play-colleges/conf/routes
// @DATE:Tue Nov 07 09:57:48 EST 2017


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
