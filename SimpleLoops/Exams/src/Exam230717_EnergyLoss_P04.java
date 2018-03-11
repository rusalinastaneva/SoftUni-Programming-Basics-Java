import java.util.Scanner;

public class Exam230717_EnergyLoss_P04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());
        int A = Integer.parseInt(scan.nextLine());

        double allEnergyOfDancers = 100 * N * A;
        double lossEnergy = 0;

        for (int i = 0; i < N; i++) {
            double H = Double.parseDouble(scan.nextLine());

            if (i % 2 == 1 && H % 2 == 0) {
                lossEnergy += A * 68;
            } else if (i % 2 != 0 && H % 2 != 0) {
                lossEnergy += A * 30;
            } else if (i % 2 == 0 && H % 2 != 0) {
                lossEnergy += A * 65;
            } else if (i % 2 != 0 && H % 2 == 0) {
                lossEnergy += A * 49;
            }
        }

            double remainEnergy = allEnergyOfDancers - lossEnergy;
         double remainEnergyForDayPerDancer = remainEnergy / A / N;

        if (lossEnergy <= allEnergyOfDancers / 2) {
            System.out.printf("They feel good! Energy left: %.2f", remainEnergyForDayPerDancer);
        } else {
            System.out.printf("They are wasted! Energy left: %.2f", remainEnergyForDayPerDancer);
        }

    }

}

