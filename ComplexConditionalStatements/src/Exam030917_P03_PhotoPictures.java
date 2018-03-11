import java.util.Scanner;

public class Exam030917_P03_PhotoPictures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantity = Integer.parseInt(scan.nextLine());
        String typePhoto = scan.nextLine();
        String orderType = scan.nextLine();
        double price = 0;

        if (typePhoto.equals("9X13") && orderType.equals("office")) {
            if ((quantity >= 50)) {
                System.out.printf("%.2fBGN", 0.16 * 0.95 * quantity);
            }
            if ((quantity < 50)) {
                System.out.printf("%.2fBGN", 0.16 * quantity);
            }
        } else if (typePhoto.equals("9X13") && orderType.equals("online")) {
            if (quantity >= 50) {
                System.out.printf("%.2fBGN", (0.16 * 0.95)*0.98 * quantity);
            }
            if (quantity < 50) {
                System.out.printf("%.2fBGN", 0.16 * 0.98 * quantity);
            }
        }

        if (typePhoto.equals("10X15") && orderType.equals("online")) {
            if ((quantity >= 80)) {
                System.out.printf("%.2fBGN", (0.16 * 0.97)*0.98 * quantity);
            }
            if (quantity < 80) {
                System.out.printf("%.2fBGN", 0.16 * 0.98 * quantity);
            }
        } else if (typePhoto.equals("10X15") && orderType.equals("office")) {
            if ((quantity >= 80)) {
                System.out.printf("%.2fBGN", 0.16 * 0.97 * quantity);
            }
            if (quantity < 80) {
                System.out.printf("%.2fBGN", 0.16 * quantity);
            }
        }
        if (typePhoto.equals("13X18") && orderType.equals("office")) {
            if ((quantity >= 50 && quantity <= 100)) {
                System.out.printf("%.2fBGN", 0.38 * 0.97 * quantity);
            }
            if ((quantity > 100)) {
                System.out.printf("%.2fBGN", 0.38 * 0.95 * quantity);
            }
            if ((quantity < 50)) {
                System.out.printf("%.2fBGN", 0.38 * quantity);
            }
        } else if (typePhoto.equals("13X18") && orderType.equals("online")) {
            if ((quantity >= 50 && quantity <= 100)) {
                System.out.printf("%.2fBGN", (0.38 * 0.97)*0.98 * quantity);
            }
            if ((quantity > 100)) {
                System.out.printf("%.2fBGN", (0.38 * 0.95)*0.98 * quantity);
            }
            if ((quantity < 50)) {
                System.out.printf("%.2fBGN", 0.38 * 0.98 * quantity);
            }
        }
        if (typePhoto.equals("20X30") && orderType.equals("office")) {
            if ((quantity >= 10 && quantity <= 50)) {
                System.out.printf("%.2fBGN", 2.90 * 0.93 * quantity);
            }
            if ((quantity > 50)) {
                System.out.printf("%.2fBGN", 2.90 * 0.91 * quantity);
            }
            if ((quantity < 10)) {
                System.out.printf("%.2fBGN", 2.90 * quantity);
            }
        } else if (typePhoto.equals("20X30") && orderType.equals("online")) {
            if ((quantity >= 10 && quantity <= 50)) {
                System.out.printf("%.2fBGN", (2.90 * 0.93)*0.98 * quantity);
            }
            if ((quantity > 50)) {
                System.out.printf("%.2fBGN", (2.90 * 0.91)*0.98 * quantity);
            }
            if ((quantity < 10)) {
                System.out.printf("%.2fBGN", 2.90 * 0.98 * quantity);
            }
        }

    }
}










