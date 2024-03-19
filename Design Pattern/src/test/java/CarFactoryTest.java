import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    @Test
    void createCar() {
        // Test creating a LuxuryCar
        Car luxuryCar = CarFactory.createCar("luxury");
        assertNotNull(luxuryCar);
        assertTrue(luxuryCar instanceof LuxuryCar);

        // Test creating an EconomyCar
        Car economyCar = CarFactory.createCar("economy");
        assertNotNull(economyCar);
        assertTrue(economyCar instanceof EconomyCar);

        // Test creating a StandardCar
        Car standardCar = CarFactory.createCar("standard");
        assertNotNull(standardCar);
        assertTrue(standardCar instanceof StandardCar);

        // Test creating an invalid car type
        assertThrows(IllegalArgumentException.class, () -> {
            Car invalidCar = CarFactory.createCar("invalid");
        });
    }

    @Test
    void returnCar() {}
}
