import java.util.Scanner;

public class Exam030917_Scholarship_P02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double income = Double.parseDouble(scan.nextLine());
        double advGrade = Double.parseDouble(scan.nextLine());
        double minSalary = Double.parseDouble(scan.nextLine());
        double amountSocSchol = minSalary * 0.35;
        double amountExcellentSchol = advGrade * 25;
        boolean excellentScholCond = advGrade >= 5.5;
        boolean socScholCond = (income < minSalary) && (advGrade > 4.5);

        if (excellentScholCond && socScholCond && (amountSocSchol > amountExcellentSchol)) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(amountSocSchol));
        } else if (excellentScholCond && socScholCond && (amountExcellentSchol >= amountSocSchol)) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(amountExcellentSchol));

        } else if (socScholCond) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(amountSocSchol));
        } else if (excellentScholCond) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(amountExcellentSchol));
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}

