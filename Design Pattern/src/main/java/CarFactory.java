import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarFactory {
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

    public static void removeCar(String type, String brand, String model) {
        Car carToRemove = null;
        for (Car car : createdCars) {
            if (car.getType().equalsIgnoreCase(type) && car.getBrand().equalsIgnoreCase(brand) && car.getModel().equalsIgnoreCase(model)) {
                carToRemove = car;
                break;
            }
        }
        if (carToRemove != null) {
            createdCars.remove(carToRemove);
            carTypeCounts.put(type, carTypeCounts.get(type) - 1); // Decrement count for car type
            System.out.println("Car removed successfully: " + carToRemove.get_description());
        } else {
            System.out.println("Car not found: " + type + " " + brand + " " + model);
        }
    }
}

