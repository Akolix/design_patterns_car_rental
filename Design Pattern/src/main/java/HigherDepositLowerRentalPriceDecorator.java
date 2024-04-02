class HigherDepositLowerRentalPrice extends RentalOptionsDecorator {
    private static final double DEPOSIT_INCREASE_PERCENTAGE = 1.5; // 150% increase
    private static final double DISCOUNT_PERCENTAGE = 0.10; // 10% discount

    public HigherDepositLowerRentalPrice(RentalAgreementInterface rentalAgreement) {
        super(rentalAgreement);
    }

    @Override
    public double calculateTotalCost() {
        System.out.println(rental_agreement.getBaseCost());
        double baseCost = rental_agreement.getBaseCost();
        double increasedDeposit = baseCost * DEPOSIT_INCREASE_PERCENTAGE;
        double discountedRate = baseCost * (1 - DISCOUNT_PERCENTAGE); // Apply 10% discount
        return Math.max(baseCost + increasedDeposit, discountedRate); // Return the maximum of increased cost or discounted rate
    }

    @Override
    public String makeRentalAgreement() {
        return "Higher Deposit Lower Rental Price option added";
    }
}
