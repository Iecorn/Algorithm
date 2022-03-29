class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;

        for(int i = 1 ; i < n+1; i++){
            int temp = i;
            sum = 0;
            while(sum <= n){
                sum += temp++;
                if(sum == n)
                    answer++;
            }
        }


        return answer;
    }
}