import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;

class CarFactoryTest {

    @BeforeEach
    void setUp() {
        CarFactory.createdCars.clear();
    }

    @AfterEach
    void tearDown() {
        CarFactory.createdCars.clear();
        CarFactory.carTypeCounts.clear(); // Clear the car type counts map
    }

    @Test
    void createLuxuryCar() {
        Car luxuryCar = CarFactory.createCar("luxury", "Rolls Royce", "Spectre", 1000, 2, 50, 200, 100);
        assertNotNull(luxuryCar);
        assertTrue(luxuryCar instanceof LuxuryCar);
    }

    @Test
    void createEconomyCar() {
        Car economyCar = CarFactory.createCar("economy", "Toyota", "Prius", 50, 0.20, 250, 200, 100);
        assertNotNull(economyCar);
        assertTrue(economyCar instanceof EconomyCar);
    }

    @Test
    void createStandardCar() {
        Car standardCar = CarFactory.createCar("standard", "Ford", "Mondeo", 27, 0.39, 150, 200, 100);
        assertNotNull(standardCar);
        assertTrue(standardCar instanceof StandardCar);
    }

    @Test
    void createFaultyCar() {
        assertThrows(IllegalArgumentException.class, () -> {
            Car invalidCar = CarFactory.createCar("invalid car type", "Invalid Brand", "Invalid Model", 0, 0, 0, 0, 100);
        });
    }

    @Test
    void createStandardCarWithAttributes() {
        String brand = "Ford";
        String model = "Mondeo";
        double dailyRate = 27.0;
        double pricePerKm = 0.39;
        int freeKm = 150;
        double deposit = 200;
        double odometer = 100;

        Car standardCar = CarFactory.createCar("standard", brand, model, dailyRate, pricePerKm, freeKm, deposit, odometer);

        assertNotNull(standardCar);

        assertTrue(standardCar instanceof StandardCar);

        assertEquals(brand, ((StandardCar) standardCar).getBrand());
        assertEquals(model, ((StandardCar) standardCar).getModel());
        assertEquals(dailyRate, ((StandardCar) standardCar).getDaily_rate());
        assertEquals(pricePerKm, ((StandardCar) standardCar).getPrice_per_km());
        assertEquals(freeKm, ((StandardCar) standardCar).getFreeKm());
    }

    @Test
    void createLuxuryCarWithAttributes() {
        String brand = "Rolls Royce";
        String model = "Spectre";
        double dailyRate = 1000;
        double pricePerKm = 2;
        int freeKm = 50;
        double deposit = 2000;
        double odometer = 100;

        Car luxuryCar = CarFactory.createCar("luxury", brand, model, dailyRate, pricePerKm, freeKm, deposit, odometer);

        assertNotNull(luxuryCar);

        assertTrue(luxuryCar instanceof LuxuryCar);

        assertEquals(brand, ((LuxuryCar) luxuryCar).getBrand());
        assertEquals(model, ((LuxuryCar) luxuryCar).getModel());
        assertEquals(dailyRate, ((LuxuryCar) luxuryCar).getDaily_rate());
        assertEquals(pricePerKm, ((LuxuryCar) luxuryCar).getPrice_per_km());
        assertEquals(freeKm, ((LuxuryCar) luxuryCar).getFreeKm());
    }

    @Test
    void createEconomyCarWithAttributes() {
        String brand = "Toyota";
        String model = "Prius";
        double dailyRate = 50;
        double pricePerKm = 0.20;
        int freeKm = 250;
        double deposit = 200;
        double odometer = 100;

        Car economyCar = CarFactory.createCar("economy", brand, model, dailyRate, pricePerKm, freeKm, deposit, odometer);

        assertNotNull(economyCar);

        assertTrue(economyCar instanceof EconomyCar);

        assertEquals(brand, ((EconomyCar) economyCar).getBrand());
        assertEquals(model, ((EconomyCar) economyCar).getModel());
        assertEquals(dailyRate, ((EconomyCar) economyCar).getDaily_rate());
        assertEquals(pricePerKm, ((EconomyCar) economyCar).getPrice_per_km());
        assertEquals(freeKm, ((EconomyCar) economyCar).getFreeKm());
    }

    @Test
    void countAllCars() {
        CarFactory.createCar("luxury", "Rolls Royce", "Spectre", 1000, 2, 50, 2000, 100);
        CarFactory.createCar("economy", "Toyota", "Prius", 50, 0.20, 250, 200, 100);
        CarFactory.createCar("standard", "Ford", "Mondeo", 27, 0.39, 150, 200, 100);

        assertEquals(3, CarFactory.countAllCars());
    }

    @Test
    void countCarsPerType() {
        CarFactory.createCar("luxury", "Rolls Royce", "Spectre", 1000, 2, 50, 2000, 100);
        CarFactory.createCar("economy", "Toyota", "Prius", 50, 0.20, 250, 200, 100);
        CarFactory.createCar("standard", "Ford", "Mondeo", 27, 0.39, 150, 200, 100);
        CarFactory.createCar("economy", "Kia", "Rio", 55, 0.3, 150, 200, 100);

        Map<String, Integer> carCounts = CarFactory.countCarsPerType();
        assertEquals(1, carCounts.get("luxury"));
        assertEquals(2, carCounts.get("economy"));
        assertEquals(1, carCounts.get("standard"));
    }

    @Test
    void removeCar() {
        CarFactory.createCar("luxury", "Rolls Royce", "Spectre", 1000, 2, 50, 2000, 100);
        CarFactory.createCar("luxury", "Rolls Royce", "Phantom", 750, 1.25, 75, 1500, 100);
        CarFactory.createCar("economy", "Toyota", "Prius", 50, 0.20, 250, 200, 100);
        CarFactory.createCar("standard", "Ford", "Mondeo", 27, 0.39, 150, 200, 100);
        CarFactory.createCar("economy", "Kia", "Rio", 55, 0.3, 150, 200, 100);

        assertEquals(5, CarFactory.countAllCars());

        CarFactory.removeCar("luxury", "rolls royce", "spectre");
        assertEquals(4, CarFactory.countAllCars());

        // Try to remove the same car again
        CarFactory.removeCar("luxury", "rolls royce", "spectre");
        assertEquals(4, CarFactory.countAllCars());
    }

    @Test
    void makeTwoOfTheSameCarThenRemoveOne() {
        CarFactory.createCar("luxury", "Rolls Royce", "Spectre", 1000, 2, 50, 2000, 100);
        CarFactory.createCar("luxury", "Rolls Royce", "Spectre", 1000, 2, 50, 2000, 100);

        assertEquals(2, CarFactory.countAllCars());

        CarFactory.removeCar("luxury", "rolls royce", "spectre");

        assertEquals(1, CarFactory.countAllCars());
    }

    @Test
    void makeTwoOfTheSameCarThenRemoveThemBoth() {
        CarFactory.createCar("luxury", "Rolls Royce", "Spectre", 1000, 2, 50, 2000, 100);
        CarFactory.createCar("luxury", "Rolls Royce", "Spectre", 1000, 2, 50, 2000, 100);

        assertEquals(2, CarFactory.countAllCars());

        CarFactory.removeCar("luxury", "rolls royce", "spectre");
        CarFactory.removeCar("luxury", "rolls royce", "spectre");

        assertEquals(0, CarFactory.countAllCars());
    }
}
