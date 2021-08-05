package Task4;

public class Task4{
    int n;
    Task4(int n){
        try{
            if(n % 1 != 0){
                throw new IntegerException();
            }
        }catch (IntegerException ex){
            System.out.println("Exception: " + ex);
            return;
        }
        this.n = n;

    }
    Task4(double n){
        try{
            if(n % 1 != 0){
                throw new IntegerException();
            }
        }catch (IntegerException ex){
            System.out.println("Exception: " + ex);
            return;
        }

    }

    public void division(){
        for(int i = 1; i <= n / 2; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}

