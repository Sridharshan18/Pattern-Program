import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n:");
        int n = scanner.nextInt();
        for(int i = 1 ; i<=n; i++)
        {
            for(int j = 1 ; j<=n-i;j++)
            {
                System.out.print(" ");
            }

            int x = 1;
            for(int k = 1 ; k<=i; k++)
            {
                System.out.print(x+" ");
                x = x*(i-k)/k;
            }
            System.out.println();
        }
    }
}