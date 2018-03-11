import java.util.Scanner;

public class Exam230717_DanceHall_P01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double L = Double.parseDouble(scan.nextLine());
        double W = Double.parseDouble(scan.nextLine());
        double A = Double.parseDouble(scan.nextLine());

        double areaHallCm = (L * 100) * (W * 100);
        double areaWardrobeCm = (A * 100) * (A * 100);
        double areaBenchCm = areaHallCm / 10;
        double freeSpace = areaHallCm - areaWardrobeCm - areaBenchCm;
        double dancers = freeSpace / (40 + 7000);
        System.out.printf("%.0f", Math.floor(dancers));

    }
}
