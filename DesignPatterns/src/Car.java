//import java.util.List;
//
//public class Car {
//    private String type;
//    private String brand;
//    private String model;
//    private double dailyRate;
//    private double pricePerKm;
//    private int freeKm;
//
//    public Car(String type, String brand, String model, double dailyRate, double pricePerKm, int freeKm) {
//        this.type = type;
//        this.brand = brand;
//        this.model = model;
//        this.dailyRate = dailyRate;
//        this.pricePerKm = pricePerKm;
//        this.freeKm = freeKm;
//    }
//
//    public static void main(String[] args) {
//        Car luxuryCar = new Car("Luxury", "Rolls Royce", "Spectre", 2000, 1, 250);
//    }
//
//    public float calculateTotalCost(int, List<RentalOptionsDecorator> rentalOptionsDecorators ) {
//        float totalCost = dailyRate + duration + rentalOptionsDecorators;
//        return totalCost;
//    }
//}


import java.util.List;

public abstract class Car {
    private String type;
    private String brand;
    private String model;
    private double dailyRate;
    private double pricePerKm;
    private int freeKm;

    //, String brand, String model, double dailyRate, double pricePerKm, int freeKm
    public Car(String type) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.dailyRate = dailyRate;
        this.pricePerKm = pricePerKm;
        this.freeKm = freeKm;
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
        return  dailyRate;
    }

//    public static void main(String[] args) {
//        Car luxuryCar = new Car("Luxury", "Rolls Royce", "Spectre", 2000, 1, 250);
//        RentalAgreement rentalAgreement = new RentalAgreement((CarInterface) luxuryCar, 7, "John Doe");
//        List<RentalOptionsDecorator> rentalOptionsDecorators = List.of(new ExtraKilometerDecorator(rentalAgreement), new TowBarDecorator(rentalAgreement));
//
//        float totalCost = luxuryCar.calculateTotalCost(rentalAgreement, rentalOptionsDecorators);
//        System.out.println("Total Cost: " + totalCost);
//    }

    public abstract void assemble();
}

