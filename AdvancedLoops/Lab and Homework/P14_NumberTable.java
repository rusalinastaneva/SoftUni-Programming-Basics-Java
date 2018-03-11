import java.util.Scanner;

public class P14_NumberTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = i + j + 1;
                if (num > n) {
                    num = 2 * n - num; }
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
