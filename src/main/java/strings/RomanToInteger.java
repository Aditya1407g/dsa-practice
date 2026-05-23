package strings;

public class RomanToInteger {
    public int romanToInt(String s) {
        int sum=0;
        for(int i =0; i<s.length();i++){
            int cur = getValue(s.charAt(i));
            int next =0;
            if(i+1<s.length()){
                next = getValue(s.charAt(i+1));
            }
            if(cur>=next){
                sum+=cur;
            }
            else sum-=cur;
        }
        return sum;
    }
    static int getValue(char c){
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        RomanToInteger sol = new RomanToInteger();

        System.out.println(sol.romanToInt("III"));      // 3
        System.out.println(sol.romanToInt("IV"));       // 4
        System.out.println(sol.romanToInt("IX"));       // 9
        System.out.println(sol.romanToInt("LVIII"));    // 58
        System.out.println(sol.romanToInt("MCMXCIV"));  // 1994
        System.out.println(sol.romanToInt("MMMCMXCIX"));// 3999
    }
}
