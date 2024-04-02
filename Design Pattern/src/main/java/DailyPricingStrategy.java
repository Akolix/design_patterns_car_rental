public class DailyPricingStrategy implements PricingStrategy {
    @Override
    public double calculateCost(double dailyRate, int duration) {
        return dailyRate * duration;
    }

    @Override
    public PricingStrategy selectStrategy(int duration) {
        return this;
    }
}

