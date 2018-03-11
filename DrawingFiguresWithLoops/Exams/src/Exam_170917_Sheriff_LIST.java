import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam_170917_Sheriff_LIST {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int h = 2 * n + 8;
        int w = 3 * n;
        List<String> arr = new ArrayList<>();

        System.out.println(repeatStr(".", (w - 1) / 2) + "x" + repeatStr(".", (w - 1) / 2));
        System.out.println(repeatStr(".", (w - 3) / 2) + "/x\\" + repeatStr(".", (w - 3) / 2));
        System.out.println(repeatStr(".", (w - 3) / 2) + "x|x" + repeatStr(".", (w - 3) / 2));

        for (int i = 0; i < n/2; i++) {
            String line = repeatStr(".", (3*n-1)/2 - n-i) + repeatStr("x", n+i)
                    + "|" + repeatStr("x", n+i) + repeatStr(".", (3*n-1)/2- n-i);
            arr.add(line);
            System.out.println(line);
        }
        System.out.println(repeatStr("x", (3*n-1)/2) + "|" + repeatStr("x", (3*n-1)/2));

        for (int i = arr.size()-1; i >= 0; i--) {
            System.out.println(arr.get(i));
        }
        System.out.println(repeatStr(".", (w - 3) / 2) + "/x\\" + repeatStr(".", (w - 3) / 2));
        System.out.println(repeatStr(".", (w - 3) / 2) + "\\x/" + repeatStr(".", (w - 3) / 2));

        for (int i = 0; i < n/2; i++) {
            String line = repeatStr(".", (3*n-1)/2 - n-i) + repeatStr("x", n+i)
                    + "|" + repeatStr("x", n+i) + repeatStr(".", (3*n-1)/2- n-i);
            arr.add(line);
            System.out.println(line);
        }
        System.out.println(repeatStr("x", (3*n-1)/2) + "|" + repeatStr("x", (3*n-1)/2));
        for (int i = arr.size() - 1; i >= n/2; i--) {
            System.out.println(arr.get(i));
        }

        System.out.println(repeatStr(".", (w - 3) / 2) + "x|x" + repeatStr(".", (w - 3) / 2));
        System.out.println(repeatStr(".", (w - 3) / 2) + "\\x/" + repeatStr(".", (w - 3) / 2));
        System.out.println(repeatStr(".", (w - 1) / 2) + "x" + repeatStr(".", (w - 1) / 2));
    }

    static String repeatStr(String text, int countToRepeat) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
