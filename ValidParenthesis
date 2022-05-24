import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        //System.out.println(validParenthesis.isValid("{}"));
       // System.out.println(validParenthesis.isValid("(]"));
        System.out.println(validParenthesis.isValid("()[]{}"));
    }

//    public boolean isValid(String s) {
//        System.out.println(s.length());
//
//        if (s.length() <= 0) {
//            return false;
//        }
//
//
//        String middle2 = s.substring((s.length() / 2) - 1, ((s.length() / 2) - 1) + 2);
//
//        // recursive
//        if (s.length() == 2) {
//            System.out.println(middle2.substring(0,1));
//            System.out.println(middle2.substring(1,2));
//
//            System.out.println(s.substring(0,1));
//            System.out.println(s.substring(1,2));
//
//            if (s.charAt(0) == '(') {
//                if (s.charAt(1) == ')') {
//                    return true;
//                }
//            }
//            if (s.charAt(0) == '{') {
//                if (s.charAt(1) == '}') {
//                    return true;
//                }
//            }
//            if (s.charAt(0) == '[') {
//                if (s.charAt(1) == ']') {
//                    return true;
//                }
//            }
//        } else {
//            if (middle2.charAt(0) == '(') {
//                if (middle2.charAt(1) == ')') {
//                    s = s.replace(s.substring((s.length() / 2) - 1), "");
//                    isValid(s);
//                }
//            }
//            if (middle2.charAt(0) == '{') {
//                if (middle2.charAt(1) == '}') {
//                    s = s.replace(s.substring((s.length() / 2) - 1), "");
//                    isValid(s);
//                }
//            }
//            if (middle2.charAt(0) == '[') {
//                if (middle2.charAt(1) == ']') {
//                    s = s.replace(s.substring((s.length() / 2) - 1), "");
//                    isValid(s);
//                }
//            }
//
//        }
//
//
//        return false;
//    }

    /*
    *   Iterate through the string by scanning each character:
        Whenever we encounter an opening bracket: ( [ { in the string, push it into the stack
        Now check if the stack is empty to avoid error for the next step
        And, whenever we encounter a closing bracket: ) ] } in the string
        pop the topmost element (an opening bracket) of the stack
        and check if the popped element is an opening bracket for the respective closing bracket
        Finally return true or false based on the stack is empty or not
        If stack is empty, the given parentheses is balanced, so return true
        Else return false
        Time Complexity -> O(N)
        Space Complexity -> O(N)
    * */

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;
                char curr = stack.pop();
                if ((curr == '(' && c == ')')
                        || (curr == '[' && c == ']')
                        || (curr == '{' && c == '}'))
                    continue;
                else
                    return false;
            }
        }
        // If stack is empty, the given parentheses is balanced, so return true
        // Else return false
        return stack.isEmpty();
    }

}
