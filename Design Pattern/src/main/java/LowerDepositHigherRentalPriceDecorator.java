class LowerDepositHigherRentalPrice extends RentalOptionsDecorator {
    private static final double DAILY_RATE_INCREASE_PERCENTAGE = 1.25; // 25% increase
    private static final double DEPOSIT_DECREASE_PERCENTAGE = 0.33; // 33% decrease

    public LowerDepositHigherRentalPrice(RentalAgreementInterface rentalAgreement) {
        super(rentalAgreement);
    }

    @Override
    public double calculateTotalCost() {
        // Add the cost of Lower Deposit Higher Rental Price option if selected, otherwise return the original cost
        double baseCost = rental_agreement.getBaseCost();
        double deposit = rental_agreement.getDeposit();
        double increasedRate = baseCost * DAILY_RATE_INCREASE_PERCENTAGE;
        double decreasedDeposit = deposit * (1 - DEPOSIT_DECREASE_PERCENTAGE); // Apply 33% decrease
        return increasedRate + decreasedDeposit; // Calculate the total cost after adjusting the rate and deposit
    }

    @Override
    public String makeRentalAgreement() {
        return "Lower Deposit Higher Rental Price";
    }
}
