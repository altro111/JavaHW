import java.util.Arrays;

public class hw3 {
    public static void main(String[] args) {
        sumArray();
        System.out.println(); // 1.
        arrayFill();
        System.out.println(); // 2.
        multipArray();
        System.out.println(); //3.
        sqareArray(1);
        System.out.println(); //4.
        System.out.println(Arrays.toString(returnArray(5, 3)));



    }

    //1.
    public static void sumArray() {
        int[] arrayForSumOrigin = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Это изменённые значения массива - ");
        for (int i = 0; i < arrayForSumOrigin.length; i++) {
            if (arrayForSumOrigin[i] == 1) {
                arrayForSumOrigin[i] = 0;
            } else {
                arrayForSumOrigin[i] = 1;
            }
            System.out.print(arrayForSumOrigin[i]);
        }
    }

    //2.
    public static void arrayFill() {
        int[] arrayEmpty = new int[100];
        System.out.print("Это Заполненный массив - ");
        for (int i = 0; i < arrayEmpty.length; i++) {
            arrayEmpty[i] = i + 1;
            System.out.print(arrayEmpty[i] + " ");
        }
    }

    //3.
    public static void multipArray() {
        int[] arrayForMultip = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Это массив с умножением - ");
        for (int i = 0; i < arrayForMultip.length; i++) {
            if (arrayForMultip[i] < 6) {
                arrayForMultip[i] = arrayForMultip[i] * 2;
            }
            System.out.print(arrayForMultip[i] + " ");
        }
    }

    //4.
    public static void sqareArray(int args) {
        int[][] arrayForSqare = new int[4][4];
        System.out.println("Массив заполнен по диагонали :");
        for (int i = 0; i < arrayForSqare.length; i++) {
            for (int j = 0; j <= i; j++) {
                arrayForSqare[i][j] = args;
                System.out.print(arrayForSqare[i][j] + " ");
            }
            System.out.println();
        }
    }

    //5.
    public static int[] returnArray(int len, int initialValue) {
        System.out.println("Возвращяется этот массив :");
        int[] arrayForReturn = new int[len];
        for (int i = 0; i < len; i++) {
            arrayForReturn[i] = initialValue;
        }
        return arrayForReturn;
    }

    //6.

   /* private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
*/

    }






/*
1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;
        2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        6. * Задать одномерный массив и найти в нем минимальный и максимальный значения элементов; !!! ВСЕ ЗАДАНИЯ ОФОРМЛЯЮТСЯ В МЕТОДАХ !!!*/
