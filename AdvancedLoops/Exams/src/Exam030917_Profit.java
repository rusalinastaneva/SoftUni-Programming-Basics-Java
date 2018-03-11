import java.util.Scanner;

public class Exam030917_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coinOne = Integer.parseInt(scanner.nextLine());
        int coinTwo = Integer.parseInt(scanner.nextLine());
        int banknFive = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= coinOne; i++) {
            for (int j = 0; j <= coinTwo; j++) {
                for (int k = 0; k <= banknFive; k++) {
                    int allSum = i*1 + j * 2 + k * 5;
                    if (allSum == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n" , i, j, k, sum);
                    }
                }

            }
        }
    }
}



