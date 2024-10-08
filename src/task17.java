public class task17 {
    public static void main(String[] args){
        int [] a={2,3,4,5,6,7,1,20,3,9,7,6,4};
        System.out.println(checkArr(a));
    }
    public static boolean checkArr (int [] a){
        int num1 =1;
        int num2 =2;
        int num3 =3;
        boolean ret =false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num1 && a[i + 1] == num2 && a[i+2]==num3) {
                ret= true;
            }
        }
        return ret;
    }
}
