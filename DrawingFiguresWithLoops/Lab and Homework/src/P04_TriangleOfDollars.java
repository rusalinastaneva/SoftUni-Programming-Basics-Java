import java.util.Scanner;

public class P04_TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("$");
            for (int j = 0; j < i; j++) {
                System.out.print(" $");
            }
            System.out.println();
        }
    }
}
