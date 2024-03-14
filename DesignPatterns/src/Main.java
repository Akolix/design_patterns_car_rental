public class Main {
    public static void main(String[] args) {
        Car luxuryCar = CarFactory.createCar("luxury");

        luxuryCar.assemble();
    }
}