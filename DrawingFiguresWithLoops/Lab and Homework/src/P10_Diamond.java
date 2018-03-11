import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P10_Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int stars = 0;
        int dash = (n - 1) / 2;
        List<String> arr = new ArrayList<>();

        if (n % 2 == 0) {
            stars = 2;
        } else {
            stars = 1;
        }
        if (n < 3) {
            System.out.println(repeatStr("-", dash) + repeatStr("*", stars) + repeatStr("-", dash));
        } else {
            System.out.println(repeatStr("-", dash) + repeatStr("*", stars) + repeatStr("-", dash));

            for (int i = 1; i < (n + 1) / 2 - 1; i++) {
                dash = dash - 1;
                String line = repeatStr("-", dash) + "*"
                        + repeatStr("-", n - 2 - 2 * (dash))
                        + "*" + repeatStr("-", dash);
                arr.add(line);
                System.out.println(line);
            }
            System.out.println("*" + repeatStr("-", n - 2) + "*");

            for (int i = arr.size() - 1; i >= 0; i--) {
                System.out.println(arr.get(i));
            }
            System.out.println(repeatStr("-", (n - 1) / 2) + repeatStr("*", stars) + repeatStr("-", (n - 1) / 2));
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
