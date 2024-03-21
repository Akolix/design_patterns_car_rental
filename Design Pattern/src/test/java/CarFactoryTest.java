import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;

class CarFactoryTest {

//    @Test
//    void createLuxuryCar() {
//        Car luxuryCar = CarFactory.createCar("luxury");
//        assertNotNull(luxuryCar);
//        assertTrue(luxuryCar instanceof LuxuryCar);
//    }
//
//    @Test
//    void createEconomyCar() {
//        Car economyCar = CarFactory.createCar("economy");
//        assertNotNull(economyCar);
//        assertTrue(economyCar instanceof EconomyCar);
//    }
//
//    @Test
//    void createStandardCAr() {
//        Car standardCar = CarFactory.createCar("standard");
//        assertNotNull(standardCar);
//        assertTrue(standardCar instanceof StandardCar);
//    }
//
//    @Test
//    void createFaultyCar() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            Car EcomonyCar = CarFactory.createCar("invalid car type");
//        });
//    }

    @BeforeEach
    void setUp() {
        CarFactory.createdCars.clear();
    }

    @Test
    void createLuxuryCar() {
        Car luxuryCar = CarFactory.createCar("luxury", "Rolls Royce", "Spectre", 1000, 2, 50);
        assertNotNull(luxuryCar);
        assertTrue(luxuryCar instanceof LuxuryCar);
    }

    @Test
    void createEconomyCar() {
        Car economyCar = CarFactory.createCar("economy", "Toyota", "Prius", 50, 0.20, 250);
        assertNotNull(economyCar);
        assertTrue(economyCar instanceof EconomyCar);
    }

    @Test
    void createStandardCar() {
        Car standardCar = CarFactory.createCar("standard", "Ford", "Mondeo", 27, 0.39, 150);
        assertNotNull(standardCar);
        assertTrue(standardCar instanceof StandardCar);
    }

    @Test
    void createFaultyCar() {
        assertThrows(IllegalArgumentException.class, () -> {
            Car invalidCar = CarFactory.createCar("invalid car type", "Invalid Brand", "Invalid Model", 0, 0, 0);
        });
    }

    @Test
    void createStandardCarWithAttributes() {
        String brand = "Ford";
        String model = "Mondeo";
        double dailyRate = 27.0;
        double pricePerKm = 0.39;
        int freeKm = 150;

        Car standardCar = CarFactory.createCar("standard", brand, model, dailyRate, pricePerKm, freeKm);

        assertNotNull(standardCar);

        assertTrue(standardCar instanceof StandardCar);

        assertEquals(brand, ((StandardCar) standardCar).getBrand());
        assertEquals(model, ((StandardCar) standardCar).getModel());
        assertEquals(dailyRate, ((StandardCar) standardCar).getDaily_rate());
        assertEquals(pricePerKm, ((StandardCar) standardCar).getPrice_per_km());
        assertEquals(freeKm, ((StandardCar) standardCar).getFree_km());
    }

    @Test
    void createLuxuryCarWithAttributes() {
        String brand = "Rolls Royce";
        String model = "Spectre";
        double dailyRate = 1000;
        double pricePerKm = 2;
        int freeKm = 50;

        Car luxuryCar = CarFactory.createCar("luxury", brand, model, dailyRate, pricePerKm, freeKm);

        assertNotNull(luxuryCar);

        assertTrue(luxuryCar instanceof LuxuryCar);

        assertEquals(brand, ((LuxuryCar) luxuryCar).getBrand());
        assertEquals(model, ((LuxuryCar) luxuryCar).getModel());
        assertEquals(dailyRate, ((LuxuryCar) luxuryCar).getDaily_rate());
        assertEquals(pricePerKm, ((LuxuryCar) luxuryCar).getPrice_per_km());
        assertEquals(freeKm, ((LuxuryCar) luxuryCar).getFree_km());
    }

    @Test
    void createEconomyCarWithAttributes() {
        String brand = "Toyota";
        String model = "Prius";
        double dailyRate = 50;
        double pricePerKm = 0.20;
        int freeKm = 250;

        Car economyCar = CarFactory.createCar("economy", brand, model, dailyRate, pricePerKm, freeKm);

        assertNotNull(economyCar);

        assertTrue(economyCar instanceof EconomyCar);

        assertEquals(brand, ((EconomyCar) economyCar).getBrand());
        assertEquals(model, ((EconomyCar) economyCar).getModel());
        assertEquals(dailyRate, ((EconomyCar) economyCar).getDaily_rate());
        assertEquals(pricePerKm, ((EconomyCar) economyCar).getPrice_per_km());
        assertEquals(freeKm, ((EconomyCar) economyCar).getFree_km());
    }

    @Test
    void createAndListAllCars() {
        CarFactory.createCar("luxury", "Rolls Royce", "Spectre", 1000, 2, 50);
        CarFactory.createCar("economy", "Toyota", "Prius", 50, 0.20, 250);
        CarFactory.createCar("standard", "Ford", "Mondeo", 27, 0.39, 150);

        List<String> carTypes = CarFactory.listAllCars();

        System.out.println(carTypes);

        assertEquals(3, carTypes.size());
        assertTrue(carTypes.contains("luxury"));
        assertTrue(carTypes.contains("economy"));
        assertTrue(carTypes.contains("standard"));
    }


}
