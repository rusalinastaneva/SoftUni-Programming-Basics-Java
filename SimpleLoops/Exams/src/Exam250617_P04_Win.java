import java.util.Scanner;

public class Exam250617_P04_Win {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double prize = Double.parseDouble(scanner.nextLine());
        int scores = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            scores = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sum += scores * 2;
            } else {
                sum += scores;
            }

        }
        System.out.printf("The project prize was %.2f lv.", prize*sum);

    }
}
