public class HW3 {
    public static void main(String[] args) {
        int[] arrayOrigin = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        changeArray(arrayOrigin);
        System.out.println("");


        int[] arrayLen100 = new int[100];
        metArrayLen100(arrayLen100);
        System.out.println("");


        int[] multip = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplication(multip);
        System.out.println();

        int n = 6;
        int[][] array = new int[n][n];

        createSquare(4);


    }


    public static void changeArray(int[] arrayOrigin) {
        System.out.print("Это изменённый массив : ");
        for (int i = 0; i < arrayOrigin.length; i++) {
            if (arrayOrigin[i] == 0) {
                arrayOrigin[i] = 1;
            } else {
                arrayOrigin[i] = 0;
            }
            System.out.print(arrayOrigin[i]);
        }
    }

    public static void metArrayLen100(int[] arrayLen100) {
        System.out.println("Заполнение массива значениями : ");
        for (int i = 0; i < arrayLen100.length; i++) {
            arrayLen100[i] = (i) + 1;
            System.out.print(" " + arrayLen100[i]);
        }
    }


    public static void multiplication(int[] multi) {
        System.out.print("После умножения : ");
        for (int i = 0; i < multi.length; i++) {
            if (multi[i] < 6) {
                multi[i] *= 2;
            }
            System.out.print(" " + multi[i]);
        }
    }


    public static void crossFill(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][i] = 1;
            System.out.println(array[i][i]);

        }
    }

    public static void createSquare(int n) {
        int[][] sqrArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sqrArray[i][j] = (i == j || j == (n - i - 1));
                System.out.print("", sqrArray[i][j]);
            }
            System.out.println();
        }
    }
}
  /*  int n = 4;
    int[][] array = new int[n][n];

for (int i = 0; i < n; i++) {
        array[i][i] = 1;
        array[i][n - i - 1] = 1;
        }*/




   // public static void main(String[] args) {

   // }
//}


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
