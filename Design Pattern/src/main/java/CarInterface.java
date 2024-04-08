public interface CarInterface
{
    void assemble();

    String get_description();

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
