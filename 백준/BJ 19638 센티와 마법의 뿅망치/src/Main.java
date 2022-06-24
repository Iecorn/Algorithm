import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int cnt = 0;
        boolean flag = false;

        PriorityQueue<Integer> array = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0 ; i < N ; i++)
            array.add(Integer.parseInt(br.readLine()));

        while(T > 0){
            if (array.peek() <= 1 || array.peek() < H){
                break;
            }
            else if(array.peek() != 1){
                array.add(array.poll()/2);
                T--;
                cnt++;
            }
        }
        if (array.peek() < H)
            flag = true;

        System.out.println(flag ? "YES" : "NO");
        System.out.println(flag ? cnt : array.peek());
    }
}