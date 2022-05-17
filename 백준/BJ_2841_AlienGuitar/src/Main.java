import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        ArrayList<Stack<Integer>> stacks = new ArrayList<>();

        for (int i = 0; i < 6; i++)
            stacks.add(new Stack<>());

        int answer = 0;

        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()) - 1;
            int p = Integer.parseInt(st.nextToken());

            if (!stacks.get(n).isEmpty()){
                while (!stacks.get(n).isEmpty() && stacks.get(n).peek() > p){
                    stacks.get(n).pop();
                    answer++;
                }
                if (stacks.get(n).isEmpty() || stacks.get(n).peek() != p){
                    stacks.get(n).push(p);
                    answer++;
                }
            }
            else{
                stacks.get(n).push(p);
                answer++;
            }
        }

        System.out.println(answer);

        br.close();
    }
}
