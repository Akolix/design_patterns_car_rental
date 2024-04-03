import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RentalCompanyTest
{
    private RentalCompany rentalCompany;
    private CarFactory carFactory;
    private Car economyCar;
    private Customer customer;

    @BeforeEach
    public void setUp()
    {
        rentalCompany = new RentalCompany("Racebakken FM", "Stadsknoal");
        carFactory = new CarFactory();
        economyCar = carFactory.createCar("economy", "Toyota", "Corolla", 30, 0.2, 100, 250, 456);
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
}
