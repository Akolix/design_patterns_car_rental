public interface PricingStrategy {
//    double calculateCost(double rentalCost, int duration, boolean isCompany);
    double calculateCost(double rentalCost, int duration);
    PricingStrategy selectStrategy(int duration, double rentalCost);
}
