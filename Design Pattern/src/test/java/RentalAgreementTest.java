import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RentalAgreementTest {

    @Test
    void make_rental_agreement() {
        CarInterface car = new EconomyCar("Toyota", "Corolla", 40.0, 0.25, 100, 500, 0);
        RentalAgreement rentalAgreement = new RentalAgreement(car, 5, "John Doe");
        assertEquals("Rental agreement: John Doe, 5 days, EconomyCar ", rentalAgreement.make_rental_agreement());
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