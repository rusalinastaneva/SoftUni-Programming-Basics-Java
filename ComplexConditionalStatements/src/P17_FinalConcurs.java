import java.util.Scanner;

public class P17_FinalConcurs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dancers = Integer.parseInt(scan.nextLine());
        double points = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String place = scan.nextLine();
        double price = 0;
        price = points * dancers;

        if (place.equalsIgnoreCase("Abroad")) {
            price = points + price * 0.5;
        }
        if (season.equalsIgnoreCase("summer")) {
            if (place.equalsIgnoreCase("Bulgaria")) {
                price = price - (0.05 * price);
            } else {
                price = price - (0.10 * price);
            }

        } else {
            if (place.equalsIgnoreCase("Bulgaria")) {
                price = price - (0.08 * price);
            } else {
                price = price - (0.15 * price);
            }

        }
        double charity = price*0.75;
        price=price - charity;
        double moneyPerDancer = price/dancers;
        System.out.printf("Charity - %.2f%nMoney per dancer - %.2f", charity, moneyPerDancer);
    }
}
