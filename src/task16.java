import java.util.Scanner;

public class task16 {
    public static void main(String [] args){
        Scanner scanner1 = new Scanner(System.in);
        String word= scanner1.nextLine();
        int num = scanner1.nextInt();
        System.out.println(returnAns(word,num));
    }
    public static String returnAns(String word, int num ){
       String wordRet=word;
        for (int i = 1; i < num; i++) {
            wordRet =wordRet.concat(word);
        }
        return wordRet;
    }
}
