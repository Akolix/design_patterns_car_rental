public interface CarInterface {
    void assemble();
    String get_description();
    String getBrand();
    String getModel();
    String getType();
    double getDeposit();
    int getFreeKm();
    double getDailyRate();
    void setDeposit(double deposit);
    void setFreeKm(int freeKm);
    void setDailyRate(double dailyRate);

}