import java.util.Arrays;

public class task20 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1, 2, 1, 2, 1, 4, 4, 3,5,9};


        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
               if(arr[j]==arr[i]){
                   count++;
               }
            }
            if(count<2){
                System.out.println(arr[i]);
            }
        }
    }
}
