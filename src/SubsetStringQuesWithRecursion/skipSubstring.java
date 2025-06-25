package SubsetStringQuesWithRecursion;

public class skipSubstring {
    public static void main(String[] args) {
        String x = "sakshiapplelovesapplesai";
        System.out.println(skipsubs(x,""));
    }
    static String skipsubs(String x,String news){
        if(x.isEmpty()){
            return news;
        }


        if(x.startsWith("apple")){
           return skipsubs(x.substring(5),news);
        }else{
           return skipsubs(x.substring(1), news+x.charAt(0));
        }

    }
}
