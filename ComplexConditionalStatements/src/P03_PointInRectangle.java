import java.util.Scanner;

public class P03_PointInRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        boolean isXInside = x >= x1 && x <= x2;
        boolean isYInside = y >= y1 && y <= y2;

        if (isXInside && isYInside) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }
}
