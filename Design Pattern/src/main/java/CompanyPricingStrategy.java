//public class CompanyPricingStrategy implements PricingStrategy {
//    private static final double TAX_RATE = 0.21;
//
//    @Override
//    public double calculateCost(double dailyRate, int duration) {
//
//        double rentalCost = (dailyRate * TAX_RATE); // Adjusting for tax cut
//        return rentalCost;
//    }
//
//    @Override
//    public PricingStrategy selectStrategy(int duration) {
//        return null;
//    }
//}

public class CompanyPricingStrategy implements PricingStrategy {
    private static final double TAX_RATE = 1.21;

    @Override
    public double calculateCost(double dailyRate, int duration) {
        double rentalCost = dailyRate / TAX_RATE;
        return rentalCost;
    }

    @Override
    public PricingStrategy selectStrategy(int duration, double rentalCost) {
        if (duration >= 30) {
            return new MonthlyPricingStrategy();
        } else if (duration >= 7) {
            return new WeeklyPricingStrategy();
        } else {
            return new DailyPricingStrategy();
        }
    }
}