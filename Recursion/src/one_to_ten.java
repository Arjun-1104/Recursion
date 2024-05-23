public class one_to_ten {
    public static void main(String[] args) {
        int n=10;
        print(n);
        System.out.println("task complete");
    }

    public static void print(int n){

        if(n<=0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
