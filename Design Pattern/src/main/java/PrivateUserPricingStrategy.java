public class PrivateUserPricingStrategy implements PricingStrategy {
    @Override
    public double calculateCost(double rentalCost, int duration) {
        double adjustedCost = rentalCost;
        PricingStrategy selectedStrategy = selectStrategy(duration);
        return selectedStrategy.calculateCost(adjustedCost, duration);
    }

    @Override
    public PricingStrategy selectStrategy(int duration) {
        if (duration >= 30) {
            return new MonthlyPricingStrategy();
        } else if (duration >= 7) {
            return new WeeklyPricingStrategy();
        } else {
            return new DailyPricingStrategy();
        }
    }
}
