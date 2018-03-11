import java.util.Scanner;

public class P01_Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double volume = l*w*h*0.001;
        double result = volume*(1 -percent*0.01);

        System.out.printf("%.3f", result);

    }
}
