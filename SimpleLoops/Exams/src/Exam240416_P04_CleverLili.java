import java.util.Scanner;

public class Exam240416_P04_CleverLili {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double priceLaundry = Double.parseDouble(scan.nextLine());
        int pricePerToy = Integer.parseInt(scan.nextLine());
        double savedMoney = 0;
        int counterToys = 0;
        int counterMoney = 0;
            int allSaved = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                savedMoney += 10;
                allSaved += savedMoney;
                counterMoney++;
            } else if (i % 2 != 0) {
                counterToys++;
            }
        }
        double broMoney = counterMoney * 1;
        double saleToys = counterToys * pricePerToy;
        double savings = allSaved + saleToys - broMoney;

        if (savings >= priceLaundry) {
            System.out.printf("Yes! %.2f", savings - priceLaundry);
        } else {
            System.out.printf("No! %.2f", priceLaundry - savings);

        }

    }
}
