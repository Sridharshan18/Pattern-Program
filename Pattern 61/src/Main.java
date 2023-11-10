import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1 ; i<=n ; i++)
        {
            for(int j = 1 ; j<=n-i+1; j++)
            {
                System.out.print(n-i+1+" ");
            }
            System.out.println();
        }
    }
}

/*
    Output:
            5 5 5 5 5
            4 4 4 4
            3 3 3
            2 2
            1
 */