import java.util.ArrayList;
import java.util.List;

public class RentalAgreement implements RentalAgreementInterface
{
    private CarInterface car;
    private int duration;
    private String customer;
    private List<RentalOptionsDecorator> rentalOptions;

    public RentalAgreement(CarInterface car, int duration, String customer)
    {
        this.car = car;
        this.duration = duration;
        this.customer = customer;
        this.rentalOptions = new ArrayList<>();
    }

    public void addOptionsToAgreement(RentalOptionsDecorator option)
    {
        rentalOptions.add(option);
    }

    public String make_rental_agreement()
    {
        StringBuilder agreement = new StringBuilder("Rental agreement: " + customer + ", " + duration + " days, " + car.getClass().getSimpleName());

        if (!rentalOptions.isEmpty())
        {
            agreement.append(" with the following options:");
            for (RentalOptionsDecorator option : rentalOptions)
            {
                agreement.append("\n- ").append(option.makeRentalAgreement());
            }
        }

        return agreement.toString();
    }

    public int getDuration()
    {
        return duration;
    }

    public double calculateTotalCost()
    {
        double baseCost = car.getDaily_rate() * duration;

        double optionsCost = 0;
        for (RentalOptionsDecorator option : rentalOptions) {
            optionsCost += option.calculateTotalCost();
        }

        return baseCost + optionsCost;
    }
}