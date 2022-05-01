import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] citations) {
        int answer = 0, h = 0;
        int n = citations.length;
        int count = 0;
        Integer[] list = new Integer[n];

        for(int i = 0; i < n; i++)
            list[i] = citations[i];

        Arrays.sort(list, Collections.reverseOrder());

        h = list[0];

        while(true){
            count = 0;
            for (Integer num : list)
                if(num >= h)
                    count++;
            if(count >= h && n-count <= h){
                answer = h;
                break;
            }
            h--;
        }

        return answer;
    }
}