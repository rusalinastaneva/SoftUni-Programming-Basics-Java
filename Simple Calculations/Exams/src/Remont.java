import java.util.Scanner;
public class Remont {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int N = Integer.parseInt(console.nextLine());

        double W = Double.parseDouble(console.nextLine());
        double L = Double.parseDouble(console.nextLine());

        int M = Integer.parseInt(console.nextLine());
        int O = Integer.parseInt(console.nextLine());

        double playfield = N * N;
        double plate = W * L;
        double bench = M * O;
        double area = playfield - bench;
        double numplates = area / plate;
        double t =  numplates * 0.20;
        System.out.printf("%n %.2f", numplates);
        System.out.printf("%n %.2f", t);
    }
}


