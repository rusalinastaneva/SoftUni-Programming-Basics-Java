import java.util.Scanner;

public class P11_Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String projection = scan.nextLine();
        int r = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        int places = r * c;

        if (projection.equalsIgnoreCase("Premiere")) {
            System.out.printf("%.2f leva", places * 12.00);
        } else if (projection.equalsIgnoreCase("Normal")) {
            System.out.printf("%.2f leva", places * 7.50);
        } else if (projection.equalsIgnoreCase("Discount")) {
            System.out.printf("%.2f leva", places * 5.00);
        }
    }
}
