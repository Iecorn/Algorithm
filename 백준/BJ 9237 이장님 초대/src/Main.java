import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Integer[] trees = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++)
            trees[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(trees, Collections.reverseOrder());

        int max = trees[0]+1;

        for(int i = 1; i < N; i++){
            if(max < trees[i]+i+1)
                max = trees[i]+i+1;
        }

        System.out.println(max+1);
    }
}
