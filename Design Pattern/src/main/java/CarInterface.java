public interface CarInterface {
//    String getType();
    void assemble();
    String get_description();
//    double getDaily_rate();
    String getBrand();
    String getModel();
    String getType();

    int getFreeKm();

    double getPrice_per_km();

    double getDeposit();

    double getDailyRate();
    void setDeposit(double deposit);
    void setFreeKm(int freeKm);
    void setDailyRate(double dailyRate);
}