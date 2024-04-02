//class LowerDepositHigherRentalPrice extends RentalOptionsDecorator {
//    public LowerDepositHigherRentalPrice(RentalAgreementInterface rental_agreement) {
//        super(rental_agreement);
//    }
//
//    public double calculate_total_cost() {
//        return rental_agreement.calculate_total_cost() + 30;
//    }
//
//    public String get_description() {
//        return rental_agreement.make_rental_agreement() + ", Lower Deposit Higher Rental Price";
//    }
//}

class LowerDepositHigherRentalPrice extends RentalOptionsDecorator {
    public LowerDepositHigherRentalPrice(RentalAgreementInterface rentalAgreement) {
        super(rentalAgreement);
    }

    @Override
    public double calculateTotalCost() {
        // Add the cost of Lower Deposit Higher Rental Price option if selected, otherwise return the original cost
        return rental_agreement.calculateTotalCost() + 30.0;
    }

    @Override
    public String makeRentalAgreement() {
        return rental_agreement.make_rental_agreement() + ", Lower Deposit Higher Rental Price";
    }
}
