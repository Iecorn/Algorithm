class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];


        for(int r = 0; r < arr1.length; r++){
            for(int c = 0; c < arr2[0].length; c++){
                answer[r][c] =multiply_sum(arr1,arr2,r,c);
            }
        }

        return answer;
    }

    public static int multiply_sum(int[][] arr1, int[][] arr2, int r, int c){
        int sum = 0;

        for(int i = 0; i < arr2.length; i++)
            sum += arr1[r][i]*arr2[i][c];

        return sum;
    }

}