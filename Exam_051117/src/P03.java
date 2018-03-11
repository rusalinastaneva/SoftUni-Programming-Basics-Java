import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double kg = Double.parseDouble(scan.nextLine());
        String type = scan.nextLine();
        int km = Integer.parseInt(scan.nextLine());
        double price = 0;

        if (type.equalsIgnoreCase("standard")) {
            if (kg < 1) {
                price = 0.03 * km;
            } else if (kg <= 10) {
                price = 0.05 * km;
            } else if (kg <= 40) {
                price = 0.10 * km;
            } else if (kg <= 90) {
                price = 0.15 * km;
            } else if (kg <= 150) {
                price = 0.20 * km;
            }
        }
        if (type.equalsIgnoreCase("express")) {
            if (kg < 1) {
                price = 0.03 * km;
                price = price + 0.80 * price * kg;
            } else if (kg <= 10) {
                price = 0.05 * km;
                price = price + 0.40 * price * kg;
            } else if (kg <= 40) {
                price = 0.10 * km;
                price = price + 0.05 * price * kg;
            } else if (kg <= 90) {
                price = 0.15 * km;
                price = price + 0.02 * price * kg;
            } else if (kg <= 150) {
                price = 0.20 * km;
                price = price + 0.01 * price * kg;
            }
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", kg, price);


    }
}
