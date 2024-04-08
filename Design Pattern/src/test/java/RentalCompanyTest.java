import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RentalCompanyTest
{
    private RentalCompany rentalCompany;
    private CarFactory carFactory;
    private Car economyCar;
    private Car luxuryCar;
    private Customer customer;

    @BeforeEach
    public void setUp()
    {
        rentalCompany = new RentalCompany("Racebakken FM", "Stadsknoal");
        carFactory = new CarFactory();
        economyCar = carFactory.createCar("economy", "Toyota", "Corolla", 30, 0.2, 100, 250, 456);
        luxuryCar = carFactory.createCar("luxury", "Rolls Royce", "Spectre", 1000, 2, 50, 2000, 789);
        customer = new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "geen@adres.nl", true);
    }

    @Test
    public void testRentOutCar_ShouldPass()
    {
        RentalAgreement agreement = new RentalAgreement(economyCar, 5, customer);
        rentalCompany.rentOutCar(agreement);
        assertTrue(CarFactory.getRentedCars().contains(economyCar));
    }

    @Test
    public void testReturnCar_ShouldPass()
    {
        RentalAgreement agreement = new RentalAgreement(economyCar, 5, customer);
        rentalCompany.rentOutCar(agreement);
        rentalCompany.returnRentedCar(agreement);
        assertFalse(CarFactory.getRentedCars().contains(economyCar));
    }

    @Test
    public void testRentAlreadyRentedCar()
    {
        RentalAgreement agreement1 = new RentalAgreement(economyCar, 5, customer);
        RentalAgreement agreement2 = new RentalAgreement(economyCar, 10, customer);

        rentalCompany.rentOutCar(agreement1);
        assertThrows(IllegalStateException.class, () -> rentalCompany.rentOutCar(agreement2));
    }

    @Test
    public void testReturnCarPriceCalculation()
    {
        Car luxuryCar = CarFactory.createCar("luxury", "Rolls Royce", "Spectre", 1000, 2, 50, 2000, 789);
        RentalAgreement agreement1 = new RentalAgreement(luxuryCar, 10, customer);
        agreement1.setStartOdoMeter(0);
        agreement1.setEndOdoMeter(2000);
        rentalCompany.rentOutCar(agreement1);
        double actualTotalCost = rentalCompany.calculateTotalCost(agreement1);
        rentalCompany.returnRentedCar(agreement1);
        assertEquals(1000.0, actualTotalCost);
    }
}
