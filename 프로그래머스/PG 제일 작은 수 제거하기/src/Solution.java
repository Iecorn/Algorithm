
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int len = arr.length;
        int min;

        if(len == 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        else{
            answer = new int[len -1];
            min = arr[0];

            for (int k : arr) {
                if (min > k)
                    min = k;
            }

            int num = 0;

            for (int j : arr) {
                if (j != min) {
                    answer[num] = j;
                    num++;
                }
            }
        }

        return answer;
    }
}