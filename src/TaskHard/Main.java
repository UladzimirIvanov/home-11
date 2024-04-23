package TaskHard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Дана строка произвольной длины с произвольными словами. Написать программу для
        проверки является ли любое выбранное слово в строке палиндромом.
        Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е
        слово в этой строке палиндромом.
        Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например,
        в строке 5 слов, а на вход программе передали число 500*/

        Scanner scanner = new Scanner(System.in);
        boolean result = false;
        ;

        System.out.println("Введите вашу строку:");
        String userLine = scanner.nextLine();
        System.out.println("Укажите цифрой слово, которое необходимо проверить:");

        String[] lineWords = userLine.split(" ");

        //Проверка на входные данные
        while (scanner.hasNextInt()) {
            int userChoice = scanner.nextInt();
            if ((userChoice <= 0) || (userChoice > lineWords.length)) {
                System.out.println("Введены некорректные данные, попробуйте ещё");
            } else {
                //Слово выбранное пользователем разбивается на символы
                char[] oneWord = lineWords[userChoice - 1].toCharArray();
                //Сравнение первого и последнего символа, второго и предпоследнего и тд
                for (int i = 0, j = oneWord.length - 1; i < oneWord.length / 2 && j >= oneWord.length / 2; i++, j--) {
                    if (oneWord[i] != oneWord[j]) {
                        System.out.println("Слово " + lineWords[userChoice - 1] + " не является палиндромом");
                        return;
                    } else {
                        result = true;
                    }
                }
                if (result == true) {
                    System.out.println("Слово " + lineWords[userChoice - 1] + " палиндром");
                }
            }
        }
        System.out.println("Введены некорректные данные, попробуйте снова");
    }
}