//import java.util.Scanner;
//
//public class P16_Number1To100ToText {
//
//    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//
//        int num = Integer.parseInt(console.nextLine());
//        if (num < 0 || num > 100) {
//            System.out.println("invalid number");
//            return; // programata spira do tuk
//        }
//        String result = "";
//        int D = num/10; // desetitsi
//        int E = num%10; // edinitsi
//        if (D==2) {
//            result="twenty";
//        } else if (D==3) {
//            result = "thirty";
//        } else if (D==4) {
//            result = "forty";
//        }  else if (D==5) {
//        result = "fifty";
//        }  else if (D==6) {
//            result = "sixty";
//        }  else if (D==7) {
//            result = "seventy";
//        }  else if (D==8) {
//            result = "eighty";
//        }  else if (D==9) {
//            result = "ninety";
//        }  else if (D==10) {
//            System.out.println("one hundred");
//        }
//        if (!result.equals("")) && E != 0) {
//    result+= " ";
//        }
//        if (E==1) {
//            result += "one";
//        } else if (E==2) {
//            result +="two";
//        } else if (E==3) {
//            result +="three";
//        } else if (E==4) {
//            result +="four";
//        } else if (E==5) {
//            result +="five";
//        } else if (E==6) {
//            result +="six";
//        } else if (E==7) {
//            result +="seven";
//        } else if (E==8) {
//            result +="eight";
//        } else if (E==9) {
//            result +="nine";
//        }
//        if (num = 10) {
//            System.out.println("ten");
//} else if (num = 11) {
//
//        }
//    }
//}
