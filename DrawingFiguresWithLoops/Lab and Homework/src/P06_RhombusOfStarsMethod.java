import java.util.Scanner;

public class P06_RhombusOfStarsMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int upperAndDownRows = n - 1;

        for (int i = 0; i <= upperAndDownRows; i++) {
            System.out.print(repeatStr(" ", upperAndDownRows - i) + "*");
            System.out.println(repeatStr(" *", i));
        }
        for (int i = upperAndDownRows - 1; i >= 0; i--) {
            System.out.print(repeatStr(" ", upperAndDownRows - i) + "*");
            System.out.println(repeatStr(" *", i));
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


