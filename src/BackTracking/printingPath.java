package BackTracking;

import java.util.ArrayList;

public class printingPath {
public static void main(String[] args) {
 // steps(3, 3, "");
 ArrayList<String> list = stepsarrayList(3, 3,"");
 System.out.println(list);
}
static void steps(int m,int n,String s){
  if(m==1 && n==1){
    System.out.println(s);
    return;
  }

  if(m>1){
steps(m-1, n, s+"D");
  }
  if(n>1){
steps(m,n-1,s+"R");
  }
  
  return;
}


static ArrayList<String> stepsarrayList(int m,int n,String s){
  if(m==1 && n==1){
    ArrayList<String> list = new ArrayList<>();
    list.add(s);
    return list;
  }

 ArrayList<String> l = new ArrayList<>();
 ArrayList<String> r = new ArrayList<>();
  if(m>1){
  l = stepsarrayList(m-1, n, s+"D");
  }
  if(n>1){
   r = stepsarrayList(m,n-1,s+"R");
  }

  l.addAll(r);
  
  return l;
}

}