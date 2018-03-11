import java.util.Scanner;

public class P05_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int bigNum=Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > bigNum) {
                bigNum = number;
            }
        }
        System.out.println(bigNum);
    }
}

