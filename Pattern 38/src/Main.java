import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        for(int i = 1 ; i<=2*n-1; i++)
        {
            for(int j = 1 ; j<=2*n-1; j++)
            {
                if(i==n || j==n)
                {
                    System.out.print("+");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}