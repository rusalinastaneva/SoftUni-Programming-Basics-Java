import java.util.Scanner;

public class Exam240416_Stop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int dots = n;

        System.out.println(repeatStr(".",n+1) +
                repeatStr("_",2*n+1)+
                repeatStr(".",n+1));

        int dash = 4*n+3 -4 - 2*n;
        System.out.println(repeatStr(".",dots) + "//"+
                repeatStr("_",dash)+
                "\\\\"+repeatStr(".",dots));

        for (int i = 1; i <n; i++) {
            dots--;
            dash+=2;
            System.out.println(repeatStr(".",dots) + "//"+repeatStr("_",dash)+
            "\\\\"+repeatStr(".",dots));
        }
        System.out.println("//"+repeatStr("_",2*n-3)+ "STOP!"+repeatStr("_",2*n-3)+
                "\\\\");

        for (int i = 0; i <=n-1 ; i++) {
            System.out.println(repeatStr(".", i) +"\\\\"+repeatStr("_",4*n+3-4 -2*i) +"//"+repeatStr(".", i));
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
