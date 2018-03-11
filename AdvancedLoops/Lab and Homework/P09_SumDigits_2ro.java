import java.util.Scanner;

public class P09_SumDigits_2ro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        do {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        } while (n > 0);

        System.out.println(sum);
    }
}
