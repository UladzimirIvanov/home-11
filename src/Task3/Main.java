package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
        средней, а также их длину*/
        Scanner scanner = new Scanner(System.in);

        String[] array = new String[3];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите строку " + (i + 1));
            array[i] = scanner.nextLine();
            System.out.println("Длинна: " + array[i].length());
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < array[array.length / 2].length()) {
                System.out.println(array[i] + " Длинна строки: " + array[i].length());
            }
        }
    }
}
