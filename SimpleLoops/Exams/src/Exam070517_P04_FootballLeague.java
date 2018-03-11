import java.util.Scanner;

public class Exam070517_P04_FootballLeague {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int st = Integer.parseInt(scan.nextLine());
        double fans = Double.parseDouble(scan.nextLine());
        String s = "";
        int counterFansA = 0;
        int counterFansB = 0;
        int counterFansV = 0;
        int counterFansG = 0;

        for (int i = 1; i <= fans; i++) {
            s = scan.nextLine();
            if (s.equalsIgnoreCase("A")) {
                counterFansA++;
            } else if (s.equalsIgnoreCase("B")) {
                counterFansB++;
            } else if (s.equalsIgnoreCase("V")) {
                counterFansV++;
            } else if (s.equalsIgnoreCase("G")) {
                counterFansG++;
            }

        }
        double A = (counterFansA / fans) * 100;
        double B = (counterFansB / fans) * 100;
        double V = (counterFansV / fans) * 100;
        double G = (counterFansG / fans) * 100;
        System.out.printf("%.2f%%%n", A);
        System.out.printf("%.2f%%%n", B);
        System.out.printf("%.2f%%%n", V);
        System.out.printf("%.2f%%%n", G);
        System.out.printf("%.2f%%%n", fans / st * 100);
    }
}
