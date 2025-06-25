package LevelOneQuesRecursion;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int target = 24;

        int result = binSearch(0,arr.length-1,target,arr);
        System.out.println(result);
    }

    static int binSearch(int start,int end,int target,int[] arr){

        if(start>end){
            return -1;
        }

        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }

        if(arr[mid]>target){
            return binSearch(start,mid-1,target,arr);
        }else{
            return binSearch(mid+1,end,target,arr);
        }

    }
}
