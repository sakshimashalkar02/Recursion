package LevelOneQuesRecursion;

public class bitwiseoperators {
    public static void main(String[] args) {
        int n = 60;
        //System.out.println(isOdd(n));

        //int[] arr = {2,3,4,3,2,6,4};
       // System.out.println(isUnique(arr));

        int x = 100101;
        System.out.println(setBit(x,4));
    }

    static boolean isOdd(int n){
        return (n & 1) == 1;
    }

    static int isUnique(int[] arr){
        int unique=0;

        for(int n:arr){
            unique ^= n;
        }
        return unique;
    }

    static int setBit(int n,int i){
        int mask = 1<<i;

        return n | mask;
    }



}
