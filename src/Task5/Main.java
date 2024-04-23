package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*5. Вывести на консоль новую строку, которой задублирована каждая буква из
        начальной строки. Например, "Hello" -> "HHeelllloo".*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу строку:");
        //String userLine = scanner.nextLine();
        char[] userLetter = scanner.nextLine().toCharArray();

        for (char c : userLetter) {
            System.out.print(c + "" + c);
        }
    }
}
