import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task12 {
    public static void main(String[] args){
        Scanner scanner1 =new Scanner(System.in);
        int a= scanner1.nextInt();
        System.out.println(Arrays.toString(upArr(a)));
    }
    public static int[] upArr(int a){
        Random random1 = new Random();
        int[] arr=new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= random1.nextInt(1,100);
        }
        int i =0;
        int j =0;
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr.length-1; l++) {
                i=arr[l];
                j=arr[l+1];
                if(i>j){
                    arr[l]=j;
                    arr[l+1]=i;
                }
            }
        }
        return arr;
    }
}
