//Найти индексы минимального и максимального элементов и вывести в консоль.

package HomeWork_3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class HomeWork_3_3 {
    public static void main(String[] args) {
        //    каждый элемент массива вводится пользователем вручную
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите размер массива ");
//        int num = scanner.nextInt();
//        int[] array = new int[num];
//        System.out.println("Введите элементы, количество которых равно размеру массива");
//        for (int i = 0; i < num; i++) {
//            array[i] = scanner.nextInt();
//        }
        // Находим индексы минимального и максимального элементов
//        int minIndex = 0;
//        int maxIndex = 0;
//
//        for (int i = 1; i < num; i++) {
//            if (array[i] < array[minIndex]) {
//                minIndex = i;
//            }
//            if (array[i] > array[maxIndex]) {
//                maxIndex = i;
//            }
//        }
//        System.out.println("Индекс минимального элемента: " + minIndex);
//        System.out.println("Индекс максимального элемента: " + maxIndex);
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
        }
        System.out.println();
        // Находим индексы минимального и максимального элементов
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < num; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Индекс минимального элемента: " + minIndex);
        System.out.println("Индекс максимального элемента: " + maxIndex);
        scanner.close();
    }
}
