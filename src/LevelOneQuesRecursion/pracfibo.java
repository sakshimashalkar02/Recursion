package LevelOneQuesRecursion;

public class pracfibo {
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        fib(0,1,5);
    }
    static void fib(int a,int b,int n){
        if(n==2){
            return;
        }
        System.out.println(a+b);
        fib(b,a+b,n-1);
    }
}
