import java.util.Scanner;

public class P12_Voleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String year = scan.nextLine();
        int p = Integer.parseInt(scan.nextLine()); // broi praznici
        int h = Integer.parseInt(scan.nextLine()); // broi uikendi, v koito patuva

        double GamesInSf = (48 - h) * 3.0 / 4;
        int GamesInHome = h;
        double GamesinPr = p * 2.0 / 3;
        double allGames = GamesInSf + GamesInHome + GamesinPr;

        if (year.equalsIgnoreCase("leap")) {
            System.out.println(Math.floor(allGames * 0.15 + allGames));
        } else if (year.equalsIgnoreCase("normal")) {
            System.out.println(Math.floor(allGames));
        }
    }

}
