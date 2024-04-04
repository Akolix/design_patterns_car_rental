import org.junit.jupiter.api.Test;


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
    void make_rental_agreement_Company_Weekly_Economy() {
        CarInterface car = new EconomyCar("Toyota", "Prius", 50, 0.20, 250, 200, 100);
        Customer customer = new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "john.doe@example.com", true);

        RentalAgreement rentalAgreement = new RentalAgreement(car, 12, customer);

        assertEquals("Rental agreement: John Doe, 12 days, EconomyCar", rentalAgreement.make_rental_agreement());
        assertEquals(671.07, rentalAgreement.calculateTotalCost());
    }

    @Test
    void make_rental_agreement_Company_Monthly_Luxury() {
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

        RentalOptionsDecorator tripleAOption  = new TripleADecorator(rentalAgreement);

        rentalAgreement.addOptionsToAgreement(tripleAOption);

        assertEquals("Rental agreement: John Doe, 41 days, LuxuryCar with the following options:\n- AAA insurance Included", rentalAgreement.make_rental_agreement());
        assertEquals(37870.00, rentalAgreement.calculateTotalCost());
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
    void make_rental_agreement_Company_Daily_Standard_With_Extra_Kilometer_Option() {
        CarInterface car = new StandardCar("Ford", "Mondeo", 27, 0.39, 150, 200, 100);
        Customer customer = new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "john.doe@example.com", true);

        RentalAgreement rentalAgreement = new RentalAgreement(car, 5, customer);

        // Add options decorators
        RentalOptionsDecorator extraKmOption = new ExtraKilometerDecorator(rentalAgreement);

        rentalAgreement.addOptionsToAgreement(extraKmOption);

        assertEquals("Rental agreement: John Doe, 5 days, StandardCar with the following options:\n- Extra Kilometer option added", rentalAgreement.make_rental_agreement());
        assertEquals(361.57, rentalAgreement.calculateTotalCost());
        assertEquals(300, rentalAgreement.getCar().getFreeKm());
    }

    @Test
    void make_rental_agreement_Private_Weekly_Economy_With_Extra_Kilometer_Option() {
        CarInterface car = new EconomyCar("Toyota", "Prius", 50, 0.20, 250, 200, 100);
        Customer customer = new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "john.doe@example.com", false);

        RentalAgreement rentalAgreement = new RentalAgreement(car, 12, customer);

        // Add options decorators
        RentalOptionsDecorator extraKmOption = new ExtraKilometerDecorator(rentalAgreement);

        rentalAgreement.addOptionsToAgreement(extraKmOption);

        assertEquals("Rental agreement: John Doe, 12 days, EconomyCar with the following options:\n- Extra Kilometer option added", rentalAgreement.make_rental_agreement());
        assertEquals(820, rentalAgreement.calculateTotalCost());
        assertEquals(500, rentalAgreement.getCar().getFreeKm());
    }

    @Test
    void make_rental_agreement_Private_Monthy_Luxury_With_Extra_Kilometer_Option() {
        CarInterface car = new LuxuryCar("Rolls Royce", "Spectre", 1000, 2, 50, 2000, 789);
        Customer customer = new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "john.doe@example.com", false);

        RentalAgreement rentalAgreement = new RentalAgreement(car, 41, customer);

        // Add options decorators
        RentalOptionsDecorator extraKmOption = new ExtraKilometerDecorator(rentalAgreement);

        rentalAgreement.addOptionsToAgreement(extraKmOption);

        assertEquals("Rental agreement: John Doe, 41 days, LuxuryCar with the following options:\n- Extra Kilometer option added", rentalAgreement.make_rental_agreement());
        assertEquals(37920.00, rentalAgreement.calculateTotalCost());
        assertEquals(100, rentalAgreement.getCar().getFreeKm());
    }
}