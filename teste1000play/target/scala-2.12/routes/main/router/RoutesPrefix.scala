// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Junior.GERSON/Desktop/teste1000play/conf/routes
// @DATE:Fri Apr 12 16:49:11 GMT-03:00 2019


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
