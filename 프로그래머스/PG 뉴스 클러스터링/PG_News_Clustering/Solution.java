import java.util.ArrayList;

class Solution {
    public int solution(String str1, String str2) {

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        ArrayList<String> arr1 = split_str(str1);
        ArrayList<String> arr2 = split_str(str2);

        if (arr1.size() == 0 && arr2.size() == 0)
            return 65536;

        int U = Union(arr1, arr2);
        int I = Intersection(arr1, arr2);

        float result = (I/(float)U)*65536;

        return (int)result;
    }

    public ArrayList<String> split_str(String str){
        String tmp;
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < str.length() -1; i++){
            char c1 = str.charAt(i);
            char c2 = str.charAt(i+1);

            if (Character.isLetter(c1) && Character.isLetter(c2)){
                tmp = String.valueOf(c1) + String.valueOf(c2);
                arr.add(tmp);
            }
        }

        return arr;
    }

    public int Union(ArrayList<String> arr1, ArrayList<String> arr2){

        ArrayList<String> tmp1 = new ArrayList<>(arr1);
        ArrayList<String> tmp2 = new ArrayList<>(arr1);

        for (String s : arr2) {
            if (!tmp1.contains(s)){
                tmp2.add(s);
            }
            else
                tmp1.remove(s);
        }

        return tmp2.size();
    }

    public int Intersection(ArrayList<String> arr1, ArrayList<String> arr2){
        ArrayList<String> tmp = new ArrayList<>(arr1);
        ArrayList<String> common = new ArrayList<>();

        for (String s : arr2) {
            if (tmp.contains(s)){
                tmp.remove(s);
                common.add(s);
            }
        }

        return common.size();
    }
    //
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        System.out.println(s.solution("aa1+aa2", "AAAA12"));
//


}


