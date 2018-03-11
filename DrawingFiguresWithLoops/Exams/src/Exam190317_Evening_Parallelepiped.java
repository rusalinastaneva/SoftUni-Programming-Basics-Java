import java.util.Scanner;

public class Exam190317_Evening_Parallelepiped {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int w = 3 * n + 1;
        int h = 4 * n + 4;

        System.out.println("+" + repeatStr("~", n - 2) + "+" + repeatStr(".", w - n));
        System.out.println("|\\" + repeatStr("~", n - 2) + "\\" + repeatStr(".", w - n - 1));

        int dotsLeft = 1;
        int dotsRight = w - n - 2;
        System.out.println("|" + repeatStr(".", dotsLeft) + "\\" + repeatStr("~", n - 2) + "\\" + repeatStr(".", dotsRight));
        for (int i = 0; i < 2 * n - 1; i++) {
            dotsLeft++;
            dotsRight--;
            System.out.println("|" + repeatStr(".", dotsLeft) + "\\" + repeatStr("~", n - 2) + "\\" + repeatStr(".", dotsRight));
        }
        System.out.println("\\" + repeatStr(".", w - n - 1) + "|" + repeatStr("~", n - 2) + "|");

        dotsLeft = 1;
        int dotsMid = w - n - 2;
        System.out.println(repeatStr(".", dotsLeft) + "\\" + repeatStr(".", dotsMid) + "|" + repeatStr("~", n - 2) + "|");
        for (int i = 0; i < 2 * n - 1; i++) {
            dotsLeft++;
            dotsMid--;
            System.out.println(repeatStr(".", dotsLeft) + "\\" + repeatStr(".", dotsMid) + "|" + repeatStr("~", n - 2) + "|");
        }
        System.out.println(repeatStr(".", w - n) + "+" + repeatStr("~", n - 2) + "+");

    }

    static String repeatStr(String text, int countToRepeat) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
