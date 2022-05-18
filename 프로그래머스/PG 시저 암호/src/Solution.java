class Solution {
    public String solution(String s, int n) {
        String answer = "";

        char[] str = s.toCharArray();

        for (char c : str) {
            if(c == ' ')
                answer += c;
            else if('a' <= c && c <= 'z'){
                if ('z' < c+n)
                    answer += (char)(c+n - 26);
                else
                    answer += (char)(c+n);
            }
            else if ('A' <= c && c <= 'Z'){
                if ('Z' <= c+n)
                    answer += (char)(c+n - 26);
                else
                    answer += (char)(c+n);
            }
        }
        return answer;
    }

}

