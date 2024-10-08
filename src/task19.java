public class task19 {
    public static void main(String [] args){
        int [] arr ={1,2,3,4,5,6,7,8,9,8,80,8,4,4,5,3,9};
        System.out.println(checkIf(arr));
    }
    public static boolean checkIf (int [] a){
        boolean ret =false;
        for (int i = 0; i < a.length-2; i++) {
            if (a[i]==a[i+1] && a[i+2]==a[i]) {
                ret =true;
            }
        }
        return ret;
    }
}
