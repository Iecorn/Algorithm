import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;


class Solution {
    public int[] solution(int[] numbers) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++ ){
                if(!list.contains(numbers[i] + numbers[j])){
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }

        Collections.sort(list);

        return list.stream().mapToInt(i->i).toArray();
    }
}