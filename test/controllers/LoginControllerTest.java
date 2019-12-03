package controllers;

import  dto.*;
import org.junit.Test;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.test.WithApplication;
import static org.junit.Assert.assertEquals;

public class LoginControllerTest extends WithApplication {
    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
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