import java.util.Scanner;

public class P07_SumSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int firstcompetitor = Integer.parseInt(console.nextLine());
        int secondcompetitor = Integer.parseInt(console.nextLine());
        int thirdcompetitor = Integer.parseInt(console.nextLine());
        int allseconds = firstcompetitor + secondcompetitor + thirdcompetitor;

        int minutes = allseconds / 60;
        int seconds = allseconds % 60;

        if (seconds < 10) {
            System.out.println(minutes + ":0" + seconds);
        } else {
            System.out.println(minutes + ":" + seconds);
        }
    }
}


