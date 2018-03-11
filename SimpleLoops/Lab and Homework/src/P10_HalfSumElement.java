import java.util.Scanner;

public class P10_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int bigNum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum = sum + number;
            if (number > bigNum) {
                bigNum = number;
            }
        }
        if (sum - bigNum == bigNum) {
            System.out.printf("Yes %nSum = %d", (sum - bigNum));
        } else {
            System.out.printf("No %nDiff = %d", Math.abs(bigNum - (sum - bigNum)));
        }
    }

}



