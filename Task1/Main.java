package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Three thee = new Three();
        System.out.println("Enter the line:\n");
        String str = input.next();

        thee.countOfThree(str);


    }
}

