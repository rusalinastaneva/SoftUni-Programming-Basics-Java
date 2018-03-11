import java.util.Scanner;

public class Exam230717_P06_GroupName_Var2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char bigLet = scanner.nextLine().charAt(0);
        char smallLet1 = scanner.nextLine().charAt(0);
        char smallLet2 = scanner.nextLine().charAt(0);
        char smallLet3 = scanner.nextLine().charAt(0);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (char i = 'A'; i <= bigLet; i++) {
            for (char j = 'a'; j <= smallLet1; j++) {
                for (char k = 'a'; k <= smallLet2; k++) {
                    for (char l = 'a'; l <= smallLet3; l++) {
                        for (int m = 0; m <= n; m++) {
                            counter++;
                            if (i == bigLet) {
                                if (j == smallLet1) {
                                    if (k == smallLet2) {
                                        if (l == smallLet3) {
                                            if (m == n) {
                                                break;
                                            }
                                        }
                                    }
                                }

                            }
                        }
                    }

                }
            }
        }
        System.out.printf("%d", counter - 1);
    }
}
