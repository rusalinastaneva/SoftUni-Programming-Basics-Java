import java.util.Scanner;

public class P07_LeftAndRightSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < 2 * n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i < n) {
                leftSum = leftSum + number;
            } else {
                rightSum = rightSum + number;
            }
        }
        if (leftSum != rightSum) {
            //System.out.printf("No, diff = %d", Math.max(leftSum, rightSum) - Math.min(leftSum, rightSum));
            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
        } else {
            System.out.println("Yes, sum = " + leftSum);
        }
    }
}


//        for (int i = 0; i < n; i++) {
//            int number = Integer.parseInt(scanner.nextLine());
//            leftSum = leftSum + number;
//        }
//
//        for (int i = 0; i < n; i++) {
//            int number = Integer.parseInt(scanner.nextLine());
//            rightSum = leftSum + number;
//        }
//        if (leftSum != rightSum) {
//            System.out.printf("No, the diff = %d", Math.max(leftSum,readcount) - Math.min(leftSum,rightSum));
//        } else {
//            System.out.println("Yes, sum = " + leftSum);
//        }
//        variant 1
