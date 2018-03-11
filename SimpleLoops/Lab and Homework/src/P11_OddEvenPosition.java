import java.io.Console;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P11_OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double evenSum = 0.00;
        double oddSum = 0.00;
        double minEvenNum = 10000000000.0;
        double minOddNum = 10000000000.0;
        double maxEvenNum = -10000000000.0;
        double maxOddNum = -10000000000.0;
        DecimalFormat df = new DecimalFormat("#.##");


        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) { // even numbers
                evenSum += number;
                if (number < minEvenNum) {
                    minEvenNum = number;
                } if (number > maxEvenNum) {
                    maxEvenNum = number;
                }
            } else {
                oddSum += number;
                if (number < minOddNum) {
                    minOddNum = number;
                }
                if (number > maxOddNum) {
                    maxOddNum = number;
                }
            }
        }
        System.out.println("OddSum=" + df.format(oddSum));

        if (minOddNum == 10000000000.0) {
            System.out.println("OddMin=No");
        } else {
            System.out.println("Oddmin=" + df.format(minOddNum));
        }
        if (maxOddNum == -10000000000.0) {
            System.out.println("OddMax=No");
        } else {
            System.out.println("OddMax=" + df.format(maxOddNum));
        }
        System.out.println("EvenSum=" + df.format(evenSum));

        if (minEvenNum == 10000000000.0) {
            System.out.println("EvenMin=No");
        } else {
            System.out.println("Evenmin=" + df.format(minEvenNum));
        }
        if (maxEvenNum == -10000000000.0) {
            System.out.println("EvenMax=No");
        } else {
            System.out.println("EvenMax=" + df.format(maxEvenNum));
        }
    }
}










