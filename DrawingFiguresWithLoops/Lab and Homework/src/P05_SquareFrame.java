import java.util.Scanner;

public class P05_SquareFrame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        // first row
        String firstAndLastRow = "+";
        for (int i = 0; i < n - 2; i++) {
            firstAndLastRow += " -";
        }
        firstAndLastRow += " +";
        System.out.println(firstAndLastRow);

        // middle part - tuk se postroqvat samite redove
        String mpart = "|";
        for (int i = 0; i < n - 2; i++) {
            mpart += " -";
        }
        mpart += " |";

        for (int i = 0; i < n - 2; i++) { // tuk se otpechatva kolko puti trqbva da se povtori celiq cikul ot redove
            System.out.println(mpart);
        }
        System.out.println(firstAndLastRow);
    }
}
           //2 reshenie
            /* // first row

        int n = Integer.parseInt(scan.nextLine());
        System.out.print("+");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" -");
        }
        System.out.print(" +");
        System.out.println();


        // last row
        System.out.print("+");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" -");
            System.out.print(" +");
            System.out.println();
*/

