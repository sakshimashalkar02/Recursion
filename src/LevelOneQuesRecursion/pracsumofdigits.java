package LevelOneQuesRecursion;

public class pracsumofdigits {
    public static class pracsum {
        public static void main(String[] args) {
            System.out.println(sum(1342,0));
            System.out.println(prod(1342,1));
        }
        static int sum(int n,int s){
            if(n==0){
                return s;
            }
            s+=n%10;
            return sum(n/10,s);
        }
        static int prod(int n,int s){
            if(n==0){
                return s;
            }
            s*=n%10;
            return prod(n/10,s);
        }
    }

}
