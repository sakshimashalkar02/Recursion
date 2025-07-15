package twoPointers;

import java.util.Arrays;

public class evenfirst {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    int i=0;
    int j=arr.length-1;
    while(i<j){
        boolean x = (arr[i]%2==0);
        boolean y = (arr[j]%2==0);
        if(x && y){
          i++;
          j--;
        }
        if(x){
          i++;
        }
        if(y){
          j--;
        }
        if(!x && !y){
          swap(arr, i, j);
        }
      }

      System.out.println(Arrays.toString(arr));
  }

  static void swap(int[] arr,int a,int b){
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b]=temp;
  }
  
}
