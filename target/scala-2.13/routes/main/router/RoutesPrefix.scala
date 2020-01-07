// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Syed_Yasir_PlayProject/Attendance/attendance/conf/routes
// @DATE:Mon Jan 06 13:22:30 IST 2020


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
