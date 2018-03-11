
import java.util.Scanner;

public class Exam230717_GroupName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bigL = scanner.nextLine().toUpperCase();
        String smallL1 = scanner.nextLine().toLowerCase();
        String smallL2 = scanner.nextLine().toLowerCase();
        String smallL3 = scanner.nextLine().toLowerCase();
        String n = scanner.nextLine();
        int count = 0;
        String name = bigL + smallL1 + smallL2 + smallL3 + n;

        char bigLet = name.charAt(0);
        char smallLet1 = name.charAt(1);
        char smallLet2 = name.charAt(2);
        char smallLet3 = name.charAt(3);
        char num = name.charAt(4);


        for (char i = 'A'; i <= bigLet ; i++) {
            for (char j = 'a'; j <= smallLet1; j++) {
                for (char k = 'a'; k <= smallLet2; k++) {
                    for (char l = 'a'; l <= smallLet3; l++) {
                        for (char m = '0'; m <= num; m++) {
                            count++;
                        }
                    }

                }
            }

        }
        System.out.println(count-1);
    }

}

