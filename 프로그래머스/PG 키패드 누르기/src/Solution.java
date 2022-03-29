
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int lh = 10;    //*
        int rh = 12;    //#

        for(int i : numbers){
            if(i == 0)
                i = 11;
            int lh_distance = distance(i,lh);
            int rh_distance = distance(i,rh);

            if(i == 1 ||i ==4 || i== 7){
                answer += "L";
                lh = i;
            }
            else if(i == 3 ||i ==6 || i== 9){
                answer += "R";
                rh = i;
            }
            else if(lh_distance == rh_distance){
                if(hand.equals("left")){
                    answer += "L";
                    lh = i;
                }
                else if(hand.equals("right")){
                    answer += "R";
                    rh = i;
                }
            }
            else if(lh_distance == Math.min(lh_distance,rh_distance)){
                answer += "L";
                lh = i;
            }
            else if (rh_distance == Math.min(lh_distance, rh_distance)){
                answer += "R";
                rh = i;
            }

        }

        return answer;
    }


    //거리 구하기
    public static int distance(int i, int n){
        //입력받은 숫자 위치 좌표
        int xi = (i-1)%3;
        int yi = (i-1)/3;

        //왼손 or 오른손 좌표 구하기
        int xn = (n-1)%3;
        int yn = (n-1)/3;

        //거리 반환
        return Math.abs(xi-xn) + Math.abs(yi-yn);
    }
}