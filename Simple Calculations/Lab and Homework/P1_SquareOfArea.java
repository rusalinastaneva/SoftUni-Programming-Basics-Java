import java.util.Scanner;

public class P1_SquareOfArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("a = ");
        int a = Integer.parseInt(console.nextLine());
        int area = a * a;
        System.out.println("Area of square = " + area);

    }
}
