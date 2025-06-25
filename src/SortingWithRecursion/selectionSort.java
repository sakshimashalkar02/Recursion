package SortingWithRecursion;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={4,2,3,1};
        System.out.println(Arrays.toString(sort(arr,arr.length-1,0,0)));
    }
    static int[] sort(int[] arr,int r,int c,int max){
        if(r == 0 ){
            return arr;
        }
        if(c<=r){
            if(arr[max]<arr[c]) {
                max=c;
            }
            return    sort(arr,r,c+1,max);
        }
        else{
            swap(arr,max,r);
            return sort(arr,r-1,0,0);
        }
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
