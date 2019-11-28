package dto;

import play.data.validation.Constraints;
import play.data.validation.Constraints.Validatable;
import play.data.validation.Constraints.Validate;
@Validate
public class RegistrationForm implements Validatable<String>
{
    @Constraints.Required protected String email ;
    @Constraints.Required protected String name;
    @Constraints.Required protected String password1;
    @Constraints.Required protected String password2;



    @Override
    public String validate() {
        if (email == null || name == null || password1==null ||password2==null) {
            return "Invalid email or password";
        }
        return null;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }
}
