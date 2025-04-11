package HomeWork_1;

public class HomeWork_1_6 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
/*
* Мы создаём дополнительную переменную.
* Передаём ей временно для хранения значение A, в само
* A передаём значение B. В B присваиваем значение, которое у нас хранится
* во временной переменной.
*/
