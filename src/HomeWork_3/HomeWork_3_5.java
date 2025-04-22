/*Пройти по массиву и поменять местами элементы первый и последний, второй
и предпоследний и т.д.
 */
package HomeWork_3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class HomeWork_3_5 {
    public static void main(String[] args) {
        //    каждый элемент массива вводится пользователем вручную
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите размер массива: ");
//        int num = scanner.nextInt();
//        int[] array = new int[num];
//        System.out.println("Введите элементы, количество которых равно размеру массива:");
//        for (int i = 0; i < num; i++) {
//            array[i] = scanner.nextInt();
//        }
        // Меняем местами элементы массива
//        for (int i = 0; i < num / 2; i++) {
//            int temp = array[i];
//            array[i] = array[num - 1 - i];
//            array[num - 1 - i] = temp;
//        }
        // Выводим измененный массив
//        System.out.print("Массив после замены: ");
//        for (int i = 0; i < num; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        scanner.close();
//    }
//}
//      используется  Math.random()
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int num = scanner.nextInt();
        int[] array = new int[num];
        System.out.print("Элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        } System.out.println();
        // Меняем местами элементы массива
        for (int i = 0; i < num / 2; i++) {
            int temp = array[i];
            array[i] = array[num - 1 - i];
            array[num - 1 - i] = temp;
        }
        // Выводим измененный массив
        System.out.print("Массив после замены: ");
        for (int i = 0; i < num; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}