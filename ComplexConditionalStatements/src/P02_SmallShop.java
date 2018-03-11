import java.util.Scanner;

public class P02_SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String town = scan.nextLine();
        Double quantity = Double.parseDouble(scan.nextLine());

        if (town.equalsIgnoreCase("Sofia")) {
            if (product.equals("coffee")) {
                System.out.println(0.50 * quantity);
            } else if (product.equals("water")) {
                System.out.println(0.80 * quantity);
            } else if (product.equals("beer")) {
                System.out.println(1.20 * quantity);
            } else if (product.equals("sweets")) {
                System.out.println(1.45 * quantity);
            } else if (product.equals("peanuts")) {
                System.out.println(1.60 * quantity);
            }
        }
        if (town.equalsIgnoreCase("Plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(0.40 * quantity);
            } else if (product.equals("water")) {
                System.out.println(0.70 * quantity);
            } else if (product.equals("beer")) {
                System.out.println(1.15 * quantity);
            } else if (product.equals("sweets")) {
                System.out.println(1.30 * quantity);
            } else if (product.equals("peanuts")) {
                System.out.println(1.50 * quantity);
            }
        }
        if (town.equalsIgnoreCase("Varna")) {
            if (product.equals("coffee")) {
                System.out.println(0.45 * quantity);
            } else if (product.equals("water")) {
                System.out.println(0.70 * quantity);
            } else if (product.equals("beer")) {
                System.out.println(1.10 * quantity);
            } else if (product.equals("sweets")) {
                System.out.println(1.35 * quantity);
            } else if (product.equals("peanuts")) {
                System.out.println(1.55 * quantity);
            }
        }
    }
}