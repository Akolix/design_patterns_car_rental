import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//public class CarrFactory {
//    static final List<Car> createdCars = new ArrayList<>();
//
//    // Method to create a car and add it to the list
//    public static Car createCar(String type, String brand, String model, double dailyRate, double pricePerKm, int freeKm) {
//        Car car;
//        if (type.equalsIgnoreCase("luxury")) {
//            car = new LuxuryCar(brand, model, dailyRate, pricePerKm, freeKm);
//        } else if (type.equalsIgnoreCase("economy")) {
//            car = new EconomyCar(brand, model, dailyRate, pricePerKm, freeKm);
//        } else if (type.equalsIgnoreCase("standard")) {
//            car = new StandardCar(brand, model, dailyRate, pricePerKm, freeKm);
//        } else {
//            throw new IllegalArgumentException("Invalid car type: " + type);
//        }
//
//        createdCars.add(car);
//        return car;
//    }
//
//    // Method to count all cars collectively
//    public static int countAllCars() {
//        return createdCars.size();
//    }
//
//    // Method to count cars per type
//    public static Map<String, Integer> countCarsPerType() {
//        Map<String, Integer> carCounts = new HashMap<>();
//        for (Car car : createdCars) {
//            String type = car.getType();
//            carCounts.put(type, carCounts.getOrDefault(type, 0) + 1);
//        }
//        return carCounts;
//    }
//
//    // Method to remove a car from the list and adjust counters accordingly
//    public static void removeCar(Car car) {
//        if (createdCars.remove(car)) {
//            System.out.println("Car removed successfully: " + car.get_description());
//        } else {
//            System.out.println("Car not found in the list: " + car.get_description());
//        }
//    }
//
//    public static List<String> listAllCars() {
//        List<String> carTypes = new ArrayList<>();
//        for (Car car : createdCars) {
//            carTypes.add(car.getType());
//        }
//        return carTypes;
//    }
//}


// 25 maart 11.30
public class CarrFactory {
    static final List<Car> createdCars = new ArrayList<>();
    static final Map<String, Integer> carTypeCounts = new HashMap<>();

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
        carTypeCounts.put(type, carTypeCounts.getOrDefault(type, 0) + 1); // Update count for car type
        return car;
    }

    public static Map<String, Integer> countCarsPerType() {
        return carTypeCounts;
    }

    public static List<String> listAllCars() {
        List<String> carTypes = new ArrayList<>();
        for (Car car : createdCars) {
            carTypes.add(car.getType());
        }
        return carTypes;
    }

    public static int countAllCars() {
        return createdCars.size();
    }

    public static void removeCar(Car car) {
        if (createdCars.remove(car)) {
            System.out.println("Car removed successfully: " + car.get_description());
        } else {
            System.out.println("Car not found in the list: " + car.get_description());
        }
    }
}
