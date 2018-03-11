import java.util.Scanner;

public class P01_Money {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bitcoin = Integer.parseInt(scan.nextLine());
        double chYuan = Double.parseDouble(scan.nextLine());
        double comission = Double.parseDouble(scan.nextLine());
        double bitcoinLv = bitcoin*1168;
        double chYuanLV  = (chYuan*0.15)*1.76;
        double totalEvro = (chYuanLV+bitcoinLv)/1.95;
        double result = totalEvro -(totalEvro*(comission*0.01));

        System.out.printf("%.2f",result);

    }
}
