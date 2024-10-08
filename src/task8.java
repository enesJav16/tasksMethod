import java.util.Scanner;

public class task8 {
    public static void main(String[]args){
        Scanner scanner1 =new Scanner(System.in);
        int num = scanner1.nextInt();
        System.out.println(whichDay(num));
    }
    public static String whichDay(int a){
        switch (a) {
            case 1:
                return "Monday";

            case 2:
                return "Tuesday";

            case 3:
                return "Wednesday";

            case 4:
                return "Thursday";

            case 5:
                return "Friday";

            case 6:
                return "Saturday";

            case 7:
                return "Sunday";

            default:
                return "There is no  such day";

        }
    }
}
