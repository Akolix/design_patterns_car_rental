//class HigherDepositLowerRentalPrice extends RentalOptionsDecorator {
//    private static final double DEPOSIT_INCREASE_PERCENTAGE = 0.5; // 50% increase
//    private static final double DISCOUNT_PERCENTAGE = 0.10; // 10% discount
//
//    public HigherDepositLowerRentalPrice(RentalAgreementInterface rental_agreement) {
//        super(rental_agreement);
//    }
//
//    public double calculate_total_cost() {
//        double adjustedDailyRate = rental_agreement.calculate_total_cost() * (1 - DISCOUNT_PERCENTAGE); // Apply discount
//        return adjustedDailyRate;
//    }
//
//    @Override
//    public double calculateTotalCost() {
//        double baseCost = rental_agreement.calculateTotalCost();
//        double increasedDeposit = baseCost * DEPOSIT_INCREASE_PERCENTAGE;
//        return baseCost + increasedDeposit;
//    }
//}

class HigherDepositLowerRentalPrice extends RentalOptionsDecorator {
    private static final double DEPOSIT_INCREASE_PERCENTAGE = 1.5; // 150% increase
    private static final double DISCOUNT_PERCENTAGE = 0.10; // 10% discount

    public HigherDepositLowerRentalPrice(RentalAgreementInterface rentalAgreement) {
        super(rentalAgreement);
    }

    @Override
    public double calculateTotalCost() {
        double baseCost = rental_agreement.calculateTotalCost();
        double increasedDeposit = baseCost * DEPOSIT_INCREASE_PERCENTAGE;
        double discountedRate = baseCost * (1 - DISCOUNT_PERCENTAGE); // Apply 10% discount
        return Math.max(baseCost + increasedDeposit, discountedRate); // Return the maximum of increased cost or discounted rate
    }

    @Override
    public String makeRentalAgreement() {
        return rental_agreement.make_rental_agreement() + ", Higher Deposit Lower Rental Price";
    }
}
