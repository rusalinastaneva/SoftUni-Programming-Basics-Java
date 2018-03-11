import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam_030917_Snowflake_BetterSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int w = 2 * n + 3;
        int h = 2 * n + 1;
        int dots = n;
        List<String> arr = new ArrayList<>();

        for (int i = 0; i <= n - 2; i++) {
            String firstPart = (repeatStr(".", i) + "*" + repeatStr(".", dots) +
                    "*" + repeatStr(".", dots) + "*" + repeatStr(".", i));
            arr.add(firstPart);
            System.out.println(firstPart);
            dots--;
        }
        System.out.println(repeatStr("*",w));

        for (int i = arr.size()-1; i >= 0; i--) {
            System.out.println(arr.get(i));
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
