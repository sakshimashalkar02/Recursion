package LevelOneQuesRecursion;

public class palindromee {
    public static class palindrome {
        public static void main(String[] args) {
            int n = 1331;
            int len = Integer.toString(n).length();
            int rev = reversenum2(n,len-1,0);
            int revnum =0;
            int x=n;

            //with while method
            while(x!=0){
                int rem=x%10;
                revnum =revnum*10+rem;
                x/=10;
            }

            if(n==revnum){
                System.out.println("isPalindrome");
            }else{
                System.out.println("isnotaPalindrome");
            }
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
