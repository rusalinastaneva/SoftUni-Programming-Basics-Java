import java.util.Scanner;

public class Exam170917_P02_ThreeBrothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double d = Double.parseDouble(scanner.nextLine());
        double cleaningT = 1 / (1 / a + 1 / b + 1 / c);
        double totalT = cleaningT + cleaningT * 0.15;
        double result = d - totalT;

        System.out.printf("Cleaning time: %.2f%n", totalT);
        if (result > 0) {
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", Math.floor(result));
        } else {
            System.out.printf("No, there isn’t a surprise - shortage of time -> %.0f hours.", Math.ceil(totalT-d));
        }
    }
}
