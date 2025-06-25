package PatternWithRecursion;

public class starnminus {
    public static void main(String[] args) {
       // recur(4);
        recur2(4,0);
    }
    static void recur(int n){
        if(n==0){
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        recur(n-1);
    }
    static void recur2(int r,int c){
        if(r==0){
            return;
        }

        if(r>c){
            System.out.print("*");
            recur2(r,c+1);
        }
        else{
            System.out.println();
            recur2(r-1,0);
        }
    }
}
