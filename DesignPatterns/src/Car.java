import java.util.List;

public abstract class Car {
    private String type;
    private String brand;
    private String model;
    private double dailyRate;
    private double pricePerKm;
    private int freeKm;
    private int odometer;

    public Car(String type, String brand, String model, double dailyRate, double pricePerKm, int freeKm) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.dailyRate = dailyRate;
        this.pricePerKm = pricePerKm;
        this.freeKm = freeKm;
        this.odometer = 0;
    }

    public float calculateTotalCost(RentalAgreement rentalAgreement, List<RentalOptionsDecorator> rentalOptionsDecorators) {
        int duration = rentalAgreement.getDuration();
        double totalCost = dailyRate * duration;

        for (RentalOptionsDecorator option : rentalOptionsDecorators) {
            totalCost += option.calculateTotalCost();
        }

        return (float) totalCost;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public abstract void assemble();
}
