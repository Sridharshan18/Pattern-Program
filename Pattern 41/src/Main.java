import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int character = 64;
        for(int i = 1 ; i<=n; i++)
        {
            for(int j = 1 ; j<=n-i+1;j++)
            {
                System.out.print((char)((n-i+1)+character)+" ");
            }
            System.out.println();
        }


    }
}

/*
   Output:

               E E E E E
               D D D D
               C C C
               B B
               A
 */