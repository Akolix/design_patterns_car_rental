import java.util.ArrayList;
import java.util.List;

public class RentalAgreement implements RentalAgreementInterface
{
    private CarInterface car;
    private int duration;
    private Customer customer;
    private List<RentalOptionsDecorator> rentalOptions;
    private PricingStrategy pricingStrategy;
    private int startOdoMeter;
    private int endOdoMeter;

    public RentalAgreement(CarInterface car, int duration, Customer customer)
    {
        this.car = car;
        this.duration = duration;
        this.customer = customer;
        this.rentalOptions = new ArrayList<>();

        if (customer.isCompany())
        {
            this.pricingStrategy = new CompanyPricingStrategy().selectStrategy(duration);
        } else
        {
            this.pricingStrategy = new PrivateUserPricingStrategy().selectStrategy(duration);
        }
    }

    public void addOptionsToAgreement(RentalOptionsDecorator option)
    {
        rentalOptions.add(option);
    }

    public String make_rental_agreement()
    {
        StringBuilder agreement = new StringBuilder("Rental agreement: " + customer.getFirstName() + " " + customer.getLastName() + ", " + duration + " days, " + car.getClass().getSimpleName());

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

    public void setStartOdoMeter(int startOdoMeter)
    {
        this.startOdoMeter = startOdoMeter;
    }

    public void setEndOdoMeter(int endOdoMeter)
    {
        this.endOdoMeter = endOdoMeter;
    }

    public int calculateTotalKmsDriven()
    {
        if (startOdoMeter < 0 || endOdoMeter < 0 || endOdoMeter < startOdoMeter)
        {
            throw new IllegalStateException("Invalid odometer readings.");
        }
        return endOdoMeter - startOdoMeter;
    }

    public int getDuration()
    {
        return duration;
    }

    public PricingStrategy getPricingStrategy()
    {
        return pricingStrategy;
    }

    public double getBaseCost()
    {
        return car.getDailyRate() * duration;
    }

    public int getFreeKm()
    {
        return car.getFreeKm();
    }

    @Override
    public double getDailyRate()
    {
        return car.getDailyRate();
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy)
    {
        this.pricingStrategy = pricingStrategy;
    }

    public double getDeposit()
    {
        return car.getDeposit();
    }

    public CarInterface getCar()
    {
        return car;
    }

    public double calculateTotalCost()
    {
        PricingStrategy selectedStrategy;
        if (customer.isCompany())
        {
            selectedStrategy = new CompanyPricingStrategy();
        } else
        {
            selectedStrategy = new PrivateUserPricingStrategy();
        }


        double optionsCost = 0;
        for (RentalOptionsDecorator option : rentalOptions)
        {
            optionsCost += option.calculateTotalCost();
        }

        double rentalCost = selectedStrategy.calculateCost(car.getDailyRate(), duration);

        double totalRentalCost = Math.round((rentalCost + optionsCost + car.getDeposit()) * 100.0) / 100.0;

        return totalRentalCost;
    }


}
