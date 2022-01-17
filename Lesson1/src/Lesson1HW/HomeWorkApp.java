package Lesson1HW;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = -8;
        int b = 8;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor()  {
        int value = 100;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 > value || value >= 100 ) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers()  {
        int a = 0;
        int b = -1;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}

