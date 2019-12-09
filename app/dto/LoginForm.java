package dto;

import org.springframework.util.StringUtils;
import play.data.validation.Constraints;
import play.data.validation.Constraints.Validatable;
import play.data.validation.Constraints.Validate;

@Validate
public class LoginForm implements Validatable<String>
{
    @Constraints.Required
    protected String email ;
    @Constraints.Required
    protected String password;

    @Override
    public String validate() {
        if (StringUtils.isEmpty(email)|| StringUtils.isEmpty(password)) {
            return "Invalid details";
        }
        else{
        return null;
    }}
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
