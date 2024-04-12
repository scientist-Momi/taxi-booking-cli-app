public class Customer extends User {
    int customerID;

    public Customer(int customerIDIn, String emailAddressIn, String fullNameIn,
             String phoneIn, String homeAddressIn, String dateTimeIn, char genderIn)
    {
        super(emailAddressIn, fullNameIn, phoneIn, homeAddressIn, dateTimeIn, genderIn);
        this.customerID = customerIDIn;
    }
    @Override
    public void display()
    {
        System.out.println("Display Customers Details");
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
        return customerID;
    }

    public char getGender(){
        return gender;
    }

}
