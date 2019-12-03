package dto;
import play.data.validation.Constraints;
import play.data.validation.Constraints.Validate;
import play.data.validation.Constraints.Validatable;

import static org.reflections.util.Utils.isEmpty;

@Validate
public class ApplicationForm implements Validatable<String>
{
   @Constraints.Required protected String email;
    @Override
    public String validate() {
        if (isEmpty(email)) {
           return "Invalid email or password";
       }
        return null;
    }
public void setEmail(String email) {
    this.email = email;
}
    public String getEmail() {
        return email;
    }

}
