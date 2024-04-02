public class CompanyPricingStrategy implements PricingStrategy {
    static final double TAX_RATE = 0.21;

    @Override
    public double calculateCost(double rentalCost, int duration) {
        double adjustedCost = rentalCost * TAX_RATE;

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