import java.util.Scanner;

public class Exam030917_TailorWorkshop_P01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tables = Integer.parseInt(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());

        double areaPokrivki = tables * (length + 2 * 0.30) * (width + 2 * 0.30);
        double areaKareta = tables * (length / 2) * (length / 2);
        double priceInUSD = areaPokrivki * 7 + areaKareta * 9;
        double priceInBGN = priceInUSD * 1.85;

        System.out.printf("%.2f USD%n",priceInUSD);
        System.out.printf("%.2f BGN",priceInBGN);

    }

}
