public class ChildSeatDecorator extends RentalOptionsDecorator {
    public ChildSeatDecorator(RentalAgreementInterface rental_agreement) {
        super(rental_agreement);
    }

//    @Override
//    public String get_description() {
//        return null;
//    }

    @Override
    public double calculateTotalCost() {
        return rental_agreement.calculateTotalCost() + 15; // Add the cost of the child seat
    }

//    @Override
//    public String getDescription() {
//        return rental_agreement.getDescription() + ", Child Seat";
//    }
}
