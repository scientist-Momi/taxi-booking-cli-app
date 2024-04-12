public class Driver extends User {
    int driverID;
    boolean isAvailable;

    Driver(int driverIDIn, String emailAddressIn, String fullNameIn,
           String phoneIn, String homeAddressIn, String dateTimeIn, char genderIn, boolean isAvailable)
    {
        super(emailAddressIn, fullNameIn, phoneIn, homeAddressIn, dateTimeIn, genderIn);
        this.driverID = driverIDIn;
        this.isAvailable = isAvailable;
    }

    @Override
    public void display()
    {
        System.out.println("Display Driver Details");
    }

    public String getName() {
        return fullName;
    }

    public String getPhone() {
        return phone;
    }

    public String getDate() {
        return dateTime;
    }

    public int getId() {
        return driverID;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public char getGender(){
        return gender;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean setAvailable(boolean available) {
        return this.isAvailable = available;

    }
}
