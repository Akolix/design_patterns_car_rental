//public class Main {
//    public static void main(String[] args) {
//        Car luxuryCar = CarFactory.createCar();
//
//        luxuryCar.assemble();
//
//
//    }
//}

public class Main {
    public static void main(String[] args) {
        Car luxuryCar = CarFactory.createCar("luxury", "Rolls Royce", "Spectre", 1000, 2, 50);
        Car economyCar = CarFactory.createCar("economy", "Toyota", "Corolla", 30, 0.2, 100);
        Car standardCar = CarFactory.createCar("standard", "Ford", "Mondeo", 27, 0.39, 150);

        luxuryCar.assemble();
        economyCar.assemble();
        standardCar.assemble();
    }
}
