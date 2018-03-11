import java.util.Scanner;

public class Exam190317Evening_P06_ControlNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int controlN = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int sum = 0;


        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= 1; j--) {
                int num = i * 2 + j * 3;
                sum += num;
                counter++;

                if (sum >= controlN) {
                    System.out.printf("%d moves %n", counter);
                    System.out.printf("Score: %d >= %d", sum, controlN);
                    break;
                }
            }
            if (sum >= controlN) {
                break;
            }
        }
        if (sum < controlN) {
            System.out.printf("%d moves ", counter);
        }
    }
}




