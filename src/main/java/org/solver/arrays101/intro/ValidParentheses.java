package org.solver.arrays101.intro;

import java.util.Stack;

public class ValidParentheses {
    public static void test(){
        String paren="()[]";
        System.out.println("The input is: "+paren);
        System.out.println(validParentheses(paren));
    }
    public static boolean validParentheses(String string){
        Stack<Character> stack =new Stack<>();
        for(char c:string.toCharArray()){
            if(c=='(' || c=='[' || c=='{' ){
                stack.push(c);
            }else{
                if (stack.empty())
                    return false;
                else if(c==')' && stack.peek()=='(')
                    stack.pop();
                else if(c==']' && stack.peek()=='[')
                    stack.pop();
                else if (c=='}' && stack.peek()=='{')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.empty();
    }
}
