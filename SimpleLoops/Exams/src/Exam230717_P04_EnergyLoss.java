import java.util.Scanner;

public class Exam230717_P04_EnergyLoss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int a = Integer.parseInt(scan.nextLine());

        int allEnergyOfDancers = 100 * a * n;
        int lossEnergy = 0;

        for (int i = 1; i <= n; i++) {
            int h = Integer.parseInt(scan.nextLine());

            if (i % 2 == 0 && h % 2 == 0) {
                lossEnergy += 68;
            } else if (i % 2 != 0 && h % 2 != 0) {
                lossEnergy += 30;
            } else if (i % 2 == 0 && h % 2 != 0) {
                lossEnergy += 65;
            } else if (i % 2 != 0 && h % 2 == 0) {
                lossEnergy += 49;
            }
        }

        double remainEnergy = allEnergyOfDancers - lossEnergy * a;
        double remainEnergyForDayPerDancer = remainEnergy / a / n;

        if (remainEnergyForDayPerDancer > 50) {
            System.out.printf("They feel good! Energy left: %.2f", remainEnergyForDayPerDancer);
        } else {
            System.out.printf("They are wasted! Energy left: %.2f", remainEnergyForDayPerDancer);
        }

    }

}



