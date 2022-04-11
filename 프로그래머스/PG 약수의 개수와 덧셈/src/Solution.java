class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count;

        for(int n = left; n < right+1; n++){
            count = 0;
            for(int i = 1 ; i < n+1; i++){
                if (n%i == 0)
                    ++count;
            }
            if (count%2 == 0)
                answer += n;
            else
                answer -= n;
        }

        return answer;
    }
}