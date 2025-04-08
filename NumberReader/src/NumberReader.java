import java.util.Scanner;

public class NumberReader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0 - 999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else {
            System.out.println(convertNumberToWords(number));
        }
    }

    static String convertNumberToWords(int number) {
        if (number == 0) return "zero";

        String[] ones = {
                "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen"
        };

        String[] tens = {
                "", "", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"
        };

        StringBuilder result = new StringBuilder();

        int hundreds = number / 100;
        int remainder = number % 100;

        if (hundreds > 0) {
            result.append(ones[hundreds]).append(" hundred");
            if (remainder > 0) {
                result.append(" and ");
            }
        }

        if (remainder < 20) {
            result.append(ones[remainder]);
        } else {
            int ten = remainder / 10;
            int one = remainder % 10;
            result.append(tens[ten]);
            if (one > 0) {
                result.append(" ").append(ones[one]);
            }
        }

        return result.toString().trim();
    }
}
