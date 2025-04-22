/*Проверить, является ли массив возрастающей последовательностью (каждое
следующее число больше предыдущего).
 */

package HomeWork_3;

import java.util.Scanner;

public class HomeWork_3_6 {
    public static void main(String[] args) {
        //  каждый элемент массива вводится пользователем вручную
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите размер массива: ");
//        int num = scanner.nextInt();
//        int[] array = new int[num];
//        System.out.println("Введите элементы, количество которых равно размеру массива:");
//        for (int i = 0; i < num; i++) {
//            array[i] = scanner.nextInt();
//        }
        // Проверяем, является ли массив возрастающей последовательностью
//        boolean isIncreasing = true;
//        for (int i = 1; i < num; i++) {
//            if (array[i] <= array[i - 1]) {
//                isIncreasing = false;
//                break;
//            }
//        }
//        if (isIncreasing) {
//            System.out.println("Массив является возрастающей последовательностью.");
//        } else {
//            System.out.println("Массив НЕ является возрастающей последовательностью.");
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
        // Проверяем, является ли массив возрастающей последовательностью
        boolean isIncreasing = true;
        for (int i = 1; i < num; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing) {
            System.out.println("Массив является возрастающей последовательностью.");
        } else {
            System.out.println("Массив НЕ является возрастающей последовательностью.");
        }
        scanner.close();
    }
}