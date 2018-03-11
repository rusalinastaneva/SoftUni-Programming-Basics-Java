public class Example3 {
    public static void main(String[] args) {

        int a = 2;
        int b = 1;

        System.out.println(a++ + ++b - --a); // 2+2-2=2
        System.out.println(--a + b++ - --b - a--); // -3 + 2 - 2 - (-3) = 0;
        System.out.println(++a - ++b + a++ - --b); // -3 - -1 -3 - -2 = -3;
    }
}
