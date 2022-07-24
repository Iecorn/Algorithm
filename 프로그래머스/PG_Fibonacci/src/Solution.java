import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int solution(int n) {
        List<Integer> fibo = new ArrayList<>();
        fibo.add(0);
        fibo.add(1);

        int result = 0;

        while(fibo.size()-1 != n){
            result = (fibo.get(fibo.size() -2) + fibo.get(fibo.size()-1))%1234567;
            fibo.add(result);
        }

        return fibo.get(fibo.size()-1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(100));
    }

}