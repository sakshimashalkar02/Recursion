package ArraysWithRecursion;

public class sortedArray {
    public static void main(String[] args) {
        int[] arr = {01,2,3,4,5,6};
        System.out.println(isSorted(arr,0));
    }
    static boolean isSorted(int[] arr,int pos){
        if(pos== arr.length-1){
            return true;
        }

        if(arr[pos]<arr[pos+1]){
            return isSorted(arr,pos+1);
        }

        return false;
    }
}
