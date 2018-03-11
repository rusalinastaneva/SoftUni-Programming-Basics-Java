import java.util.Scanner;

public class P06_PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        boolean XOnBorder = (x == x1 || x == x2) && (y > y1 && y < y2);
        boolean YOnBorder = (y == y1 || y == y2) && (x > x1 && x < x2);
        boolean XYOnBorder = (x == x1 || x == x2) && (y == y1 || y == y2);

        if (XOnBorder || YOnBorder || XYOnBorder) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
