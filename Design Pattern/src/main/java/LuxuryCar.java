public class LuxuryCar extends Car {
    private String brand;
    private String model;
//    private double daily_rate;
    private double price_per_km;
//    private int free_km;
    private double odometer;
//    private double deposit;

    public LuxuryCar(String brand, String model, double dailyRate, double price_per_km, int free_km, double deposit, double odometer) {
        super("Luxury");
        this.brand = brand;
        this.model = model;
        this.dailyRate = dailyRate;
        this.price_per_km = price_per_km;
        this.freeKm = free_km;
        this.odometer = odometer;
        this.deposit = deposit;
    }



    @Override
    public String get_description() {
        return brand + " " + model;
    }
    @Override
    public String getType() {
        return "Luxury";
    }

    @Override
    public String getBrand() {
        return brand;
    }
    @Override
    public String getModel() {
        return model;
    }
    public double getDailyRate() {
        return dailyRate;
    }
    public double getPrice_per_km() {
        return price_per_km;
    }
    @Override
    public void assemble() {
        System.out.println("Assembling LuxuryCar");
    }


//    @Override
//    public double getDeposit() {
//        return deposit;
//    }

//    public void setDeposit(double deposit) {
//        this.deposit = deposit;
//    }
}