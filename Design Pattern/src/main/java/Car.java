    public abstract class Car implements CarInterface {
        public String type;
        private double deposit;
        private int freeKm;
        private double price_per_km;

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

        @Override
        public int getFree_km()
        {
            return freeKm;
        }

        @Override
        public double getPrice_per_km()
        {
            return price_per_km;
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
