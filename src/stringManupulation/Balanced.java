package stringManupulation;

import java.util.Stack;

class Balanced {
    public static void main(String[] args) {
        System.out.println(isBalanced("({}([][]))[]()"));
    }
    static String isBalanced(String s) {
        if(s.charAt(0)==']'||s.charAt(0)=='}'||s.charAt(0)==')')
            return "NO";

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char cp=s.charAt(i);
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
                stack.add(s.charAt(i));
          else  if(!stack.isEmpty()){
                if(s.charAt(i)=='}'||s.charAt(i)==')'||s.charAt(i)==']'){
                    char c =stack.peek();
                    if(c=='{'&&cp=='}'){
                        stack.pop();
                    }
                  else  if(c=='['&&cp==']')
                        stack.pop();
                    else if(c=='('&&cp==')')
                        stack.pop();
                    else
                        return "NO";
                }
            }

        }
        if(stack.isEmpty())
            return "YES";
        return "NO";

    }

}