import java.util.Scanner;

public class Exam070517_P02_ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double holiday = Double.parseDouble(scan.nextLine());
        int toy1 = Integer.parseInt(scan.nextLine());
        int toy2 = Integer.parseInt(scan.nextLine());
        int toy3 = Integer.parseInt(scan.nextLine());
        int toy4 = Integer.parseInt(scan.nextLine());
        int toy5 = Integer.parseInt(scan.nextLine());
        int totalToys = toy1 + toy2 + toy3 + toy4 + toy5;
        double totalTurnover = toy1 * 2.60 + toy2 * 3.00 + toy3 * 4.10 + toy4 * 8.20 + toy5 * 2;
        double profit = 0;

        if (totalToys >= 50) {
            profit = (totalTurnover * 0.75)*0.90;
        } else {
            profit = 0.90 * totalTurnover;
        }
        if (profit > holiday) {
            System.out.printf("Yes! %.2f lv left.", Math.abs(profit - holiday));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(profit - holiday));

        }

    }
}
