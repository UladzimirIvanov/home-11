package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
        значений их длины.*/
        Scanner scanner = new Scanner(System.in);

        String[] array = new String[3];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите строку " + (i + 1));
            array[i] = scanner.nextLine();
        }

        boolean sorted = false;
        String temp;
        while (sorted == false) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].length() > array[i + 1].length()) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
