import java.util.Scanner;

public class Exam030917_P04_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int qty = w * l;

        int pieces = 0;
        while (!"STOP".equalsIgnoreCase(command)){
            pieces = Integer.parseInt(command);
            qty = qty - pieces;
            if(qty<0){
                System.out.printf("No more cake left! You need %d pieces more.",qty*-1);
                return;
            }
            command = scanner.nextLine();
        }
        System.out.printf("%d pieces are left.", qty);


    }
}
//        Scanner scanner = new Scanner(System.in);
//        int w = Integer.parseInt(scanner.nextLine());
//        int l = Integer.parseInt(scanner.nextLine());
//        int qty = w * l;
//
//        while (true){
//            String command = scanner.nextLine();
//            if (command.equals("STOP")) {
//                break;
//            }
//            int pieces = Integer.parseInt(command);
//            qty = qty-pieces;
//
//            if (qty <0) {
//                break;
//            }
//        }
//        if (qty<0) {
//            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(qty));
//        } else {
//            System.out.printf("%d pieces are left.", qty);
//        }

