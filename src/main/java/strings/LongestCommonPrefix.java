package strings;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        StringBuilder rval = new StringBuilder();
        int strlength = strs[0].length();
        int i =0;
        while(i<strlength){
            if(checker(strs,i)){
                rval.append(strs[0].charAt(i));
                i++;
            }
            else break;
        }
        return rval.toString();
    }
    static boolean checker(String[] str, int index){
        char pre = str[0].charAt(index);
        for(int i =1;i<str.length;i++){
            if(index >= str[i].length() || pre!=str[i].charAt(index)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        LongestCommonPrefix sol = new LongestCommonPrefix();

        System.out.println(sol.longestCommonPrefix(new String[]{"flower","flow","flight"}));         // "fl"
        System.out.println(sol.longestCommonPrefix(new String[]{"dog","racecar","car"}));            // ""
        System.out.println(sol.longestCommonPrefix(new String[]{"interspecies","interstellar","interstate"}));  // "inters"
        System.out.println(sol.longestCommonPrefix(new String[]{"a"}));                              // "a"
        System.out.println(sol.longestCommonPrefix(new String[]{""}));                               // ""
        System.out.println(sol.longestCommonPrefix(new String[]{"ab", "a"}));                        // "a"
    }
}
