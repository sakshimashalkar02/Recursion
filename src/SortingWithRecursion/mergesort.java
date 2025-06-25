package SortingWithRecursion;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4};
        mergeSort2(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid, arr.length));

        return mergedArray(arr,left,right);
    }

    static int[] mergedArray(int[] arr, int[] left, int[] right) {
        int[] mix = new int[left.length+ right.length];

        int i = 0;
        int j=0;
        int k =0;

       while(i< left.length && j< right.length){
           if(left[i]<right[j]){
               mix[k]=left[i];
               i++;
               k++;
           }else{
               mix[k]=right[j];
               j++;
               k++;
           }
       }

       while (i< left.length){
           mix[k]=left[i];
           i++;
           k++;
       }


        while (j< right.length){
            mix[k]=right[j];
            j++;
            k++;
        }

        return mix;
    }

    static void mergeSort2(int[] arr,int start,int end){
        if(end-start==1){
            return;
        }

        int mid = start+(end-start)/2;

        mergeSort2(arr,start,mid);
        mergeSort2(arr,mid,end);

        mergedArray2(arr,start,mid,end);
    }
    static void mergedArray2(int[] arr,int s,int m,int e){
        int[] mix = new int[e-s];

        int i = s;
        int j=m;
        int k =0;

        while(i< m && j< e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        while (i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }


        while (j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l]=mix[l];
        }
    }
}
