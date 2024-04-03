import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RentalAgreementTest {

    @Test
    void make_rental_agreement_Company_Daily_Standard() {
        CarInterface car = new LuxuryCar("Rolls Royce", "Spectre", 1000, 2, 50, 2000, 789);
        Customer customer = new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "john.doe@example.com", true);

        RentalAgreement rentalAgreement = new RentalAgreement(car, 5, customer);

        assertEquals("Rental agreement: John Doe, 5 days, LuxuryCar", rentalAgreement.make_rental_agreement());
        assertEquals(6132.23, rentalAgreement.calculateTotalCost());
    }

    @Test
    void make_rental_agreement_Company_Weeky_Economy() {
        CarInterface car = new LuxuryCar("Rolls Royce", "Spectre", 1000, 2, 50, 2000, 789);
        Customer customer = new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "john.doe@example.com", true);

        RentalAgreement rentalAgreement = new RentalAgreement(car, 12, customer);

        assertEquals("Rental agreement: John Doe, 12 days, LuxuryCar", rentalAgreement.make_rental_agreement());
        assertEquals(11421.49, rentalAgreement.calculateTotalCost());
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
    void getDuration() {

    }

    @Test
    void makeRentalAgreementWithinBoundaries() {

    }

    @Test
    void makeRentalAgreementWithFaultyDuration() {

    }

    @Test
    void calculateTotalCostForStandardCarRentedForOneDayWithNoOptions() {

    }
    @Test
    void calculateTotalCostForStandardCarRentedForOneDayWithOptions() {

    }

    @Test
    void calculateTotalCostForEconomyCarRentedForOneDayWithNoOptions() {

    }
    @Test
    void calculateTotalCostForEconomyCarRentedForOneDayWithOptions() {

    }

    @Test
    void calculateTotalCostForLuxuryCarRentedForOneDayWithNoOptions() {

    }
    @Test
    void calculateTotalCostForLuxuryCarRentedForOneDayWithOptions() {

    }

}