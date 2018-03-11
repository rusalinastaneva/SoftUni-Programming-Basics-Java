import java.util.Scanner;

public class Exam230717_Cup_2ndReshenie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int w = 5 * n;
        int dots = n;

        for (int i = 1; i <= n + 1; i++) {
            if (i <= n / 2) {
                System.out.println(repeatStr(".", dots) + repeatStr("#", w - 2 * dots) + repeatStr(".", dots));
            } else {
                System.out.println(repeatStr(".", dots) + "#" + repeatStr(".", w - 2 - 2 * dots) + "#" + repeatStr(".", dots));
            }
            dots++;
        }
        System.out.println(repeatStr(".", (w - n) / 2) + repeatStr("#", n) + repeatStr(".", (w - n) / 2));

        for (int i = 1; i <= n + 2; i++) {
            if (i == n / 2 + 1) {
                System.out.println(repeatStr(".", (w - 10) / 2) + "D^A^N^C^E^" + repeatStr(".", (w - 10) / 2));
            } else {
                System.out.println(repeatStr(".", (w - n - 4) / 2) + repeatStr("#", n + 4) + repeatStr(".", (w - n - 4) / 2));

            }

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
