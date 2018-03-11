import java.util.Scanner;

public class P07_FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String dayOfWeek = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        boolean workingdays = dayOfWeek.equalsIgnoreCase("Monday") || dayOfWeek.equalsIgnoreCase("Tuesday") || dayOfWeek.equalsIgnoreCase("Wednesday")|| dayOfWeek.equalsIgnoreCase("Thursday")|| dayOfWeek.equalsIgnoreCase("Friday");
        boolean holidays = dayOfWeek.equalsIgnoreCase("Saturday") || dayOfWeek.equalsIgnoreCase("Sunday");
        boolean allfruits = fruit.equalsIgnoreCase("banana") || fruit.equalsIgnoreCase("apple") || fruit.equalsIgnoreCase("orange") || fruit.equalsIgnoreCase("grapefruit") || fruit.equalsIgnoreCase("kiwi") || fruit.equalsIgnoreCase("pineapplie") || fruit.equalsIgnoreCase("grapes");

        if (workingdays) {
            if (fruit.equalsIgnoreCase("banana")) {
                System.out.println(2.50 * quantity);
            }
            if (fruit.equalsIgnoreCase("apple")) {
                System.out.println(1.20 * quantity);
            }
            if (fruit.equalsIgnoreCase("orange")) {
                System.out.println(0.85 * quantity);
            }
            if (fruit.equalsIgnoreCase("grapefruit")) {
                System.out.println(1.45 * quantity);
            }
            if (fruit.equalsIgnoreCase("kiwi")) {
                System.out.println(2.70 * quantity);
            }
            if (fruit.equalsIgnoreCase("pineapple")) {
                System.out.println(5.50 * quantity);
            }
            if (fruit.equalsIgnoreCase("grapes")) {
                System.out.println(3.85 * quantity);
            }
        } else if (holidays) {
            if (fruit.equalsIgnoreCase("banana")) {
                System.out.println(2.70 * quantity);
            }
            if (fruit.equalsIgnoreCase("apple")) {
                System.out.println(1.25 * quantity);
            }
            if (fruit.equalsIgnoreCase("orange")) {
                System.out.println(0.90 * quantity);
            }
            if (fruit.equalsIgnoreCase("grapefruit")) {
                System.out.println(1.60 * quantity);
            }
            if (fruit.equalsIgnoreCase("kiwi")) {
                System.out.println(3.00 * quantity);
            }
            if (fruit.equalsIgnoreCase("pineapple")) {
                System.out.println(5.60 * quantity);
            }
            if (fruit.equalsIgnoreCase("grapes")) {
                System.out.println(4.20 * quantity);
            }
        } if ((!allfruits) || (!workingdays) || (!holidays)) {
            System.out.println("error");
        }
    }
}
