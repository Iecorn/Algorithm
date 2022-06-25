import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        Integer[] arr = new Integer[N];
        Integer[] sorted = new Integer[N];
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt = 0;


        for(int i = 0 ; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        sorted = arr.clone();
        Arrays.sort(sorted);

        for (Integer i : sorted) {
            if(!map.containsKey(i))
                map.put(i, cnt++);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }

        System.out.println(sb);

    }
}
