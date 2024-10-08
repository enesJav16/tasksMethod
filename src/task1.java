import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main (String [] args){
        Random random1 =new Random();
        Scanner scanner1 = new Scanner(System.in);
        int range = scanner1.nextInt();
        int num = scanner1.nextInt();
        int [] a =new int[range];
        for (int i = 0; i < a.length; i++) {
            a[i]=random1.nextInt(1,100);
        }
        System.out.println(Arrays.toString(a));
        check(a,num);

    }
    public static void check(int [] a, int b) {
        boolean c =false;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>=b){
                c=true;
            }
        }
        if (c){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
