class LowerDepositHigherRentalPrice extends RentalOptionsDecorator {
    private static final double DAILY_RATE_INCREASE_PERCENTAGE = 0.25; // 25% increase
    private static final double DEPOSIT_DECREASE_PERCENTAGE = 0.33; // 33% decrease

    public LowerDepositHigherRentalPrice(RentalAgreementInterface rentalAgreement) {
        super(rentalAgreement);
    }

    @Override
    public double calculateTotalCost() {
        CarInterface rentedCar = rental_agreement.getCar();

        if (rentedCar != null) {
            double dailyRate = rentedCar.getDailyRate();
            double deposit = rental_agreement.getDeposit();
            double decreasedDeposit = deposit * (1 - DEPOSIT_DECREASE_PERCENTAGE);
            double increasedRate = dailyRate * (1 + DAILY_RATE_INCREASE_PERCENTAGE);

            System.out.println("Current deposit: " + deposit);
            System.out.println("Decreased deposit: " + decreasedDeposit);
            System.out.println("Current daily rate: " + dailyRate);
            System.out.println("Increased daily rate: " + increasedRate);


            rentedCar.setDeposit(decreasedDeposit);
            rentedCar.setDailyRate(increasedRate);

            return 0;
        }

        return 0;
    }

    @Override
    public String makeRentalAgreement() {
        return "Lower Deposit Higher Rental Price option added";
    }
}
