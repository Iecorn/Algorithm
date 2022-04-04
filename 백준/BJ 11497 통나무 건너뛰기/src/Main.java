import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            func(sc);
        }
        sc.close();
    }

    public static void func(Scanner sc){
        int N = sc.nextInt();
        Integer[] numbers = new Integer[N];

        for(int i = 0 ; i < N ; i++){
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers, Collections.reverseOrder());
        
        int answer = Math.max(numbers[0]-numbers[1], numbers[0]-numbers[2]);

        for(int i = 3; i < N; i++){
            if(answer < numbers[i-2] - numbers[i]){
                answer = numbers[i-2] - numbers[i];
            }
        }

        System.out.println(answer);
    }
}
