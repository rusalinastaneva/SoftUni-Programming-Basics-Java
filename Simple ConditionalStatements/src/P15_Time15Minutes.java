import java.util.Scanner;

public class P15_Time15Minutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hours = Integer.parseInt(console.nextLine());
        int minutes = Integer.parseInt(console.nextLine());

        int timePlusMinutes = (hours * 60) + minutes + 15;

        hours = timePlusMinutes / 60;

        if (hours>=24){
            hours = hours % 24;
        }
        minutes = timePlusMinutes % 60;

        System.out.printf("%d:%02d", hours, minutes);

//        int hours = Integer.parseInt(console.nextLine());
//        int minutes = Integer.parseInt(console.nextLine());
//
//        if ((minutes + 15) >= 59 && (minutes - 60) + 15 > 10 && hours == 23) {
//            System.out.println(("0:") + "" + ((minutes - 60) + 15));
//
//        } else if ((minutes + 15) > 59 && (minutes - 60) + 15 <= 10  && hours == 23) {
//            System.out.println(("0:") + "0" + ((minutes - 60) + 15));
//
//        } else if ((minutes + 15) >= 59 && (minutes - 60) + 15 >= 10 && hours < 23) {
//            System.out.println((hours + 1) + ":" + ((minutes - 60) + 15));
//        } else if ((minutes + 15) > 59 && (minutes - 60) + 15 < 10 && hours < 23) {
//            System.out.println((hours + 1) + ":0" + ((minutes - 60) + 15));
//
//        } else if ((minutes + 15) <= 59 && hours <= 23) {
//            System.out.println(hours + ":" + (minutes + 15));
//        } else if ((minutes + 15) == 60 && hours == 23) {
//            System.out.println("00:00");
//
//        }
    }
}



