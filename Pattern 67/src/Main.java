import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1 ; i<=n; i++)
        {
            for(int j = i ; j>=1 ; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*
   Output:
         1
         2 1
         3 2 1
         4 3 2 1
         5 4 3 2 1
 */