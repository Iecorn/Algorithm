import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int min = 0, max = 0;

        for (int n : win_nums)
            if (IntStream.of(lottos).anyMatch(x-> x == n))
                min++;

        max = min + counter(lottos);

        answer[0] = getGrade(max);
        answer[1] = getGrade(min);

        return answer;
    }

    public static int counter(int[] array){
        int count = 0;

        for (int n : array)
            if (n == 0)
                count++;

        return count;
    }

    public int getGrade(int n) {
        switch(n) {
            case 6 :
                return 1;
            case 5 :
                return 2;
            case 4 :
                return 3;
            case 3 :
                return 4;
            case 2 :
                return 5;
            default :
                return 6;
        }
    }
}