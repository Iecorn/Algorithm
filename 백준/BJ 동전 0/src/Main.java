import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int money = sc.nextInt();
        int[] coins = new int[10];
        int answer = 0;

        for(int i = 0; i < n; i++){
            coins[i] = sc.nextInt();
        }
        sc.close();

        int i = n - 1;

        while (money >= 0 && i >= 0){
            if(money / coins[i] > 0){
                answer += money / coins[i];
                money -= (money / coins[i])*coins[i];
            }
            i--;
        }

        System.out.println(answer);


    }
}
