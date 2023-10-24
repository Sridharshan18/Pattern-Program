import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int character = 65;
        for(int i = 1 ; i<=n ; i++)
        {
            for(int j = 1 ; j<=i ;j++)
            {
                System.out.print((char)(character)+" ");

            }
            character++;
            System.out.println();
        }
    }
}


/* Output:
              A
              B B
              C C C
              D D D D
              E E E E E
 */


