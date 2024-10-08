public class task13 {
    public static void main(String[] args){
        int [] a = {1,2,3,4,5,6,7,8,-9,2};
        System.out.println(check(a));

    }
    public static boolean check (int[] a){
        boolean chek= true;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<0){
                return false;
            }
        }
        return chek;
    }
}
