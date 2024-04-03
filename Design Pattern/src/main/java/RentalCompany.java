import java.util.ArrayList;

public class RentalCompany
{
    private String name;
    private String location;
    private ArrayList<RentalAgreement> rentalAgreements;

    public RentalCompany(String name, String location)
    {
        this.name = name;
        this.location = location;
        this.rentalAgreements = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public void rentOutCar(RentalAgreement agreement) {
        Car car = (Car) agreement.getCar(); // Get the car associated with the rental agreement
        CarFactory.rentCar(car); // Remove the car from the list of available cars
        rentalAgreements.add(agreement); // Add the rental agreement to the list of agreements
    }

    public void returnRentedCar(RentalAgreement agreement) {
        Car car = (Car) agreement.getCar(); // Get the car associated with the rental agreement
        CarFactory.returnCar(car); // Return the car to the CarFactory
    }
}
