import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : priorities)
            queue.offer(i);

        while (!queue.isEmpty()){
            for ( int i = 0 ; i < priorities.length; i++){
                if (queue.peek() == priorities[i]){
                    if (i == location){
                        return answer;
                    }
                    answer++;
                    queue.poll();
                }
            }
        }

        return answer;

        
        //문제 잘못 이해해서 푼 풀이
        /*int target = priorities[location];
        Stack<Queue<Integer>> stack = new Stack<>();
        Queue<Integer> q;

        for (int i : priorities)
            if (i > target)
                answer++;

        for (int i = 0; i < priorities.length; i++){
            q = new LinkedList<>();
            for (int j = i; j < priorities.length; j++){
                i = j;
                if (target == priorities[j])
                    q.offer(j);
                else if (target != priorities[j])
                    break;
            }
            if (!q.isEmpty())
                stack.add(q);
        }

        System.out.println(stack);
        System.out.println("answer = " + answer);

        boolean flag = false;
        while (!stack.isEmpty()){
            q = stack.pop();
            while (!q.isEmpty()){
                answer++;
                if (q.peek() != location)
                    q.poll();
                else{
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
        return answer;*/
    }
}

