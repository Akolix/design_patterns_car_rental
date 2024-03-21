import java.util.List;
public abstract class Car implements CarInterface {
    private String type;

    public Car(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }
}

////
////public class Car {
////    private String type;
////    private String brand;
////    private String model;
////    private double dailyRate;
////    private double pricePerKm;
////    private int freeKm;
////
////    public Car(String type, String brand, String model, double dailyRate, double pricePerKm, int freeKm) {
////        this.type = type;
////        this.brand = brand;
////        this.model = model;
////        this.dailyRate = dailyRate;
////        this.pricePerKm = pricePerKm;
////        this.freeKm = freeKm;
////    }
////
////    public static void main(String[] args) {
////        Car luxuryCar = new Car("Luxury", "Rolls Royce", "Spectre", 2000, 1, 250);
////    }
////
////    public float calculateTotalCost(int, List<RentalOptionsDecorator> rentalOptionsDecorators ) {
////        float totalCost = dailyRate + duration + rentalOptionsDecorators;
////        return totalCost;
////    }
////}
//
//
//import java.util.List;
//
//public abstract class Car {
//    private String type;
//    private String brand;
//    private String model;
//    private double dailyRate;
//    private double pricePerKm;
//    private int freeKm;
//
//    //, String brand, String model, double dailyRate, double pricePerKm, int freeKm
//    public Car(String type) {
//        this.type = type;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public abstract void assemble();
//}
//