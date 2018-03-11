import java.util.Scanner;

public class Exam250617_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int w = 4 * n + 1;

        System.out.println(repeatStr("#", w));

        int dots = (w - 2 * (2 * n - 1) - 1) / 2;
        int space = w - 2 * (2 * n - 1) - 2;
        int diesis = 2 * n - 1;

        System.out.println(repeatStr(".", dots) + repeatStr("#", diesis)
                + repeatStr(" ", space) + repeatStr("#", diesis) + (repeatStr(".", dots)));

        for (int i = 1; i <= n - 1; i++) {
            dots++;
            diesis -= 2;
            space += 2;
            String leftPart = (repeatStr(".", dots) + repeatStr("#", diesis));
            String spaces = repeatStr(" ", space);
            String rightPart = repeatStr("#", diesis) + (repeatStr(".", dots));
            String at = repeatStr(" ", (n / 2 + 1) - 2) +
                    repeatStr("(@)", 1) + repeatStr(" ", (n / 2 + 1) - 2);

            System.out.print(leftPart);
            System.out.print(i == n / 2 ? at : spaces);
            System.out.println(rightPart);
        }
        diesis = 2 * n - 1;
        dots = n + 1;
        System.out.println(repeatStr(".", dots) + repeatStr("#", diesis) + repeatStr(".", dots));
        for (int i = 0; i < n - 1; i++) {
            dots++;
            diesis -= 2;
            System.out.println(repeatStr(".", dots) + repeatStr("#", diesis) + repeatStr(".", dots));
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
