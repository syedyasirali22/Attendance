// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Syed_Yasir_PlayProject/Attendance/attendance/conf/routes
// @DATE:Mon Dec 02 14:33:33 IST 2019


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
