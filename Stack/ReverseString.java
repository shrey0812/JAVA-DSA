package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    
    public String reverse(String str){

        Stack<Character> stack = new Stack<Character>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
        }
        for (int i = 0; i < chars.length; i++) {
            chars[i]= stack.pop();
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to be reversed");
        String str = sc.nextLine();
        String reversedString=reverseString.reverse(str);
        System.out.println(reversedString);
        sc.close();
    }
}
