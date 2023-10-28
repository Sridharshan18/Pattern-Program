import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int character = 64;
        for(int i = 1 ; i<=n;i++)
        {
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print((char)(character+ n)+" ");
            }
            character--;
            System.out.println();
        }
    }
}


/*

 Output :

     E
     D D
     C C C
     B B B B
     A A A A A
 */