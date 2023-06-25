import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args){
        String str="([)]";
        System.out.println(isValid(str));
    }
    static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch(ch){
                case '(' :
                case '{' :
                case '[' :
                    stack.push(ch);
                    break;
                case ')' :
                    if(stack.isEmpty() || stack.pop()!='(') return false;
                    break;
                case '}' :
                    if(stack.isEmpty() || stack.pop()!='{') return false;
                    break;
                case ']' :
                    if(stack.isEmpty() || stack.pop()!='[') return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
