import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1 ; i<=n ;i++)
        {
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print(n-i+1+" ");
            }
            System.out.println();
        }
    }
}

/*
    Output:
           5
           4 4
           3 3 3
           2 2 2 2
           1 1 1 1 1
 */