import java.util.Scanner;

public class P08_TradeComissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine();
        double s = Double.parseDouble(scan.nextLine());
        boolean rangecom1 = s >= 0 && s <= 500;
        boolean rangecom2 = s > 500 && s <= 1000;
        boolean rangecom3 = s > 1000 && s <= 10000;
        boolean rangecom4 = s > 10000;
        double commission = -1;

        if (town.equalsIgnoreCase("Sofia")) {
            if (rangecom1) commission = 0.05;
            else if (rangecom2) commission = 0.07;
            else if (rangecom3) commission = 0.08;
            else if (rangecom4) commission = 0.12;
        } else if (town.equalsIgnoreCase("Varna")) {
            if (rangecom1) commission = 0.045;
            if (rangecom2) commission = 0.075;
            if (rangecom3) commission = 0.10;
            if (rangecom4) commission = 0.13;
        } else if (town.equalsIgnoreCase("Plovdiv")) {
            if (rangecom1) commission = 0.055;
            if (rangecom2) commission = 0.08;
            if (rangecom3) commission = 0.12;
            if (rangecom4) commission = 0.145;
        }
        if (commission >= 0) {
            System.out.printf("%.2f", s * commission);
        } else {
            System.out.println("error");
        }
    }
}
