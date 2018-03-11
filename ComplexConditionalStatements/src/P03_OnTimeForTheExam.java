import java.util.Scanner;

public class P03_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hourExam = Integer.parseInt(scan.nextLine());
        int minutesExam = Integer.parseInt(scan.nextLine());
        int hourArrival = Integer.parseInt(scan.nextLine());
        int minutesArrival = Integer.parseInt(scan.nextLine());

        int totalMinExam = hourExam * 60 + minutesExam;
        int totalMinArrival = hourArrival * 60 + minutesArrival;
        int diffInMin = Math.abs(totalMinArrival - totalMinExam);

        if (totalMinArrival > totalMinExam && diffInMin < 60) {
            System.out.println("Late");
            System.out.printf("%d minutes after the start", diffInMin);
        } else if (totalMinArrival > totalMinExam && totalMinExam >= 60) {
            System.out.println("Late");
            System.out.printf("%d:%02d hours after the start", diffInMin / 60, diffInMin % 60);
        } else if (totalMinArrival <= totalMinExam && diffInMin <= 30) {
            if (totalMinArrival == totalMinExam) {
                System.out.printf("On time");
            } else {
                System.out.printf("On time %n%d minutes before the start", diffInMin % 60);
            }
        } else {
            if (diffInMin >= 60) {
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start", diffInMin / 60, diffInMin % 60);
            } else {
                System.out.println("Early");
                System.out.printf("%d minutes before the start", diffInMin);
            }
        }
    }
}
