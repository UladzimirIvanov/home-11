package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
        Если таких слов несколько, найти первое из них*/
        String userInput = "Helo";
        char[] arr = userInput.toCharArray();
        boolean compare = false;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("good i = " + arr[i] + " and j = " + arr[j]);
                    compare = true;
                    break;
                } else {
                    System.out.println("bad i = " + arr[i] + " and j = " + arr[j]);
                }
            }
            if (compare == true) {
                break;
            }
        }
        if (compare == false){
            System.out.println("Искомое слово: " + userInput);
        }
    }
}






        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/



















        /*Scanner scanner = new Scanner(System.in);
        String[] arrayWords = scanner.nextLine().split(" ");

        boolean compare = false;

        for (int i = 0; i < arrayWords.length; i++) {
            System.out.println(arrayWords[i]);

            char[] arrayChar = arrayWords[i].toCharArray();
            while (compare == false) {
                compare = true;
                for (int j = 0; j < arrayChar.length - 1; j++) {
                    if (arrayChar.equals(arrayChar[j+1]))

                    System.out.println(arrayChar[j]);


                }
            }
            System.out.println();
        }*/

