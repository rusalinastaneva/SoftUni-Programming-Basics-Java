import java.util.Scanner;

public class Exam260316_P04_Divide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counterP1 = 0;
        int counterP2 = 0;
        int counterP3 = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num % 2 == 0) {
                counterP1++;
            } if (num % 3 == 0) {
                counterP2++;
            } if (num % 4 == 0) {
                counterP3++;
            }
        }
        double p1 = (double)counterP1/n*100;
        double p2 = (double)counterP2/n*100;
        double p3 = (double)counterP3/n*100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);

    }
}
