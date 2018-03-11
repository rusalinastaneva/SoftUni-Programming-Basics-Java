import java.util.Scanner;

public class Exam190317_Evening_Parallelepiped_SECOND {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int w = 3 * n + 1;
        int h = 4 * n + 4;
        int rightDots = w - n;
        System.out.println("+" + repeatStr("~", n - 2) + "+" + repeatStr(".", rightDots));

        for (int i = 1; i <= 2 * n + 1; i++) {
            rightDots--;
            if (i != 1) {
                System.out.println("|" + repeatStr(".", i - 1) + "\\" + repeatStr("~", n - 2) + "\\" + repeatStr(".", rightDots));
            } else {
                System.out.println("|" + "\\" + repeatStr("~", n - 2) + "\\" + repeatStr(".", rightDots));
            }
        }
        int righDots2= w-(n+1);
        for (int i = 1; i <= 2 * n + 1; i++) {
            if (i != 1) {
                righDots2--;
                System.out.println(repeatStr(".",i-1)+"\\"+repeatStr(".", righDots2)+"|"+repeatStr("~", n - 2)+"|");
            } else {
                System.out.println("\\"+repeatStr(".", righDots2)+"|"+repeatStr("~", n - 2)+"|");
            }
        }
        System.out.println(repeatStr(".",w-n)+"+"+repeatStr("~", n - 2)+"+");
    }

    static String repeatStr(String text, int countToRepeat) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {
            result.append(text);
        }
        return result.toString();

    }
}
