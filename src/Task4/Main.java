package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
        Если таких слов несколько, найти первое из них*/

        Scanner scanner = new Scanner(System.in);
        String[] arrayUserLine = new String[3];
        boolean compare = false;

        for (int i = 0; i < arrayUserLine.length; i++) {
            System.out.println("Введите строку " + (i + 1));
            arrayUserLine[i] = scanner.nextLine();
        }

        for (int i = 0; i < arrayUserLine.length; i++) {
            String[] arrayUserWordsInFirstLine = arrayUserLine[i].split(" ");
            for (int j = 0; j < arrayUserWordsInFirstLine.length; j++) {
                compare = false;
                //System.out.println(arrayUserWordsInFirstLine[j]);
                char[] arrSymbols = arrayUserWordsInFirstLine[j].toCharArray();
                for (int k = 0; k < arrSymbols.length; k++) {
                    //System.out.println(arrSymbols[k]);
                    for (int l = k + 1; l < arrSymbols.length; l++) {
                        if (arrSymbols[k] == arrSymbols[l]) {
                            //System.out.println("В строке " + arrayUserLine[i] + " в слове " + arrayUserWordsInFirstLine[j] + " Совпали символы " + arrSymbols[k] + " и " + arrSymbols[l]);
                            compare = true;
                            break;
                        }
                    }
                    if (compare == true) {
                        break;
                    }
                }
                if (compare == false) {
                    System.out.println("В строке " + "\"" + arrayUserLine[i] + "\"" + " в слове " + "\"" + arrayUserWordsInFirstLine[j] + "\"" + " нет повторяющихся символов");
                    return;
                }
            }
        }
    }
}