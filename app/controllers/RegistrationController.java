package controllers;

import dao.*;
import dto.*;
import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.List;

public class RegistrationController extends Controller {
    public Result home() {
        return ok(views.html.home.render());
    }

    public Result index() {
        return ok(views.html.register.render(""));
    }

    private FormFactory formFactory;

    @Inject
    public RegistrationController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result saveRegistration(Http.Request request) {
        BaseResponse response = new BaseResponse();
        Form<RegistrationForm> registrationForm = formFactory.form(RegistrationForm.class).bindFromRequest(request);
        if (registrationForm.hasErrors()) {
            response.setStatus(400);
            response.setReason("Please do not leave any field blank");
            return ok(Json.toJson(response));
//          return ok(views.html.register.render(" Kindly enter all details"));
        }
        RegistrationForm form = registrationForm.get();
        String email = form.getEmail();
        String name = form.getName();
        String password1 = form.getPassword1();
        String password2 = form.getPassword2();

        if(password1.equals(password2)){
            List<Person> objects = DbConnector.find(Person.class).select("email,id").where().eq("email", email).findList();
            if (objects.isEmpty()) {

                Person person = new Person();
                Role role = Role.find.query().where().like("role_id", "2").findOne();
                person.setName(name);
                person.setEmail(email);
                person.setPassword(password1);
                person.setCreatedOn(LocalDateTime.now());
                person.setRole(role);
                DbConnector.save(person);
                response.setStatus(200);
                response.setReason("successfully saved");
                return ok(Json.toJson(response));
//              return ok(views.html.login.render("Registration Successful"));
            } else {

                response.setStatus(200);
                response.setReason("Email already exists, kindly login here");
                return ok(Json.toJson(response));
//            return ok(views.html.login.render("Email already exists, kindly login here"));

            }
        }
        else{
            response.setStatus(200);
            response.setReason("Password do not Match");
            return ok(Json.toJson(response));
        }
    }
}