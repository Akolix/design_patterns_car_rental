import java.util.List;

public class Car {
    private String type;
    private String brand;
    private String model;
    private double dailyRate;
    private double pricePerKm;
    private int freeKm;

    public Car(String type, String brand, String model, double dailyRate, double pricePerKm, int freeKm) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.dailyRate = dailyRate;
        this.pricePerKm = pricePerKm;
        this.freeKm = freeKm;
    }

    public static void main(String[] args) {
        Car luxuryCar = new Car("Luxury", "Rolls Royce", "Spectre", 2000, 1, 250);
    }

    public float calculateTotalCost(int numberOfDays, List<RentalOptionsDecorator> rentalOptionsDecorators ) {
        float totalCost = dailyRate + numberOfDays + rentalOptionsDecorators;
        return totalCost;
    }
}
