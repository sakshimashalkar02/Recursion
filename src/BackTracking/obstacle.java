package BackTracking;

public class obstacle {
  public static void main(String[] args) {
    boolean[][] maze={{true,true,true},{true,false,true},{true,true,true}};
    steps("", maze, 0, 0);
  }
  static void steps(String s,boolean[][] maze,int m,int n){
    if(m==maze.length-1 && n== maze[0].length-1){
      System.out.println(s);
      return;
    }

    if(!maze[m][n]){
      return;
    }

    if(m< maze.length-1){
      steps(s+"D", maze, m+1, n);
    }

    if(n<maze[0].length-1){
      steps(s+"R", maze, m, n+1);
    }
  }
}
