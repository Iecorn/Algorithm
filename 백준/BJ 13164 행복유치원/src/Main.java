import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] array = new int[N];
        int[] diff = new int[N-1];

        st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < N; i++)
            array[i] = Integer.parseInt(st.nextToken());

        for(int i = 0; i< N-1; i++)
            diff[i] = array[i+1] - array[i];

        Arrays.sort(diff);

        for(int i = 0; i < N-K; i++)
            answer += diff[i];

        System.out.println(answer);

        br.close();
    }
}
