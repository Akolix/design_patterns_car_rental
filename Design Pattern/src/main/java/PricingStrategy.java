public interface PricingStrategy
{
    double calculateCost(double dailyRate, int duration);

    PricingStrategy selectStrategy(int duration);
}
