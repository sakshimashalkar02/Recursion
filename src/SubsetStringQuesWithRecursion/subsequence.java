package SubsetStringQuesWithRecursion;

public class subsequence {
    public static void main(String[] args) {
        String str = "abc";
        subseq(str,"");
    }
    static void subseq(String str,String strnew){
        if(str.isEmpty()){
            System.out.println(strnew);
            return;
        }

        char ch =str.charAt(0);

        subseq(str.substring(1),strnew+ch);
        subseq(str.substring(1),strnew);

    }
}
