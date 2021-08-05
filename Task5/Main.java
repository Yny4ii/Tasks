package Task5;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OperationsWithLetters operationsWithLetters = new OperationsWithLetters();
        System.out.println("Enter the line:\n");
        String str = input.nextLine();
        operationsWithLetters.numberOfVowels(str); // кол-во гласных в словах
        operationsWithLetters.sorting(str); // сортировка по кол-ву гласных
        operationsWithLetters.upperCase(str); // верхний регистр первой гласнов в слове



    }
}
