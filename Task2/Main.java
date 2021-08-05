package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter the line:\n");
        String str = input.next();
        calculator.calculate(str);
    }
}
