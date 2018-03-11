import java.util.Scanner;

public class Test_Exams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        int contlNum = a * b + c * d;
                        if (contlNum == m) {
                            if (a < b && c > d) {
                                counter++;
                                System.out.printf("%d%d%d%d ", a, b, c, d);
                                if (counter == 4) {
                                    A = a;
                                    B = b;
                                    C = c;
                                    D = d;
                                }
                            }
                        }

                    }

                }
            }
        }
        if (counter >= 4) {
            System.out.printf("%nPassword: %d%d%d%d", A, B, C, D);
        } else {
            System.out.printf("%nNo!");
        }
    }
}