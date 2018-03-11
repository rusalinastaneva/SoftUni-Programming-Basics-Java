import java.util.Scanner;

public class DailyProfit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int workdays = Integer.parseInt(console.nextLine());
        double dayprofit = Double.parseDouble(console.nextLine());
        double usdtoleva = Double.parseDouble(console.nextLine());

        double monthprofit = dayprofit * workdays;
        double yearnetprofit = 12 * monthprofit + 2.5 * monthprofit - ((12 * monthprofit) + (2.5 * monthprofit )) * 0.25;
        double yearnetprofitleva = yearnetprofit * usdtoleva;
        System.out.printf("%.2f", yearnetprofitleva / 365);
    }
}
