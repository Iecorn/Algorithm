import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);

        for (int n : d) {
            if (sum+n > budget)
                break;
            else{
                sum += n;
                answer++;
            }
        }

        return answer;
    }
}