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
        double totalCost = calculateTotalCost(agreement);
        System.out.printf("Total cost for returning the car: " + totalCost);

        CarFactory.returnCar(car); // Return the car to the CarFactory
    }

    private double calculateTotalCost(RentalAgreement agreement)
    {
        Car car = (Car) agreement.getCar();
        int totalKmsDriven = agreement.calculateTotalKmsDriven();
        int freeKms = car.getFree_km();
        double pricePerKm = car.getPrice_per_km();
        double deposit = car.getDeposit();
        double rentalCost = agreement.calculateTotalCost();
        System.out.println("Rentalcost: " + rentalCost);

        double totalCost = Math.max(totalKmsDriven - freeKms, 0) * pricePerKm + rentalCost;

        if (deposit > 0) {
            totalCost = Math.max(0, totalCost - deposit);
        }

        totalCost = Math.round(totalCost * 100.0) / 100.0;

        return totalCost;
    }
}
