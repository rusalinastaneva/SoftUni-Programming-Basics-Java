import java.util.Scanner;

public class Exam201116Evening_P06_MaxCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int maxCombination = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                if (counter == maxCombination) {
                    break;
                }
                counter++;
                System.out.printf("<%d-%d>", i, j);
            }
        }
    }
}