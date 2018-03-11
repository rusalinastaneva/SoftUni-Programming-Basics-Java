import java.util.Scanner;

public class P01_RectangleOf10x10Stars {
    public static void main(String[] args) {

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//        Scanner scan = new Scanner(System.in);
//        int n = Integer.parseInt(scan.nextLine());


