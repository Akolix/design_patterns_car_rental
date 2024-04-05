public class ExtraKilometerDecorator extends RentalOptionsDecorator {
    private static final double STANDARD_ECONOMY_COST = 50;
    private static final double LUXURY_COST = 250;

    public ExtraKilometerDecorator(RentalAgreementInterface rentalAgreement) {
        super(rentalAgreement);
    }

    @Override
    public double calculateTotalCost() {
        CarInterface rentedCar = rental_agreement.getCar();
        if (rentedCar != null) {
            int originalFreeKm = rentedCar.getFreeKm();
            int doubledFreeKm = originalFreeKm * 2;

            rentedCar.setFreeKm(doubledFreeKm);

            double extraKmCost = 0;
            if (rentedCar.getType().equalsIgnoreCase("standard") || rentedCar.getType().equalsIgnoreCase("economy")) {
                extraKmCost = STANDARD_ECONOMY_COST;
            } else if (rentedCar.getType().equalsIgnoreCase("luxury")) {
                extraKmCost = LUXURY_COST;
            }

            return extraKmCost;
        }
        return 0;
    }
    @Override
    public String makeRentalAgreement() {
        return "Extra Kilometer option added";
    }
}
