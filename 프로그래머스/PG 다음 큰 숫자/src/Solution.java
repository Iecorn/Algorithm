class Solution {
    public int solution(int n) {
        int answer = 0;
        int ones = Integer.bitCount(n);

        int i = 1;
        int count = 0;

        while(true){
            count = Integer.bitCount(n+i);
            if(ones == count) break;
            i++;
        }

        answer = n+i;

        return answer;
    }
}

