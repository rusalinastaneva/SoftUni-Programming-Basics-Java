import java.util.Scanner;

public class Exam190317_TrainersSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double budjet = Double.parseDouble(scanner.nextLine());
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        double payment = budjet / num;

        for (int i = 1; i <= num; i++) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("Jelev")) {
                count1++;
            } else if (name.equalsIgnoreCase("Royal")) {
                count2++;
            } else if (name.equalsIgnoreCase("Roli")) {
                count3++;
            } else if (name.equalsIgnoreCase("Trofon")) {
                count4++;
            } else if (name.equalsIgnoreCase("Sino")) {
                count5++;
            } else {
                count6++;
            }
        }
        System.out.printf("Jelev salary: %.2f lv%n",payment*count1);
        System.out.printf("RoYaL salary: %.2f lv%n",payment*count2);
        System.out.printf("Roli salary: %.2f lv%n",payment*count3);
        System.out.printf("Trofon salary: %.2f lv%n",payment*count4);
        System.out.printf("Sino salary: %.2f lv%n",payment*count5);
        System.out.printf("Others salary: %.2f lv%n",payment*count6);

    }
}
