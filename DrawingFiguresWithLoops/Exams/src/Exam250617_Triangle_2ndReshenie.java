import java.util.Scanner;

public class Exam250617_Triangle_2ndReshenie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int w = 4 * n + 1;
        int h = 2 * n + 1;
        System.out.println(repeatStr("#", w));
        int counterSpace = 1;

        for (int i = 1; i <= h-1; i++) {
            if (i <= n) {
                if (i!=n/2+1) {
                    System.out.printf("%s%s%s%s%s%n",
                            repeatStr(".", i),
                            repeatStr("#", (w - (2 * i + counterSpace)) / 2),
                            repeatStr(" ", counterSpace),
                            repeatStr("#", (w - 2 * i - counterSpace) / 2),
                            repeatStr(".", i));
                } else {
                    System.out.printf("%s%s%s%s%s%n",
                            repeatStr(".", i),
                            repeatStr("#", (w - (2 * i + counterSpace)) / 2),
                            repeatStr(" ", (counterSpace -3)/2) +
                                    "(@)" +
                                    repeatStr(" ", (counterSpace -3)/2) ,
                            repeatStr("#", (w - 2 * i - counterSpace) / 2),
                            repeatStr(".", i));
                }
                counterSpace += 2;
            } else {
                System.out.printf("%s%s%s%n",
                        repeatStr(".",i),
                        repeatStr("#",w-2*i),
                        repeatStr(".",i));
            }

            }
        }



    static String repeatStr(String text, int countToRepeat) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {
            result.append(text);
        }
        return result.toString();
    }
}