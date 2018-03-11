import java.util.Scanner;

public class Exam181216_P06_LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String end = scanner.nextLine();
        String a = scanner.nextLine();

        int count = 0;
        String name = start + end + a;
        char start1 = name.charAt(0);
        char end1 = name.charAt(1);
        char a1 = name.charAt(2);


        for (char i = start1; i <= end1; i++) {
            for (char j = start1; j <= end1; j++) {
                for (char k = start1; k <= end1; k++) {
                    if (i == a1 || j == a1 || k == a1) {
                        continue;
                    }
                    count++;
                    System.out.print((char) i + "" + (char) j + "" + (char) k + " ");
                }
            }
        }
        System.out.println(count);
    }
}

