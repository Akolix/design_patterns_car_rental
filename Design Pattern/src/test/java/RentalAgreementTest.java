import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RentalAgreementTest {

    @Test
    void make_rental_agreement() {
        CarInterface car = new EconomyCar("Toyota", "Corolla", 40.0, 0.25, 100, 500, 0);
        RentalAgreement rentalAgreement = new RentalAgreement(car, 5, new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "geen@adres.nl", true), null);
        assertEquals("Rental agreement: John Doe, 5 days, EconomyCar", rentalAgreement.make_rental_agreement());
//        assertEquals("John Doe", Customer.customer rentalAgreement.make_rental_agreement());
    }

    @Test
    void make_rental_agreement_Company_Daily_Luxury() {
        CarInterface car = new LuxuryCar("Rolls Royce", "Spectre", 1000, 2, 50, 2000, 789);
        Customer customer = new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "john.doe@example.com", true);
        PricingStrategy pricingStrategy = new CompanyPricingStrategy();
        RentalAgreement rentalAgreement = new RentalAgreement(car, 5, customer, pricingStrategy);

        assertEquals("Rental agreement: John Doe, 5 days, LuxuryCar", rentalAgreement.make_rental_agreement());
        assertEquals(5000.0, rentalAgreement.calculateTotalCost());
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