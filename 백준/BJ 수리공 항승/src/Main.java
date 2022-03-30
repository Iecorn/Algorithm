import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int answer = 1;

        int[] broke = new int[N];

        for(int i = 0; i < N; i++)
            broke[i] = sc.nextInt();

        sc.close();
        Arrays.sort(broke);
        double cover = broke[0] + L - 0.5;

        for(int i = 1; i < N; i++){
            if(cover < broke[i] + 0.5){
                answer++;
                cover = broke[i]-0.5+L;
            }
        }

        System.out.println(answer);
    }
}
