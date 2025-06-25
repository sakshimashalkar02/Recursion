package LevelOneQuesRecursion;

public class reverseano {
    public static class reverseanumber {
        public static void main(String[] args) {
            reversenum(12345);
            int n = 12345;
            int len = Integer.toString(n).length();
            System.out.println();
            System.out.println( reversenum2(n,len-1,0));
        }
        static void reversenum(int n){
            if(n==0){
                return;
            }
            System.out.print(n%10);
            reversenum(n/10);
        }

        static int reversenum2(int n,int x,int sum){
            if(n==0){
                return sum;
            }
            sum= (int) ((int) sum + ((n%10)*Math.pow(10,x)));
            return reversenum2(n/10,x-1,sum);
        }
    }
}
