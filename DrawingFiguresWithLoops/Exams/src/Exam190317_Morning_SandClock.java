import java.util.Scanner;

public class Exam190317_Morning_SandClock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int w = 2 * n + 1;

        System.out.println(repeatStr("*", w));
        System.out.println(".*" + repeatStr(" ", w-4) + "*.");
        int at = w-6;
        int dots=2;
        System.out.println(repeatStr(".", dots) + "*"
                + repeatStr("@",at) + "*" + repeatStr(".", dots));

        for (int i = 0; i < n-3; i++) {
            at -=2;
            dots++;
            System.out.println(repeatStr(".", dots) + "*"
                    + repeatStr("@",at) + "*" + repeatStr(".",dots));
        }
        System.out.println(repeatStr(".",n)+ "*" + repeatStr(".",n));
        System.out.println(repeatStr(".",n-1)+ "*@*" + repeatStr(".",n-1));

        int space = 1;
        dots = n-2;
        System.out.println(repeatStr(".",dots)+ "*" +
                repeatStr(" ", space)+ "@" +repeatStr(" ", space) +  "*" + repeatStr(".",dots));
        for (int i = 0; i < n-4; i++) {
            space++;
            dots--;
            System.out.println(repeatStr(".", dots) + "*" + repeatStr(" ", space)
                    + "@" + repeatStr(" ", space) + "*" +repeatStr(".", dots));
        }
        System.out.println(".*" + repeatStr("@", w-4) + "*.");
        System.out.println(repeatStr("*", w));

    }
    static String repeatStr(String text, int countToRepeat) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
