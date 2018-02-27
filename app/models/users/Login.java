package models.users;

public class Login {
    private String email;
    private String password;

    public String validate() {
        if (User.authenticate(getEmail(), getPassword()) == null) {
            return "Invalid user or password";
        }
        return null;
    }

    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}