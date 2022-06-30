import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        Queue<Integer> bridge = new LinkedList<>();
        int sum = 0;
        int i = 0;
        int time = 0;

        for (int j = 0 ; j < bridge_length; j++)
            bridge.add(0);

        while(i < truck_weights.length){
            sum -= bridge.poll();
            if(sum + truck_weights[i] > weight){
                bridge.add(0);
            }
            else{
                sum += truck_weights[i];
                bridge.add(truck_weights[i++]);
            }
            time++;
        }
        return time+bridge_length;
    }
}