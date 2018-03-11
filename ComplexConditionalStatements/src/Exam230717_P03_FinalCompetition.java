import java.util.Scanner;

public class Exam230717_P03_FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double scores = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();
        double netPrize = 0;
        if (place.equalsIgnoreCase("Bulgaria") && season.equalsIgnoreCase("Summer")) {
            netPrize = scores * n - scores * n * 0.05;
        } else if (place.equalsIgnoreCase("Abroad") && season.equalsIgnoreCase("Summer")) {
            netPrize = (scores * n * 1.50) - (scores * n * 1.50) * 0.10;
        }
        if (place.equalsIgnoreCase("Bulgaria") && season.equalsIgnoreCase("Winter")) {
            netPrize = scores * n - scores * n * 0.08;
        } else if (place.equalsIgnoreCase("Abroad") && season.equalsIgnoreCase("Winter")) {
           netPrize = (scores * n * 1.50) - (scores * n * 1.50) * 0.15;
        }
        double charity = netPrize*0.75;
        System.out.printf("Charity - %.2f%n", charity);
        System.out.printf("Money per dancer - %.2f", (netPrize - charity)/n);

    }

}

