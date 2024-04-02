//class TowBarDecorator extends RentalOptionsDecorator {
//    public TowBarDecorator(RentalAgreementInterface rental_agreement) {
//        super(rental_agreement);
//    }
//
//    public double calculate_total_cost() {
//        return rental_agreement.calculate_total_cost() + 20;
//    }
//
//    public String get_description() {
//        return rental_agreement.make_rental_agreement() + ", Tow Bar";
//    }
//
//}

class TowBarDecorator extends RentalOptionsDecorator {
    public TowBarDecorator(RentalAgreementInterface rentalAgreement) {
        super(rentalAgreement);
    }

    @Override
    public double calculateTotalCost() {
        return rental_agreement.calculateTotalCost() + 20.0;
    }

    @Override
    public String makeRentalAgreement() {
        return rental_agreement.make_rental_agreement() + ", Tow Bar";
    }
}
