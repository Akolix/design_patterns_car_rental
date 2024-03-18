class PricingStrategy {
    public double calculateCost(Car car, int duration, int extraKm, String customer) {
        double rate = car.getDailyRate();

        double cost = rate * duration;

        return cost;
    }
}