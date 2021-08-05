package Task5;

import java.util.Arrays;

public class OperationsWithLetters {

    public void numberOfVowels(String str) {
        str = str.toLowerCase().replaceAll("[^аеиоуэюя]", "");
        System.out.print("Number of vowels: ");
        System.out.println(str.length());


    }

    public void upperCase(String str) {
        String vowel = "аеиоуэюя";
        str = str.toLowerCase();
        int len = vowel.length();
        String array[] = str.split(" ");
        char[] vowels = {'a', 'e', 'o', 'i', 'u', 'y'};
    mark:    for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                for (int k = 0; k < len; k++) {
                    if (array[i].charAt(j) == vowel.charAt(k)) {
                        char newChar = Character.toUpperCase(vowel.charAt(k));
                        char oldChar = array[i].charAt(j);
                        array[i] = array[i].replace(oldChar, newChar);
                        continue mark;
                    }
                }
            }
        }
        System.out.print("UpperCase: ");
        System.out.println(Arrays.toString(array));
    }

    public void sorting(String str) {
        String vowel = "аеиоуэюя";
        str = str.toLowerCase();
        String array[] = str.split(" ");

        int[] count = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                int index = vowel.indexOf(array[i].charAt(j));
                if (index > 0) {
                    count[i] = count[i] + 1;
                }
            }
        }
        for (int i = 0; i < count.length - 1; i++) {
            for (int j = i + 1; j < count.length; j++) {

                if (count[i] < count[j]) {

                    int buf = count[i];
                    count[i] = count[j];
                    count[j] = buf;

                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Sorting: ");
        System.out.println(Arrays.toString(array));
    }
}
