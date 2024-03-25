import java.util.List;

public class RentalAgreement implements RentalAgreementInterface {
    private CarInterface car;
    private int duration;
    private String customer;
    private List<RentalOptionsDecorator> rentalOptions;

    public RentalAgreement(CarInterface car, int duration, String customer, List<RentalOptionsDecorator> rentalOptions) {
        this.car = car;
        this.duration = duration;
        this.customer = customer;
        this.rentalOptions = rentalOptions;
    }

    public String make_rental_agreement() {
        return "Rental Agreement: " + customer + ", " + duration + " days, " + car.get_description();
    }

    public int getDuration() {
        return duration;
    }

    public double calculateTotalCost() {
        double baseCost = car.getDaily_rate() * duration;

        double optionsCost = 0;
        for (RentalOptionsDecorator option : rentalOptions) {
            optionsCost += option.calculateTotalCost();
        }

        return baseCost + optionsCost;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double calculate_total_cost() {
        return 0;
    }
}
