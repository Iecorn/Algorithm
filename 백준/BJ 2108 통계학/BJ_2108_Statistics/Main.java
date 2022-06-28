import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> numbers = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();


        for(int i = 0 ; i < N; i++)
            numbers.add(Integer.parseInt(br.readLine()));

        Collections.sort(numbers);

        int sum = 0, size = numbers.size(), mid = numbers.get(numbers.size()/2);

        for(int i = 0 ; i < size; i++){
            int n = numbers.get(i);

            //평균
            sum += n;

            //최빈값 카운터
            if(!map.containsKey(n))
                map.put(n,1);
            else
                map.replace(n, map.get(n)+1);
        }

        List<Map.Entry<Integer,Integer>> list_entries = new ArrayList<>(map.entrySet());

        Collections.sort(list_entries, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        List<Integer> candidate = new ArrayList<>();


        int max = list_entries.get(0).getValue();

        for (Map.Entry<Integer, Integer> entry : list_entries) {
            if(max == entry.getValue())
                candidate.add(entry.getKey());
        }

        Collections.sort(candidate);

        int mode = candidate.size() == 1 ? candidate.get(0) : candidate.get(1);


        int range = 0;

        if(numbers.size() != 1)
            range = numbers.get(numbers.size()-1) - numbers.get(0);


        System.out.println(Math.round(sum/(float)size));
        System.out.println(mid);
        System.out.println(mode);
        System.out.println(range);


    }

}
