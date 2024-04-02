public interface PricingStrategy {
    double calculateCost(double dailyRate, int duration, boolean isCompany);

    double taxFree = 1.21;
    double taxIncluded = 1.00;
}
