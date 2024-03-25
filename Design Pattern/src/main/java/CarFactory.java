import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    private static final List<Car> createdCars = new ArrayList<>();

    public static Car createCar(String type, String brand, String model, double dailyRate, double pricePerKm, int freeKm) {
        Car car;
        if (type.equalsIgnoreCase("luxury")) {
            car = new LuxuryCar(brand, model, dailyRate, pricePerKm, freeKm);
        } else if (type.equalsIgnoreCase("economy")) {
            car = new EconomyCar(brand, model, dailyRate, pricePerKm, freeKm);
        } else if (type.equalsIgnoreCase("standard")) {
            car = new StandardCar(brand, model, dailyRate, pricePerKm, freeKm);
        } else {
            throw new IllegalArgumentException("Invalid car type: " + type);
        }

        createdCars.add(car);
        return car;
    }

    public static List<String> listAllCars() {
        List<String> carTypes = new ArrayList<>();
        for (Car car : createdCars) {
            carTypes.add(car.getType());
        }
        return carTypes;
    }
}

////public class CarFactory {
////    public static Car createCar(String type, String brand, String model, double dailyRate, double pricePerKm, int freeKm) {
////        if (type.equalsIgnoreCase("luxury")) {
////            LuxuryCar luxuryCar = new LuxuryCar();
////            luxuryCar.setBrand(brand);
////            luxuryCar.setModel(model);
////            luxuryCar.setDaily_rate(dailyRate);
////            luxuryCar.setPrice_per_km(pricePerKm);
////            luxuryCar.setFree_km(freeKm);
////            return new LuxuryCar();
////
////        } else if (type.equalsIgnoreCase("economy")) {
////            EconomyCar economyCar = new EconomyCar();
////            economyCar.setBrand(brand);
////            economyCar.setModel(model);
////            economyCar.setDaily_rate(dailyRate);
////            economyCar.setPrice_per_km(pricePerKm);
////            economyCar.setFree_km(freeKm);
////            return new EconomyCar();
////
////        } else if (type.equalsIgnoreCase("standard")) {
////            StandardCar standardCar = new StandardCar();
////            standardCar.setBrand(brand);
////            standardCar.setModel(model);
////            standardCar.setDaily_rate(dailyRate);
////            standardCar.setPrice_per_km(pricePerKm);
////            standardCar.setFree_km(freeKm);
////            return standardCar;
////        } else {
////            throw new IllegalArgumentException("Invalid car type: " + type);
////        }
////
////    }
////}
//import java.util.ArrayList;
//import java.util.List;
//
//public class CarFactory {
//
//    public static final List<Car> createdCars = new ArrayList<>();
//
////    public static Car createCar(String type, String brand, String model, double dailyRate, double pricePerKm, int freeKm) {
////        Car car;
////        if (type.equalsIgnoreCase("luxury")) {
////            LuxuryCar luxuryCar = new LuxuryCar();
////            luxuryCar.setBrand(brand);
////            luxuryCar.setModel(model);
////            luxuryCar.setDaily_rate(dailyRate);
////            luxuryCar.setPrice_per_km(pricePerKm);
////            luxuryCar.setFree_km(freeKm);
////            car = luxuryCar;
////        } else if (type.equalsIgnoreCase("economy")) {
////            EconomyCar economyCar = new EconomyCar();
////            economyCar.setBrand(brand);
////            economyCar.setModel(model);
////            economyCar.setDaily_rate(dailyRate);
////            economyCar.setPrice_per_km(pricePerKm);
////            economyCar.setFree_km(freeKm);
////            car = economyCar;
////        } else if (type.equalsIgnoreCase("standard")) {
////            StandardCar standardCar = new StandardCar();
////            standardCar.setBrand(brand);
////            standardCar.setModel(model);
////            standardCar.setDaily_rate(dailyRate);
////            standardCar.setPrice_per_km(pricePerKm);
////            standardCar.setFree_km(freeKm);
////            car = standardCar;
////        } else {
////            throw new IllegalArgumentException("Invalid car type: " + type);
////        }
////
////        createdCars.add(car);
////
////        return car;
////    }
//
//    public static Car createCar(String type, String brand, String model, double dailyRate, double pricePerKm, int freeKm) {
//        Car car;
//        if (type.equalsIgnoreCase("luxury")) {
//            LuxuryCar luxuryCar = new LuxuryCar();
//            luxuryCar.setBrand(brand);
//            luxuryCar.setModel(model);
//            luxuryCar.setDaily_rate(dailyRate);
//            luxuryCar.setPrice_per_km(pricePerKm);
//            luxuryCar.setFree_km(freeKm);
//            car = luxuryCar;
//        } else if (type.equalsIgnoreCase("economy")) {
//            EconomyCar economyCar = new EconomyCar();
//            economyCar.setBrand(brand);
//            economyCar.setModel(model);
//            economyCar.setDaily_rate(dailyRate);
//            economyCar.setPrice_per_km(pricePerKm);
//            economyCar.setFree_km(freeKm);
//            car = economyCar;
//        } else if (type.equalsIgnoreCase("standard")) {
//            StandardCar standardCar = new StandardCar();
//            standardCar.setBrand(brand);
//            standardCar.setModel(model);
//            standardCar.setDaily_rate(dailyRate);
//            standardCar.setPrice_per_km(pricePerKm);
//            standardCar.setFree_km(freeKm);
//            car = standardCar;
//        } else {
//            throw new IllegalArgumentException("Invalid car type: " + type);
//        }
//
//        return car;
//    }
//
//
//    public static List<String> listAllCars() {
//        List<String> carTypes = new ArrayList<>();
//        for (Car car : createdCars) {
//            carTypes.add(car.getType());
//        }
//        return carTypes;
//    }
//}
//
