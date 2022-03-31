import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> add = new ArrayList<>();

        for(int i = 0; i < N; i++){
            int tmp = sc.nextInt();
            if(tmp < 0)
                neg.add(tmp);
            else
                pos.add(Math.abs(tmp));
        }

        Collections.sort(neg);
        Collections.sort(pos, Collections.reverseOrder());

        for(int i = 0; i < neg.size(); i++)
            if(i%M == 0)
                add.add(Math.abs(neg.get(i)));

        for(int i = 0; i < pos.size(); i++)
            if(i%M == 0)
                add.add(pos.get(i));

        Collections.sort(add);

        int sum = 0;

        for (int n = 0; n < add.size()-1; n++) {
            sum += add.get(n)*2;
        }
        sum += add.get(add.size()-1);

        System.out.println(sum);

    }
}
