import java.util.Arrays;

public class sortArrayof0s1s {
  public static void main(String[] args) {
    int[] arr = {0,1,0,0,0,0,0,0,0};
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]==0){
        count++;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if(i<count){
        arr[i]=0;
      }else{
        arr[i]=1;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
  
}
