    import java.util.List;
    public abstract class Car implements CarInterface {
        public String type;
        private double deposit;

        public Car(String type) {
            this.type = type;
            this.deposit = deposit;
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


        //Rental Meuk
        @Override
        public double getDeposit() {
            return deposit;
        }

        public void setDeposit(double deposit) {
            this.deposit = deposit;
        }
    }
