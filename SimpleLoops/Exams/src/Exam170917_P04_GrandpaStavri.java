import java.util.Scanner;

public class Exam170917_P04_GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double sumQty = 0;
        int sumDegree = 0;
        double alldegrees = 0;
        for (int i = 1; i <= n; i++) {
            double dailyQty = Double.parseDouble(scanner.nextLine());
            double dailyDegree = Double.parseDouble(scanner.nextLine());
            sumQty += dailyQty; //100; 100+50;
            sumDegree += dailyDegree * dailyQty; //45*100; 55*50+4500;
        }
        alldegrees = sumDegree / sumQty;
        System.out.printf("Liter: %.2f%n", sumQty);
        System.out.printf("Degrees: %.2f%n", alldegrees);

        if (alldegrees>42){
            System.out.println("Dilution with distilled water!");
        } else if (alldegrees<38) {
            System.out.println("Not good, you should baking!");
        } else {
            System.out.println("Super!");
        }
    }
}
