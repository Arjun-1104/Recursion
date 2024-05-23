public class _8_calculate_power {
    public static void main(String[] args) {
        int n = 2;
        int x = 10000;

        int ans = powerlog(n,x);
        System.out.println(ans);
    }
    public static int power(int n,int x){
        if(x==0 || n==1){
            return 1;
        }
        else if(x==1){
            return n;
        }
        else if(n==0){
            return 0;
        }

        int pre = power(n,x-1);
        int ans  = pre * n;
        return ans;

    }

    public static int powerlog(int n,int x){
        if(x==0 || n==1){
            return 1;
        }
        else if(x==1){
            return n;
        }
        else if(n==0){
            return 0;
        }

        int pre = powerlog(n,x/2);
        if(x%2==0){
            return pre * pre ;
        }
        else{
            return pre * pre * n;
        }

    }
}
