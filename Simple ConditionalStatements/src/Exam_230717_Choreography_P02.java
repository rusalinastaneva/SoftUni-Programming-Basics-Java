import java.util.Scanner;

public class Exam_230717_Choreography_P02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double steps = Double.parseDouble(scan.nextLine());
        double dancers = Double.parseDouble(scan.nextLine());
        double daysStudy = Double.parseDouble(scan.nextLine());

        double stepsPerDay = Math.ceil(((steps / daysStudy) / steps) * 100); // in percent
        double stepsPerDancer = stepsPerDay / dancers;

        if (stepsPerDay > 13) {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.", stepsPerDancer);
        } else {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", stepsPerDancer);
        }
    }
}
