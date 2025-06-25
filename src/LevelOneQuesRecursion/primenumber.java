package LevelOneQuesRecursion;

public class primenumber {
    public static void main(String[] args) {
    int n = 32;

        for (int i = 1; i <= 32 ; i++) {
            if(primenUm(i)){
                System.out.println();
            }
        }

    }
    static boolean primeno(int n){
        for (int i = 2; i < n ; i++) {
            if(n==1){
                return false;
            }
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static boolean primenUm(int n){
        if (n==1){
            return false;
        }
        int c =2;
        while (c*c <= n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
