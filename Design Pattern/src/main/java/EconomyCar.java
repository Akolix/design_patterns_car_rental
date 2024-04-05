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

class EconomyCar extends Car  {
    private String type;
    private String brand;
    private String model;
//    private double dailyRate;
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
        return "Economy";
    }
    @Override
    public String getBrand() {
        return brand;
    }
    @Override
    public String getModel() {
        return model;
    }
    public double getPrice_per_km() {
        return price_per_km;
    }
    @Override
    public void assemble() {
        System.out.println("Assembling EconomyCar");
    }

}
