import java.util.Scanner;

public class Exam201116Morning_P06_Battles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int maxBattles = Integer.parseInt(scanner.nextLine());
int counter=0;
        for (int i = 1; i <=num1 ; i++) {
            for (int j = 1; j <=num2 ; j++) {
                if (counter ==maxBattles){
                    break;
                }
                counter++;
                System.out.printf("(%d <-> %d) ", i,j);
            }
        }
    }
}
