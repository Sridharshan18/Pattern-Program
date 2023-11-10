import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1 ; i<=n ; i++)
        {
            for(int j = 1 ; j<=n-i+1; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

/*
    Output:
         1 1 1 1 1
         2 2 2 2
         3 3 3
         4 4
         5
 */