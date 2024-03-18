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
    private int initialOdometerReading;
    private int finalOdometerReading;

    public RentalAgreement(CarInterface car, int duration, String customer, int initialOdometerReading) {
        this.car = car;
        this.duration = duration;
        this.customer = customer;
        this.initialOdometerReading = initialOdometerReading;
    }

    public String make_rental_agreement() {
        return "Rental Agreement: " + customer + ", " + duration + " days, " + car.get_description();
    }

    public int getDuration() {
        return duration;
    }

    public int returnCar(int finalOdometerReading) {
        this.finalOdometerReading = finalOdometerReading;
        int distanceDriven = finalOdometerReading - initialOdometerReading;
        return distanceDriven;
    }
}

