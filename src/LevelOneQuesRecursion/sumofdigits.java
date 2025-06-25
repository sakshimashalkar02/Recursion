package LevelOneQuesRecursion;

public class sumofdigits {
    public static void main(String[] args) {
        System.out.println(sumdigits(1342));
    }
    static int sumdigits(int n) {
        if (n == 0) {
            return 0;
        }
        int digit = n%10;
        int sum = digit + sumdigits((int)(n/10));
        return sum;

    }
}
