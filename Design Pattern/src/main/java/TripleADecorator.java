class TripleADecorator extends RentalOptionsDecorator {
//    public TripleADecorator(RentalAgreementInterface rental_agreement) {
//        super(rental_agreement);
//    }
//
//    @Override
//    public  double calculateTotalCost() {
//        return rental_agreement.calculate_total_cost() + 200;
//    }
//
//    @Override
//    public String makeRentalAgreement() {
//        return rental_agreement.calculate_total_cost() + ", including AAA"
//    }


    public TripleADecorator(RentalAgreementInterface rentalAgreement) {
        super(rentalAgreement);
    }

    @Override
    public double calculateTotalCost() {
        return rental_agreement.calculateTotalCost() + 200;
    }

    @Override
    public String makeRentalAgreement() {
        return rental_agreement.make_rental_agreement() + ", AAA Discount";
    }
}

