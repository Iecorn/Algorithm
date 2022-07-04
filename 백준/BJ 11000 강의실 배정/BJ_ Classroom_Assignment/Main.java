import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static class Class implements Comparable<Class>{
        int start;
        int end;

        public Class(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Class o) {
            return this.start - o.start;
        }

        @Override
        public String toString() {
            return "Class{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Class[] classes = new Class[N];

        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            classes[i] = new Class(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        br.close();

        Arrays.sort(classes);

        PriorityQueue<Integer> end_times = new PriorityQueue<>();
        end_times.offer(classes[0].end);

        for(int i = 1 ; i < N; i++){
            if(end_times.peek() <= classes[i].start){
                end_times.poll();
            }

            end_times.add(classes[i].end);
        }

        System.out.println(end_times.size());

    }
}
