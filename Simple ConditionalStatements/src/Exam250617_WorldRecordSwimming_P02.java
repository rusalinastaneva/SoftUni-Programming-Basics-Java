import java.util.Scanner;

public class Exam250617_WorldRecordSwimming_P02{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double recordSec = Double.parseDouble(scan.nextLine());
        double s = Double.parseDouble(scan.nextLine());
        double t = Double.parseDouble(scan.nextLine());

        double sumT = (s * t) + Math.floor(s / 15) * 12.5;

        if (recordSec <= sumT) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", (sumT - recordSec));
        } else if (recordSec > sumT){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", sumT);
        }

    }
}
