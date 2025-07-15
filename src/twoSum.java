import java.util.HashMap;
import java.util.Scanner;

public class twoSum{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int j = 0; j < n; j++) {
        arr[j] = sc.nextInt();
      }
      int target = sc.nextInt();

      HashMap<Integer,Integer> hma = new HashMap<>();
      for (int index = 0; index < arr.length; index++) {
        int complement = target - arr[index];
        if(hma.containsKey(complement)){
          System.out.println(hma.get(complement) + " " + index);
        }else{
          hma.put(arr[index],index);
        }
      }
    }
    sc.close();
  }
}