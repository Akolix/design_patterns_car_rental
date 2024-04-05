//public class EconomyCar extends Car {
//    public EconomyCar() {
//        super("economy");
//    }
//
//    @Override
//    public void assemble() {
//        System.out.println("Assembling economy car");
//    }
//}

class EconomyCar extends Car implements CarInterface {
    private String type;
    private String brand;
    private String model;
//    private double daily_rate;
    private double price_per_km;
    private double odometer;
//    private double deposit;

    public EconomyCar(String brand, String model, double dailyRate, double price_per_km, int free_km, double deposit, double odometer) {
        super("Economy");
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
        return "Standard";
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDailyRate() {
        return dailyRate;
    }

//    public void setDailyRate(double daily_rate) {
//        this.dailyRate = daily_rate;
//    }

    public double getPrice_per_km() {
        return price_per_km;
    }

    public void setPrice_per_km(double price_per_km) {
        this.price_per_km = price_per_km;
    }

//    public int getFreeKm() {
//        return free_km;
//    }

//    public void setFree_km(int free_km) {
//        this.free_km = free_km;
//    }

    @Override
    public void assemble() {
        System.out.println("Assembling StandardCar");
    }

//    @Override
//    public double getDeposit() {
//        return deposit;
//    }

//    public void setDeposit(double deposit) {
//        this.deposit = deposit;
//    }
}
