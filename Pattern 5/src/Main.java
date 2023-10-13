import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n:");
        int n = scanner.nextInt();
        // Using two loop

                // Print the pattern
                for (int i = 1; i <= 2 * n - 1; i++) {
                    int numStars = i <= n ? i : 2 * n - i;

                    for (int j = 1; j <= numStars; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }


      /*  for(int i = 0 ; i<n ; i++)
        {

        }
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 2 ; i<=n; i++)
        {
            for(int j = 0 ; j<=n-i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/