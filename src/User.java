import java.util.Date;
import java.time.format.DateTimeFormatter;

public abstract class User {
    String emailAddress;
    String fullName;
    String phone;
    String homeAddress;
    String dateTime;
    char gender;

    public User(String emailAddress,String fullName, String phone, String homeAddress, String dateTime, char gender) {
        this.emailAddress = emailAddress;
        this.fullName = fullName;
        this.phone = phone;
        this.homeAddress = homeAddress;
        this.dateTime = dateTime;
        this.gender = gender;
    }

    public abstract void display();


}
