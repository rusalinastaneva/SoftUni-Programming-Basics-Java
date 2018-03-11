import java.text.DecimalFormat;
import java.util.Scanner;

public class P17_ThreeBrothers {
    public static void main(String[] args) {
        double a = 0000222.5670;
        double b = -102.000;

//        System.out.println(Math.floor(2)); // закръгля към по-малкото цяло число

//        System.out.println((int)b); // kastvane na b, otrqzva desetichnata chast; otpechatva - 12
//
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("31033.##"); // premahva neznacheshtite 0
        System.out.println(df.format(a));
        System.out.println(df.format(b));


    }
}
