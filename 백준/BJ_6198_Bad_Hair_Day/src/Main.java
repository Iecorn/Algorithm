import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] bulidings = new int[N];
        long answer = 0;

        for(int i = 0; i < N; i++)
            bulidings[i] = Integer.parseInt(br.readLine());

        for(int i = 0; i < N-1; i++){
            for(int j = i+1; j < N; j++){
                if (bulidings[j] < bulidings[i])
                    answer++;
                else
                    break;
            }
        }

        System.out.println(answer);
        br.close();
    }

}
