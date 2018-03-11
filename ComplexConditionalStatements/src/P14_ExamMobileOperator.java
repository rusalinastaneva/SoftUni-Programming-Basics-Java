import java.util.Scanner;

public class P14_ExamMobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String periodContract = scanner.nextLine();
        String type = scanner.nextLine();
        String net = scanner.nextLine();
        int monthsPay = Integer.parseInt(scanner.nextLine());
        double tax = -1;

        if (periodContract.equals("one")) {
            if (type.equals("Small")) tax = 9.98;
            if (type.equals("Middle")) tax = 18.99;
            if (type.equals("Large")) tax = 25.98;
            if (type.equals("ExtraLarge")) tax = 35.99;
        } else if (periodContract.equals("two")) {
            if (type.equals("Small")) tax = 8.58;
            if (type.equals("Middle")) tax = 17.09;
            if (type.equals("Large")) tax = 23.59;
            if (type.equals("ExtraLarge")) tax = 31.79;
        }
        if ((net.equals("yes")) && (periodContract.equals("one"))) {
            if (tax >= 30) {
                System.out.printf("%.2f lv.", (tax + 3.85) * monthsPay);
            } else if (tax <= 10) {
                System.out.printf("%.2f lv.", (tax + 5.50) * monthsPay);
            } else if (tax <= 30) {
                System.out.printf("%.2f lv.", (tax + 4.35) * monthsPay);
            }
        } else if ((net.equals("yes")) && (periodContract.equals("two"))) {
            if (tax >= 30) {
                System.out.printf("%.2f lv.", ((tax + 3.85)* (1 - 0.0375)) * monthsPay);
            } else if (tax <= 10) {
                System.out.printf("%.2f lv.", ((tax + 5.50) * (1 - 0.0375)) * monthsPay);
            } else if (tax <= 30) {
                System.out.printf("%.2f lv.", ((tax + 4.35) * monthsPay) - ((tax + 4.35)*monthsPay*0.0375));
            }
        } else if ((net.equals("no")) && (periodContract.equals("two"))) {
            System.out.printf("%.2f lv.", (tax * monthsPay)  - (tax * monthsPay * 0.0375));
        } else {
            System.out.printf("%.2f lv.", tax * monthsPay);
        }
    }
}
