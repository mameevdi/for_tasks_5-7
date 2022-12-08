public class Main {
    public static void main(String[] args) {
        task5();
        task6();
        task7();
    }

    public static void task5() {
        System.out.println("Задача 1"); //Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i+" год является високосным");
        }
        System.out.println();
    }
    public static void task6() {
        System.out.println("Задача 2"); //Напишите программу, которая выводит в консоль последовательность чисел: 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println();
    }
    public static void task7() {
        System.out.println("Задача 3"); //Напишите программу, которая выводит в консоль последовательность чисел: 1 2 4 8 16 32 64 128 256 512
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }
}