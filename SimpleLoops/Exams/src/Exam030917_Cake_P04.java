import java.util.Scanner;

public class Exam030917_Cake_P04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int w = 0;
        int l = 0;
        int takenPieces = 0;
        int availPieces = 0;
        int allPieces = 0;

        int sumTakenPieces = 0;
        String command;
        w = Integer.parseInt(scan.nextLine());
        l = Integer.parseInt(scan.nextLine());

        for (int i = allPieces; i > -1; i = allPieces) {
            takenPieces = Integer.parseInt(scan.nextLine());
            command = scan.nextLine();

            allPieces = w * l;
            sumTakenPieces = sumTakenPieces + takenPieces;
            availPieces = allPieces - sumTakenPieces;

            if ((takenPieces < allPieces) || command.equals("stop")) {
                System.out.printf("%d pieces are left.", availPieces);
            } else {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(availPieces));

            }

        }

    }
}

