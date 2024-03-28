class HigherDepositLowerRentalPrice extends RentalOptionsDecorator {
    private static final double DEPOSIT_INCREASE_PERCENTAGE = 0.5; // 50% increase
    private static final double DISCOUNT_PERCENTAGE = 0.10; // 10% discount

    public HigherDepositLowerRentalPrice(RentalAgreementInterface rental_agreement) {
        super(rental_agreement);
    }

    public double calculate_total_cost() {
        double adjustedDailyRate = rental_agreement.calculate_total_cost() * (1 - DISCOUNT_PERCENTAGE); // Apply discount
        return adjustedDailyRate;
    }

//    public String get_description() {
//        return rental_agreement.make_rental_agreement() + ", Higher Deposit Lower Rental Price";
//    }
//
//    @Override
//    public String getDescription() {
//        return null;
//    }

    // Override the method to calculate the deposit
    @Override
    public double calculateTotalCost() {
        double baseCost = rental_agreement.calculateTotalCost();
        double increasedDeposit = baseCost * DEPOSIT_INCREASE_PERCENTAGE;
        return baseCost + increasedDeposit;
    }
}
