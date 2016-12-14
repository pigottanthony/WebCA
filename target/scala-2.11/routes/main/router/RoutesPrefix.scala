
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/webca/conf/routes
// @DATE:Wed Dec 14 11:19:20 GMT 2016


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
