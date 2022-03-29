class Solution {
    public int solution(String name) {
        int[] updown = new int[name.length()];
        int right = updown[0];
        int left = updown[0];

        for(int i = 0; i < name.length(); i++){
            updown[i] = (int)name.indexOf(i) <= 77
                    ? (int)name.indexOf(i) - 65 : 91 - (int)name.indexOf(i);
        }

        for(int i = 1; i < name.length(); i++){
            right += updown[i]+1;
            left += updown[i]+1;
        }



        return Math.min(right, left);
    }
}