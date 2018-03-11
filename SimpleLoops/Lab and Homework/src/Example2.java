public class Example2 {
    public static void main(String[] args) {
//        String a = "1";
//        System.out.println(a++); // izpolzva se samo za chisla i char

//        double a = 1.4;
//        System.out.println(++a); // 2.4

        int a = 1;
        int b = 1;

        System.out.println(--a + b--); //1
        System.out.println(a-- + ++b); //1
        System.out.println(a); //-1
    }

}
