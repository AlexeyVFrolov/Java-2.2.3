import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CreditPaymentService service = new CreditPaymentService();
        System.out.print("Please, enter credit amount in rubles ");
        long creditAmount = in.nextLong();
        System.out.print("Please, enter annual interest rate ");
        double annualInterestRate = in.nextDouble();
        System.out.print("Please, enter credit period in months ");
        double creditPeriodInMonths = in.nextDouble();
        System.out.printf("Your Monthly payment amount: %s", service.calculate(creditAmount, annualInterestRate, creditPeriodInMonths));
    }
}
