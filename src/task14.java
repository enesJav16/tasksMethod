import java.util.Scanner;

public class task14 {
    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);
        int [] a={3,3,4};
        int num = scanner1.nextInt();

        int index =0;
        for (int j = 0; j < a.length; j++) {
            for (int i = index+1; i < a.length; i++) {
                if (a[index] + a[i]==num) {
                    System.out.println(index+" "+i);
                }
            }
            index++;
        }


    }
}
