import java.util.Scanner;

public class Exam190317Evening_P03_TruckDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String season = scan.nextLine();
        double kmPerMonth = Double.parseDouble(scan.nextLine());
        double money = 0;
        if (kmPerMonth <= 5000) {
            if (season.equalsIgnoreCase("spring") || season.equalsIgnoreCase("autumn")) {
                money = 0.75;
            } else if (season.equalsIgnoreCase("summer")) {
                money = 0.90;
            } else {
                money = 1.05;
            }
        } else if (kmPerMonth <= 10000) {
            if (season.equalsIgnoreCase("spring") || season.equalsIgnoreCase("autumn")) {
                money = 0.95;
            } else if (season.equalsIgnoreCase("summer")) {
                money = 1.10;
            } else {
                money = 1.25;
            }
        } else {
            money = 1.45;
        }

        System.out.printf("%.2f", money*kmPerMonth*4*0.90);
    }
}
