
class Solution {
    public String solution(String phone_number) {
        String answer = "";

        int pn_length = phone_number.length() - 4;

        for (int i = 0; i < pn_length; i++){
            answer = answer.concat("*");
        }

        answer = answer.concat(phone_number.substring(pn_length));

        return answer;
    }
}