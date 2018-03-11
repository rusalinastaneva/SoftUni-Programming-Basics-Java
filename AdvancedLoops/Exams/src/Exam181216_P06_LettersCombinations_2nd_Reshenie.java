import java.util.Scanner;

public class Exam181216_P06_LettersCombinations_2nd_Reshenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        char lose = scanner.nextLine().charAt(0);

        int counter=0;

        for (int i = start; i <=end ; i++) {
            for (int j = start; j <=end ; j++) {
                for (int k = start; k <=end ; k++) {
                    if (lose==i || lose==j || lose==k) {
                        continue;
                    }
                    counter++;
                    System.out.printf("%c%c%c ", i, j, k);
                }
            }
        }
        System.out.println(counter);
    }
}
