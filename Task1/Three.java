package Task1;

public class Three {
    public  void countOfThree(String str){
        int count = 0;
        for(int i = 0; i < str.length() - 2; i++){
            char ch = str.charAt(i);
            if(ch == str.charAt(i + 1) && ch == str.charAt(i + 2)){
                count++;
            }

        }
        System.out.println("Number of 'troek': " + count);


    }
}
