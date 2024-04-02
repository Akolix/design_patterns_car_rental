//public class PrivateUserPricingStrategy implements PricingStrategy {
//
//    @Override
//    public double calculateCost(double dailyRate, int duration) {
//
//        double rentalCost = dailyRate;
//        return rentalCost;
//    }
//
//    @Override
//    public PricingStrategy selectStrategy(int duration) {
//        return null;
//    }
//}

//public class PrivateUserPricingStrategy implements PricingStrategy {
//    @Override
//    public double calculateCost(double dailyRate, int duration) {
//        double rentalCost = dailyRate;
//        return rentalCost;
//    }
//
//    @Override
//    public PricingStrategy selectStrategy(int duration) {
//        if (duration >= 30) {
//            return new MonthlyPricingStrategy();
//        } else if (duration >= 7) {
//            return new WeeklyPricingStrategy();
//        } else {
//            return new DailyPricingStrategy();
//        }
//    }
//}

public class PrivateUserPricingStrategy implements PricingStrategy {

    @Override
    public double calculateCost(double rentalCost, int duration) {
        return rentalCost;
    }

    @Override
    public PricingStrategy selectStrategy(int duration, double rentalCost) {
        if (duration >= 30) {
            return new MonthlyPricingStrategy(rentalCost);
        } else if (duration >= 7) {
            return new WeeklyPricingStrategy(rentalCost);
        } else {
            return new DailyPricingStrategy(rentalCost);
        }
    }
}
