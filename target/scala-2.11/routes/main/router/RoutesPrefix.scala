
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/WebCA/conf/routes
// @DATE:Sat Nov 19 23:35:42 GMT 2016


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
