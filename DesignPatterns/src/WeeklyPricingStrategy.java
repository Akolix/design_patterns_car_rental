class WeeklyPricingStrategy {
    public double calculateCost(Car car, int duration, int extraKm, String customer) {
        double rate = car.getDailyRate();

        double cost = rate * duration;
        double weeklyCost = (rate * duration) * 0.92

        return weeklyCost;
    }
}