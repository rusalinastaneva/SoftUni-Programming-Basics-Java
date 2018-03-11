import java.util.Scanner;

public class Exam060316_P06_StupidPasword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (char k = 97; k < 97+l; k++) {
                    for (char m = 97; m <97+l; m++) {
                        for (int o = Math.max(i,j)+1; o <= n; o++) {

                            System.out.printf("%d%d%c%c%d ",i,j,k,m,o);
                        }
                    }
                }
            }
        }
    }
}
