package searching;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "aditya";
        char ch = 'i';
        System.out.println(stringSearch(name, ch));
    }

    static boolean stringSearch(String str, char ch){
        if(str.length()==0) return false;

        for(int i =0;i<str.length();i++){
            if(ch==str.charAt(i)) return true;
        }
        return false;
    }
}
