class MonthlyPricingStrategy {
    public double calculateCost(Car car, int duration, int extraKm, String customer) {
        double rate = car.getDailyRate();

        double cost = rate * duration;
        double monthlyCost = (rate * duration) * 0.80

        return monthlyCost;
    }
}