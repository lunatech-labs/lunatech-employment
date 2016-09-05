
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/aniket/Development/lunatech-employment/conf/routes
// @DATE:Wed Aug 31 17:45:25 CEST 2016


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
