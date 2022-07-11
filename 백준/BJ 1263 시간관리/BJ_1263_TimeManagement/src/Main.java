import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;


class JOB implements Comparable<JOB> {
    public int time;
    public int deadline;

    public JOB(int time, int deadline) {
        this.time = time;
        this.deadline = deadline;
    }

    @Override
    public int compareTo(JOB o) {
        return o.deadline - this.deadline;
    }

    @Override
    public String toString() {
        return "JOB{" +
                "time=" + time +
                ", deadline=" + deadline +
                '}';
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        List<JOB> jobs = new ArrayList<>();

        for (int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            jobs.add(new JOB(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(jobs);

        int time = jobs.get(0).deadline - jobs.get(0).time;

        for (int i = 1 ; i < N; i++){
            if (time > jobs.get(i).deadline)
                time = jobs.get(i).deadline;
            time = time - jobs.get(i).time;
        }

        System.out.println(time > 0 ? time : -1);
    }
}
