package rocketseat;

public class TestandoWhile {

    public static void main(String[] args){
        int i = 0;
        while(i < 13){
            if(i % 2 == 0){
                System.out.println(i + " é par");
            } else {
                System.out.println(i + " é impar");
            }
        i++;   
        }
    }
}
