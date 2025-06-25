package PatternWithRecursion;

public class starplus {
    public static void main(String[] args) {
        stplus(4,0);
    }
    static void stplus(int r,int c){
        if(r==0){
            return;
        }
        if(r>c){
            stplus(r,c+1);
            System.out.print("*");

        }else {
            stplus(r-1,0);

            System.out.println();
        }
    }
}
