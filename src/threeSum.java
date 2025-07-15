import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
  // public static void main(String[] args) {
  //   int[] arr = {
  //     1,0,1,2,-1,-4};
  //   List<List<Integer>> list = new ArrayList<>();
  //   Arrays.sort(arr);
  //   for (int i = 0; i < arr.length; i++) {
  //     for (int j = i+1; j < arr.length; j++) {
  //       for (int k = j+1; k < arr.length; k++) {
          
  //   List<Integer> innerList = new ArrayList<>();
  //         if(arr[i]+arr[j]+arr[k] == 0){
  //          innerList = Arrays.asList(arr[i],arr[j],arr[k]);
  //         }
  //         if(!innerList.isEmpty() && !list.contains(innerList)){
  //           list.add(innerList);
  //         }
  //       }
  //     }
  //   }
  //   System.out.println(list);
  // }

  public static void main(String[] args) {
    int[] nums = {-1,0,1,2,-1,-4};
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      if(i>0 && nums[i]==nums[i-1]){
        continue;
      }
      int j =i+1;
      int k=nums.length-1;
       List<Integer> innerList = new ArrayList<>();
      while(j<k){
       int sum=nums[i]+nums[j]+nums[k];
        if(sum==0){
          innerList = Arrays.asList(nums[i],nums[j],nums[k]);
           if(!innerList.isEmpty() && !list.contains(innerList)){
           list.add(innerList);
         }
          j++;
          k--;
           while (j < k && nums[j] == nums[j - 1]) j++;
          while (j < k && nums[k] == nums[k + 1]) k--;
        }
        else if(sum>0){
          k--;
        }else{
          j++;
        }
       
      }
    }
    System.out.println(list);
  }
}
