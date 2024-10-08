import java.util.Scanner;

public class task5 {
    public static void main(String[]args){
        Scanner scanner1 =new Scanner(System.in);
        int a = scanner1.nextInt();
        System.out.println(sum(a));
    }
    public static int sum (int a ){
        int sum =0;
        for (int i = 0; i <= a; i++) {
            sum+=i;
        }
        return sum;
    }
}
