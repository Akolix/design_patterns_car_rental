class PricingStrategy {
    public double calculateCost(Car car, int duration, int extraKm, String customer) {
        double cost;

        if (duration <= 0 || duration > 60) {
            throw new IllegalArgumentException("Invalid rental duration.");
        }

        if (duration < 7) {
            cost = new DailyPricingStrategy().calculateCost(car, duration);
        } else if (duration >= 7 && duration <= 29) {
            cost = new WeeklyPricingStrategy().calculateCost(car, duration);
        } else {
            cost = new MonthlyPricingStrategy().calculateCost(car, duration);
        }

        return cost;
    }
}
