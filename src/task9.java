import java.util.Random;

public class task9 {
    public static void main(String[] args) {
        int[] a = new int[15];
        arr(a);
    }

    public static void arr(int[] a) {
        Random random1 = new Random();
        int indexCount=0;
        for (int i = 0; i < a.length; ) {
            int b = random1.nextInt(10, 99);
            if (b % 2 == 0) {
                a[indexCount]=b;
                indexCount++;
                i++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

