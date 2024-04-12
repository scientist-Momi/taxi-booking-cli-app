import java.text.NumberFormat;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Main main = new Main();
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static NumberFormat currency = NumberFormat.getCurrencyInstance();
    static List <Car> cars = new ArrayList<Car>();
    static List <Customer> customers = new ArrayList<Customer>();
    static List <Driver> drivers = new ArrayList<Driver>();
    static List <Trip> trips = new ArrayList<Trip>();
    String redColorCode = "\u001B[31m";
    String blackColorCode = "\u001B[30m";
    String greenColorCode = "\u001B[32m";
    String yellowColorCode = "\u001B[33m";
    String blueColorCode = "\u001B[34m";
    String purpleColorCode = "\u001B[35m";
    String cyanColorCode = "\u001B[36m";
    String whiteColorCode = "\u001B[37m";
    String resetColorCode = "\u001B[0m";
    public void startMenu(){
        System.out.println("***********************************************************************************");
        System.out.println("*                                                                                 *");
        System.out.println("*                     WELCOME TO THE TAXI BOOKING SYSTEM                          *");
        System.out.println("*                                                                                 *");
        System.out.println("***********************************************************************************");
        System.out.println(" ");
        System.out.print(redColorCode + "?" + resetColorCode + " Enter as a Driver"+yellowColorCode+"[D]"+resetColorCode+" or Customer"+yellowColorCode+"[C]"+resetColorCode+": ");
        char choice = scanner.next().charAt(0);
        scanner.nextLine();
        switch(choice)
        {
            case 'D':
                System.out.println("-----------------------------------------------------------");
                System.out.println("|                                                         |");
                System.out.println("|                ENTERED AS A DRIVER!!                    |");
                System.out.println("|                                                         |");
                System.out.println("-----------------------------------------------------------");
                main.driverMenu();
                break;
            case 'C':
                System.out.println("-----------------------------------------------------------");
                System.out.println("|                                                         |");
                System.out.println("|                ENTERED AS A CUSTOMER!!                  |");
                System.out.println("|                                                         |");
                System.out.println("-----------------------------------------------------------");
                main.customerMenu();
                break;
            default:
                System.out.println("-----------------------------------------------------------");
                System.out.println("|                                                         |");
                System.out.println("|            YOU ENTERED A WRONG OPTION!!                 |");
                System.out.println("|                                                         |");
                System.out.println("-----------------------------------------------------------");
                main.startMenu();
        }
    }

    public void driverMenu()
    {
        int options;
        while(true)
        {
            System.out.println(" ");
            System.out.println("-----------------------------------------------------------");
            System.out.println("|      DRIVER MENU OPTIONS                                |");
            System.out.println("-----------------------------------------------------------");
            System.out.println("-----------------------------------------------------------");
            System.out.println("|      "+yellowColorCode+"[1]"+resetColorCode+". Register Driver                               |");
            System.out.println("|      "+yellowColorCode+"[2]"+resetColorCode+". All Drivers                                   |");
            System.out.println("|      "+yellowColorCode+"[3]"+resetColorCode+". Find Driver                                   |");
            System.out.println("|      "+yellowColorCode+"[4]"+resetColorCode+". Delete Driver                                 |");
            System.out.println("|      "+yellowColorCode+"[0]"+resetColorCode+". Exit                                          |");
            System.out.println("-----------------------------------------------------------");
            System.out.println("-----------------------------------------------------------");
            System.out.println(" ");
            System.out.print(redColorCode + "?" + resetColorCode + " Choose an option from above menu: ");
            options = scanner.nextInt();
            switch(options)
            {
                case 1:
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                                                         |");
                    System.out.println("|                REGISTER A DRIVER!!                      |");
                    System.out.println("|                                                         |");
                    System.out.println("-----------------------------------------------------------");
                    createDriver();
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("---------------------------------------------------------------------------------------------");
                    System.out.println("|                                                                                           |");
                    System.out.println("|                 ALL DRIVERS!!                                                             |");
                    System.out.println("|                                                                                           |");
                    System.out.println("---------------------------------------------------------------------------------------------");
                    displayAllDrivers();
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                                                         |");
                    System.out.println("|                 FIND A DRIVER!!                         |");
                    System.out.println("|                                                         |");
                    System.out.println("-----------------------------------------------------------");
                    findDriver();
                    break;
                case 4:
                    System.out.println("Delete a driver option selected");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                                                         |");
                    System.out.println("|                 DELETE A DRIVER!!                       |");
                    System.out.println("|                                                         |");
                    System.out.println("-----------------------------------------------------------");
                    deleteDriverOption();
                    break;
                case 0:
                    startMenu();
                    break;
                default:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                                                         |");
                    System.out.println("|            YOU ENTERED A WRONG OPTION!!                 |");
                    System.out.println("|                                                         |");
                    System.out.println("-----------------------------------------------------------");
                    main.driverMenu();
            }
        }
    }

    public void customerMenu()
    {
        int options;
        while(true)
        {
            System.out.println(" ");
            System.out.println("-----------------------------------------------------------");
            System.out.println("|      CUSTOMER MENU OPTIONS                              |");
            System.out.println("-----------------------------------------------------------");
            System.out.println("-----------------------------------------------------------");
            System.out.println("|      "+yellowColorCode+"[1]"+resetColorCode+". Register Customer                             |");
            System.out.println("|      "+yellowColorCode+"[2]"+resetColorCode+". All Customers                                 |");
            System.out.println("|      "+yellowColorCode+"[3]"+resetColorCode+". Book a Ride                                   |");
            System.out.println("|      "+yellowColorCode+"[4]"+resetColorCode+". All Trips                                     |");
            System.out.println("|      "+yellowColorCode+"[0]"+resetColorCode+". Exit                                          |");
            System.out.println("-----------------------------------------------------------");
            System.out.println("-----------------------------------------------------------");
            System.out.println(" ");
            System.out.print(redColorCode + "?" + resetColorCode + " Choose an option from above menu: ");
            options = scanner.nextInt();
            switch(options)
            {
                case 1:
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                                                         |");
                    System.out.println("|                REGISTER A CUSTOMER!!                    |");
                    System.out.println("|                                                         |");
                    System.out.println("-----------------------------------------------------------");
                    createCustomer();
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                                                         |");
                    System.out.println("|                ALL CUSTOMERS!!                          |");
                    System.out.println("|                                                         |");
                    System.out.println("-----------------------------------------------------------");
                    displayAllCustomers();
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                                                         |");
                    System.out.println("|                BOOK A RIDE!!                            |");
                    System.out.println("|                                                         |");
                    System.out.println("-----------------------------------------------------------");
                    createTrip();
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                                                         |");
                    System.out.println("|                ALL TRIPS!!                              |");
                    System.out.println("|                                                         |");
                    System.out.println("-----------------------------------------------------------");
                    displayMyTrips();
                    break;
                case 0:
                    startMenu();
                    break;
                default:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                                                         |");
                    System.out.println("|            YOU ENTERED A WRONG OPTION!!                 |");
                    System.out.println("|                                                         |");
                    System.out.println("-----------------------------------------------------------");
                    customerMenu();
            }
        }
    }

    private static Driver createDriver()
    {
        System.out.println(" ");
        scanner.nextLine();
        System.out.println(" ");
        System.out.print(main.redColorCode + "?" + main.resetColorCode + " Enter Full Name: ");
        String fullName = scanner.nextLine();
        System.out.println(" ");
        System.out.print(main.redColorCode + "?" + main.resetColorCode + " Enter Email Address: ");
        String emailAddress = scanner.nextLine();
        System.out.println(" ");
        System.out.print(main.redColorCode + "?" + main.resetColorCode + " Enter Phone Number: ");
        String phone = scanner.nextLine();
        System.out.println(" ");
        System.out.print(main.redColorCode + "?" + main.resetColorCode + " Enter Home Address: ");
        String homeAddress = scanner.nextLine();
        System.out.println(" ");
        System.out.print(main.redColorCode + "?" + main.resetColorCode + " Enter Gender " + main.yellowColorCode + "[M]" + main.resetColorCode +" / " + main.yellowColorCode + "[F]" + main.resetColorCode + ": ");
        char gender = scanner.findWithinHorizon(".", 0).charAt(0);
        int driverId = main.generateId();
        String registerDate = main.generateDate();
        Car newCar = createCar(driverId);
        cars.add(newCar);
        boolean isAvailable = true;
        Driver newDriver = new Driver(driverId, emailAddress, fullName, phone, homeAddress, registerDate, gender, isAvailable);
        drivers.add(newDriver);
        System.out.println(" ");
        printMsgWithProgressBar("⌛Saving Driver details.......", 35, 120);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println( "\uD83D\uDC4D Driver details saved successfully.");
        main.returnMenu("DRIVER");
        return newDriver;
    }

    public static Car createCar(int driverId){
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                REGISTER DRIVER'S CAR!!                  |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
        scanner.nextLine();
        System.out.println(" ");
        System.out.print(main.redColorCode + "?" + main.resetColorCode + " Enter Car make: ");
        String carMake = scanner.nextLine();
        System.out.println(" ");
        System.out.print(main.redColorCode + "?" + main.resetColorCode + " Enter Car model: ");
        String carModel = scanner.nextLine();
        System.out.println(" ");
        System.out.print(main.redColorCode + "?" + main.resetColorCode + " Enter license number: ");
        String carLicenseNumber = scanner.nextLine();
        int carId = main.generateId();
        return new Car(carId, driverId, carMake, carModel, carLicenseNumber);
    }
    private static Customer createCustomer()
    {
        System.out.println(" ");
        scanner.nextLine();
        System.out.println(" ");
        System.out.print(main.redColorCode + "?" + main.resetColorCode + " Enter Full Name: ");
        String fullName = scanner.nextLine();
        System.out.println(" ");
        System.out.print(main.redColorCode + "?" + main.resetColorCode + " Enter Email Address: ");
        String emailAddress = scanner.nextLine();
        System.out.println(" ");
        System.out.print(main.redColorCode + "?" + main.resetColorCode + " Enter Phone Number: ");
        String phone = scanner.nextLine();
        System.out.println(" ");
        System.out.print(main.redColorCode + "?" + main.resetColorCode + " Enter Home Address: ");
        String homeAddress = scanner.nextLine();
        System.out.println(" ");
        System.out.print(main.redColorCode + "?" + main.resetColorCode + " Enter Gender " + main.yellowColorCode + "[M]" + main.resetColorCode +" / " + main.yellowColorCode + "[F]" + main.resetColorCode + ": ");
        char gender = scanner.findWithinHorizon(".", 0).charAt(0);
        int customerId = main.generateId();
        String registerDate = main.generateDate();
        Customer newCustomer = new Customer(customerId, emailAddress,fullName, phone, homeAddress, registerDate, gender);
        customers.add(newCustomer);
        System.out.println(" ");
        printMsgWithProgressBar("⌛Saving Customer details.......", 35, 120);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println( "\uD83D\uDC4D Customer details saved successfully.");
        main.returnMenu("CUSTOMER");
        return newCustomer;
    }

    public static Trip createTrip(){
        if(customers.isEmpty())
        {
            System.out.println("❌ You have to be registered to book a ride.");
            System.out.println(" ");
            return null;
        }else {
            scanner.nextLine();
            System.out.println(" ");
            System.out.print(main.redColorCode + "?" + main.resetColorCode + " Enter your current postcode: ");
            String pickUp = scanner.nextLine();
            System.out.println(" ");
            System.out.print(main.redColorCode + "?" + main.resetColorCode + " Enter your destination postcode: ");
            String dropOff = scanner.nextLine();
            Driver driver = main.findDriverForCustomer();
            System.out.println(" ");
            printMsgWithProgressBar("⌛Getting you a driver now.......", 35, 120);
            System.out.println(" ");
            System.out.println(" ");
            if (driver == null) {
                System.out.println("❌ Sorry, no available drivers at the moment. Please try again later.");
                System.out.println(" ");
                return null;
            }
            System.out.println( "\uD83D\uDC4D We got you a driver.");
            Car driverCar = main.findCarForDriver(driver.getId());
            System.out.println(" ");
            System.out.println("+-------------------+----------------------+");
            System.out.println("|   Driver                 Details         |");
            System.out.println("+-------------------+----------------------+");
            System.out.println("|   Name            |        " + driver.getName() + "           |");
            System.out.println("|   Phone           |        " + driver.getPhone() + "        |");
            System.out.println("+-------------------+----------------------+");
            System.out.println("|   Car              Details               |");
            System.out.println("+-------------------+----------------------+");
            System.out.println("|   License No      |        " + driverCar.getLicenceNumber() + "           |");
            System.out.println("|   Make            |        " + driverCar.getCarMake() + "         |");
            System.out.println("|   Model           |        " + driverCar.getCarModel() + "         |");
            System.out.println("+-------------------+----------------------+");
            double tripPrice = main.generatePrice();
            System.out.println("+-------------------+----------------------+");
            System.out.println("|      Trip Price   |         " + currency.format(tripPrice) + "        |");
            System.out.println("+-------------------+----------------------+");
            System.out.println(" ");
            System.out.print(main.redColorCode + "?" + main.resetColorCode + " Do you wish to book this ride YES"+main.yellowColorCode+" [Y]"+main.resetColorCode+" / NO "+main.yellowColorCode+"[N]"+main.resetColorCode+": ");
            char response = scanner.findWithinHorizon(".", 0).charAt(0);
            if(response == 'Y'){
                System.out.println("\uD83D\uDC4D Trip successfully booked.........");
                System.out.println(" ");
                System.out.println("Your driver is arriving now............");
                System.out.println("\uD83D\uDE97 Driver has arrived.");
                System.out.println(" ");
                System.out.println("\uD83D\uDC4D Customer picked up.");
                System.out.println(" ");
                System.out.println("\uD83D\uDC4D Trip started");
                main.updateDriverStatus(driver.getEmailAddress());
                System.out.println("Driver status updated.");
                printMsgWithProgressBar("⌛Trip in progress. On the way to destination.......", 35, 120);
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("\uD83D\uDC4D Arrived at Destination.");
                System.out.println("\uD83D\uDC4D Trip ended.");
                main.updateDriverStatus(driver.getEmailAddress());
                System.out.println("Driver status updated.");
                Trip newTrip = new Trip(driver, pickUp, dropOff, tripPrice);
                trips.add(newTrip);
                main.returnMenu("CUSTOMER");
                return newTrip;
            } else if (response == 'N') {
                System.out.println("\uD83D\uDC4D OKAY, No problem we understand.");
                main.returnMenu("CUSTOMER");
                return null;
            }else {
                System.out.println("-----------------------------------------------------------");
                System.out.println("|                                                         |");
                System.out.println("|            YOU ENTERED A WRONG INPUT!!                 |");
                System.out.println("|                                                         |");
                System.out.println("-----------------------------------------------------------");
                main.returnMenu("CUSTOMER");
                return null;
            }
        }
    }

    public void updateDriverStatus(String driverEmail){
        Driver driver = findDriverByEmail(driverEmail);
        boolean pastStatus = driver.isAvailable();
        boolean newStatus = driver.setAvailable(!pastStatus);
    }

    public void displayAllDrivers()
    {
        printMsgWithProgressBar("⌛Retrieving all Driver details.......", 35, 120);
        System.out.println(" ");
        System.out.println(" ");
        if (drivers.isEmpty()) {
            System.out.println("❌ Currently we have no drivers");
            System.out.println(" ");
        } else {
            System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("| %-10s | %-20s | %-15s | %-12s | %-20s | %-20s | %-20s | %-20s |\n",
                    "Driver ID", "Name", "Phone", "Date", "Available", "Car License", "Car Make", "Car Model");
            System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            for (Driver driver : drivers) {
                Car car = findCarForDriver(driver.getId());
                System.out.printf("| %-10s | %-20s | %-15s | %-12s | %-20s | %-20s | %-20s | %-20s |\n",
                        driver.getId(), driver.getName(), driver.getPhone(),
                        driver.getDate(), (driver.isAvailable() ? "Yes" : "No"), car.getLicenceNumber(), car.getCarMake(), car.getCarModel());
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        returnMenu("DRIVER");
    }

    public void findDriver()
    {
        scanner.nextLine();
        System.out.println(" ");
        System.out.print(main.redColorCode + "?" + main.resetColorCode + " Enter driver's email address to find driver: ");
        String findEmail = scanner.nextLine();
        Driver driver = findDriverByEmail(findEmail);
        System.out.println(" ");
        printMsgWithProgressBar("⌛Searching for Driver details.......", 35, 120);
        System.out.println(" ");
        System.out.println(" ");
        if (driver != null) {
            Car car = findCarForDriver(driver.getId());
            System.out.println("\uD83D\uDC4D Driver found!!!");
            System.out.println(" ");
            System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("| %-10s | %-20s | %-15s | %-12s | %-20s | %-20s | %-20s | %-20s |\n",
                    "Driver ID", "Name", "Phone", "Date", "Available", "Car License", "Car Make", "Car Model");
            System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("| %-10s | %-20s | %-15s | %-12s | %-20s | %-20s | %-20s | %-20s |\n",
                    driver.getId(), driver.getName(), driver.getPhone(),
                    driver.getDate(), (driver.isAvailable() ? "Yes" : "No"), car.getLicenceNumber(), car.getCarMake(), car.getCarModel());
            System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(" ");
        } else {
            System.out.println("❌ Driver not found");
        }
        returnMenu("DRIVER");
    }

    public void displayAllCustomers()
    {
        if(customers.isEmpty())
        {
            System.out.println("❌ Currently there are no customers.");
            System.out.println(" ");
        }else{
            printMsgWithProgressBar("⌛Retrieving all customer details.......", 35, 120);
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.printf("| %-10s | %-20s | %-15s | %-12s | %-20s |\n",
                    "Customer ID", "Name", "Phone", "Date", "Gender");
            System.out.println("---------------------------------------------------------------------------------------------");
            for (Customer customer : customers) {
                System.out.printf("| %-11s | %-20s | %-15s | %-12s | %-20s |\n",
                        customer.getId(), customer.getName(), customer.getPhone(),
                        customer.getDate(), customer.getGender());
            }
            System.out.println("---------------------------------------------------------------------------------------------");
        }
        returnMenu("CUSTOMER");
    }

    public Driver findDriverByEmail(String findEmail){
        for (Driver driver : drivers) {
            if (driver.getEmailAddress().equals(findEmail)) {
                return driver;
            }
        }
        return null;
    }

    public void deleteDriverOption(){
        scanner.nextLine();
        System.out.println(" ");
        System.out.print(main.redColorCode + "?" + main.resetColorCode + " Enter driver's email address to delete driver: ");
        String driverEmail = scanner.nextLine();
        Driver driverToRemove = findDriverByEmail(driverEmail);
        System.out.println(" ");
        printMsgWithProgressBar("⌛Searching for Driver and Deleting details.......", 35, 120);
        System.out.println(" ");
        System.out.println(" ");
        if (driverToRemove != null) {
            if (drivers.remove(driverToRemove)) {
                System.out.println("\uD83D\uDC4D Driver removed successfully.");
            } else {
                System.out.println("❌ Failed to remove driver.");
            }
        }else{
            System.out.println("❌ Driver not found.");
        }
        returnMenu("DRIVER");
    }

    public void displayMyTrips(){
        printMsgWithProgressBar("⌛Retrieving all your trips.......", 35, 120);
        System.out.println(" ");
        System.out.println(" ");
        if(trips.isEmpty())
        {
            System.out.println("❌ You currently don't have any trip.");
        }else
        {
            System.out.println("-------------------------------------------------------------------------");
            System.out.printf("| %-10s | %-20s | %-15s | %-15s |\n",
                    "Driver", "Pick-Up", "Drop-Off", "Trip Price");
            System.out.println("-------------------------------------------------------------------------");
            for (Trip trip : trips) {
                System.out.printf("| %-10s | %-20s | %-15s | %-15s |\n",
                        trip.getDriver().getName(), trip.getPickUp(), trip.getDropOff(),
                        currency.format(trip.getTripPrice()));
            }
            System.out.println("-------------------------------------------------------------------------");
        }
        main.returnMenu("CUSTOMER");
    }


    public Car findCarForDriver(int driverId) {
        for (Car car : cars) {
            if (car.getDriverId() == driverId) {
                return car;
            }
        }
        return null;
    }

    public Driver findDriverForCustomer(){
        for (Driver driver : drivers) {
            if (driver.isAvailable()) {
                return driver;
            }
        }
        return null;
    }

    public String generateDate(){
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = dateTime.format(dateFormat);
        return formattedDate;
    }

    public int generateId() {
        int min = 100000;
        int max = 999999;
        int randomId = random.nextInt(max - min + 1) + min;
        return randomId;
    }

    public double generatePrice(){
        int min = 3;
        int max = 10;
        double tripPrice = random.nextInt(max - min + 1) + min;
        return tripPrice;
    }

    public static void printMsgWithProgressBar(String message, int length, long timeInterval)
    {
        char incomplete = '░';
        char complete = '█';
        StringBuilder builder = new StringBuilder();
        Stream.generate(() -> incomplete).limit(length).forEach(builder::append);
        System.out.println(message);
        for(int i = 0; i < length; i++)
        {
            builder.replace(i,i+1,String.valueOf(complete));
            String progressBar = "\r"+builder;
            System.out.print(progressBar);
            try
            {
                Thread.sleep(timeInterval);
            }
            catch (InterruptedException ignored)
            {

            }
        }
    }

    public static void countdown(){
        int countdownSeconds = 10;
        System.out.println("Driver arriving in "+countdownSeconds+" seconds...");
        for (int i = countdownSeconds; i >= 0; i--) {
            System.out.print(i + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Your driver is here!!!!!!!");
    }


    public static void main(String[] args)
    {
        main.startMenu();
    }

    public void returnMenu(String operationType){
        int options;
        String operationName;
        if(operationType.equalsIgnoreCase("DRIVER")){
            operationName = "Driver Menu";
        } else if (operationType.equalsIgnoreCase("CUSTOMER")) {
            operationName = "Customer Menu";
        }else{
            operationName = "Driver Menu";
        }
        while(true)
        {
            System.out.println("-----------------------------------------------------------");
            System.out.println("|      RETURN TO                                          |");
            System.out.println("|                                                         |");
            System.out.println("|      "+yellowColorCode+"[1]"+resetColorCode+". "+operationName+"                                 |");
            System.out.println("|      "+yellowColorCode+"[2]"+resetColorCode+". Main Menu                                     |");
            System.out.println("|      "+yellowColorCode+"[0]"+resetColorCode+". Exit Application                              |");
            System.out.println("-----------------------------------------------------------");
            System.out.println(" ");
            System.out.print(redColorCode + "?" + resetColorCode + " Choose an option from above menu: ");
            options = scanner.nextInt();
            switch(options)
            {

                case 1:
                    if (operationType.equalsIgnoreCase("DRIVER")) {
                        driverMenu();
                    } else if (operationType.equalsIgnoreCase("CUSTOMER")) {
                        customerMenu();
                    }
                    break;
                case 2:
                    startMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                                                         |");
                    System.out.println("|            YOU ENTERED A WRONG OPTION!!                 |");
                    System.out.println("|                                                         |");
                    System.out.println("-----------------------------------------------------------");
                    if (operationType.equalsIgnoreCase("DRIVER")) {
                        driverMenu();
                    } else if (operationType.equalsIgnoreCase("CUSTOMER")) {
                        customerMenu();
                    }
            }
        }
    }
}