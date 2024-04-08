public class MonthlyPricingStrategy implements PricingStrategy
{
    private static final double MONTHLY_DISCOUNT = 0.87;

    @Override
    public double calculateCost(double rentalCost, int duration)
    {
        return rentalCost * MONTHLY_DISCOUNT * duration;
    }

    @Override
    public PricingStrategy selectStrategy(int duration)
    {
        return this;
    }
}