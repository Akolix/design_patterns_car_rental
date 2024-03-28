class ExtraKilometerDecorator extends RentalOptionsDecorator {
    private static final double STANDARD_ECONOMY_COST = 50;
    private static final double LUXURY_COST = 250;

    public ExtraKilometerDecorator(RentalAgreementInterface rental_agreement) {
        super(rental_agreement);
    }

    @Override
    public double calculateTotalCost() {
        double extraKmCost = 0;

        if (rental_agreement instanceof Car) {
            Car rentedCar = (Car) rental_agreement;
            if (rentedCar instanceof StandardCar || rentedCar instanceof EconomyCar) {
                extraKmCost = STANDARD_ECONOMY_COST;
            } else if (rentedCar instanceof LuxuryCar) {
                extraKmCost = LUXURY_COST;
            }
        }

        return rental_agreement.calculateTotalCost() + extraKmCost;
    }

//    @Override
//    public String get_description() {
//        return rental_agreement.) + ", Extra Kilometers";
//    }
}

