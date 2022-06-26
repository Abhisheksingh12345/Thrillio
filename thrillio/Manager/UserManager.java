package thrillio.Manager;
import thrillio.entities.*;

public class UserManager {

    private UserManager(){}
    public static UserManager getUserManager() {
        return new UserManager();
    }

    public void createUser(long id, String email, String password, String firstName, String lastName, int gender, String userType) {
        User user = new User();
        user.setId(id);
        user.setEmail(email);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUserType(userType);
        user.setGender(gender);
    }
}
