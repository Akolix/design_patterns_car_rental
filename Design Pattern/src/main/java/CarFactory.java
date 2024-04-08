import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarFactory
{
    static final List<Car> createdCars = new ArrayList<>();
    static final List<Car> rentedCars = new ArrayList<>();
    static final Map<String, Integer> carTypeCounts = new HashMap<>();

    public static Car createCar(String type, String brand, String model, double dailyRate, double pricePerKm, int freeKm, double deposit, double odometer)
    {
        Car car;
        if (type.equalsIgnoreCase("luxury"))
        {
            car = new LuxuryCar(brand, model, dailyRate, pricePerKm, freeKm, deposit, odometer);
        } else if (type.equalsIgnoreCase("economy"))
        {
            car = new EconomyCar(brand, model, dailyRate, pricePerKm, freeKm, deposit, odometer);
        } else if (type.equalsIgnoreCase("standard"))
        {
            car = new StandardCar(brand, model, dailyRate, pricePerKm, freeKm, deposit, odometer);
        } else
        {
            throw new IllegalArgumentException("Invalid car type: " + type);
        }

        createdCars.add(car);
        carTypeCounts.put(type, carTypeCounts.getOrDefault(type, 0) + 1);
        return car;
    }

    public static Map<String, Integer> countCarsPerType()
    {
        return carTypeCounts;
    }

    public static int countAllCars()
    {
        return createdCars.size();
    }

    public static List<Car> getRentedCars()
    {
        return rentedCars;
    }

    public static void rentCar(Car car)
    {
        if (createdCars.contains(car))
        {
            createdCars.remove(car);
            rentedCars.add(car);
            int count = carTypeCounts.getOrDefault(car.getType(), 0);
            carTypeCounts.put(car.getType(), count - 1);
        } else
        {
            throw new IllegalStateException("Car not found in the list of available cars: " + car.getBrand() + " " + car.getModel());
        }
    }

    public static void returnCar(Car car)
    {
        if (rentedCars.contains(car))
        {
            rentedCars.remove(car);
            createdCars.add(car);
            carTypeCounts.put(car.getType(), carTypeCounts.getOrDefault(car.getType(), 0) + 1); // Increment count for car type
        } else
        {
            System.out.println("Car not found in the list of rented cars: " + car.getBrand() + " " + car.getModel());
        }
    }

    public static void removeCar(String type, String brand, String model)
    {
        Car carToRemove = null;
        for (Car car : createdCars)
        {
            if (car.getType().equalsIgnoreCase(type) && car.getBrand().equalsIgnoreCase(brand) && car.getModel().equalsIgnoreCase(model))
            {
                carToRemove = car;
                break;
            }
        }
        if (carToRemove != null)
        {
            createdCars.remove(carToRemove);
            carTypeCounts.put(type, carTypeCounts.get(type) - 1);
            System.out.println("Car removed successfully: " + carToRemove.get_description());
        } else
        {
            System.out.println("Car not found: " + type + " " + brand + " " + model);
        }
    }
}

