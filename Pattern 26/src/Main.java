import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n:");
        int n = scanner.nextInt();
        for(int i = 1 ; i<=n ; i++)
        {
            for(int j = 0 ; j<=n-i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}