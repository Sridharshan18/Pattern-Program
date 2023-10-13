import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n:");
        int n = scanner.nextInt();
        for(int i = 1 ; i<2*n;i++)
        {
            int star = i<=n ? i : 2*n-i;
            int spaces = i<=n ? n-i : i - n;
            for(int j = 1 ; j<=spaces; j++)
            {
                System.out.print(" ");
            }
            for(int j = star ; j>=1;j--)
            {
                System.out.print(j);
            }

            for(int j = 2; j<=star;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}