package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
        найденные строки и их длину.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку и нажмите Enter");
        String firstUserInput = scanner.nextLine();
        System.out.println("Введите вторую строку и нажмите Enter");
        String secondtUserInput = scanner.nextLine();
        System.out.println("Введите третью строку и нажмите Enter");
        String thirdUserInput = scanner.nextLine();
        System.out.println("Первая строка: " + firstUserInput + "\nДлина первой строки: " + firstUserInput.length());
        System.out.println();
        System.out.println("Вторая строка: " + secondtUserInput + "\nДлина второй строки: " + secondtUserInput.length());
        System.out.println();
        System.out.println("Третья строка: " + thirdUserInput + "\nДлина третьей строки: " + thirdUserInput.length());

    }
}
