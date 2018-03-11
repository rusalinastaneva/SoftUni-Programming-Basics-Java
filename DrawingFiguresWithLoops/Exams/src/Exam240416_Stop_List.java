import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Solution with List

public class Exam240416_Stop_List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> arr = new ArrayList<>();
        int dots = n + 1;
        int space = 0;
        String a = "//___________\\\\";
        System.out.println(a.length());
        System.out.println(repeatStr(".", dots) + repeatStr("_", 2 * n + 1) + repeatStr(".", dots));
        for (int i = 0; i <= n; i++) {
            dots--;
            if (i == n) {
                System.out.println(repeatStr(".", dots) + "//" + repeatStr("", space) + repeatStr("_", (2 * n - 3) / 2 +i) + "STOP!" + repeatStr("_", (2 * n - 3) / 2+i) +
                        repeatStr("", space) + "\\\\" + (repeatStr(".", dots)));
            } else {
                System.out.println(repeatStr(".", dots) + "//" + repeatStr("", space) + repeatStr("_", 2 * n - 3 +2*i) +
                        repeatStr("", space) + "\\\\" + (repeatStr(".", dots)));
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
