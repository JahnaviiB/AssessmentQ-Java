import java.util.Stack;

public class ValidParanthesis {
    public static boolean ValidParanthesis(String a){
        Stack<Character> stack = new Stack<>();
        for(char ch:a.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if(ch == ')' && !stack.empty() && stack.peek() == '('){
                stack.pop();
            }
            else if(ch == '}' && !stack.empty() && stack.peek() == '{'){
                stack.pop();
            }
            else if(ch == ']' && !stack.empty() && stack.peek() == '['){
                stack.pop();
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        String s = "[{}]";
        Boolean result = ValidParanthesis(s);
        System.out.println(result);
    }
}
