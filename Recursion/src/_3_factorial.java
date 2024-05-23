/*public class _3_factorial {
    public static void main(String[] args) {
        int n=5;

        int ans = fac(n);        // my code
        System.out.println(ans);
    }
    public static int fac(int n){
        if(n==0){
            return 1;
        }

        int ans = n * fac(n-1);
        return ans;
    }
}
*/

public class _3_factorial {
    public static void main(String[] args) {

        int n = 6;
        int ans = fact(n);
        System.out.println(ans);
    }
    public static int fact(int n){

        if(n==0){
            return 1;
        }
        int pre = fact(n-1);
        int ans = n * pre;

        return ans;
    }
}