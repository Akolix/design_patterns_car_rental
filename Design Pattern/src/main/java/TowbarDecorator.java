class TowBarDecorator extends RentalOptionsDecorator
{
    public TowBarDecorator(RentalAgreementInterface rentalAgreement)
    {
        super(rentalAgreement);
    }

    @Override
    public double calculateTotalCost()
    {
        return 40;
    }

    @Override
    public String makeRentalAgreement()
    {
        return "Tow Bar option added";
    }
}
