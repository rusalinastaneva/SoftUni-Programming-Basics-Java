import java.util.Scanner;

public class P13_GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        double qtyPerDay = 0;
        double degreePerDay = 0;
        double qtySum = 0;
        double qtyXDegree = 0;
        double qtySumXDegree = 0;
        double allDegrees = 0;

        for (int i = 1; i <= N; i++) {
            qtyPerDay = Double.parseDouble(scanner.nextLine());
            degreePerDay = Double.parseDouble(scanner.nextLine());
            qtySum = qtySum + qtyPerDay; //100; 100+50
            qtyXDegree = qtyPerDay * degreePerDay; // 100*45; 50*55
            qtySumXDegree = qtySumXDegree + qtyXDegree; // 100*45 +0; 4500 + 50*55
        }
        allDegrees = qtySumXDegree / qtySum; // 4500/100
        System.out.printf("Liter: %.2f%n", qtySum);
        System.out.printf("Degrees: %.2f%n", allDegrees);

        if (allDegrees > 42) {
            System.out.println("Dilution with distilled water!");
        } else if (allDegrees < 38) {
            System.out.println("Not good, you should baking!");
        } else {
            System.out.println("Super!");
        }

    }
}