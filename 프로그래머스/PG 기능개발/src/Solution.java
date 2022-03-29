import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> answers = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            double remain = (100 - progresses[i]) / (double) speeds[i];
            int date = (int) Math.ceil(remain);

            if (!q.isEmpty() && (q.peek() < date)) {
                answers.add(q.size());
                q.clear();
            }

            q.offer(date);
        }

        answers.add(q.size());

        int[] answer = new int[answers.size()];

        for (int i = 0; i < answer.length; i++) answer[i] = answers.get(i);

        return answer;
    }
}