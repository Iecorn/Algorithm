import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char first = str.charAt(0);
        char temp = str.charAt(0);
        int count = 0;

        for(int i = 1 ; i < str.length(); i++){
            if(str.charAt(i) != first && temp != str.charAt(i)){
                count++;
                temp = str.charAt(i);
            }
            else if(temp != str.charAt(i) && first == str.charAt(i)){
                temp = str.charAt(i);
            }
        }

        System.out.println(count);
    }
}
