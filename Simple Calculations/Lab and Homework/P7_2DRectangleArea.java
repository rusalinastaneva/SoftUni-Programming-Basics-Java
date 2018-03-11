

//double width = Math.max(x1, x2) - Math.min(x1, x2);
        //double height = Math.max(y1, y2) - Math.min(y1, y2);
       // System.out.printf("Area = %f%n", width * height);
       // System.out.printf("Perimeter = %f%n", 2 * (width + height));

        import java.util.Scanner;

public class P7_2DRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double a = Math.abs(y1 - y2);
        double b = Math.abs(x1 - x2);
        double area = a * b;
        double perimeter = 2 * (a + b);
        System.out.println(area);
        System.out.println(perimeter);
    }
}
