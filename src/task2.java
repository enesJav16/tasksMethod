import java.util.Arrays;
import java.util.Random;

public class task2 {
    public static void main (String[]args){
        Random random1 = new Random();
        boolean [] a =new boolean[10];
        for (int i = 0; i < a.length; i++) {
            a[i]= random1.nextBoolean();
        }
        System.out.println(Arrays.toString(a));
        count(a);
    }
    public  static void count (boolean [] a){
        int trueCount=0;
        int falseCount=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==true){
                trueCount++;
            }else {
                falseCount++;
            }
        }
        System.out.println("True: "+trueCount);
        System.out.println("False: "+falseCount);
    }
}
