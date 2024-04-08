public class WeeklyPricingStrategy implements PricingStrategy
{
    private static final double WEEKLY_DISCOUNT = 0.95;

    @Override
    public double calculateCost(double dailyRate, int duration)
    {
        return dailyRate * WEEKLY_DISCOUNT * duration;
    }

    @Override
    public PricingStrategy selectStrategy(int duration)
    {
        return this;
    }
}
