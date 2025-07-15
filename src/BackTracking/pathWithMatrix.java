package BackTracking;

import java.util.Arrays;

public class pathWithMatrix {
  public static void main(String[] args) {
    boolean[][] maze = {{true,true,true},{true,true,true},{true,true,true}};
    int[][] ans = new int[maze.length][maze[0].length];
    steps("", maze,0,0, ans, 1);
  }

  static void steps(String s,boolean[][] maze,int m,int n,int[][] path,int step){
     if ( m<0 || n<0 || m>=maze.length || n>=maze[0].length || !maze[m][n]){
      return ;
    }

    if(m==maze.length-1 && n==maze[0].length-1){
      path[m][n]=step;
      for(int[] arr:path){
        System.out.println(Arrays.toString(arr));
      }
      System.out.println(s);
      System.out.println();
      return;
    }

      maze[m][n] = false;
      path[m][n] = step;
      steps(s+"D", maze, m+1, n,path,step+1);
    
      steps(s+"U", maze, m-1, n,path,step+1);
    
      steps(s+"R", maze, m, n+1,path,step+1);

      steps(s+"L", maze, m, n-1,path,step+1);

      maze[m][n] = true;
      path[m][n] = 0;

  }
}
