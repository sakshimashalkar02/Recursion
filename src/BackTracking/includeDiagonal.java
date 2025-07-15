package BackTracking;

public class includeDiagonal {
  public static void main(String[] args) {
    steps(3, 3, "");
  }

  static void steps(int m,int n,String s){
  if(m==1 && n==1){
    System.out.println(s);
    return;
  }

  if(m>1){
steps(m-1, n, s+"V");
  }
  if(n>1){
steps(m,n-1,s+">");
  }
  if(m>1 && n>1){
    steps(m-1, n-1, s+"\\");
  }
  
  return;
}
}
