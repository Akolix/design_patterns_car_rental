    import java.util.List;
    public abstract class Car implements CarInterface {
        public String type;

        public Car(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public String getBrand(String brand) {
            return brand;
        }

        public String getModel(String model) {
            return model;
        }
    }
