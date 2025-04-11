package HomeWork_1;
// второй вариант
public class HomeWork_1_6_1 {
        public static void main(String[] args) {
            int a = 5;
            int b = 3;
            // меняем местами пошагово
            a = a + b;
            b = a - b;
            a = a - b;
            // меняем местами в одну строчку.
            a = a + b - (b = a);
            // меняем местами пошагово с помощью XOR
            a = a ^ b;
            b = b ^ a;
            a = a ^ b;
            System.out.println(a);
            System.out.println(b);
        }
}
