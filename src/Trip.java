public class Trip {
    Driver driver;
    String pickUp;
    String dropOff;
    double tripPrice;

    public Trip(Driver driver, String pickUp, String dropOff, double tripPrice){
        this.driver = driver;
        this.pickUp = pickUp;
        this.dropOff = dropOff;
        this.tripPrice = tripPrice;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public Driver getDriver() {
        return driver;
    }

    public String getDropOff() {
        return dropOff;
    }

    public String getPickUp() {
        return pickUp;
    }
}
