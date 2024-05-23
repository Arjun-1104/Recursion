public class _4_fibonacci {
    public static void main(String[] args) {
        int n= 6;

        int ans = fib(n);
        System.out.println(ans);
    }
    public static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }

        int ans1 = fib(n-1);
        int ans2 = fib(n-2);

        int ans3= ans1 + ans2;

        return ans3;
    }
}
