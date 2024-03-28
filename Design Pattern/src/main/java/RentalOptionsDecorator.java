abstract class RentalOptionsDecorator {
    protected RentalAgreementInterface rental_agreement;

    public RentalOptionsDecorator(RentalAgreementInterface rental_agreement) {
        this.rental_agreement = rental_agreement;
    }

//    public abstract String get_description();

    public double calculateTotalCost() {

        return 20;
    }

//    public abstract String getDescription();
}