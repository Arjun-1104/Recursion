public class callsBack_Basic {
    public static void main(String[] args) {
        System.out.println("I am start");
        method1();
        System.out.println("I am end");
    }
    public static void method1(){
        System.out.println("I am first");
        method2();
        System.out.println("First function end here");
    }
    public static void method2(){
        System.out.println("I am second");
        method3();
        System.out.println("second function end here");
    }
    public static void method3(){
        System.out.println("I am third");
    }
}
