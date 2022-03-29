import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String num = String.valueOf(n);
        int len = num.length();
        int cycle = (int) Math.pow(10, len);


        for(int i = 0 ; i < len+1; i++){
            answer += n/cycle;
            n = n-(n/cycle)*cycle;
            cycle /= 10;
        }



        return answer;
    }
}