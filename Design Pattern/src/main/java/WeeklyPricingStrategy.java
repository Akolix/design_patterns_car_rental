//public class WeeklyPricingStrategy implements PricingStrategy {
//    private static final double WEEKLY_DISCOUNT = 0.95;
//
//    @Override
//    public double calculateCost(double rentalCost, int duration) {
//        return rentalCost * WEEKLY_DISCOUNT * duration;
//    }
//
//    @Override
//    public PricingStrategy selectStrategy(int duration) {
//        return this;
//    }
//}

//public class WeeklyPricingStrategy implements PricingStrategy {
//    private static final double WEEKLY_DISCOUNT = 0.95;
//
//    @Override
//    public double calculateCost(double dailyRate, int duration) {
//        return dailyRate * WEEKLY_DISCOUNT * duration;
//    }
//
//    @Override
//    public PricingStrategy selectStrategy(int duration) {
//        return this;
//    }
//}
public class WeeklyPricingStrategy implements PricingStrategy {
    private double rentalCost;

    public WeeklyPricingStrategy(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    @Override
    public double calculateCost(int duration) {
        return rentalCost * duration * 0.95; // Apply discount for weekly rental
    }

    @Override
    public PricingStrategy selectStrategy(int duration, double rentalCost) {
        return this;
    }
}
