import java.util.Scanner;

public class Exam070517_NumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int specialN = Integer.parseInt(scanner.nextLine());
        int controlN = Integer.parseInt(scanner.nextLine());
        int sumN = 0;

        for (int i = m; i <= 9; i--) {
            for (int j = n; j <= 9; j--) {
                for (int k = l; k <= 9; k--) {

                    if (sumN % 3 == 0) {
                        specialN += 5;
                    }
                    if (sumN % 5 == 0) {
                        specialN -= 2;
                    }
                    if (sumN % 2 == 0) {
                        specialN *= 2;
                    }
                    if (specialN >= controlN && specialN <= 111) {
                        System.out.println("Yes! Control number was reached! Current special number is " + specialN);
                    } else if (specialN < controlN && specialN <= 111) {
                        System.out.printf("No! %d is the last reached special number.", specialN);
                    }

                }
            }
        }
    }
}



