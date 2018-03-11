import java.util.Scanner;

public class P05_InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        boolean validnumber = num ==0 || num <=200 && num >=100;

        if (!validnumber) {
            System.out.println("invalid");
        }
    }
}
//        int isFirst = 1;
//        int isSecond = 0;
//        System.out.println(isFirst & isSecond); // da se vnimava s logicheskite operatori
//
//    }
//}
