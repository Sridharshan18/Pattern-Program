import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int alphabet = 64 + n;   //65  A
        for(int i = 1 ; i<=n ; i++)
        {
            for(int j = 1 ; j<=(n-i)+1; j++)
            {
                System.out.print((char) (alphabet)+" ");
                alphabet--;
            }
            System.out.println();
            alphabet = alphabet + (n-i);
        }
    }
}