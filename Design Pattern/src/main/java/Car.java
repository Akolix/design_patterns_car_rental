    import java.util.List;
    public abstract class Car implements CarInterface {
        public String type;
        private double deposit;
        private int freeKm;

        public Car(String type) {
            this.type = type;
            this.deposit = deposit;
            this.freeKm = freeKm;
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
        public int getFreeKm(int freeKm) {
            return freeKm;
        }

        public int setFreeKm() {
            return freeKm;
        }
        
        @Override
        public double getDeposit() {
            return deposit;
        }

        public void setDeposit(double deposit) {
            this.deposit = deposit;
        }

        public abstract int getFreeKm();

        @Override
        public abstract void setFreeKm(int doubledFreeKm);
    }
