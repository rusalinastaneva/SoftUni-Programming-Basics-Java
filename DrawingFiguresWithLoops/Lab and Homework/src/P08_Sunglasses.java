import java.util.Scanner;

public class P08_Sunglasses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String space = repeatStr(" ", n);
        // first and last row
        String firstAndLastRow = repeatStr("*", 2 * n) + repeatStr(" ", n) + repeatStr("*", 2 * n);
        System.out.println(firstAndLastRow);

        // middle rows
        for (int i = 0; i < n - 2; i++) {
            String pipes = repeatStr("|", n);
            String mPart = "*" + repeatStr("/", 2 * n - 2) + "*";
            System.out.print(mPart);
            System.out.print(i == (n - 1) / 2 - 1 ? pipes : space);
            System.out.println(mPart);
        }

        System.out.println(firstAndLastRow);
    }

    static String repeatStr(String text, int countToRepeat) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {
            result.append(text);
        }
        return result.toString();

    }
}
