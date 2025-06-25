package LevelOneQuesRecursion;

public class countnumofzeros {
    public static void main(String[] args) {
        int n=1;
        System.out.println(countzeros(n,0));
    }
    static int countzeros(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10 == 0){
            count++;
        }
        return countzeros(n/10,count);
    }

}
