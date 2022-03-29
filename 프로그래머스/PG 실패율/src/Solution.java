import java.util.*;


class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        int count = 0;
        int num = stages.length;

        answer = new int[N];

        Map<Integer, Double> failure_rate = new HashMap<>();
        for(int i = 1; i < N+1; i++){
            count = 0;
            for(int j : stages)
                if(i == j)
                    count++;

            if(count == 0)
                failure_rate.put(i, 0.0);
            else
                failure_rate.put(i, (double)count/num);

            num -= count;
        }

        List<Integer> listKeyset = new ArrayList<>(failure_rate.keySet());

        Collections.sort(listKeyset, (o1, o2) -> (failure_rate.get(o2).
                compareTo(failure_rate.get(o1))));

        int n = 0;

        for(Integer key : listKeyset){
            answer[n] = key;
            n++;
        }



        return answer;
    }
}