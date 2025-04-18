//Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести
//«Warm».
//Если –5>= t >–20, то вывести «Normal». Если –20>= t, то вывести «Cold».

package HomeWork_2;

import java.util.Scanner;

public class HomeWork_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру");
        double t = scanner.nextDouble();
        if (t > -5) {
            System.out.println("Warm");
        } else if (t >= -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
        scanner.close();
    }
}