public class _5_sum_of_digit {
    public static void main(String[] args) {

        int n = 1234;
        int ans = sumDigit(n);
        System.out.println(ans);
    }
    public static int sumDigit(int n){

        if(n>=0 && n<=9){
            return n;
        }

        int remNum = n/10;    //1
        int d = n%10;         //2
        int remSum = sumDigit(remNum);   //3
        int ans = remSum + d;   //4

        return ans;
    }
}
