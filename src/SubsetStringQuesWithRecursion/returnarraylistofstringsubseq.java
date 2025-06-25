package SubsetStringQuesWithRecursion;

import java.util.ArrayList;
import java.util.Arrays;

public class returnarraylistofstringsubseq {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(returnArrayList(str,""));
    }
    static ArrayList<String> returnArrayList(String str,String newx){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(newx);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> left = returnArrayList(str.substring(1),newx);
        ArrayList<String> right = returnArrayList(str.substring(1),newx+ch);

        left.addAll(right);

        return left;

    }
}
