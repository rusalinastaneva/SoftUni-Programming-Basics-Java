import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int w = 3 * n + 6;
        int h = 3 * n + 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(repeatStr(" ", n) + "~" + repeatStr(" ", 1) + "~" + repeatStr(" ", 1) + "~" + repeatStr(" ", w - n - 5));
        }
        System.out.println(repeatStr("=", w - 1));
        for (int i = 1; i <= n - 2; i++) {
            if (i != n / 2) {
                System.out.println("|" + repeatStr("~", n * 2 + 4) + "|" + repeatStr(" ", w - 2 * n - 7) + "|");
            } else {
                System.out.println("|" + repeatStr("~", n) + "JAVA" + repeatStr("~", n) + "|" + repeatStr(" ", w - 2 * n - 7) + "|");
            }
        }
        System.out.println(repeatStr("=", w - 1));
        int at = 2 * n + 4;
        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr(" ",i)+"\\" + repeatStr("@", at)+"/"+repeatStr(" ",w-2-at-i));
            at-=2;
        }
        System.out.println(repeatStr("=",2 * n + 6));
    }

    static String repeatStr(String text, int countToRepeat) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
