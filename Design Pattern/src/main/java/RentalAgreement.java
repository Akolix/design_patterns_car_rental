//import java.util.ArrayList;
//import java.util.List;
//
//public class RentalAgreement implements RentalAgreementInterface
//{
//    private CarInterface car;
//    private int duration;
//    private String customer;
//    private List<RentalOptionsDecorator> rentalOptions;
//    private PricingStrategy pricingStrategy;
//
//    public RentalAgreement(CarInterface car, int duration, String customer, PricingStrategy pricingStrategy) {
//        this.car = car;
//        this.duration = duration;
//        this.customer = customer;
//        this.rentalOptions = new ArrayList<>();
//
//        // Set default pricing strategy if not provided
//        if (pricingStrategy == null) {
//            if (Customer. == false) {
//                this.pricingStrategy = new PrivateUserPricingStrategy();
//            } else {
//                this.pricingStrategy = new DailyPricingStrategy();
//            }
//        } else {
//            this.pricingStrategy = pricingStrategy;
//        }
//    }
//
//    public void addOptionsToAgreement(RentalOptionsDecorator option)
//    {
//        rentalOptions.add(option);
//    }
//
//    public String make_rental_agreement()
//    {
//        StringBuilder agreement = new StringBuilder("Rental agreement: " + customer + ", " + duration + " days, " + car.getClass().getSimpleName());
//
//        if (!rentalOptions.isEmpty())
//        {
//            agreement.append(" with the following options:");
//            for (RentalOptionsDecorator option : rentalOptions)
//            {
//                agreement.append("\n- ").append(option.makeRentalAgreement());
//            }
//        }
//
//        return agreement.toString();
//    }
//
//    public int getDuration()
//    {
//        return duration;
//    }
//
//    public PricingStrategy getPricingStrategy() {
//        return pricingStrategy;
//    }
//
//    public void setPricingStrategy(PricingStrategy pricingStrategy) {
//        this.pricingStrategy = pricingStrategy;
//    }
//
//    public double getBaseCost()
//    {
//        return car.getDaily_rate() * duration;
//    }
//
//    public double getDeposit()
//    {
//        return car.getDeposit();
//    }
//
//    public double calculateTotalCost()
//    {
//        double optionsCost = 0;
//        for (RentalOptionsDecorator option : rentalOptions) {
//            optionsCost += option.calculateTotalCost();
//        }
//        return optionsCost;
//    }
//}

import java.util.ArrayList;
import java.util.List;

public class RentalAgreement implements RentalAgreementInterface
{
    private CarInterface car;
    private int duration;
    private Customer customer;
    private List<RentalOptionsDecorator> rentalOptions;
    private PricingStrategy pricingStrategy;

    public RentalAgreement(CarInterface car, int duration, Customer customer, PricingStrategy pricingStrategy) {
        this.car = car;
        this.duration = duration;
        this.customer = customer;
        this.rentalOptions = new ArrayList<>();

        // Set default pricing strategy based on customer type
        if (customer.isCompany()) {
            this.pricingStrategy = new CompanyPricingStrategy().selectStrategy(duration);
        } else {
            this.pricingStrategy = new PrivateUserPricingStrategy().selectStrategy(duration);
        }

        // Override with provided pricing strategy if available
        if (pricingStrategy != null) {
            this.pricingStrategy = pricingStrategy.selectStrategy(duration);
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

    public int getDuration()
    {
        return duration;
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double getBaseCost()
    {
        return car.getDaily_rate() * duration;
    }

    public double getDeposit()
    {
        return car.getDeposit();
    }

    public double calculateTotalCost()
    {
        double totalRentalCost = 2;
        double optionsCost = 0;
        for (RentalOptionsDecorator option : rentalOptions) {
            optionsCost += option.calculateTotalCost();
        }
        return optionsCost;
    }
}
