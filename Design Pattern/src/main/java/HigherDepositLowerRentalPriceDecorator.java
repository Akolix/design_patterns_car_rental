class HigherDepositLowerRentalPrice extends RentalOptionsDecorator {
    private static final double DEPOSIT_INCREASE_PERCENTAGE = 1.5; // 150% increase
    private static final double DISCOUNT_PERCENTAGE = 0.10; // 10% discount

    public HigherDepositLowerRentalPrice(RentalAgreementInterface rentalAgreement) {
        super(rentalAgreement);
    }

    @Override
    public double calculateTotalCost() {
        double baseCost = rental_agreement.getBaseCost();
        double deposit = rental_agreement.getDeposit();
        double increasedDeposit = deposit * DEPOSIT_INCREASE_PERCENTAGE;
        double discountedRate = baseCost * (1 - DISCOUNT_PERCENTAGE); // Apply 10% discount
//        System.out.println("Basecost: " + baseCost);
//        System.out.println("deposit:" + deposit);
//        System.out.println("Increased despot" + increasedDeposit);
//        System.out.println("discount" + discountedRate);
        System.out.println(increasedDeposit);
        System.out.println(discountedRate);
        return increasedDeposit + discountedRate; // Return the maximum of increased cost or discounted rate
    }

    @Override
    public String makeRentalAgreement() {
        return "Higher Deposit Lower Rental Price option added";
    }
}
