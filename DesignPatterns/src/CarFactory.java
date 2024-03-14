public class CarFactory {
    public static Car createCar(String type) {
        if (type.equalsIgnoreCase("luxury")) {
            return new LuxuryCar();
        } else if (type.equalsIgnoreCase("economy")) {
            return new EconomyCar();
        } else if (type.equalsIgnoreCase("standard")) {
            return new StandardCar();
        } else {
            throw new IllegalArgumentException("Invalid car type: " + type);
        }
    }
}