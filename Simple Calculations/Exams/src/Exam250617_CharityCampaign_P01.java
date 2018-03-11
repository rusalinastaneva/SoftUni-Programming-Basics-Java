import java.util.Scanner;

public class Exam250617_CharityCampaign_P01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int chefs = Integer.parseInt(scan.nextLine());
        int numT = Integer.parseInt(scan.nextLine());
        int numG = Integer.parseInt(scan.nextLine());
        int numP = Integer.parseInt(scan.nextLine());

        double allSum = (numT * 45 + numG * 5.80 + numP * 3.20) * chefs * days;
        double charitySum = allSum * (1 - (1.0 / 8.0));
        System.out.printf("%.2f", charitySum);
    }
}
