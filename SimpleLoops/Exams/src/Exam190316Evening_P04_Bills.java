import java.util.Scanner;

public class Exam190316Evening_P04_Bills {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int months = Integer.parseInt(scan.nextLine());
        double water = 20.00;
        double net = 15.00;
        double billOther = 0;
        double totalElectr = 0;
        for (int i = 1; i <= months; i++) {
            double monthlyElectr = Double.parseDouble(scan.nextLine());
            totalElectr += monthlyElectr;
            billOther += (monthlyElectr + water + net) * 1.2;
        }
        System.out.printf("Electricity: %.2f lv%n", totalElectr);
        System.out.printf("Water: %.2f lv%n", months *water);
        System.out.printf("Internet: %.2f lv%n", months *net);
        System.out.printf("Other: %.2f lv%n", billOther);
        System.out.printf("Average: %.2f lv%n",(totalElectr+ (water+net)*months + billOther)/months);

    }
}
