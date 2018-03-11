import java.util.Scanner;

public class P09_House {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int stars = 0;

        if (n % 2 == 0) {
            stars = 2;
        } else {
            stars = 1;

        }
        int dash = (n - stars) / 2;
        System.out.println(repeatStr("-", dash) + repeatStr("*", stars) + repeatStr("-", dash));

        for (int i = 1; i < (n + 1) / 2; i++) {
            stars += 2; // stars = stars+2;
            dash = dash - 1;
            System.out.println(repeatStr("-", dash) + repeatStr("*", stars) + repeatStr("-", dash));
        }
        for (int i = 0; i <= n / 2 - 1; i++) {
            System.out.println("|" + repeatStr("*", n-2)+ "|");
        }
    }

    static String repeatStr(String text, int countToRepeat) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {
            result.append(text);
        }
        return result.toString();

    }
}
