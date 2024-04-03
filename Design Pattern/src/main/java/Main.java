import java.util.List;

public class Main {
    public static void main(String[] args) {
        RentalCompany rentalCompany = new RentalCompany("Racebakken FM", "Stadsknoal");

        Car luxuryCar = CarFactory.createCar("luxury", "Rolls Royce", "Spectre", 1000, 2, 50, 2000, 789);
        Car economyCar = CarFactory.createCar("economy", "Toyota", "Corolla", 30, 0.2, 100, 250, 456);
//        Car standardCar = CarFactory.createCar("standard", "Ford", "Mondeo", 27, 0.39, 150, 300, 123);

        Customer customer = new Customer("John", "Doe", "Main Avenue, 123", "0612345789", "geen@adres.nl", true);

        luxuryCar.assemble();
        economyCar.assemble();
//        standardCar.assemble();

        RentalAgreement agreement1 = new RentalAgreement(economyCar, 5, customer);
//        RentalAgreement agreement2 = new RentalAgreement(luxuryCar, 10, customer);

        rentalCompany.rentOutCar(agreement1);

        List<String> availableCars = CarFactory.listAllCars();
        System.out.println("Available cars after return:");
        for (String car : availableCars) {
            System.out.println(car);
        }

        rentalCompany.returnRentedCar(agreement1);

        List<String> availableCars2 = CarFactory.listAllCars();
        System.out.println("Available cars after return:");
        for (String car : availableCars2) {
            System.out.println(car);
        }


//        RentalOptionsDecorator childSeatOption = new ChildSeatDecorator(agreement1);
//        RentalOptionsDecorator towBarOption = new TowBarDecorator(agreement2);
//        RentalOptionsDecorator higherDepositLowerRentalPrice = new HigherDepositLowerRentalPrice(agreement2);
//        RentalOptionsDecorator lowerDepositHigherRental = new LowerDepositHigherRentalPrice(agreement2);
//        RentalOptionsDecorator extraKM = new ExtraKilometerDecorator(agreement1);
//
//        agreement2.addOptionsToAgreement(childSeatOption);
//        agreement2.addOptionsToAgreement(towBarOption);
//        agreement2.addOptionsToAgreement(lowerDepositHigherRental);
//
//        // Automatically select pricing strategy based on duration
//        agreement1.setPricingStrategy(agreement1.getPricingStrategy().selectStrategy(agreement1.getDuration()));
//        agreement2.setPricingStrategy(agreement2.getPricingStrategy().selectStrategy(agreement2.getDuration()));
//
//        System.out.println(agreement2.make_rental_agreement());
//        System.out.println(agreement2.calculateTotalCost());
    }
}
