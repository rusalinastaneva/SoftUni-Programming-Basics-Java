import java.util.Scanner;

public class ClassExamples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double age = Double.parseDouble(scan.nextLine());

        char gender = scan.next().charAt(0);

        if ('f' == gender) {
            if (age < 16) {
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }

        } else {
            if ('m' == gender) {
                if (age < 16) {
                    System.out.println("Master");
                } else {
                    System.out.println("Mr.");
                }
            }
        }
    }
}
