import java.util.Scanner;

public class Exam070517_Crown {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int w = 2 * n - 1;
        int h = n / 2 + 4;

        System.out.println("@" + repeatStr(" ", (w - 3) / 2) + "@" + repeatStr(" ", (w - 3) / 2) + "@");
        System.out.println("**" + repeatStr(" ", (w - 5) / 2) + "*" + repeatStr(" ", (w - 5) / 2) + "**");

        for (int i = 0; i < n / 2 - 2; i++) {
            System.out.println("*" + repeatStr(".", i + 1) + "*"
                    + repeatStr(" ", (n - 5) - (2 * i)) +
                    "*" + repeatStr(".", i) + "." + repeatStr(".", i) + "*"
                    + repeatStr(" ", (n - 5) - (2 * i)) +
                    "*" + repeatStr(".", i + 1) + "*");
        }
        System.out.println("*" + repeatStr(".", n / 2 - 1) + "*"
                + repeatStr(".", n - 3) + "*" +
                repeatStr(".", n / 2 - 1) + "*");
        System.out.println("*" + repeatStr(".", n / 2)
                + repeatStr("*", n / 2 - 2) + "." + repeatStr("*", n / 2 - 2)
                + repeatStr(".", n / 2) + "*");

        for (int i = 0; i < 2; i++) {
            System.out.println(repeatStr("*", 2 * n - 1));
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
