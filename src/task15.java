public class task15 {
    public static void main(String[] args){
        int [] a ={1,5,5,32,2,2,2,2,4,7,4,8,7,6};
        System.out.println(check(a));

    }
    public static boolean check (int []a){
        int count =0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==2){
                count++;
            }
        }
        if(count==5){
            return true;
        }else {
            return false;
        }
    }
}
