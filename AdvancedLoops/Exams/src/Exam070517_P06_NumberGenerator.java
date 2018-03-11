import java.util.Scanner;

public class Exam070517_P06_NumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int specialN = Integer.parseInt(scanner.nextLine());
        int controlN = Integer.parseInt(scanner.nextLine());
        int sumN = 0;

        search:
        {
            for (int i = m; i >= 1; i--) {
                for (int j = n; j >= 1; j--) {
                    for (int k = l; k >= 1; k--) {
                        sumN = i * 100 + j * 10 + k;
                        if (sumN % 3 == 0) {
                            specialN += 5;
                        } else if (sumN % 10 == 5) {
                            specialN -= 2;
                        } else if (sumN % 2 == 0) {
                            specialN *= 2;
                        }
                        if (specialN >= controlN) {
                            System.out.printf("Yes! Control number was reached! Current special number is %d.", specialN);
                            break search;

                        }
                    }

                }
            }
        }
        if (sumN == 111) {
            System.out.printf("No! %d is the last reached special number.", specialN);
        }
    }
}
