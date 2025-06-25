package SortingWithRecursion;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={4,2,3,1};
        System.out.println(Arrays.toString(sort(arr,0,arr.length-1)));
    }
    static int[] sort(int[] arr,int i,int pass){
        if(pass == 0 ){
            return arr;
        }
        if(i<pass){
        if(arr[i]>arr[i+1]) {
            swap(arr, i, i + 1);
        }
            sort(arr,i+1,pass);
        }else {
            sort(arr,0,pass-1);
        }
        return arr;
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
