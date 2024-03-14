class EconomyCar extends Car implements CarInterface {
    private String type;
    private String brand;
    private String model;
    private double daily_rate;
    private double price_per_km;
    private int free_km;

    //String type, String brand, String model, double daily_rate, double price_per_km, int free_km
    public EconomyCar() {
        super("Economy");
//        this.type = type;
//        this.brand = brand;
//        this.model = model;
//        this.daily_rate = daily_rate;
//        this.price_per_km = price_per_km;
//        this.free_km = free_km;
    }

    public String get_description() {
        return brand + " " + model;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling EconomyCar");
    }
}
