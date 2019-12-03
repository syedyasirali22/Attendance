// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Syed_Yasir_PlayProject/Attendance/attendance/conf/routes
// @DATE:Tue Dec 03 18:36:34 IST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseRegistrationController RegistrationController = new controllers.ReverseRegistrationController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLoginController LoginController = new controllers.ReverseLoginController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseRegistrationController RegistrationController = new controllers.javascript.ReverseRegistrationController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLoginController LoginController = new controllers.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
