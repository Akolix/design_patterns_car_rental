////public class StandardCar extends Car {
////    public StandardCar() {
////        super("standard");
////    }
////
////    @Override
////    public void assemble() {
////        System.out.println("Assembling standard car");
////    }
////}
//
//class StandardCar extends Car implements CarInterface {
//    private String type;
//    private String brand;
//    private String model;
//    private double daily_rate;
//    private double price_per_km;
//    private int free_km;
//    private double deposit;
//
//    private  double odometer;
//
//    //String type, String brand, String model, double daily_rate, double price_per_km, int free_km
//    public StandardCar(String brand, String model, double daily_rate, double price_per_km, int free_km,double deposit, double odometer) {
//        super("Standard");
//        this.brand = brand;
//        this.model = model;
//        this.daily_rate = daily_rate;
//        this.price_per_km = price_per_km;
//        this.free_km = free_km;
//        this.deposit = deposit;
//        this.odometer = odometer;
//    }
//
//    @Override
//    public String get_description() {
//        return brand + " " + model;
//    }
//
//    @Override
//    public String getType() {
//        return "Standard";
//    }
//
//    public void setType(String type) {
//        this.type = type;
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
//    @Override
//    public void assemble() {
//        System.out.println("Assembling StandardCar");
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
//    public void setDeposit(double deposit) {
//        this.deposit = deposit;
//    }
//}

//public class StandardCar extends Car {
//    public StandardCar() {
//        super("Standard");
//    }
//
//    @Override
//    public void assemble() {
//        System.out.println("Assembling Standard car");
//    }
//}

class StandardCar extends Car  {
    private String type;
    private String brand;
    private String model;
    private double daily_rate;
    private double price_per_km;
    private double odometer;
    private double deposit;


    public StandardCar(String brand, String model, double daily_rate, double price_per_km, int free_km, double deposit, double odometer) {
        super("Standard");
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
        System.out.println("Assembling StandardCar");
    }

    @Override    public double getDeposit() {
        return deposit;
    }


}
