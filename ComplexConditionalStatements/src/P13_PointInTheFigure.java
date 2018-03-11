import java.util.Scanner;

public class P13_PointInTheFigure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = Integer.parseInt(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        boolean isXInsideDown = x > 0 && x < 3 * h; // dolniq pravougulnik
        boolean isYInsideDown = y > 0 && y < h;
        boolean isXInsideUp = x > h && x < 2 * h;  // gorniq pravougulnik
        boolean isYInsideUp = y >= h && y < 4 * h;

        boolean isXOutsideDown = x < 0 || x > 3 * h; // dolniq pravougulnik
        boolean isYOutsideDown = y < 0 || y > h;
        boolean isXOutsideUp = x < h || x > 2 * h; // gorniq pravougulnik
        boolean isYOutsideUp = y < h || y > 4 * h;

        if ((isXInsideDown && isYInsideDown) || (isXInsideUp && isYInsideUp)) {
            System.out.println("inside");
        } else if ((isXOutsideDown || isYOutsideDown) && (isXOutsideUp || isYOutsideUp)) {
            System.out.println("outside");
        } else {
            System.out.println("border");
        }

    }
}
