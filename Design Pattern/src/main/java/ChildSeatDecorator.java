class ChildSeatDecorator extends RentalOptionsDecorator {
    public ChildSeatDecorator(RentalAgreementInterface rentalAgreement) {
        super(rentalAgreement);
    }

    @Override
    public double calculateTotalCost()
    {
        return 20;
    }

    @Override
    public String makeRentalAgreement() {
        return "Child Seat option added";
    }
}