public interface RentalAgreementInterface {

    double getBaseCost();

    double getDeposit();

    int getDuration();
    double calculateTotalCost();

    String make_rental_agreement();

}
