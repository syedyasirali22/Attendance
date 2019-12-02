package controllers;
import org.junit.Test;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;
import static org.junit.Assert.assertEquals;
import static play.test.Helpers.*;
public class HomeControllerTest extends WithApplication {
    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    @Test
    public void testIndex() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/");

        Result result = route(app, request);
        assertEquals(303, result.status());  //303 is the default HTTP code for  Redirect
    }
    @Test
    public void testRegister(){
        Http.RequestBuilder request= new Http.RequestBuilder().method(GET).uri("/register");
        Result result = route(app, request);
        assertEquals(200, result.status());  //200 is default HTTP code for render
    }
}