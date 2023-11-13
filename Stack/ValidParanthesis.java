package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {
    
    boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c=='('|| c=='{'||c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top = stack.peek();
                    if((c==')'&& top=='(')||(c=='}'&&top=='{')||(c==']'&&top=='[')){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParanthesis validParanthesis = new ValidParanthesis();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to be checked");
        String str = sc.nextLine();
        boolean validString=validParanthesis.isValid(str);
        System.out.println(validString);
        sc.close();
    }
}
