import java.util.Scanner;

public class P06_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int smallNum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int Number = Integer.parseInt(scanner.nextLine());
            if (Number < smallNum) {
                smallNum = Number;
            }
        }
        System.out.println(smallNum);
    }
}
