public class RewardValue {
    double cash;
    double miles;
    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash / 0.0035;
    }
    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = convertMilesToCash(miles);
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }
    public double convertMilesToCash(int miles) {
        return miles * 0.0035;
    }
    public double convertCashToMiles(double cash) {
        return cash / 0.0035;
    }
}
