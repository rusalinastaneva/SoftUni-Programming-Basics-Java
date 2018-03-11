import java.util.Scanner;

public class Exam170917_SongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int num = 0;

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        int ctrlNum = a * b + c * d;
                        if (n == ctrlNum) {
                            if (a < b && c > d) {
                                System.out.printf("%d%d%d%d ", a, b, c, d);
                                num++;
                                if (num == 4) {
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
        if (num >= 4) {
            System.out.printf("%nPassword: %d%d%d%d", A, B, C, D);
        } else {
            System.out.printf("%nNo!");
        }
    }
}

