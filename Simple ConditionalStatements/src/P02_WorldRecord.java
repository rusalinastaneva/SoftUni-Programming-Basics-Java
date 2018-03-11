import java.util.Scanner;

public class P02_WorldRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double record = Double.parseDouble(scan.nextLine());
        double s = Double.parseDouble(scan.nextLine());
        double t = Double.parseDouble(scan.nextLine());

        double tRecord = s*t;
        double tSlow = Math.floor(s/15)*12.5;
        double totalT = tRecord+tSlow;

        if (record<=totalT){
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalT-record);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalT);
        }

    }
}
