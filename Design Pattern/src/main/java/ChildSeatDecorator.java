//public class ChildSeatDecorator extends RentalOptionsDecorator {
//    public ChildSeatDecorator(RentalAgreementInterface rental_agreement) {
//        super(rental_agreement);
//    }
//
//    @Override
//    public double calculateTotalCost() {
//        return rental_agreement.calculateTotalCost() + 15;
//    }
//}

class ChildSeatDecorator extends RentalOptionsDecorator {
    public ChildSeatDecorator(RentalAgreementInterface rentalAgreement) {
        super(rentalAgreement);
    }

    @Override
    public double calculateTotalCost() {
        return rental_agreement.calculateTotalCost() + 20;
    }

    @Override
    public String makeRentalAgreement() {
        return rental_agreement.make_rental_agreement() + ", Child Seat option added";
    }
}