import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                stack.push(c - '0');
            }
            else
                logic(stack, c);
        }

        System.out.println(stack.pop());

    }

    static void logic(Stack<Integer> stack, char symbol){
        switch (symbol){
            case '*':
                int a1 = stack.pop();
                int a2 = stack.pop();
                stack.push(a2*a1);
                break;
            case '/':
                int b1 = stack.pop();
                int b2 = stack.pop();
                stack.push(b2/b1);
                break;
            case '+':
                int c1 = stack.pop();
                int c2 = stack.pop();
                stack.push(c2+c1);
                break;
            case '-':
                int d1 = stack.pop();
                int d2 = stack.pop();
                stack.push(d2-d1);
                break;
        }
    }
}
