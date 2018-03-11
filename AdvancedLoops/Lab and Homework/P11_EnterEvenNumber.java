import java.util.Scanner;

public class P11_EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter even number: ");
        int n = Integer.parseInt(scanner.nextLine());

        while (n % 2 != 0) {
            System.out.println("Invalid number!");
            System.out.print("Enter even number: ");
            n = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Even number entered: " + n);
    }

}

