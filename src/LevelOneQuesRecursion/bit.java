package LevelOneQuesRecursion;

public class bit {
    public static boolean isEven(int n){
        return (n&1)==1;
    }
    public static void main(String[] args) {
        int n =11;
        String x = Integer.toBinaryString(n);
        int[] binaryArr = new int[x.length()];
        for (int i = 0; i < x.length(); i++) {
            binaryArr[i] = x.charAt(i) - '0';  // Convert char to int
        }

        int count =0;
        for (int i = 0; i < x.length(); i++) {
            if(binaryArr[i] ==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
