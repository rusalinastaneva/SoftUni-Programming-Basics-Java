import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam_030917_Snowflake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int h = 2*n +1;
        int w = 2*n +3;
        int dots =n;
        List<String> arr = new ArrayList<>();

        System.out.println("*" + repeatStr(".", n) + "*" +repeatStr(".", n) + "*");

        for (int i = 1; i < n-1; i++) {
            dots --;
            String line = repeatStr(".",i)+ "*" + repeatStr(".",dots) + "*"
                    + repeatStr(".",dots) + "*" + repeatStr(".",i);
                    arr.add(line);
            System.out.println(line);
        }
        System.out.println(repeatStr(".", n-1) + "*****" + repeatStr(".", n-1));
        System.out.println(repeatStr("*", 2*n+3));
        System.out.println(repeatStr(".", n-1) + "*****" + repeatStr(".", n-1));

        for (int i = arr.size()-1; i >= 0; i--) {
            System.out.println(arr.get(i));
        }
        System.out.println("*" + repeatStr(".", n) + "*" +repeatStr(".", n) + "*");
    }
    static String repeatStr(String text, int countToRepeat) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countToRepeat; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
