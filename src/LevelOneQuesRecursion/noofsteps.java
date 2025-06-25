package LevelOneQuesRecursion;

public class noofsteps {
    public static class numberofsteps {
        public static void main(String[] args) {
            int n = 14;
            System.out.println(num(n,0));
        }
        static int num(int n,int steps){
            if(n==0){
                return steps;
            }
            if(n%2==0){
                steps++;
                return num(n/=2,steps);
            }else{
                steps++;
                return num(n-1,steps);
            }
        }
    }

}
