public class Car
{
    int carID;
    int driverID;
    String carMake;
    String carModel;
    String licenceNumber;

    Car(int carIDIn, int driverIDIn, String carMakeIn, String carModelIn, String licenceNumberIn )
    {
        carID = carIDIn;
        driverID = driverIDIn;
        carMake = carMakeIn;
        carModel =  carModelIn;
        licenceNumber = licenceNumberIn;
    }

    public void display()
    {
        System.out.println("Display Car details");
    }

    public int getCarId() {
        return carID;
    }

    public int getDriverId() {
        return driverID;
    }

    public String getCarMake(){
        return carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }
}
