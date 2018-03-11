import java.util.Scanner;

public class P08_MetricConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double number = Double.parseDouble(console.nextLine());
        String inputmetric = console.next().toLowerCase();
        String outputmetric = console.next().toLowerCase();

        if (inputmetric.equals("mm")) {
            number = number / 1000;
        } else if (inputmetric.equals("cm")) {
            number = number / 100;
        } else if (inputmetric.equals("mi")) {
            number = number / 0.000621371192;
        } else if (inputmetric.equals("in")) {
            number = number / 39.3700787;
        } else if (inputmetric.equals("km")) {
            number = number / 0.001;
        } else if (inputmetric.equals("ft")) {
            number = number / 3.2808399;
        } else if (inputmetric.equals("yd")) {
            number = number / 1.0936133;
        } else if (inputmetric.equals("m")) {
            number = number;
        }
        if (outputmetric.equals("mm")) {
            number = number * 1000;
        } else if (outputmetric.equals("cm")) {
            number = number * 100;
        } else if (outputmetric.equals("mi")) {
            number = number * 0.000621371192;
        } else if (outputmetric.equals("in")) {
            number = number * 39.3700787;
        } else if (outputmetric.equals("km")) {
            number = number * 0.001;
        } else if (outputmetric.equals("ft")) {
            number = number * 3.2808399;
        } else  if (outputmetric.equals("yd")) {
            number = number * 1.0936133;
        } else if (outputmetric.equals("m")) {
            number = number;
        }
        System.out.printf("%.8f %s", number, outputmetric);
    }
}
