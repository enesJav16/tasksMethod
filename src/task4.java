import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Random random1 = new Random();
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        int [] b = new int[20];
        for (int i = 0; i < b.length; i++) {
            b[i]= random1.nextInt(1,50);
        }
        System.out.println(Arrays.toString(b));
        returnCount(b,a);

    }
    public static void returnCount (int[] a, int b){
        int count =0;

        for (int i = 0; i < a.length; i++) {
            if (a[i]==b){
                count++;
            }
        }
        System.out.println("There is "+count+" '"+b+"'");
    }
}
