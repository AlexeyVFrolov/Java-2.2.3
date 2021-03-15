public class CreditPaymentService {
    public long calculate(long creditAmount, double annualInterestRate, double creditPeriodInMonths) {
        return (long) (creditAmount * ((annualInterestRate / 12 / 100) * (Math.pow((1 + (annualInterestRate / 12 / 100)), creditPeriodInMonths))) /
                ((Math.pow((1 + (annualInterestRate / 12 / 100)), creditPeriodInMonths)) - 1));
    }
}
