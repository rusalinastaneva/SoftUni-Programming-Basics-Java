import java.util.Scanner;

public class Exam170917_ThreeBrothers_P02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tBro1 = Double.parseDouble(scan.nextLine());
        double tBro2 = Double.parseDouble(scan.nextLine());
        double tBro3 = Double.parseDouble(scan.nextLine());
        double tFatherOut = Double.parseDouble(scan.nextLine());

        double totalT = 1 / (1 / tBro1 + 1 /tBro2 + 1/ tBro3);
        double tWithBreak = totalT * 0.15 + totalT;
        double timeLeft = tFatherOut - tWithBreak;

        System.out.printf("Cleaning time: %.2f%n", tWithBreak);

        if (timeLeft > 0) {
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", Math.floor(timeLeft));
        } else {
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.", Math.ceil(tWithBreak-tFatherOut));
        }

    }
}
