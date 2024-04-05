class HigherDepositLowerRentalPrice extends RentalOptionsDecorator {
    private static final double DEPOSIT_INCREASE_PERCENTAGE = 0.5;
    private static final double DISCOUNT_PERCENTAGE = 0.10;

    public HigherDepositLowerRentalPrice(RentalAgreementInterface rentalAgreement) {
        super(rentalAgreement);
    }

    @Override
    public double calculateTotalCost() {
        CarInterface rentedCar = rental_agreement.getCar();

        if (rentedCar != null) {
            double dailyRate = rentedCar.getDailyRate();
            double deposit = rental_agreement.getDeposit();
            double increasedDeposit = deposit * (1 + DEPOSIT_INCREASE_PERCENTAGE);
            double discountedRate = dailyRate * (1 - DISCOUNT_PERCENTAGE);

            rentedCar.setDeposit(increasedDeposit);
            rentedCar.setDailyRate(discountedRate);

            return 0;
        }

        return 0;
    }

    @Override
    public String makeRentalAgreement() {
        return "Higher Deposit Lower Rental Price option added";
    }
}
