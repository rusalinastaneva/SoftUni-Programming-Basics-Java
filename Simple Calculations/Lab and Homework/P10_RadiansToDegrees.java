import java.util.Scanner;

public class P10_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Radians: ");
        Double radians = Double.parseDouble(console.nextLine());
        double degrees = Math.round(radians * 180 / Math.PI);
        System.out.println("Degrees = " + degrees);
    }
}
