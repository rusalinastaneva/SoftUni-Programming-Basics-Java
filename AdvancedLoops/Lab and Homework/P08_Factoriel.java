import java.util.Scanner;

public class P08_Factoriel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int fact = 1;

        do {
            fact *= fact * n == 0 ? 1 : n; // ako e n=0 vurni 1, ako ne - vurni n;
            n--;

        } while (n > 0);
        System.out.println(fact);
    }
}

