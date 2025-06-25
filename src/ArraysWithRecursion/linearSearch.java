package ArraysWithRecursion;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr={2,4,76,12,34,86};
        System.out.println(linsearch(arr,8,0));
    }
    static int linsearch(int[] arr,int target,int pos){
        if(pos==arr.length){
            return -1;
        }

        if(target==arr[pos]){
            return pos;
        }

        return linsearch(arr,target,pos+1);

    }
}
