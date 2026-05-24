package strings;
import java.util.*;

// LC 20: Valid Parentheses
class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(') stack.push(')');
            else if (ch=='[') stack.push(']');
            else if (ch=='{') stack.push('}');
            else {
                if(stack.isEmpty() ||  stack.pop() != ch)  return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses sol = new ValidParentheses();

        System.out.println(sol.isValid("()"));        // true
        System.out.println(sol.isValid("()[]{}"));    // true
        System.out.println(sol.isValid("(]"));        // false
        System.out.println(sol.isValid("([])"));      // true
        System.out.println(sol.isValid("([)]"));      // false
        System.out.println(sol.isValid("]"));         // false
        System.out.println(sol.isValid("((("));       // false
        System.out.println(sol.isValid(""));          // true (empty is valid)
    }
}
