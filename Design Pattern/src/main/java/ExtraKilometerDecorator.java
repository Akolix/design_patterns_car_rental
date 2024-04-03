class ExtraKilometerDecorator extends RentalOptionsDecorator
{
    private static final double STANDARD_ECONOMY_COST = 50;
    private static final double LUXURY_COST = 250;

    public ExtraKilometerDecorator(RentalAgreementInterface rentalAgreement)
    {
        super(rentalAgreement);
    }

    @Override
    public double calculateTotalCost()
    {
        double extraKmCost = 0;

        CarInterface rentedCar = rental_agreement.getCar();
        if (rentedCar != null)
        {
            if (rentedCar.getType().equalsIgnoreCase("standard") || rentedCar.getType().equalsIgnoreCase("economy"))
            {
                extraKmCost = STANDARD_ECONOMY_COST;
            } else if (rentedCar.getType().equalsIgnoreCase("luxury"))
            {
                extraKmCost = LUXURY_COST;
            }
        }

        return extraKmCost;
    }

    @Override
    public String makeRentalAgreement()
    {
        return "Extra Kilometer option added";
    }
}
