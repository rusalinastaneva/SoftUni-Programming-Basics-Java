import java.util.Scanner;

public class Exam280816_P06_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int n1 = n;
        int digit3 = n1 % 10;
        n1 = n1 / 10;
        int digit2 = n1 % 10;
        n1 = n1 / 10;
        int digit1 = n1 % 10;
        n1 = n1 / 10;

        for (int i = 1; i <= digit1 + digit2; i++) {
            for (int j = 1; j <= digit1 + digit3; j++) { //310
                if (n % 5 == 0) {
                    n -= digit1;
                    System.out.printf("%d ", n);
                } else if (n % 3 == 0) {
                    n -= digit2;
                    System.out.printf("%d ", n);
                } else {
                    n += digit3;
                    System.out.printf("%d ", n);

                }

            }
            System.out.println();
        }
    }
}

