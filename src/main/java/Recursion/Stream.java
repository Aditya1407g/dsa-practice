package Recursion;

public class Stream {
    public static void main(String[] args) {

        String str = "aditya";
        String ans = "";
//        skip(ans,str);
        System.out.println(skip1(str));
    }

    static void skip(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char pre = up.charAt(0);
        if(pre!='a'){
            skip(p+pre , up.substring(1));
        }
        else{
            skip(p,up.substring(1));
        }
    }

    static String skip1(String up){
        if(up.isEmpty()){
            return "" ;
        }

        char ch = up.charAt(0);
        if(ch=='a'){
            return skip1(up.substring(1));
        }
        else
            return ch+skip1(up.substring(1));
    }
}
