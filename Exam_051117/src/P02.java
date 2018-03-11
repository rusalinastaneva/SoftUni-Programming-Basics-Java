import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tomatoQty = Double.parseDouble(scan.nextLine());
        int numCases = Integer.parseInt(scan.nextLine());
        int numJar = Integer.parseInt(scan.nextLine());

        double totalLutenica = tomatoQty / 5;
        double jars = totalLutenica/0.535;
        double totalCases = jars/numJar;

        System.out.printf("Total lutenica: %.0f kilograms.%n",Math.floor(totalLutenica));
        if (totalCases>numCases) {
            System.out.printf("%.0f boxes left.%n",Math.floor(totalCases-numCases));
            System.out.printf("%.0f jars left.", Math.floor(jars-(numCases*numJar)));
        } else {
            System.out.printf("%.0f more boxes needed.%n", Math.floor(numCases-totalCases));
            System.out.printf("%.0f more jars needed.", Math.floor((numCases*numJar)-jars));

        }
    }
}
