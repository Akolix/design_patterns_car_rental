    public abstract class Car implements CarInterface {
        public String type;
        protected double deposit;
        protected int freeKm;
        protected double dailyRate;
        private double price_per_km;

        public Car(String type) {
            this.type = type;
            this.deposit = deposit;
            this.freeKm = freeKm;
            this.dailyRate = dailyRate;
        }
        public String getType() {
            return type;
        }

        public double getDeposit() {
            return deposit;
        }

        @Override
        public void setDeposit(double deposit) {
            this.deposit = deposit;
        }
        public int getFreeKm() {
            return freeKm;
        }
        @Override
        public void setFreeKm(int freeKm) {
            this.freeKm = freeKm;
        }
        public double getDailyRate() {
            return dailyRate;
        }
        @Override
        public void setDailyRate(double dailyRate){
            this.dailyRate = dailyRate;
        }
    }
