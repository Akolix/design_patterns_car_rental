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
    private double daily_rate;
    private double price_per_km;
    private int free_km;

    public EconomyCar(String brand, String model, double daily_rate, double price_per_km, int free_km, double deposit) {
        super("Economy");
        this.brand = brand;
        this.model = model;
        this.daily_rate = daily_rate;
        this.price_per_km = price_per_km;
        this.free_km = free_km;
    }

    @Override
    public String get_description() {
        return brand + " " + model;
    }

    @Override
    public String getType() {
        return "Economy";
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

    public int getFree_km() {
        return free_km;
    }

    public void setFree_km(int free_km) {
        this.free_km = free_km;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling EconomyCar");
    }
//
//    @Override
//    public double getDailyRate() {
//        return 0;
//    }
}
