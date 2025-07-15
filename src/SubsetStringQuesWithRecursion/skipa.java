package SubsetStringQuesWithRecursion;

public class skipa {
    public static void main(String[] args) {
        String x = "baccad";
        usingaforloop(x);
        withrecursion(x,"");

    }
    static void usingaforloop(String x){
        StringBuilder n = new StringBuilder();

        for (int i = 0; i < x.length(); i++) {
            if( x.charAt(i) != 'a'){
                n.append(x.charAt(i));
            }
        }

        System.out.println(n);
    }
    static void withrecursion(String x,String newx){
        if(x.isEmpty()){
            System.out.println(newx);
            return ;
        }


        char ch = x.charAt(0);

        if(ch == 'a'){
            withrecursion(x.substring(1),newx);
        }else{
            withrecursion(x.substring(1),newx+ ch);
        }

    }
}
