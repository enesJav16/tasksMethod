public class task18 {
    public static void main(String [] args){
        System.out.println(checkIf(1,2,3,69,4,5,3,9,4));

    }
    public static boolean checkIf (int...a){
        boolean b =false;
        for (int i = 0; i < 4; i++) {
            if(a[i]==9){
                b=true;
            }
        }
        return b;
    }
}
