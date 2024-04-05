public interface RentalAgreementInterface {
    double getBaseCost();
    double getDeposit();
    int getDuration();
    double calculateTotalCost();
    CarInterface getCar();
    String make_rental_agreement();

}
