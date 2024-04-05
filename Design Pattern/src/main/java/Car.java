    import java.util.List;
    public abstract class Car implements CarInterface {
        public String type;
        private double deposit;
        protected int freeKm;

        public Car(String type) {
            this.type = type;
            this.deposit = deposit;
            this.freeKm = freeKm;
        }

        public String getType() {
            return type;
        }

        public int getFreeKm() {
            return freeKm;
        }

        @Override
        public double getDeposit() {
            return deposit;
        }

        public void setDeposit(double deposit) {
            this.deposit = deposit;
        }

        @Override
        public void setFreeKm(int freeKm) {
            this.freeKm = freeKm;
        };
    }
