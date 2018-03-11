import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        double h = Double.parseDouble(scan.nextLine());
        double price = Double.parseDouble(scan.nextLine());
        double weight = Double.parseDouble(scan.nextLine());

        int netL = 2*a+2*b;
        double priceNet = netL*price;
        double areaNet = netL*h;
        double weightNet=areaNet*weight;

        System.out.println(netL);
        System.out.printf("%.2f%n",priceNet);
        System.out.printf("%.3f",weightNet);


    }
}
