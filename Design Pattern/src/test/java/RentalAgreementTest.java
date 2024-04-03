import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RentalAgreementTest {

    @Test
    void make_rental_agreement_Company_Daily_Standard() {
        CarInterface car = new StandardCar("Ford", "Mondeo", 27, 0.39, 150, 200, 100);
        Customer customer = new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "john.doe@example.com", true);

        RentalAgreement rentalAgreement = new RentalAgreement(car, 5, customer);

        assertEquals("Rental agreement: John Doe, 5 days, StandardCar", rentalAgreement.make_rental_agreement());
        assertEquals(311.57, rentalAgreement.calculateTotalCost());
    }

    @Test
    void make_rental_agreement_Company_Weeky_Economy() {
        CarInterface car = new EconomyCar("Toyota", "Prius", 50, 0.20, 250, 200, 100);
        Customer customer = new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "john.doe@example.com", true);

        RentalAgreement rentalAgreement = new RentalAgreement(car, 12, customer);

        assertEquals("Rental agreement: John Doe, 12 days, EconomyCar", rentalAgreement.make_rental_agreement());
        assertEquals(671.07, rentalAgreement.calculateTotalCost());
    }

    @Test
    void make_rental_agreement_Company_Monthy_Luxury() {
        CarInterface car = new LuxuryCar("Rolls Royce", "Spectre", 1000, 2, 50, 2000, 789);
        Customer customer = new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "john.doe@example.com", true);

        RentalAgreement rentalAgreement = new RentalAgreement(car, 41, customer);

        assertEquals("Rental agreement: John Doe, 41 days, LuxuryCar", rentalAgreement.make_rental_agreement());
        assertEquals(31479.34, rentalAgreement.calculateTotalCost());
    }

    @Test
    void make_rental_agreement_Private_Daily_Standard() {
        CarInterface car = new StandardCar("Ford", "Mondeo", 27, 0.39, 150, 200, 100);
        Customer customer = new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "john.doe@example.com", false);

        RentalAgreement rentalAgreement = new RentalAgreement(car, 5, customer);

        assertEquals("Rental agreement: John Doe, 5 days, StandardCar", rentalAgreement.make_rental_agreement());
        assertEquals(335.00, rentalAgreement.calculateTotalCost());
    }

    @Test
    void make_rental_agreement_Private_Weekly_Economy() {
        CarInterface car = new EconomyCar("Toyota", "Prius", 50, 0.20, 250, 200, 100);
        Customer customer = new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "john.doe@example.com", false);

        RentalAgreement rentalAgreement = new RentalAgreement(car, 12, customer);

        assertEquals("Rental agreement: John Doe, 12 days, EconomyCar", rentalAgreement.make_rental_agreement());
        assertEquals(770.00, rentalAgreement.calculateTotalCost());
    }

    @Test
    void make_rental_agreement_Private_Monthly_Luxury() {
        CarInterface car = new LuxuryCar("Rolls Royce", "Spectre", 1000, 2, 50, 2000, 789);
        Customer customer = new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "john.doe@example.com", false);

        RentalAgreement rentalAgreement = new RentalAgreement(car, 41, customer);

        assertEquals("Rental agreement: John Doe, 41 days, LuxuryCar", rentalAgreement.make_rental_agreement());
        assertEquals(37670.00, rentalAgreement.calculateTotalCost());
    }

    @Test
    void make_rental_agreement_Private_Monthly_Luxury_With_Options() {
        CarInterface car = new LuxuryCar("Rolls Royce", "Spectre", 1000, 2, 50, 2000, 789);
        Customer customer = new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "john.doe@example.com", false);

        RentalAgreement rentalAgreement = new RentalAgreement(car, 41, customer);

        assertEquals("Rental agreement: John Doe, 41 days, LuxuryCar", rentalAgreement.make_rental_agreement());
        assertEquals(37670.00, rentalAgreement.calculateTotalCost());
    }

    @Test
    void make_rental_agreement_Private_Daily_Standard_With_Options() {
        CarInterface car = new StandardCar("Ford", "Mondeo", 27, 0.39, 150, 200, 100);
        Customer customer = new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "john.doe@example.com", false);

        RentalAgreement rentalAgreement = new RentalAgreement(car, 5, customer);

        // Add options decorators
        RentalOptionsDecorator childSeatOption = new ChildSeatDecorator(rentalAgreement);
        RentalOptionsDecorator towBarOption = new TowBarDecorator(rentalAgreement);

        rentalAgreement.addOptionsToAgreement(childSeatOption);
        rentalAgreement.addOptionsToAgreement(towBarOption);

        assertEquals("Rental agreement: John Doe, 5 days, StandardCar with the following options:\n- Child Seat option added\n- Tow Bar option added", rentalAgreement.make_rental_agreement());
        assertEquals(395, rentalAgreement.calculateTotalCost());
    }

    @Test
    void make_rental_agreement_Company_Daily_Standard_With_Options() {
        CarInterface car = new StandardCar("Ford", "Mondeo", 27, 0.39, 150, 200, 100);
        Customer customer = new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "john.doe@example.com", true);

        RentalAgreement rentalAgreement = new RentalAgreement(car, 5, customer);

        // Add options decorators
        RentalOptionsDecorator childSeatOption = new ChildSeatDecorator(rentalAgreement);
        RentalOptionsDecorator towBarOption = new TowBarDecorator(rentalAgreement);

        rentalAgreement.addOptionsToAgreement(childSeatOption);
        rentalAgreement.addOptionsToAgreement(towBarOption);

        assertEquals("Rental agreement: John Doe, 5 days, StandardCar with the following options:\n- Child Seat option added\n- Tow Bar option added", rentalAgreement.make_rental_agreement());
        assertEquals(371.57, rentalAgreement.calculateTotalCost());
    }

}