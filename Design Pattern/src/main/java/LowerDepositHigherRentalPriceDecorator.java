class LowerDepositHigherRentalPrice extends RentalOptionsDecorator {
    public LowerDepositHigherRentalPrice(RentalAgreementInterface rentalAgreement) {
        super(rentalAgreement);
    }

    @Override
    public double calculateTotalCost() {
        // Add the cost of Lower Deposit Higher Rental Price option if selected, otherwise return the original cost
        return 50;
    }

    @Override
    public String makeRentalAgreement() {
        return "Lower Deposit Higher Rental Price";
    }
}
