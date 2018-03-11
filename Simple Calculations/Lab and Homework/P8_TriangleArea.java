import java.util.Scanner;

public class P8_TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());
        System.out.printf("Triangle Area = %.2f", a * h / 2);
    }
}
