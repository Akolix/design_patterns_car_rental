public class DailyPricingStrategy implements PricingStrategy {

    @Override
    public double calculateCost(double dailyRate, int duration, boolean isCompany) {
        if(isCompany == true) {
            double totalCostTaxEcluded =
                    icingStrategy.taxFree) * duration;
            return totalCostTaxEcluded;
        }
        else {
            double totalCostTaxIncluded = dailyRate * duration;
            return totalCostTaxIncluded;
        }
    }
}