public interface CarInterface {
    void assemble();
    String get_description();
    String getBrand();
    String getModel();
    String getType();

    int getFree_km();

    double getPrice_per_km();

    double getDeposit();
    int getFreeKm();
    double getDailyRate();
    void setDeposit(double deposit);
    void setFreeKm(int freeKm);
    void setDailyRate(double dailyRate);

}