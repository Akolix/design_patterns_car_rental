//public class Main {
//    public static void main(String[] args) {
//        Car luxuryCar = CarFactory.createCar();
//
//        luxuryCar.assemble();
//
//
//    }
//}

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car luxuryCar = CarFactory.createCar("luxury", "Rolls Royce", "Spectre", 1000, 2, 50, 2000, 789);
        Car economyCar = CarFactory.createCar("economy", "Toyota", "Corolla", 30, 0.2, 100, 250, 456);
        Car standardCar = CarFactory.createCar("standard", "Ford", "Mondeo", 27, 0.39, 150, 300, 123);

        luxuryCar.assemble();
        economyCar.assemble();
        standardCar.assemble();

        RentalAgreement agreement1 = new RentalAgreement(economyCar, 5, "John Doe");
        RentalAgreement agreement2 = new RentalAgreement(luxuryCar, 10, "Jane Doe");

        RentalOptionsDecorator childSeatOption = new ChildSeatDecorator(agreement1);
        RentalOptionsDecorator towBarOption = new TowBarDecorator(agreement2);
        RentalOptionsDecorator higherDepositLowerRentalPrice = new HigherDepositLowerRentalPrice(agreement2);
        RentalOptionsDecorator lowerDepositHigherRental = new LowerDepositHigherRentalPrice(agreement2);

//        agreement1.addOptionsToAgreement(childSeatOption);
//        agreement1.addOptionsToAgreement(higherDepositLowerRentalPrice);
        agreement2.addOptionsToAgreement(childSeatOption);
        agreement2.addOptionsToAgreement(towBarOption);
        agreement2.addOptionsToAgreement(lowerDepositHigherRental);

//        System.out.println(agreement1.make_rental_agreement());
//        System.out.println(agreement1.calculateTotalCost());

//        System.out.println(agreement2.getDeposit());
        System.out.println(agreement2.make_rental_agreement());
        System.out.println(agreement2.calculateTotalCost());
    }
}
