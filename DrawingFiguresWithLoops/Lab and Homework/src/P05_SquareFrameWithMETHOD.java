import java.util.Scanner;

public class P05_SquareFrameWithMETHOD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        // first row
        String firstAndLastRow = "+" + repeatStr(" -", n-2) + " +";
        System.out.println(firstAndLastRow);

        // middle part - tuk se postroqvat samite redove
        String mpart = "|" + repeatStr(" -", n-2) + " |";

        for (int i = 0; i < n - 2; i++) { // tuk se otpechatva kolko puti trqbva da se povtori celiq cikul ot redove
            System.out.println(mpart);
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
