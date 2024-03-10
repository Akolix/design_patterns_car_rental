class ChildSeatDecorator extends RentalOptionsDecorator {
    public ChildSeatDecorator(RentalAgreementInterface rental_agreement) {
        super(rental_agreement);
    }

    public double calculate_total_cost() {
        return rental_agreement.calculate_total_cost() + 15;
    }

    public String get_description() {
        return rental_agreement.make_rental_agreement() + ", Child Seat";
    }
}