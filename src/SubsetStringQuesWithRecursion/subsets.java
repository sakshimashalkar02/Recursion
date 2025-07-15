import java.util.ArrayList;
import java.util.List;

public class subsets {
  public static void main(String[] args) {
    int[] arr = {1,2,3};
    List<List<Integer>> res = new ArrayList<>();
    subs(arr, new ArrayList<Integer>(), res, 0);
    System.out.println(res);
  }
  static void subs(int[] arr,List<Integer> current,List<List<Integer>> result,int pos){
    if(pos==arr.length){
      result.add(new ArrayList<Integer>(current));
      return;
    }

    current.add(arr[pos]);
    subs(arr,current,result,pos+1);
    current.remove(current.size()-1);
    subs(arr, current, result, pos+1);
  }
  
}
