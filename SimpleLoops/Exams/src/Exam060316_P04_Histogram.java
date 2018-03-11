import java.util.Scanner;

public class Exam060316_P04_Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = Double.parseDouble(scan.nextLine());

        int counterp1 = 0;
        int counterp2 = 0;
        int counterp3 = 0;
        int counterp4 = 0;
        int counterp5 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num < 200) {
                counterp1++;
            } else if (num <= 399){
                counterp2++;
            } else if (num<=599){
                counterp3++;
                } else if (num<=799) {
                counterp4++;
            } else {
                counterp5++;
            }
        }
        double p1=(double)counterp1/n*100;
        double p2=(double)counterp2/n*100;
        double p3=(double)counterp3/n*100;
        double p4=(double)counterp4/n*100;
        double p5=(double)counterp5/n*100;

        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%%n",p3);
        System.out.printf("%.2f%%%n",p4);
        System.out.printf("%.2f%%%n",p5);

    }
}
