/*Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
вывести сообщение, что их нет.
 */

package HomeWork_3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class HomeWork_3_4 {
    public static void main(String[] args) {
//        //    каждый элемент массива вводится пользователем вручную
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите размер массива ");
//        int num = scanner.nextInt();
//        int[] array = new int[num];
//        System.out.println("Введите элементы, количество которых равно размеру массива");
//        for (int i = 0; i < num; i++) {
//            array[i] = scanner.nextInt();
//        }
//        // Подсчитываем количество нулевых элементов
//        int zeroCount = 0;
//        for (int i = 0; i < num; i++) {
//            if (array[i] == 0) {
//                zeroCount++;
//            }
//        }
//        // Выводим результат
//        if (zeroCount > 0) {
//            System.out.println("Количество нулевых элементов: " + zeroCount);
//        } else {
//            System.out.println("Нулевых элементов нет.");
//        }
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
//      Подсчитываем количество нулевых элементов
        int zeroCount = 0;
        for (int i = 0; i < num; i++) {
            if (array[i] == 0) {
                zeroCount++;
            }
        }
//        Выводим результат
        if (zeroCount > 0) {
            System.out.println("Количество нулевых элементов: " + zeroCount);
        } else {
            System.out.println("Нулевых элементов нет.");
        }
        scanner.close();
    }
}