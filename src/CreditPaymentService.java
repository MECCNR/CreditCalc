public class CreditPaymentService {
    public double calculate(int creditsum, int months) {
        double persent = 0.23/12;
        double supreme = 1 + persent;
        double ruler = (persent * Math.pow(supreme, months)) / (Math.pow(supreme, months) - 1);
        double money = creditsum * ruler;
        return money;
    }
}
