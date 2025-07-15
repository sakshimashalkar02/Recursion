package BackTracking;

public class alldirections {
  public static void main(String[] args) {
    boolean[][] a = {{true,true,true},{true,true,true},{true,true,true}};
    steps("", a, 0, 0);
  }
  static void steps(String s,boolean[][] maze,int m,int n){
    if ( m<0 || n<0 || m>=maze.length || n>=maze[0].length || !maze[m][n]){
      return ;
    }

    if(m==maze.length-1 && n==maze[0].length-1){
      System.out.println(s);
      return;
    }

      maze[m][n] = false;
      steps(s+"D", maze, m+1, n);
    
      steps(s+"U", maze, m-1, n);
    
      steps(s+"R", maze, m, n+1);
      steps(s+"L", maze, m, n-1);

      maze[m][n] = true;
  }
}
