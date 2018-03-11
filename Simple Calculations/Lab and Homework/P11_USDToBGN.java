import java.util.Scanner;

public class P11_USDToBGN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("USD: ");
        double usd = Double.parseDouble(console.nextLine());
        System.out.printf("%.2f BGN", usd * 1.79549);
    }
}
