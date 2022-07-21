public class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        int A = Math.min(a,b);
        int B = Math.max(a,b);

        while(true){
            A = A%2 == 1 ? A+1 : A;
            B = B%2 == 1 ? B+1 : B;
            if (A == B)
                break;
            else{
                A = A/2;
                B = B/2;
            }
            answer++;
        }

        return answer;
    }
}