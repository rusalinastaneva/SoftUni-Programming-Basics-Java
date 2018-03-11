import java.util.Scanner;

//JUDGE 75/100

public class P12_EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPairs = Integer.parseInt(scanner.nextLine());
        double previousPairSum = 0;
        double currentPairSum = 0;
        double difference = 0;
        double biggestDifference = 0;

        for (int i = 0; i < numPairs; i++) {
            double firstNum = Double.parseDouble(scanner.nextLine());
            double secondNum = Double.parseDouble(scanner.nextLine());

            if (i == 0) {
                previousPairSum = firstNum + secondNum;
            } else {
                currentPairSum = firstNum + secondNum;
                difference = Math.abs(currentPairSum - previousPairSum);
                if (difference > biggestDifference) {
                    biggestDifference = difference;
                }
                currentPairSum = previousPairSum;
            }
        }
        if (biggestDifference == 0) {
            System.out.printf("Yes, value=%.0f", previousPairSum);
        } else {
            System.out.printf("No, maxdiff=%.0f", biggestDifference);

        }
    }
}

