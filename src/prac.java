import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prac {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int m = sc.nextInt();
    // int n = sc.nextInt();
    // int[][] arr = new int[m][n];
    // for (int i = 0; i < m; i++) {
    //   for (int j = 0; j < n; j++) {
    //     arr[i][j] = sc.nextInt();
    //   }
    // }

    int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    System.out.println(spi(arr));
   
  }

  static List<Integer> spi(int[][] arr){
    List<Integer> res = new ArrayList<>();
    int top = 0;
    int left =0;
    int bottom = arr.length-1;
    int right = arr[0].length-1;
    while(top<=bottom && left<=right){
      for(int i=left;i<=right;i++){
        res.add(arr[top][i]);
      }
       top++;
      for(int i=top;i<=bottom;i++){
        res.add(arr[i][right]);
        
      }
      right--;
      if(top<=bottom){
      for (int i = right; i >=left; i--) {
        res.add(arr[bottom][i]);
        
      }
      bottom--;
    }
    if(left<=right){
      for(int i=bottom;i>=top;i--){
        res.add(arr[i][left]);
      }
      left++;
    }
  }

    return res;
  }
  
}
