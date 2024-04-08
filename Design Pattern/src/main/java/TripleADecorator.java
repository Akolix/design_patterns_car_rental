class TripleADecorator extends RentalOptionsDecorator
{
    public TripleADecorator(RentalAgreementInterface rentalAgreement)
    {
        super(rentalAgreement);
    }

    @Override
    public double calculateTotalCost()
    {
        return 200;
    }

    @Override
    public String makeRentalAgreement()
    {
        return "AAA insurance Included";
    }
}

