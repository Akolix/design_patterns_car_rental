public class PrivateUserPricingStrategy implements PricingStrategy {
    @Override
    public double calculateCost(double dailyRate, int duration) {
        double rentalCost = dailyRate;
        return rentalCost;
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