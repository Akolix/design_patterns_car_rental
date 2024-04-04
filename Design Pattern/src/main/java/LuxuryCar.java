//public class LuxuryCar extends Car {
//    private String brand;
//    private String model;
//    private double daily_rate;
//    private double price_per_km;
//    private int free_km;
//    private double odometer;
//    private double deposit;
//
//    public LuxuryCar(String brand, String model, double daily_rate, double price_per_km, int free_km, double deposit, double odometer) {
//        super("luxury");
//        this.brand = brand;
//        this.model = model;
//        this.daily_rate = daily_rate;
//        this.price_per_km = price_per_km;
//        this.free_km = free_km;
//        this.odometer = odometer;
//        this.deposit = deposit;
//    }
//
//    @Override
//    public String get_description() {
//        return brand + " " + model;
//    }
//
//    @Override
//    public void assemble() {
//        System.out.println("Assembling luxury car");
//    }
//
//    @Override
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    @Override
//    public String getModel() {
//        return model;
//    }
//    @Override
//    public String getType() {
//        return "luxury";
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public double getDaily_rate() {
//        return daily_rate;
//    }
//
//    public void setDaily_rate(double daily_rate) {
//        this.daily_rate = daily_rate;
//    }
//
//    public double getPrice_per_km() {
//        return price_per_km;
//    }
//
//    public void setPrice_per_km(double price_per_km) {
//        this.price_per_km = price_per_km;
//    }
//
//    public int getFree_km() {
//        return free_km;
//    }
//
//    @Override
//    public double getDeposit() {
//        return deposit;
//    }
//
//    @Override
//    public int getFreeKm() {
//        return free_km;
//    }
//
//    @Override
//    public void setFreeKm(int doubledFreeKm) {
//
//    }
//
//}

//public class LuxuryCar extends Car {
//    public LuxuryCar() {
//        super("Luxury");
//    }
//
//    @Override
//    public void assemble() {
//        System.out.println("Assembling Luxury car");
//    }
//}

class LuxuryCar extends Car  {
    private String type;
    private String brand;
    private String model;
    private double daily_rate;
    private double price_per_km;
    private double odometer;
    private double deposit;


    public LuxuryCar(String brand, String model, double daily_rate, double price_per_km, int free_km, double deposit, double odometer) {
        super("Luxury");
        this.brand = brand;
        this.model = model;
        this.daily_rate = daily_rate;
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

    public double getDaily_rate() {
        return daily_rate;
    }

    public void setDaily_rate(double daily_rate) {
        this.daily_rate = daily_rate;
    }

    public double getPrice_per_km() {
        return price_per_km;
    }

    public void setPrice_per_km(double price_per_km) {
        this.price_per_km = price_per_km;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling LuxuryCar");
    }

    @Override    public double getDeposit() {
        return deposit;
    }


}
