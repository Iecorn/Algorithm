import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        int num = 10;
        for(int i : arr){
            if(i != num){
                list.add(i);
                num = i;
            }
        }

        answer = new int[list.size()];

        for(int j = 0 ; j < list.size() ; j++)
            answer[j] = list.get(j);


        return answer;
    }
}