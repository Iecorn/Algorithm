import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> counter = new HashMap<>();

        for(int i = 0; i < N; i++){
            String book = br.readLine();
            Integer value = counter.get(book);
            counter.put(book, value == null ? 1 : value+1);
        }

        int max = 0;
        String max_book = "";
        for (String s : counter.keySet())
            max = Math.max(max, counter.get(s));

        ArrayList<String> books = new ArrayList<>(counter.keySet());
        Collections.sort(books);

        for (String book : books) {
            if(max == counter.get(book)){
                System.out.println(book);
                break;
            }
        }
    }
}
