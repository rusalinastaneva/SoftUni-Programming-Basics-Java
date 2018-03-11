import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int counterPoor = 0;
        int counterSatisf = 0;
        int counterGood = 0;
        int counterVeryGood = 0;
        int counterExcellent = 0;

        for (int i = 1; i <= n; i++) {
            double scores = Double.parseDouble(scan.nextLine());

            if (scores < 22.5) {
                counterPoor++;
            } else if (scores < 40.5) {
                counterSatisf++;
            } else if (scores < 58.5) {
                counterGood++;
            } else if (scores < 76.5) {
                counterVeryGood++;
            } else {
                counterExcellent++;
            }

        }
        double poor = (double)counterPoor / n * 100;
        double satisf = (double)counterSatisf / n * 100;
        double good = (double)counterGood / n * 100;
        double veryGood = (double)counterVeryGood / n * 100;
        double excell = (double)counterExcellent / n * 100;

        System.out.printf("%.2f%% poor marks %n", poor);
        System.out.printf("%.2f%% satisfactory marks %n", satisf);
        System.out.printf("%.2f%% good marks%n", good);
        System.out.printf("%.2f%% very good marks%n", veryGood);
        System.out.printf("%.2f%% excellent marks", excell);

    }
}
