import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int n = scanner1.nextInt();
        boolean b = scanner1.nextBoolean();
        System.out.println(Arrays.toString(charArr(n,b)));
    }

    public static char[] charArr(int n, boolean b) {
        Random random1 = new Random();
        char[] arr = new char[n];
        if (b) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (char) (random1.nextInt(26) + 'A');
            }
        } else if(!b) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (char) (random1.nextInt(26) + 'a');
            }
        }
        return arr;
    }
}
