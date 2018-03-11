import java.util.Scanner;

public class P9_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Celsius:  ");
        double celsius = Double.parseDouble(console.nextLine());
        System.out.printf("Fahrenheit = %.2f", celsius * 1.8 + 32);

    }
}
