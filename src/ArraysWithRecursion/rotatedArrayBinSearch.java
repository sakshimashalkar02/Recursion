package ArraysWithRecursion;

public class rotatedArrayBinSearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3};
        System.out.println(binSearch(arr,3,0,arr.length-1));
    }
    static int binSearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[start]<=arr[mid]){
                if(target>=arr[start] && target<arr[mid]){
                    return binSearch(arr,target,start,mid-1);
                }else {
                    return binSearch(arr,target,mid+1,end);
                }
            }else{
                if(target>=arr[start]){
                    return binSearch(arr,target,start,mid-1);
                }else {
                    return binSearch(arr,target,mid+1,end);
                }
            }
        }
        return -1;
    }
}
