package controllers;

import dao.DbConnector;
import dto.ApplicationForm;
import dto.PasswordForm;
import dto.PersonAttendance;
import io.ebean.Expr;
import io.ebean.SqlRow;
import io.ebean.SqlUpdate;
import jdk.nashorn.internal.runtime.Context;
import models.Attendance;
import models.Person;
import play.Logger;
import play.cache.SyncCacheApi;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import scala.xml.factory.LoggedNodeFactory;

import javax.inject.Inject;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class HomeController extends Controller {
    private FormFactory formFactory;
    private SyncCacheApi cache;

    @Inject
    public HomeController(FormFactory formFactory, SyncCacheApi cache) {
        this.formFactory = formFactory;
        this.cache = cache;
    }

//    public Result singlepersondetails(Http.Request request) {
//        Person person = Person.find.query().where().eq("role_id", "1").setMaxRows(1).findOne();
//        if (person.getRole().getRole_id() == 1) {
//            String ccmail = cache.get("cacheemail");
//            Integer role_id = person.getRole().getRole_id();
//            List<Attendance> attendance = Attendance.find.query().findList();
//            if (attendance != null && attendance.size() > 0 && role_id == 1) {
//                return ok(views.html.details.render(attendance));
//            }
//            return ok(views.html.index.render(""));
//        } else {
//            return TODO();
//        }
//            String ccmail = cache.get("cacheemail");
//        Person person = Person.find.query().where().eq("email", ccmail).setMaxRows(1).findOne();
//            Integer role_id = person.getRole().getRole_id();
//            List<Attendance> attendance = Attendance.find.query().where().eq("person_pid",person.getId()).findList();
//            if (attendance != null && attendance.size() > 0 && role_id == 1) {
//                return ok(views.html.details.render(attendance));
//            }
//            return ok(views.html.index.render(""));


    public Result base(){
        return redirect("/login");
    }

    public Result editdetails(Http.Request request){
        return ok(views.html.edit.render(""));
    }


    public Result edited(Http.Request request){
        Form<PasswordForm> passwordForm = formFactory.form(PasswordForm.class).bindFromRequest(request);
        if (passwordForm.hasErrors()) {
            return ok(views.html.edit.render(" Kindly enter all details"));
        }
        PasswordForm form;
        form = passwordForm.get();
        Integer uid=form.getPid();
        String uname=form.getName();
        String uemail = form.getEmail();
        String upassword=form.getPassword1();

        Logger.info(uid+uemail+upassword);

        Person person=Person.find.query().where().like("email", uemail).setMaxRows(1).findOne();
        Logger.info(person.getEmail()+person.getId()+person.getPassword());
        if(uid==(person.getId()) && upassword.equals(person.getPassword()))
        {
            person.setName(uname);

            DbConnector.update(person);
           // Logger.info("reached " +femail+ fname);
            return ok(views.html.login.render("Updated Successfully "));}
        else{
            return ok(views.html.edit.render("Enter Correct details"));
        }





    }

    public Result persondetails(Http.Request request) {
        Person person = Person.find.query().where().eq("role_id", "1").setMaxRows(1).findOne();
        if (person.getRole().getRole_id() == 1) {
            String ccmail = cache.get("cacheemail");
            Integer role_id = person.getRole().getRole_id();
            List<Attendance> attendance = Attendance.find.query().findList();
            List<PersonAttendance> attendanceList = new ArrayList<>();
            for(Attendance a : attendance){
                PersonAttendance personAttendance = new PersonAttendance();
                personAttendance.setId(a.getId());
                personAttendance.setName(a.getPerson().getName());
                personAttendance.setCheckIn(a.getCheckIn());
                personAttendance.setCheckOut(a.getCheckOut());

                attendanceList.add(personAttendance);
            }

            if (attendanceList != null && attendanceList.size() > 0 && role_id == 1) {
                return ok(views.html.details.render(attendanceList));
            }
            return ok(views.html.index.render(""));
        } else {
            return TODO();
        }
    }


    public Result HRindex(Http.Request request) {
        String ccmail = cache.get("cacheemail");
        if (ccmail != null && ccmail != "") {
            return ok(views.html.HRindex.render(""));
        } else {
            return TODO();
        }
    }

    public Result index(Http.Request request) {
        String ccmail = cache.get("cacheemail");
        if (ccmail != null && ccmail != "") {
            return ok(views.html.index.render(""));
        }
        //retrieving session data in controllers
        // Optional<String> logged = request.session().getOptional("sessionemail");
        // Logger.info(String.valueOf(logged));
        ///////////////////////////////
        // String a="";
        // a=request.session().getOptional("sessionemail").get();
        // String loggedInEmail = cache.get("email");
        //  if (a == "") {
        //    return ok(views.html.login.render(" "));
        //} else {
        else {
            return TODO();
        }
        //}
    }

    public Result saveAttendance(Http.Request request) {

        String loggedInEmail = cache.get("cacheemail");
        if (loggedInEmail != null && loggedInEmail != "") {
            Form<ApplicationForm> attendanceForm = formFactory.form(ApplicationForm.class).bindFromRequest(request);
            if (attendanceForm.hasErrors()) {
                return ok(views.html.index.render("invalid email"));
            }
            ApplicationForm form;
            form = attendanceForm.get();
            String email = form.getEmail();

            //Validation for email matching
            if (email.equals(request.session().getOptional("sessionemail").get().toString())) {       //validation for email matching block
                Person person=Person.find.query().where().like("email",email).setMaxRows(1).findOne();
                //  List<SqlRow> objects = DbConnector.createSqlQuery("Select EMAIL,ID from ATTENDANCE WHERE EMAIL= ('" + email + "') AND (SELECT DAte(check_in) = (select date(now()))) ").findList();
                List<Attendance> objects = Attendance.find.query().select("Id").where().and().eq("person_pid", person.getId())
                        .eq("Date(checkIn)", LocalDate.now()).endAnd().findList();
                // Person person = Person.find.query().where().like("email", email).findOne();
                //Getting Role ID for admin login
                int role_id = person.getRole().getRole_id();
                if (objects.isEmpty()) {
                    // SqlUpdate sqlUpdate = DbConnector.createUpdateQuery("INSERT INTO ATTENDANCE(EMAIL,check_in) VALUES('" + email + "','" + LocalDateTime.now() + "')");
                    //sqlUpdate.execute();

                    Attendance attendance = new Attendance();
                    // attendance.getPerson().setEmail(email);
                    attendance.setCheckIn(LocalDateTime.now());
                    attendance.setPerson(person);
                    DbConnector.save(attendance);
                    if (role_id == 1) {
                        return ok(views.html.HRindex.render("Checked in successfully at " + LocalTime.now()));
                    } else {
                        return ok(views.html.index.render("Checked in successfully at " + LocalTime.now()));
                    }
                }
                // List<SqlRow> obj = DbConnector.createSqlQuery("Select email,id from attendance WHERE email= ('" + email + "') AND (SELECT DAte(check_in) = (select date(now()))) and check_out is null").findList();

                List<Attendance> obj = Attendance.find.query().where().eq("person_pid",person.getId()).eq("DATE(checkIn)", LocalDate.now()).isNull("checkOut").findList();
                //   DbConnector.find(Attendance.class).where().eq("email", email).eq("DATE(checkIn)", LocalDate.now()).isNull("checkOut").findList();

                if (obj.isEmpty()) {
                    if (role_id == 1) {
                        return ok(views.html.HRindex.render("You have already checked out"));
                    } else {
                        return ok(views.html.index.render("You have already checked out"));
                    }

                } else {

//                    SqlUpdate sqlUpdate = DbConnector.createUpdateQuery("update ATTENDANCE SET check_out =now() WHERE EMAIL='" + email + "' ");
//                    sqlUpdate.execute();
                    Attendance attendanceobj = DbConnector.find(Attendance.class).where().eq("person_pid", person.getId()).orderBy("id desc").setMaxRows(1).findOne();
                    attendanceobj.setCheckOut(LocalDateTime.now());
                    DbConnector.update(attendanceobj);
                    if (role_id == 1) {
                        return ok(views.html.HRindex.render("Checked-Out successfully at " + LocalTime.now()));
                    } else {
                        return ok(views.html.index.render("Checked-Out successfully at " + LocalTime.now()));
                    }
                }
            } else {

                //Getting Role ID for admin login
                Person person = Person.find.query().where().like("email", (cache.get("cacheemail"))).findOne();
                int role_id = person.getRole().getRole_id();
                Logger.info("Reached here    " + role_id);
                if (role_id == 1) {
                    return ok(views.html.HRindex.render("Kindly enter correct email"));
                } else {
                    return ok(views.html.index.render("Kindly enter correct email"));
                }
            }
        } else {
            return ok(views.html.login.render("cache email not found"));
        }
    }
}