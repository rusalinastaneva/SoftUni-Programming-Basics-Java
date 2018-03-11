import java.util.Scanner;

public class P09_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            char num = n.charAt(i);

            sum += num - '0';
        }
        System.out.println(sum);

    }
}