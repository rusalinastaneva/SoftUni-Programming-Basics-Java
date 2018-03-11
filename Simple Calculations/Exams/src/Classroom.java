import java.util.Scanner;

public class Classroom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double h = Double.parseDouble(console.nextLine());
        double w = Double.parseDouble(console.nextLine());

        double rows =  Math.floor(h / 1.20);
        double deskperrow = Math.floor((w - 1) / 0.70);
        double places = rows * deskperrow - 3;
        System.out.println(places);
    }
}
