import java.util.Scanner;

public class Exam070517_Crown_Var2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int w = (2 * n) - 1;
        int h = (n / 2) + 4;
        int mDots = 1;
        int space = n - 5;

        System.out.println("@" + repeatStr(" ", (w - 3) / 2) + "@" + repeatStr(" ", (w - 3) / 2) + "@");
        System.out.println("**" + repeatStr(" ", (w - 5) / 2) + "*" + repeatStr(" ", (w - 5) / 2) + "**");

        for (int i = 1; i <= n / 2 - 1; i++) {
            if (i!=n/2-1){
                System.out.println("*" + repeatStr(".", i) + "*" + repeatStr(" ", space) + "*" + repeatStr(".", mDots) + "*" + repeatStr(" ", space) + "*" + repeatStr(".", i) + "*");
                mDots += 2;
                space -= 2;

            }else {
                System.out.println("*"+repeatStr(".",n/2-1)+"*"+repeatStr(".",mDots) +"*"+repeatStr(".",n/2-1)+"*");
            }

        }
        System.out.println("*"+repeatStr(".",n/2)+repeatStr("*",(w-n-3)/2)+"."+repeatStr("*",(w-n-3)/2) +repeatStr(".",n/2)+"*");
        System.out.println(repeatStr("*",w));
        System.out.println(repeatStr("*",w));
    }

    static String repeatStr(String text, int countToRepeat) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {
            result.append(text);
        }
        return result.toString();
    }
}