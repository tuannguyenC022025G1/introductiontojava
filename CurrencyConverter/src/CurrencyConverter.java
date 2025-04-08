import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        final double exchangeRate = 25000;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in USD: ");
        double usd = scanner.nextDouble();

        double vnd = usd * exchangeRate;

        System.out.printf("%.2f USD = %.0f VND\n", usd, vnd);
    }
}
