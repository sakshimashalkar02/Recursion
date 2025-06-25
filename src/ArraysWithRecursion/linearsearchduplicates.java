package ArraysWithRecursion;

import java.util.ArrayList;

public class linearsearchduplicates {
    public static void main(String[] args) {
        int[] arr={4,2,3,44,4,5,6};
        System.out.println(duplilinsearch(arr,new ArrayList<>(),0,4));
    }

    static ArrayList<Integer> duplilinsearch(int[] arr,ArrayList<Integer> poses,int pos,int target){
        if(pos== arr.length){
            return poses;
        }
        if(arr[pos]==target){
            poses.add(pos);
        }
        return duplilinsearch(arr,poses,pos+1,target);
    }
}
