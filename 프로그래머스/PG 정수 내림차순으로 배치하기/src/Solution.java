import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String number = Long.toString(n);

        Long[] digits = new Long[number.length()];
        for(int i = 0; i < number.length(); i++)
            digits[i] = (long) (number.charAt(i) - '0');

        Arrays.sort(digits, Collections.reverseOrder());

        for(long j : digits){
            answer *= 10;
            answer += j;
        }

        return answer;
    }
}