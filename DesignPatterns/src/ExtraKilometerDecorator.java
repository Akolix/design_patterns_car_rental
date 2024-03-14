class ExtraKilometerDecorator extends RentalOptionsDecorator {
    public ExtraKilometerDecorator(RentalAgreementInterface rental_agreement) {
        super(rental_agreement);
    }

    public double calculate_total_cost() {
        return rental_agreement.calculate_total_cost() + 200;
    }

    public String get_description() {
        return rental_agreement.make_rental_agreement() + ", Extra Kilometers";
    }
}