package controllers;

import dto.*;
import org.junit.Test;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;

import static org.junit.Assert.assertEquals;
import static play.test.Helpers.*;

public class RegistrationControllerTest extends WithApplication {
    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    @Test
    public void testIndexGET() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/register");
        Result result = route(app, request);
        assertEquals(OK, result.status());  //303 is the default HTTP code for  Redirect
    }

    @Test
    public void testIndexPOST() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(POST)
                .uri("/register/login");

        Result result = route(app, request);
        assertEquals(OK, result.status());  //303 is the default HTTP code for  Redirect
    }

    @Test
    public void testRegisterValidate() {
        RegistrationForm register = new RegistrationForm();
        register.setEmail("abc");
        register.setName("def");
        register.setPassword1("456");
        register.setPassword2("123");
        assertEquals(register.validate(), null);
        register.setPassword2("123");
        register.setPassword1("566");
        register.setEmail("asddf");
        register.setName(null);
        assertEquals(register.validate(), "Invalid details");
        register.setPassword1("566");
        register.setEmail("asddf");
        register.setName(null);
        assertEquals(register.validate(), "Invalid details");
    }
}