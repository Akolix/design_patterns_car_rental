abstract class RentalOptionsDecorator {
    protected RentalAgreementInterface rental_agreement;

    public RentalOptionsDecorator(RentalAgreementInterface rental_agreement) {
        this.rental_agreement = rental_agreement;
    }

    public abstract double calculateTotalCost();

    public abstract String makeRentalAgreement();
}

