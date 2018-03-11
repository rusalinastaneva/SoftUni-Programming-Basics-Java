import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int bitcoins = Integer.parseInt(console.nextLine());
        double yuans = Double.parseDouble(console.nextLine());
        double commision = Double.parseDouble(console.nextLine()) / 100;

        double bitcointoleva = bitcoins * 1168;
        double yantodollar = yuans * 0.15;
        double dollartoleva = yuans * 0.15 * 1.76;

        double income = (bitcoins * 1168) + (yuans * 0.15 * 1.76);
        double money = (income - commision * income) / 1.95;
        System.out.printf("%.2f", money);
    }
}
