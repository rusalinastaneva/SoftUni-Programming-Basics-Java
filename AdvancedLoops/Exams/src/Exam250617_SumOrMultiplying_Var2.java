import java.util.Scanner;

public class Exam250617_SumOrMultiplying_Var2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        int counter=0;
        for (int a = 1; a <= 30; a++) {
            for (int b = 1; b <= 30; b++) {
                for (int c = 1; c <= 30; c++) {
                    if (n == a + b + c && (a < b && b < c)) {
                        check=true;
                        System.out.printf("%d + %d + %d = %d%n", a, b, c, n);
                        counter++;
                    } else if (n == a * b * c && (a > b && b > c)) {
                        check=true;
                        System.out.printf("%d * %d * %d = %d%n", a, b, c, n);
                        counter++;
                    }

                }
            }
        }
        if (counter==0){
            System.out.printf("No!");
        }
    }

}





