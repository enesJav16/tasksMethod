import java.util.Arrays;
import java.util.Random;

public class task3 {
    public static void main (String []args){
        Random random1 = new Random();
        int [] a =new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i]= random1.nextInt(1,50);
        }
        System.out.println(Arrays.toString(a));
        retuern(a);
    }
    public static void retuern (int[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i]>=20){
                System.out.print(a[i]+" ");
            }
        }
    }
}
