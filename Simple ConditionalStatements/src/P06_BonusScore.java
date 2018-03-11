import java.util.Scanner;

public class P06_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double bonusscores = 0;

        if (num <= 100) {
            bonusscores = 5;
        } else if (num < 1000) {
            bonusscores = (num * 20.0) / 100;
        } else {
            bonusscores = (num * 10.0) / 100;
        }

        if (num % 2 ==0) {
            bonusscores = bonusscores + 1;
        } else  if (num % 5 ==0) {
            bonusscores = bonusscores + 2;
        }
        System.out.println(bonusscores);
        System.out.println(num + bonusscores);

    }
}
// if (num % 10 ==5) {
//bonusscores = bonusscores + 2;