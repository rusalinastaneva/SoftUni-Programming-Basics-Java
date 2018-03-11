import java.util.Scanner;

public class Exam_230717_Cup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int w = 5 * n;
        int diesis = 3 * n;
        int dots = n;
        int mid = 0;
        System.out.println(repeatStr(".", dots) + repeatStr("#", diesis) + repeatStr(".", dots));
        for (int i = 1; i < n / 2; i++) {
            dots++;
            diesis -= 2;
            System.out.println(repeatStr(".", dots) + repeatStr("#", diesis) + repeatStr(".", dots));
        }
        dots = ((5 * n - 2) - (2 * n - 2)) / 2;
        mid = 2 * n - 2;
        System.out.println(repeatStr(".", dots) + "#" + repeatStr(".", mid)
                + "#" + repeatStr(".", dots));
        for (int i = 1; i < n / 2 + 1; i++) {
            dots = dots + 1;
            mid -= 2;
            System.out.println(repeatStr(".", dots) + "#"
                    + repeatStr(".", mid) + "#" // n - 2 - 2 * (dash))
                    + repeatStr(".", dots));
        }
        System.out.println(repeatStr(".",2*n)+repeatStr("#",n)+repeatStr(".",2*n));
        for (int i = 0; i <n/2 ; i++) {
            System.out.println(repeatStr(".",(5*n - n-4)/2)+repeatStr("#",n+4)+repeatStr(".",(5*n - n-4)/2));
        }
        System.out.println(repeatStr(".",(5*n -10)/2)+"D^A^N^C^E^" + repeatStr(".",(5*n -10)/2));
        for (int i = 0; i <=n/2 ; i++) {
            System.out.println(repeatStr(".",(5*n - n-4)/2)+repeatStr("#",n+4)+repeatStr(".",(5*n - n-4)/2));
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
