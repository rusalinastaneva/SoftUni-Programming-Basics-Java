import java.util.Scanner;

public class P07_GreatestCommondDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        while (second != 0) {
            int oldB = second;
            second = first % second;
            first = oldB;
        }
        System.out.println(first);
    }
}
