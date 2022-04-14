import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = 1, answer = 0, count;

        while(true){
            String str = bf.readLine();
            Stack<Character> s = new Stack<>();
            answer = 0;

            if (str.contains("-"))
                break;

            for (int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '{')
                    s.push(str.charAt(i));
                else if (str.charAt(i) == '}') {
                    if (s.isEmpty()){
                        answer++;
                        s.push('}');
                    }
                    else
                        s.pop();

                }
            }

            answer += s.size()/2;

            System.out.println(n + ". " + answer);

            n++;
        }
        bf.close();
    }


}
