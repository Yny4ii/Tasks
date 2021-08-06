package Task4;

public class Task4{
    public void division(Number n) throws IntegerException {
        throw new IntegerException();
    }

    public void division(int n){
        for(int i = 1; i <= n / 2; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}

