public class RewardValue {
    double cash;
    double miles;
    public RewardValue(double cash) {
        this.cash = cash;
    }
    public RewardValue(double miles) {
        this.cash = miles * 0.0035;
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

    public void setMiles(double miles) {
        this.miles = miles;
    }
}
