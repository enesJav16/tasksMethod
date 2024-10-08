import java.util.Arrays;
import java.util.Random;

public class task7 {
    public static void main (String[] args){
        Random random1 = new Random();
        int [] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i]= random1.nextInt(1,50);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(evenReturn(a)));
    }
    public static int [] evenReturn(int[]a){
        int evenCount=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                evenCount++;
            }
        }
        int [] even=new int[evenCount];
        int evenIndex=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                even[evenIndex]=a[i];
                evenIndex++;
            }
        }

        return even;

    }
}
