//class RentalAgreement implements RentalAgreementInterface {
//    private CarInterface car;
//    private int duration;
//    private String customer;
//
//    public RentalAgreement(CarInterface car, int duration, String customer) {
//        this.car = car;
//        this.duration = duration;
//        this.customer = customer;
//    }
//
//    public String make_rental_agreement() {
//        return "Rental Agreement: " + customer + ", " + duration + " days, " + car.get_description();
//    }
//}

class RentalAgreement implements RentalAgreementInterface {
    private CarInterface car;
    private int duration;
    private String customer;

    public RentalAgreement(CarInterface car, int duration, String customer) {
        this.car = car;
        this.duration = duration;
        this.customer = customer;
    }

    public String make_rental_agreement() {
        return "Rental Agreement: " + customer + ", " + duration + " days, " + car.get_description();
    }

    public int getDuration() {
        return duration;
    }
}
