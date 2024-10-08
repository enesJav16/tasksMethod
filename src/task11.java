import java.util.Scanner;

public class task11 {
    public static void main(String[]args){
        Scanner scanner1 = new Scanner(System.in);
        String [] nameArr ={"enes","said","adilet","nursultan","azmar","jyrgalbek"};
        String name= scanner1.nextLine();
        System.out.println(check(nameArr,name));
    }
    public static boolean check (String[]a,String name){
        boolean returnAns=false;
        for (int i = 0; i < a.length; i++) {
            if(a[i].equals(name) && i%2==0){
                returnAns=true;
            }
        }
        return returnAns;
    }
}
