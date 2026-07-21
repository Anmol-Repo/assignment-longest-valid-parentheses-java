import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        int max = 0;

        // Initial boundary
        stack.push(-1);
         for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                stack.push(i);

            } else {

                stack.pop();

                if (stack.isEmpty()) {

                    stack.push(i);

                }  else {

                    max = Math.max(max, i - stack.peek());

                }
          }
        }

        return max;
    }


  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses string: ");
        String s = sc.nextLine();

        int ans = longestValidParentheses(s);

        System.out.println("Longest Valid Parentheses Length = " + ans);

        sc.close();
    }
}
