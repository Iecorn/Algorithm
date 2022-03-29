
class Solution {
    public String solution(String s) {

        String answer = "";
        int len = 0;
        String[] array = s.split("");

        for(String s1: array) {
            if(s1.contains(" "))
                len = 0;
            else
                len++;


            if(len%2 == 0)
                answer += s1.toLowerCase();
            else
                answer += s1.toUpperCase();
        }
        return answer;
    }
}