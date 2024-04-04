//class ExtraKilometerDecorator extends RentalOptionsDecorator {
//
//
//    private static final double STANDARD_ECONOMY_COST = 50;
//    private static final double LUXURY_COST = 250;
//
//    public ExtraKilometerDecorator(RentalAgreementInterface rentalAgreement) {
//        super(rentalAgreement);
//    }
//
//    @Override
//    public double calculateTotalCost() {
//        double extraKmCost = 0;
//
//        if (rental_agreement instanceof CarInterface) {
//            System.out.println("asDoSGFsdg");
//            CarInterface rentedCar = (CarInterface) rental_agreement;
//            int originalFreeKm = rentedCar.getFreeKm(); // Store the original value
//            int doubledFreeKm = originalFreeKm * 2; // Double the free kilometers
//
//            // Update the free kilometers in the car object
//            rentedCar.setFreeKm(doubledFreeKm);
//
//            if (rentedCar instanceof StandardCar || rentedCar instanceof EconomyCar) {
//                extraKmCost = STANDARD_ECONOMY_COST;
//            } else if (rentedCar instanceof LuxuryCar) {
//                extraKmCost = LUXURY_COST;
//            }
//        }
//        System.out.println(extraKmCost);
//        return extraKmCost;
//
//    }
//
//    @Override
//    public String makeRentalAgreement() {
//        return "Extra Kilometer option added";
//    }
//}

//class ExtraKilometerDecorator extends RentalOptionsDecorator
//{
//    private static final double STANDARD_ECONOMY_COST = 50;
//    private static final double LUXURY_COST = 250;
//
//    public ExtraKilometerDecorator(RentalAgreementInterface rentalAgreement)
//    {
//        super(rentalAgreement);
//    }
//
//    @Override
//    public double calculateTotalCost()
//    {
//        double extraKmCost = 0;
//        CarInterface rentedCar = rental_agreement.getCar();
//        System.out.println(rentedCar + "rented car");
//
////        if (rentedCar != null)
////        {
//            int originalFreeKm = rentedCar.getFreeKm();
//            int doubledFreeKm = originalFreeKm * 2;
//
//            System.out.println(originalFreeKm);
//            System.out.println(doubledFreeKm);
//
//            rentedCar.setFreeKm(doubledFreeKm);
//
//            if (rentedCar.getType().equalsIgnoreCase("standard") || rentedCar.getType().equalsIgnoreCase("economy"))
//            {
//                extraKmCost = STANDARD_ECONOMY_COST;
//                rentedCar.setFreeKm(rentedCar.getFreeKm() * 2);
//            } else if (rentedCar.getType().equalsIgnoreCase("luxury"))
//            {
//                extraKmCost = LUXURY_COST;
//            }
////        }
////        else
////        {
////            throw new RuntimeException("There are no cars with the specified type.");
////        }
//
//        return extraKmCost;
//    }
//
//    @Override
//    public String makeRentalAgreement()
//    {
//        return "Extra Kilometer option added";
//    }
//}

//class ExtraKilometerDecorator extends RentalOptionsDecorator {
//    private static final double STANDARD_ECONOMY_COST = 50;
//    private static final double LUXURY_COST = 250;
//
//    public ExtraKilometerDecorator(RentalAgreementInterface rentalAgreement) {
//        super(rentalAgreement);
//    }
//
//    @Override
//    public double calculateTotalCost() {
//        double extraKmCost = 0;
//
//        CarInterface rentedCar = rental_agreement.getCar();
//        if (rentedCar != null) {
//            int freeKm = rentedCar.getFreeKm();
//            int freeKms = rental_agreement.getFreeKm();
//            int originalFreeKm = rentedCar.getFreeKm(); // Store the original value
//            int doubledFreeKm = originalFreeKm * 2; // Double the free kilometers
//            int doubledFreeKms = freeKms * 3; // Double the free kilometers
//            int doubledFreeKmss = freeKm * 4; // Double the free kilometers
//
//            // Update the free kilometers in the car object
//            rentedCar.setFreeKm(doubledFreeKm);
//            rentedCar.setFreeKm(doubledFreeKms);
//            rentedCar.setFreeKm(doubledFreeKmss);
//            rental_agreement.getCar().setFreeKm(originalFreeKm * 2);
//            rental_agreement.getCar().setFreeKm(doubledFreeKm);
//            rental_agreement.getCar().setFreeKm(doubledFreeKms);
//            rental_agreement.getCar().setFreeKm(doubledFreeKmss);
//            rental_agreement.getCar().setFreeKm(originalFreeKm * 2);
//            rentedCar.setFreeKm(doubledFreeKm);
//            rentedCar.setFreeKm(doubledFreeKms);
//            rentedCar.setFreeKm(doubledFreeKmss);
//            System.out.println(doubledFreeKm);
//            System.out.println(doubledFreeKms);
//            System.out.println(doubledFreeKmss);
//
//            if (rentedCar.getType().equalsIgnoreCase("standard") || rentedCar.getType().equalsIgnoreCase("economy")) {
//                extraKmCost = STANDARD_ECONOMY_COST;
//            } else if (rentedCar.getType().equalsIgnoreCase("luxury")) {
//                extraKmCost = LUXURY_COST;
//            }
//        }
//        return extraKmCost;
//    }
//
//    @Override
//    public String makeRentalAgreement() {
//        return "Extra Kilometer option added";
//    }
//}


public class ExtraKilometerDecorator extends RentalOptionsDecorator {
    private static final double STANDARD_ECONOMY_COST = 50;
    private static final double LUXURY_COST = 250;

    public ExtraKilometerDecorator(RentalAgreementInterface rentalAgreement) {
        super(rentalAgreement);
    }

    @Override
    public double calculateTotalCost() {
        CarInterface rentedCar = rental_agreement.getCar();
        if (rentedCar != null) {
            int originalFreeKm = rentedCar.getFreeKm();
            int doubledFreeKm = originalFreeKm * 2;

            rentedCar.setFreeKm(doubledFreeKm);

            // Calculate extra kilometer cost based on car type
            double extraKmCost = 0;
            if (rentedCar.getType().equalsIgnoreCase("standard") || rentedCar.getType().equalsIgnoreCase("economy")) {
                extraKmCost = STANDARD_ECONOMY_COST;
            } else if (rentedCar.getType().equalsIgnoreCase("luxury")) {
                extraKmCost = LUXURY_COST;
            }

            return extraKmCost;
        }
        return 0;
    }

    @Override
    public String makeRentalAgreement() {
        return "Extra Kilometer option added";
    }
}
