//public class MonthlyPricingStrategy implements PricingStrategy {
//    private static final double MONTHLY_DISCOUNT = 0.87;
//
//    @Override
//    public double calculateCost(double rentalCost, int duration) {
//        return rentalCost * MONTHLY_DISCOUNT * duration;
//    }
//
//    @Override
//    public PricingStrategy selectStrategy(int duration) {
//        return this;
//    }
//}

//public class MonthlyPricingStrategy implements PricingStrategy {
//    private static final double MONTHLY_DISCOUNT = 0.87;
//
//    @Override
//    public double calculateCost(double dailyRate, int duration) {
//        return dailyRate * MONTHLY_DISCOUNT * duration;
//    }
//
//    @Override
//    public PricingStrategy selectStrategy(int duration) {
//        return this;
//    }
//}
public class MonthlyPricingStrategy implements PricingStrategy {
    private double rentalCost;

    public MonthlyPricingStrategy(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    @Override
    public double calculateCost(double rentalCost, int  duration) {
        return rentalCost * duration * 0.87; // Apply discount for monthly rental
    }

    @Override
    public PricingStrategy selectStrategy(int duration, double rentalCost) {
        return this;
    }
}
