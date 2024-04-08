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

    public void rentOutCar(RentalAgreement agreement)
    {
        Car car = (Car) agreement.getCar();
        CarFactory.rentCar(car);
        rentalAgreements.add(agreement);
    }

    public void returnRentedCar(RentalAgreement agreement)
    {
        Car car = (Car) agreement.getCar();
        double totalCost = calculateTotalCost(agreement);
        int totalKmsDriven = agreement.calculateTotalKmsDriven();
        int freeKms = car.getFreeKm() * agreement.getDuration();
        int ridenKms = totalKmsDriven - freeKms;

        System.out.println("Total cost for returning the car: " + totalCost);
        System.out.println("Total Kms driven, minus the free kms per day: " + ridenKms);

        CarFactory.returnCar(car);
    }

    public double calculateTotalCost(RentalAgreement agreement)
    {
        Car car = (Car) agreement.getCar();
        int totalKmsDriven = agreement.calculateTotalKmsDriven();
        int freeKms = car.getFreeKm() * agreement.getDuration();
        double pricePerKm = car.getPrice_per_km();
        double deposit = car.getDeposit();
        double rentalCost = agreement.calculateTotalCost();

        double totalCost = Math.max(totalKmsDriven - freeKms, 0) * pricePerKm + rentalCost;

        totalCost = Math.round((totalCost - (rentalCost + deposit)) * 100.0) / 100.0;

        return Math.max(totalCost, 0);
    }
}
