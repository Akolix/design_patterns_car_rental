//public class DailyPricingStrategy implements PricingStrategy {
//    @Override
//    public double calculateCost(double rentalCost, int duration) {
//        return rentalCost * duration;
//    }
//
//    @Override
//    public PricingStrategy selectStrategy(int duration) {
//        return this;
//    }
//}

//public class DailyPricingStrategy implements PricingStrategy {
//    @Override
//    public double calculateCost(double dailyRate, int duration) {
//        return dailyRate * duration;
//    }
//
//    @Override
//    public PricingStrategy selectStrategy(int duration) {
//        return this;
//    }
//}

public class DailyPricingStrategy implements PricingStrategy {
    private double rentalCost;

    public DailyPricingStrategy(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    @Override
    public double calculateCost(int duration) {
        return rentalCost * duration;
    }

    @Override
    public PricingStrategy selectStrategy(int duration, double rentalCost) {
        return this;
    }
}