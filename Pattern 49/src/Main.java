import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1 ; i<=n; i++)
        {
            int character = 65-i;
            for(int j = 1 ; j<=n-i+1; j++)

            {
                System.out.print((char)(character+n)+" ");
                character++;
            }

            System.out.println();
        }
    }
}


/*
    Output:

           E F G H I
           D E F G
           C D E
           B C
           A
 */