class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int i = 0;
        int count = 0;
        p = p-1;

        if(i == p){
            answer += '0';
            count++;
        }
        else
            count++;


        while(answer.length() < t){
            String str = number(i,n);

            for(int j = 0; j < str.length(); j++){
                if(check(answer, t))
                    break;
                if(count%m == p)
                    answer += str.charAt(j);
                count++;
            }
            i++;
        }


        return answer;
    }

    public static boolean check(String answer, int t){
        if(answer.length() >= t)
            return true;
        else
            return false;
    }

    public static String number(int i, int n){
        StringBuilder sb = new StringBuilder();
        int temp = i;
        while(temp > 0){
            if (temp % n < 10)
                sb.append(temp % n);
            else {
                sb.append((char) (temp % n - 10 + 'A'));
            }
            temp /= n;
        }

        return sb.reverse().toString();
    }
}