import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task6 {
    public static void main (String[] args){
        Random random1 =new Random();
        Scanner scanner1 = new Scanner(System.in);
        int []a=new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i]= random1.nextInt(1,10);
        }
        int b = scanner1.nextInt();
        System.out.println(Arrays.toString(a));
        System.out.println(sumTill(a,b));
    }
    public static int sumTill(int[]a,int k){
        int sum =0;
        for (int i = 0; i < k; i++) {
            sum+=a[i];
        }
        return sum;
    }
}
