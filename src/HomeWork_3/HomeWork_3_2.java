/*
Пользователь с клавиатуры вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта. После заполнения массива данными, решить для него следующие
задачи:

Найти минимальный - максимальный элементы и вывести в консоль.
 */

package HomeWork_3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class HomeWork_3_2 {
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
//        int maxValue = Arrays.stream(array).max().getAsInt();
//        System.out.println("Максимальный элемент массива: " + maxValue);
//        int minValue = Arrays.stream(array).min().getAsInt();
//        System.out.println("Минимальный элемент массива: " + minValue);
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
        int maxValue = Arrays.stream(array).max().getAsInt();
        System.out.println("Максимальный элемент массива: " + maxValue);
        int minValue = Arrays.stream(array).min().getAsInt();
        System.out.println("Минимальный элемент массива: " + minValue);
        scanner.close();
    }
}
