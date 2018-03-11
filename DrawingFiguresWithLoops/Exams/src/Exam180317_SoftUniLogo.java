import java.util.Scanner;

public class Exam180317_SoftUniLogo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int w = 12 * n - 5;
        int h = 4 * n - 2;

        System.out.println(repeatStr(".", (w - 1) / 2) + "#" + repeatStr(".", (w - 1) / 2));

        int dots = (w - 1) / 2 - 3;
        int diesis = 7;
        System.out.println(repeatStr(".", dots) + repeatStr("#", diesis) + repeatStr(".", dots));

        for (int i = 1; i < 2 * n - 1; i++) {
            diesis += 6;
            dots -= 3;
            System.out.println(repeatStr(".", dots) + repeatStr("#", diesis) + repeatStr(".", dots));
        }
        int dotsLeft = 2;
        int dotsRight = 3;
        diesis = 12 * n - 11;
        System.out.println("|" + repeatStr(".", dotsLeft) + repeatStr("#", diesis) + repeatStr(".", dotsRight));

        for (int i = 0; i < n - 2; i++) {
            dotsLeft += 3;
            dotsRight += 3;
            diesis -= 6;
            System.out.println("|" + repeatStr(".", dotsLeft) + repeatStr("#", diesis) + repeatStr(".", dotsRight));
        }
        for (int i = 0; i < n - 2; i++) {
            System.out.println("|" + repeatStr(".", n * 3 - 4) + repeatStr("#", 6 * n + 1) + repeatStr(".", n * 3 - 3));
        }
        System.out.println("@" + repeatStr(".", n * 3 - 4) + repeatStr("#", 6 * n + 1) + repeatStr(".", n * 3 - 3));
    }


    static String repeatStr(String text, int countToRepeat) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
