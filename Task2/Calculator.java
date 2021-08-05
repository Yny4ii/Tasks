package Task2;

public class Calculator {
    public void calculate(String str){
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sum+= Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println("The amount is: " + sum);
    }
}
