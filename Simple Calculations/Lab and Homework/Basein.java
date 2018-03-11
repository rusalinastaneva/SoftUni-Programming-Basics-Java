import java.text.DecimalFormat;
import java.util.Scanner;

public class Basein {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.####");
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());
        double totalFilledWater = H * p1 + H * p2;
            if (totalFilledWater>v) {
                System.out.printf("For %s hours the pool overflows with %.1f liters.", df.format(H), totalFilledWater - v);
            } else  {
                System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.", Math.floor(totalFilledWater/v *100), Math.floor(p1*H/totalFilledWater*100), Math.floor(p2*H/totalFilledWater*100));
        }

    }
}
