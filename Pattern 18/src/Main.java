import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n:");
        int n = scanner.nextInt();
        for(int i = 1 ; i<=2*n; i++)
        {
            int star = i<=n?(n-i)+1:i-n;
            int spaces = i<=n?2*i-2: 2 * (2 * n - i);
            for(int j = 1 ; j<=star; j++)
            {
                System.out.print("*");
            }

            for(int j = 1 ; j<=spaces; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1 ; j<=star; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}