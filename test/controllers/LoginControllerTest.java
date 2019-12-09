package controllers;

import  dto.*;
import org.junit.Test;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;
import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.*;
import static play.test.Helpers.route;

public class LoginControllerTest extends WithApplication {
    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    @Test
    public void testIndexGET() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/login");
        Result result = route(app, request);
        assertEquals(OK, result.status());  //303 is the default HTTP code for  Redirect
    }

    @Test
    public void testIndexPOST() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(POST)
                .uri("/login");
        Result result = route(app, request);
        assertEquals(OK, result.status());  //303 is the default HTTP code for  Redirect
    }


    @Test
    public void testloginValidate(){
        LoginForm login=new LoginForm();
        login.setEmail("abc");
        login.setPassword("asadd");
        assertEquals(login.validate(),null);
        login.setPassword("");
        login.setEmail("acv");
        assertEquals(login.validate(),"Invalid details");
        login.setPassword("abc");
        login.setEmail("");
        assertEquals(login.validate(),"Invalid details");
        login.setPassword("");
        login.setEmail("");
        assertEquals(login.validate(),"Invalid details");
    }
}