package LevelOneQuesRecursion;

import java.util.Scanner;

public class printnostilln {
    public static class printnnumberstilln {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printnnos(n);
        }
        static void printnnos(int n){
            if(n==0){
                return;
            }
            System.out.println(n);
            printnnos(n-1);
            System.out.println(n);

        }
    }
}
